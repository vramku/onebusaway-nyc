//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package lrms_final_09_07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GridPointPair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridPointPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pointPairCoordinateType" type="{http://www.lrms-final-09-07}GridPointPairCoordinateType"/>
 *         &lt;element name="side" type="{http://www.lrms-final-09-07}Side"/>
 *         &lt;element name="pointPairInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="1000">
 *                   &lt;sequence>
 *                     &lt;element name="startLongitude" type="{http://www.lrms-final-09-07}GridPointLongitude" minOccurs="0"/>
 *                     &lt;element name="startLatitude" type="{http://www.lrms-final-09-07}GridPointLatitude" minOccurs="0"/>
 *                     &lt;element name="endLongitude" type="{http://www.lrms-final-09-07}GridPointLongitude" minOccurs="0"/>
 *                     &lt;element name="endLatitude" type="{http://www.lrms-final-09-07}GridPointLatitude" minOccurs="0"/>
 *                     &lt;element name="gridId" type="{http://www.lrms-final-09-07}Int-index8" minOccurs="0"/>
 *                     &lt;element name="startLatitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
 *                     &lt;element name="startLongitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
 *                     &lt;element name="endLatitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
 *                     &lt;element name="endLongitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
 *                     &lt;element name="endLatitudePointDelta" type="{http://www.lrms-final-09-07}GridLatLonPointDelta"/>
 *                     &lt;element name="endLongitudePointDelta" type="{http://www.lrms-final-09-07}GridLatLonPointDelta"/>
 *                     &lt;element name="startAltitudeGridDelta" type="{http://www.lrms-final-09-07}GridAltitudeDelta" minOccurs="0"/>
 *                     &lt;element name="endAltitudeGridDelta" type="{http://www.lrms-final-09-07}GridAltitudeDelta" minOccurs="0"/>
 *                     &lt;element name="offsetStart" type="{http://www.lrms-final-09-07}NormalizedDistance" minOccurs="0"/>
 *                     &lt;element name="offsetEnd" type="{http://www.lrms-final-09-07}NormalizedDistance" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localGridPointPair" type="{http://www.dummy-local-address}GridPointPair" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridPointPair", propOrder = {
    "pointPairCoordinateType",
    "side",
    "pointPairInfo",
    "localGridPointPair"
})
public class GridPointPair {

    @XmlElement(required = true)
    protected String pointPairCoordinateType;
    @XmlElement(required = true)
    protected String side;
    @XmlElement(required = true)
    protected GridPointPair.PointPairInfo pointPairInfo;
    protected dummy_local_address.GridPointPair localGridPointPair;

    /**
     * Gets the value of the pointPairCoordinateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointPairCoordinateType() {
        return pointPairCoordinateType;
    }

    /**
     * Sets the value of the pointPairCoordinateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointPairCoordinateType(String value) {
        this.pointPairCoordinateType = value;
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
     * Gets the value of the pointPairInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GridPointPair.PointPairInfo }
     *     
     */
    public GridPointPair.PointPairInfo getPointPairInfo() {
        return pointPairInfo;
    }

    /**
     * Sets the value of the pointPairInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridPointPair.PointPairInfo }
     *     
     */
    public void setPointPairInfo(GridPointPair.PointPairInfo value) {
        this.pointPairInfo = value;
    }

    /**
     * Gets the value of the localGridPointPair property.
     * 
     * @return
     *     possible object is
     *     {@link dummy_local_address.GridPointPair }
     *     
     */
    public dummy_local_address.GridPointPair getLocalGridPointPair() {
        return localGridPointPair;
    }

    /**
     * Sets the value of the localGridPointPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link dummy_local_address.GridPointPair }
     *     
     */
    public void setLocalGridPointPair(dummy_local_address.GridPointPair value) {
        this.localGridPointPair = value;
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
     *       &lt;sequence maxOccurs="1000">
     *         &lt;sequence>
     *           &lt;element name="startLongitude" type="{http://www.lrms-final-09-07}GridPointLongitude" minOccurs="0"/>
     *           &lt;element name="startLatitude" type="{http://www.lrms-final-09-07}GridPointLatitude" minOccurs="0"/>
     *           &lt;element name="endLongitude" type="{http://www.lrms-final-09-07}GridPointLongitude" minOccurs="0"/>
     *           &lt;element name="endLatitude" type="{http://www.lrms-final-09-07}GridPointLatitude" minOccurs="0"/>
     *           &lt;element name="gridId" type="{http://www.lrms-final-09-07}Int-index8" minOccurs="0"/>
     *           &lt;element name="startLatitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
     *           &lt;element name="startLongitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
     *           &lt;element name="endLatitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
     *           &lt;element name="endLongitudeGridDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
     *           &lt;element name="endLatitudePointDelta" type="{http://www.lrms-final-09-07}GridLatLonPointDelta"/>
     *           &lt;element name="endLongitudePointDelta" type="{http://www.lrms-final-09-07}GridLatLonPointDelta"/>
     *           &lt;element name="startAltitudeGridDelta" type="{http://www.lrms-final-09-07}GridAltitudeDelta" minOccurs="0"/>
     *           &lt;element name="endAltitudeGridDelta" type="{http://www.lrms-final-09-07}GridAltitudeDelta" minOccurs="0"/>
     *           &lt;element name="offsetStart" type="{http://www.lrms-final-09-07}NormalizedDistance" minOccurs="0"/>
     *           &lt;element name="offsetEnd" type="{http://www.lrms-final-09-07}NormalizedDistance" minOccurs="0"/>
     *         &lt;/sequence>
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
        "startLongitudeAndStartLatitudeAndEndLongitude"
    })
    public static class PointPairInfo {

        @XmlElementRefs({
            @XmlElementRef(name = "endLatitudePointDelta", type = JAXBElement.class),
            @XmlElementRef(name = "endLongitudePointDelta", type = JAXBElement.class),
            @XmlElementRef(name = "startLongitudeGridDelta", type = JAXBElement.class),
            @XmlElementRef(name = "endLatitudeGridDelta", type = JAXBElement.class),
            @XmlElementRef(name = "offsetEnd", type = JAXBElement.class),
            @XmlElementRef(name = "endLongitudeGridDelta", type = JAXBElement.class),
            @XmlElementRef(name = "startLatitudeGridDelta", type = JAXBElement.class),
            @XmlElementRef(name = "offsetStart", type = JAXBElement.class),
            @XmlElementRef(name = "endLongitude", type = JAXBElement.class),
            @XmlElementRef(name = "gridId", type = JAXBElement.class),
            @XmlElementRef(name = "startAltitudeGridDelta", type = JAXBElement.class),
            @XmlElementRef(name = "startLatitude", type = JAXBElement.class),
            @XmlElementRef(name = "endAltitudeGridDelta", type = JAXBElement.class),
            @XmlElementRef(name = "startLongitude", type = JAXBElement.class),
            @XmlElementRef(name = "endLatitude", type = JAXBElement.class)
        })
        protected List<JAXBElement<? extends Comparable>> startLongitudeAndStartLatitudeAndEndLongitude;

        /**
         * Gets the value of the startLongitudeAndStartLatitudeAndEndLongitude property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the startLongitudeAndStartLatitudeAndEndLongitude property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStartLongitudeAndStartLatitudeAndEndLongitude().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Float }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Float }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends Comparable>> getStartLongitudeAndStartLatitudeAndEndLongitude() {
            if (startLongitudeAndStartLatitudeAndEndLongitude == null) {
                startLongitudeAndStartLatitudeAndEndLongitude = new ArrayList<JAXBElement<? extends Comparable>>();
            }
            return this.startLongitudeAndStartLatitudeAndEndLongitude;
        }

    }

}
