//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_final_3_0_5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for FCBoardingAlightingRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCBoardingAlightingRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passenger-type" type="{http://www.atis-partial-03-00-74}TravelerClass" minOccurs="0"/>
 *         &lt;element name="date-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;choice>
 *           &lt;element name="location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/>
 *           &lt;element name="stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPTStoppointIden" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="boarding-count" type="{http://www.TCIP-Final-3-0-5-1}OB-PassengerBoarding" minOccurs="0"/>
 *           &lt;element name="alighting-count" type="{http://www.TCIP-Final-3-0-5-1}OB-PassengerAlighting" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="localFCBoardingAlightingRecord" type="{http://www.tcip-3-0-5-local}FCBoardingAlightingRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCBoardingAlightingRecord", propOrder = {
    "passengerType",
    "dateTime",
    "location",
    "stoppoint",
    "boardingCount",
    "alightingCount",
    "localFCBoardingAlightingRecord"
})
public class FCBoardingAlightingRecord {

    @XmlElement(name = "passenger-type")
    protected String passengerType;
    @XmlElement(name = "date-time", required = true)
    protected String dateTime;
    protected GeoLocation location;
    protected CPTStoppointIden stoppoint;
    @XmlElement(name = "boarding-count")
    protected Integer boardingCount;
    @XmlElement(name = "alighting-count")
    protected Integer alightingCount;
    protected tcip_3_0_5_local.FCBoardingAlightingRecord localFCBoardingAlightingRecord;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setLocation(GeoLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the stoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getStoppoint() {
        return stoppoint;
    }

    /**
     * Sets the value of the stoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setStoppoint(CPTStoppointIden value) {
        this.stoppoint = value;
    }

    /**
     * Gets the value of the boardingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoardingCount() {
        return boardingCount;
    }

    /**
     * Sets the value of the boardingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoardingCount(Integer value) {
        this.boardingCount = value;
    }

    /**
     * Gets the value of the alightingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlightingCount() {
        return alightingCount;
    }

    /**
     * Sets the value of the alightingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlightingCount(Integer value) {
        this.alightingCount = value;
    }

    /**
     * Gets the value of the localFCBoardingAlightingRecord property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.FCBoardingAlightingRecord }
     *     
     */
    public tcip_3_0_5_local.FCBoardingAlightingRecord getLocalFCBoardingAlightingRecord() {
        return localFCBoardingAlightingRecord;
    }

    /**
     * Sets the value of the localFCBoardingAlightingRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.FCBoardingAlightingRecord }
     *     
     */
    public void setLocalFCBoardingAlightingRecord(tcip_3_0_5_local.FCBoardingAlightingRecord value) {
        this.localFCBoardingAlightingRecord = value;
    }

}
