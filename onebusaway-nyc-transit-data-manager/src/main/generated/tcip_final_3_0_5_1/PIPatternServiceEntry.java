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
import lrms_final_09_07.Distance;
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for PIPatternServiceEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIPatternServiceEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleID" type="{http://www.TCIP-Final-3-0-5-1}CPTVehicleIden"/>
 *         &lt;element name="patternID" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternIden"/>
 *         &lt;element name="location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/>
 *         &lt;element name="scheduleStatus" type="{http://www.TCIP-Final-3-0-5-1}OB-ScheduleAdherenceOffset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIPatternServiceEntry", propOrder = {
    "vehicleID",
    "patternID",
    "location",
    "distance",
    "scheduleStatus"
})
public class PIPatternServiceEntry {

    @XmlElement(required = true)
    protected CPTVehicleIden vehicleID;
    @XmlElement(required = true)
    protected SCHPatternIden patternID;
    protected GeoLocation location;
    protected Distance distance;
    protected Integer scheduleStatus;

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setVehicleID(CPTVehicleIden value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the patternID property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternIden }
     *     
     */
    public SCHPatternIden getPatternID() {
        return patternID;
    }

    /**
     * Sets the value of the patternID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternIden }
     *     
     */
    public void setPatternID(SCHPatternIden value) {
        this.patternID = value;
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
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the scheduleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    /**
     * Sets the value of the scheduleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleStatus(Integer value) {
        this.scheduleStatus = value;
    }

}
