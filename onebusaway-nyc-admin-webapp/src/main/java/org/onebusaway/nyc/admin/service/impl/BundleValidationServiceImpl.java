package org.onebusaway.nyc.admin.service.impl;

import org.onebusaway.gtfs.model.calendar.ServiceDate;
import org.onebusaway.nyc.admin.model.ServiceDateRange;
import org.onebusaway.nyc.admin.service.BundleValidationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class BundleValidationServiceImpl implements BundleValidationService {

  private static final int CHUNK_SIZE = 1024;
  private static final String TRANSIT_FEED = "transitfeed-1.2.11";
  private static Logger _log = LoggerFactory.getLogger(BundleValidationServiceImpl.class);

  @Override
  /**
   * Examine the calendar.txt file inside the gtfsZipFile and return a list of ServiceDateRanges.
   */
  public List<ServiceDateRange> getServiceDateRanges(InputStream gtfsZipFile) {
    ZipInputStream zis = null;
    try {
      zis = new ZipInputStream(gtfsZipFile);

      ZipEntry entry = null;
      String agencyId = null;
      String calendarFile = null;
      while ((entry = zis.getNextEntry()) != null) {
        if ("agency.txt".equals(entry.getName())) {
          byte[] buff = new byte[CHUNK_SIZE];
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          int count = 0;
          while ((count = zis.read(buff, 0, CHUNK_SIZE)) != -1) {
            baos.write(buff, 0, count);
          }
          agencyId = parseAgencyId(baos.toString());
        }
        if ("calendar.txt".equals(entry.getName())) {
          byte[] buff = new byte[CHUNK_SIZE];
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          int count = 0;
          while ((count = zis.read(buff, 0, CHUNK_SIZE)) != -1) {
            baos.write(buff, 0, count);
          }
          calendarFile = baos.toString();
        }
      }
      if (agencyId != null && calendarFile != null) {
        return convertToServiceDateRange(agencyId, calendarFile);
      }
      return null; // did not find calendar.txt
    } catch (IOException ioe) {
      throw new RuntimeException(ioe);
    } finally {
      if (zis != null) {
        try {
          zis.close();
        } catch (IOException ioe) {
          // bury
        }
      }
    }
  }

  private String parseAgencyId(String agencyFile) {
    String[] entries = agencyFile.split("\n");
    return entries[1].split(",")[0];
  }

  private List<ServiceDateRange> convertToServiceDateRange(String agencyId,
      String calendarFile) {
    String[] entries = calendarFile.split("\n");
    List<ServiceDateRange> ranges = new ArrayList<ServiceDateRange>();
    int line = 0;
    for (String entry : entries) {
      // skip header
      if (line != 0) {
        String[] columns = entry.split(",");
        if (columns.length > 9) {
          ranges.add(new ServiceDateRange(agencyId, parseDate(columns[8]),
              parseDate(columns[9])));
        }
      }
      line++;
    }
    return ranges;
  }

  private ServiceDate parseDate(String s) {
    return new ServiceDate(Integer.parseInt(s.substring(0, 4)),
        Integer.parseInt(s.substring(4, 6)),
        Integer.parseInt(s.substring(6, 8)));
  }

  @Override
  /**
   * collect all service date ranges in the list, and return 
   * map of key=agencyId, value=ServiceDateRange 
   */
  public Map<String, List<ServiceDateRange>> getServiceDateRangesByAgencyId(
      List<ServiceDateRange> ranges) {
    HashMap<String, List<ServiceDateRange>> map = new HashMap<String, List<ServiceDateRange>>();
    for (ServiceDateRange sd : ranges) {
      List<ServiceDateRange> list = map.get(sd.getAgencyId());
      if (list == null) {
        list = new ArrayList<ServiceDateRange>();
      }
      list.add(sd);
      map.put(sd.getAgencyId(), list);
    }
    return map;
  }

  @Override
  /**
   * collect all service date ranges in the GTFS, and return 
   * map of key=agencyId, value=ServiceDateRange
   */
  public Map<String, List<ServiceDateRange>> getServiceDateRangesAcrossAllGtfs(
      List<InputStream> gtfsZipFiles) {
    List<ServiceDateRange> ranges = new ArrayList<ServiceDateRange>(
        gtfsZipFiles.size());
    for (InputStream is : gtfsZipFiles) {
      ranges.addAll(getServiceDateRanges(is));
    }
    return getServiceDateRangesByAgencyId(ranges);
  }

  public int installAndValidateGtfs(String gtfsZipFileName, String outputFile) {
    int returnCode = -1;
    try {
      returnCode = validateGtfs(gtfsZipFileName, outputFile);
    } catch (RuntimeException e) {
      _log.error(e.toString());
      return -1;
    }
    // 2 is the return code if process not found/file not found on exec
    if (returnCode == 2) {
      // try installing if that failed
      downloadFeedValidator();
      
      try {
        // try again after install
        return validateGtfs(gtfsZipFileName, outputFile);
      } catch (RuntimeException e) {
        _log.error(e.toString());
        return -1;
      }
    }
    return returnCode;

  }

  @Override
  public int validateGtfs(String gtfsZipFileName, String outputFile) {
    Process process = null;
    try {
      String tmpDir = System.getProperty("java.io.tmpdir") + File.separator
          + TRANSIT_FEED;
      String cmd = tmpDir + File.separator
          + "feedvalidator.py -n -m --service_gap_interval=1 --output="
          + outputFile + " " + gtfsZipFileName;

      process = Runtime.getRuntime().exec(cmd);
      return process.waitFor();
    } catch (Exception e) {
      String msg = e.getMessage();
      if (msg != null && e.getMessage().indexOf("error=2,") > 0) {
        return 2; // File Not Found
      }
      _log.error(e.toString());
      throw new RuntimeException(e);
    }
  }

  public void downloadFeedValidator() {
    String tmpDir = System.getProperty("java.io.tmpdir");
    FileUtils fs = new FileUtils(tmpDir);
    String url = "http://googletransitdatafeed.googlecode.com/files/"
        + TRANSIT_FEED + ".tar.gz";
    fs.wget(url);
    fs.tarzxf(TRANSIT_FEED + "tar.gz");
  }

}
