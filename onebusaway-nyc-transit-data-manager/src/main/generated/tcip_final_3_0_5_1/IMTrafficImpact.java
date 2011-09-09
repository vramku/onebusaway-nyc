//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_final_3_0_5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import lrms_final_09_07.StreetInfo;


/**
 * <p>Java class for IMTrafficImpact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMTrafficImpact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affected-roads">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="affected-road" type="{http://www.lrms-final-09-07}StreetInfo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lane-blocked-count" type="{http://www.tmdd-partial-00-00-00}Event-lanes-total-affected"/>
 *         &lt;element name="time-est-duration" type="{http://www.tmdd-partial-00-00-00}Event-timeline-estimated-duration"/>
 *         &lt;element name="clear-date-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="lane-status-datasets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="lane-status-dataset" type="{http://www.tmdd-partial-00-00-00}Link-status"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localIMTrafficImpact" type="{http://www.tcip-3-0-5-local}IMTrafficImpact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMTrafficImpact", propOrder = {
    "affectedRoads",
    "laneBlockedCount",
    "timeEstDuration",
    "clearDateTime",
    "laneStatusDatasets",
    "localIMTrafficImpact"
})
public class IMTrafficImpact {

    @XmlElement(name = "affected-roads", required = true)
    protected IMTrafficImpact.AffectedRoads affectedRoads;
    @XmlElement(name = "lane-blocked-count")
    protected short laneBlockedCount;
    @XmlElement(name = "time-est-duration", required = true)
    protected Duration timeEstDuration;
    @XmlElement(name = "clear-date-time")
    protected String clearDateTime;
    @XmlElement(name = "lane-status-datasets")
    protected IMTrafficImpact.LaneStatusDatasets laneStatusDatasets;
    protected tcip_3_0_5_local.IMTrafficImpact localIMTrafficImpact;

    /**
     * Gets the value of the affectedRoads property.
     * 
     * @return
     *     possible object is
     *     {@link IMTrafficImpact.AffectedRoads }
     *     
     */
    public IMTrafficImpact.AffectedRoads getAffectedRoads() {
        return affectedRoads;
    }

    /**
     * Sets the value of the affectedRoads property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMTrafficImpact.AffectedRoads }
     *     
     */
    public void setAffectedRoads(IMTrafficImpact.AffectedRoads value) {
        this.affectedRoads = value;
    }

    /**
     * Gets the value of the laneBlockedCount property.
     * 
     */
    public short getLaneBlockedCount() {
        return laneBlockedCount;
    }

    /**
     * Sets the value of the laneBlockedCount property.
     * 
     */
    public void setLaneBlockedCount(short value) {
        this.laneBlockedCount = value;
    }

    /**
     * Gets the value of the timeEstDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeEstDuration() {
        return timeEstDuration;
    }

    /**
     * Sets the value of the timeEstDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeEstDuration(Duration value) {
        this.timeEstDuration = value;
    }

    /**
     * Gets the value of the clearDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearDateTime() {
        return clearDateTime;
    }

    /**
     * Sets the value of the clearDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearDateTime(String value) {
        this.clearDateTime = value;
    }

    /**
     * Gets the value of the laneStatusDatasets property.
     * 
     * @return
     *     possible object is
     *     {@link IMTrafficImpact.LaneStatusDatasets }
     *     
     */
    public IMTrafficImpact.LaneStatusDatasets getLaneStatusDatasets() {
        return laneStatusDatasets;
    }

    /**
     * Sets the value of the laneStatusDatasets property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMTrafficImpact.LaneStatusDatasets }
     *     
     */
    public void setLaneStatusDatasets(IMTrafficImpact.LaneStatusDatasets value) {
        this.laneStatusDatasets = value;
    }

    /**
     * Gets the value of the localIMTrafficImpact property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.IMTrafficImpact }
     *     
     */
    public tcip_3_0_5_local.IMTrafficImpact getLocalIMTrafficImpact() {
        return localIMTrafficImpact;
    }

    /**
     * Sets the value of the localIMTrafficImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.IMTrafficImpact }
     *     
     */
    public void setLocalIMTrafficImpact(tcip_3_0_5_local.IMTrafficImpact value) {
        this.localIMTrafficImpact = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="affected-road" type="{http://www.lrms-final-09-07}StreetInfo"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedRoad"
    })
    public static class AffectedRoads {

        @XmlElement(name = "affected-road", required = true)
        protected List<StreetInfo> affectedRoad;

        /**
         * Gets the value of the affectedRoad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedRoad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedRoad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StreetInfo }
         * 
         * 
         */
        public List<StreetInfo> getAffectedRoad() {
            if (affectedRoad == null) {
                affectedRoad = new ArrayList<StreetInfo>();
            }
            return this.affectedRoad;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="lane-status-dataset" type="{http://www.tmdd-partial-00-00-00}Link-status"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "laneStatusDataset"
    })
    public static class LaneStatusDatasets {

        @XmlElement(name = "lane-status-dataset", required = true)
        protected List<String> laneStatusDataset;

        /**
         * Gets the value of the laneStatusDataset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the laneStatusDataset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLaneStatusDataset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLaneStatusDataset() {
            if (laneStatusDataset == null) {
                laneStatusDataset = new ArrayList<String>();
            }
            return this.laneStatusDataset;
        }

    }

}
