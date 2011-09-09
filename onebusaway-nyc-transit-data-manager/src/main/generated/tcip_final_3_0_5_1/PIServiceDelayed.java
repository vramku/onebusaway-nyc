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


/**
 * <p>Java class for PIServiceDelayed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIServiceDelayed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="route" type="{http://www.TCIP-Final-3-0-5-1}SCHRouteIden"/>
 *         &lt;element name="direction" type="{http://www.TCIP-Final-3-0-5-1}SCH-RouteDirectionName"/>
 *         &lt;element name="directionLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="suspended" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="start-location" type="{http://www.TCIP-Final-3-0-5-1}SCHTimeStoppoint" minOccurs="0"/>
 *         &lt;element name="end-location" type="{http://www.TCIP-Final-3-0-5-1}SCHTimeStoppoint" minOccurs="0"/>
 *         &lt;element name="start-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="end-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="delay" type="{http://www.TCIP-Final-3-0-5-1}CPT-Duration" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="remarksLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="localPIServiceDelayed" type="{http://www.tcip-3-0-5-local}PIServiceDelayed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIServiceDelayed", propOrder = {
    "route",
    "direction",
    "directionLangs",
    "suspended",
    "startLocation",
    "endLocation",
    "startTime",
    "endTime",
    "delay",
    "remarks",
    "remarksLangs",
    "localPIServiceDelayed"
})
public class PIServiceDelayed {

    @XmlElement(required = true)
    protected SCHRouteIden route;
    @XmlElement(required = true)
    protected String direction;
    protected CPTAdditionalLanguageContents directionLangs;
    protected boolean suspended;
    @XmlElement(name = "start-location")
    protected SCHTimeStoppoint startLocation;
    @XmlElement(name = "end-location")
    protected SCHTimeStoppoint endLocation;
    @XmlElement(name = "start-time")
    protected String startTime;
    @XmlElement(name = "end-time")
    protected String endTime;
    protected String delay;
    protected String remarks;
    protected CPTAdditionalLanguageContents remarksLangs;
    protected tcip_3_0_5_local.PIServiceDelayed localPIServiceDelayed;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setRoute(SCHRouteIden value) {
        this.route = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the directionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDirectionLangs() {
        return directionLangs;
    }

    /**
     * Sets the value of the directionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDirectionLangs(CPTAdditionalLanguageContents value) {
        this.directionLangs = value;
    }

    /**
     * Gets the value of the suspended property.
     * 
     */
    public boolean isSuspended() {
        return suspended;
    }

    /**
     * Sets the value of the suspended property.
     * 
     */
    public void setSuspended(boolean value) {
        this.suspended = value;
    }

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimeStoppoint }
     *     
     */
    public SCHTimeStoppoint getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimeStoppoint }
     *     
     */
    public void setStartLocation(SCHTimeStoppoint value) {
        this.startLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimeStoppoint }
     *     
     */
    public SCHTimeStoppoint getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimeStoppoint }
     *     
     */
    public void setEndLocation(SCHTimeStoppoint value) {
        this.endLocation = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(String value) {
        this.delay = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the remarksLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getRemarksLangs() {
        return remarksLangs;
    }

    /**
     * Sets the value of the remarksLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setRemarksLangs(CPTAdditionalLanguageContents value) {
        this.remarksLangs = value;
    }

    /**
     * Gets the value of the localPIServiceDelayed property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.PIServiceDelayed }
     *     
     */
    public tcip_3_0_5_local.PIServiceDelayed getLocalPIServiceDelayed() {
        return localPIServiceDelayed;
    }

    /**
     * Sets the value of the localPIServiceDelayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.PIServiceDelayed }
     *     
     */
    public void setLocalPIServiceDelayed(tcip_3_0_5_local.PIServiceDelayed value) {
        this.localPIServiceDelayed = value;
    }

}
