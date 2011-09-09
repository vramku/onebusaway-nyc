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
 * <p>Java class for SPFacilityGeoLoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPFacilityGeoLoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facility" type="{http://www.TCIP-Final-3-0-5-1}CPTTransitFacilityIden"/>
 *         &lt;element name="pointLocation" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/>
 *         &lt;element name="polygonLocation" type="{http://www.TCIP-Final-3-0-5-1}SPPolygon" minOccurs="0"/>
 *         &lt;element name="frontageBegin" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/>
 *         &lt;element name="frontageEnd" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/>
 *         &lt;element name="data-quality" type="{http://www.TCIP-Final-3-0-5-1}SPDataQuality"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPFacilityGeoLoc", propOrder = {
    "facility",
    "pointLocation",
    "polygonLocation",
    "frontageBegin",
    "frontageEnd",
    "dataQuality"
})
public class SPFacilityGeoLoc {

    @XmlElement(required = true)
    protected CPTTransitFacilityIden facility;
    protected GeoLocation pointLocation;
    protected SPPolygon polygonLocation;
    protected GeoLocation frontageBegin;
    protected GeoLocation frontageEnd;
    @XmlElement(name = "data-quality", required = true)
    protected SPDataQuality dataQuality;

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link CPTTransitFacilityIden }
     *     
     */
    public CPTTransitFacilityIden getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTTransitFacilityIden }
     *     
     */
    public void setFacility(CPTTransitFacilityIden value) {
        this.facility = value;
    }

    /**
     * Gets the value of the pointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getPointLocation() {
        return pointLocation;
    }

    /**
     * Sets the value of the pointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setPointLocation(GeoLocation value) {
        this.pointLocation = value;
    }

    /**
     * Gets the value of the polygonLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SPPolygon }
     *     
     */
    public SPPolygon getPolygonLocation() {
        return polygonLocation;
    }

    /**
     * Sets the value of the polygonLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPolygon }
     *     
     */
    public void setPolygonLocation(SPPolygon value) {
        this.polygonLocation = value;
    }

    /**
     * Gets the value of the frontageBegin property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getFrontageBegin() {
        return frontageBegin;
    }

    /**
     * Sets the value of the frontageBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setFrontageBegin(GeoLocation value) {
        this.frontageBegin = value;
    }

    /**
     * Gets the value of the frontageEnd property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getFrontageEnd() {
        return frontageEnd;
    }

    /**
     * Sets the value of the frontageEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setFrontageEnd(GeoLocation value) {
        this.frontageEnd = value;
    }

    /**
     * Gets the value of the dataQuality property.
     * 
     * @return
     *     possible object is
     *     {@link SPDataQuality }
     *     
     */
    public SPDataQuality getDataQuality() {
        return dataQuality;
    }

    /**
     * Sets the value of the dataQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDataQuality }
     *     
     */
    public void setDataQuality(SPDataQuality value) {
        this.dataQuality = value;
    }

}
