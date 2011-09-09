//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package lrms_final_09_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://www.lrms-final-09-07}Text-name255" minOccurs="0"/>
 *         &lt;element name="linearRefMethod" type="{http://www.lrms-final-09-07}LRMethod" minOccurs="0"/>
 *         &lt;element name="transElement" type="{http://www.lrms-final-09-07}StreetInfo" minOccurs="0"/>
 *         &lt;element name="startRefPoint" type="{http://www.lrms-final-09-07}PointLocation" minOccurs="0"/>
 *         &lt;element name="endRefPoint" type="{http://www.lrms-final-09-07}PointLocation" minOccurs="0"/>
 *         &lt;element name="startDistance" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/>
 *         &lt;element name="endDistance" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/>
 *         &lt;element name="startNormDistance" type="{http://www.lrms-final-09-07}NormalizedDistance" minOccurs="0"/>
 *         &lt;element name="endNormDistance" type="{http://www.lrms-final-09-07}NormalizedDistance" minOccurs="0"/>
 *         &lt;element name="distanceDirection" type="{http://www.lrms-final-09-07}Direction" minOccurs="0"/>
 *         &lt;element name="lateralOffsetRef" type="{http://www.lrms-final-09-07}LROffsetRef" minOccurs="0"/>
 *         &lt;element name="positiveOffsetDir" type="{http://www.lrms-final-09-07}LRPosOffsetDir" minOccurs="0"/>
 *         &lt;element name="startLateralOffset" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/>
 *         &lt;element name="endLateralOffset" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/>
 *         &lt;element name="travelDirection" type="{http://www.lrms-final-09-07}Direction" minOccurs="0"/>
 *         &lt;element name="side" type="{http://www.lrms-final-09-07}Side" minOccurs="0"/>
 *         &lt;element name="startHeight" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/>
 *         &lt;element name="endheight" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/>
 *         &lt;element name="startAdminAreas" type="{http://www.lrms-final-09-07}AdminAreaGroup" minOccurs="0"/>
 *         &lt;element name="endAdminAreas" type="{http://www.lrms-final-09-07}AdminAreaGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="locationID" type="{http://www.lrms-final-09-07}String-index64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearReference", propOrder = {
    "locationName",
    "linearRefMethod",
    "transElement",
    "startRefPoint",
    "endRefPoint",
    "startDistance",
    "endDistance",
    "startNormDistance",
    "endNormDistance",
    "distanceDirection",
    "lateralOffsetRef",
    "positiveOffsetDir",
    "startLateralOffset",
    "endLateralOffset",
    "travelDirection",
    "side",
    "startHeight",
    "endheight",
    "startAdminAreas",
    "endAdminAreas"
})
public class LinearReference {

    protected String locationName;
    protected String linearRefMethod;
    protected StreetInfo transElement;
    protected PointLocation startRefPoint;
    protected PointLocation endRefPoint;
    protected Distance startDistance;
    protected Distance endDistance;
    protected Float startNormDistance;
    protected Float endNormDistance;
    protected String distanceDirection;
    protected String lateralOffsetRef;
    protected String positiveOffsetDir;
    protected Distance startLateralOffset;
    protected Distance endLateralOffset;
    protected String travelDirection;
    protected String side;
    protected Height startHeight;
    protected Height endheight;
    protected AdminAreaGroup startAdminAreas;
    protected AdminAreaGroup endAdminAreas;
    @XmlAttribute(name = "locationID")
    protected String locationID;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the linearRefMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearRefMethod() {
        return linearRefMethod;
    }

    /**
     * Sets the value of the linearRefMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearRefMethod(String value) {
        this.linearRefMethod = value;
    }

    /**
     * Gets the value of the transElement property.
     * 
     * @return
     *     possible object is
     *     {@link StreetInfo }
     *     
     */
    public StreetInfo getTransElement() {
        return transElement;
    }

    /**
     * Sets the value of the transElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetInfo }
     *     
     */
    public void setTransElement(StreetInfo value) {
        this.transElement = value;
    }

    /**
     * Gets the value of the startRefPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getStartRefPoint() {
        return startRefPoint;
    }

    /**
     * Sets the value of the startRefPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setStartRefPoint(PointLocation value) {
        this.startRefPoint = value;
    }

    /**
     * Gets the value of the endRefPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getEndRefPoint() {
        return endRefPoint;
    }

    /**
     * Sets the value of the endRefPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setEndRefPoint(PointLocation value) {
        this.endRefPoint = value;
    }

    /**
     * Gets the value of the startDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getStartDistance() {
        return startDistance;
    }

    /**
     * Sets the value of the startDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setStartDistance(Distance value) {
        this.startDistance = value;
    }

    /**
     * Gets the value of the endDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getEndDistance() {
        return endDistance;
    }

    /**
     * Sets the value of the endDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setEndDistance(Distance value) {
        this.endDistance = value;
    }

    /**
     * Gets the value of the startNormDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStartNormDistance() {
        return startNormDistance;
    }

    /**
     * Sets the value of the startNormDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStartNormDistance(Float value) {
        this.startNormDistance = value;
    }

    /**
     * Gets the value of the endNormDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEndNormDistance() {
        return endNormDistance;
    }

    /**
     * Sets the value of the endNormDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEndNormDistance(Float value) {
        this.endNormDistance = value;
    }

    /**
     * Gets the value of the distanceDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceDirection() {
        return distanceDirection;
    }

    /**
     * Sets the value of the distanceDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceDirection(String value) {
        this.distanceDirection = value;
    }

    /**
     * Gets the value of the lateralOffsetRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateralOffsetRef() {
        return lateralOffsetRef;
    }

    /**
     * Sets the value of the lateralOffsetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateralOffsetRef(String value) {
        this.lateralOffsetRef = value;
    }

    /**
     * Gets the value of the positiveOffsetDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveOffsetDir() {
        return positiveOffsetDir;
    }

    /**
     * Sets the value of the positiveOffsetDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveOffsetDir(String value) {
        this.positiveOffsetDir = value;
    }

    /**
     * Gets the value of the startLateralOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getStartLateralOffset() {
        return startLateralOffset;
    }

    /**
     * Sets the value of the startLateralOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setStartLateralOffset(Distance value) {
        this.startLateralOffset = value;
    }

    /**
     * Gets the value of the endLateralOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getEndLateralOffset() {
        return endLateralOffset;
    }

    /**
     * Sets the value of the endLateralOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setEndLateralOffset(Distance value) {
        this.endLateralOffset = value;
    }

    /**
     * Gets the value of the travelDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDirection() {
        return travelDirection;
    }

    /**
     * Sets the value of the travelDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDirection(String value) {
        this.travelDirection = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the startHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getStartHeight() {
        return startHeight;
    }

    /**
     * Sets the value of the startHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setStartHeight(Height value) {
        this.startHeight = value;
    }

    /**
     * Gets the value of the endheight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getEndheight() {
        return endheight;
    }

    /**
     * Sets the value of the endheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setEndheight(Height value) {
        this.endheight = value;
    }

    /**
     * Gets the value of the startAdminAreas property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAreaGroup }
     *     
     */
    public AdminAreaGroup getStartAdminAreas() {
        return startAdminAreas;
    }

    /**
     * Sets the value of the startAdminAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAreaGroup }
     *     
     */
    public void setStartAdminAreas(AdminAreaGroup value) {
        this.startAdminAreas = value;
    }

    /**
     * Gets the value of the endAdminAreas property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAreaGroup }
     *     
     */
    public AdminAreaGroup getEndAdminAreas() {
        return endAdminAreas;
    }

    /**
     * Sets the value of the endAdminAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAreaGroup }
     *     
     */
    public void setEndAdminAreas(AdminAreaGroup value) {
        this.endAdminAreas = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

}
