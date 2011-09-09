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
 * <p>Java class for GridPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pointCoordinateType" type="{http://www.lrms-final-09-07}GridPointCoordinateType" minOccurs="0"/>
 *         &lt;element name="side" type="{http://www.lrms-final-09-07}Side" minOccurs="0"/>
 *         &lt;element name="gridPointInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="1000">
 *                   &lt;sequence>
 *                     &lt;element name="longitude" type="{http://www.lrms-final-09-07}GridPointLongitude" minOccurs="0"/>
 *                     &lt;element name="latitude" type="{http://www.lrms-final-09-07}GridPointLatitude" minOccurs="0"/>
 *                     &lt;element name="gridId" type="{http://www.lrms-final-09-07}Int-index8" minOccurs="0"/>
 *                     &lt;element name="latitudeDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
 *                     &lt;element name="longitudeDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
 *                     &lt;element name="altitudeDelta" type="{http://www.lrms-final-09-07}GridPointAltitudeDelta" minOccurs="0"/>
 *                     &lt;element name="offsetStart" type="{http://www.lrms-final-09-07}GridPointOffsetDistance" minOccurs="0"/>
 *                     &lt;element name="offsetEnd" type="{http://www.lrms-final-09-07}GridPointOffsetDistance" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localGridPoint" type="{http://www.dummy-local-address}GridPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridPoint", propOrder = {
    "pointCoordinateType",
    "side",
    "gridPointInfo",
    "localGridPoint"
})
public class GridPoint {

    protected String pointCoordinateType;
    protected String side;
    @XmlElement(required = true)
    protected GridPoint.GridPointInfo gridPointInfo;
    protected dummy_local_address.GridPoint localGridPoint;

    /**
     * Gets the value of the pointCoordinateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointCoordinateType() {
        return pointCoordinateType;
    }

    /**
     * Sets the value of the pointCoordinateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointCoordinateType(String value) {
        this.pointCoordinateType = value;
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
     * Gets the value of the gridPointInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GridPoint.GridPointInfo }
     *     
     */
    public GridPoint.GridPointInfo getGridPointInfo() {
        return gridPointInfo;
    }

    /**
     * Sets the value of the gridPointInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridPoint.GridPointInfo }
     *     
     */
    public void setGridPointInfo(GridPoint.GridPointInfo value) {
        this.gridPointInfo = value;
    }

    /**
     * Gets the value of the localGridPoint property.
     * 
     * @return
     *     possible object is
     *     {@link dummy_local_address.GridPoint }
     *     
     */
    public dummy_local_address.GridPoint getLocalGridPoint() {
        return localGridPoint;
    }

    /**
     * Sets the value of the localGridPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link dummy_local_address.GridPoint }
     *     
     */
    public void setLocalGridPoint(dummy_local_address.GridPoint value) {
        this.localGridPoint = value;
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
     *           &lt;element name="longitude" type="{http://www.lrms-final-09-07}GridPointLongitude" minOccurs="0"/>
     *           &lt;element name="latitude" type="{http://www.lrms-final-09-07}GridPointLatitude" minOccurs="0"/>
     *           &lt;element name="gridId" type="{http://www.lrms-final-09-07}Int-index8" minOccurs="0"/>
     *           &lt;element name="latitudeDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
     *           &lt;element name="longitudeDelta" type="{http://www.lrms-final-09-07}GridPointLatLonDelta"/>
     *           &lt;element name="altitudeDelta" type="{http://www.lrms-final-09-07}GridPointAltitudeDelta" minOccurs="0"/>
     *           &lt;element name="offsetStart" type="{http://www.lrms-final-09-07}GridPointOffsetDistance" minOccurs="0"/>
     *           &lt;element name="offsetEnd" type="{http://www.lrms-final-09-07}GridPointOffsetDistance" minOccurs="0"/>
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
        "longitudeAndLatitudeAndGridId"
    })
    public static class GridPointInfo {

        @XmlElementRefs({
            @XmlElementRef(name = "altitudeDelta", type = JAXBElement.class),
            @XmlElementRef(name = "longitude", type = JAXBElement.class),
            @XmlElementRef(name = "gridId", type = JAXBElement.class),
            @XmlElementRef(name = "offsetEnd", type = JAXBElement.class),
            @XmlElementRef(name = "longitudeDelta", type = JAXBElement.class),
            @XmlElementRef(name = "latitudeDelta", type = JAXBElement.class),
            @XmlElementRef(name = "latitude", type = JAXBElement.class),
            @XmlElementRef(name = "offsetStart", type = JAXBElement.class)
        })
        protected List<JAXBElement<? extends Comparable>> longitudeAndLatitudeAndGridId;

        /**
         * Gets the value of the longitudeAndLatitudeAndGridId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the longitudeAndLatitudeAndGridId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLongitudeAndLatitudeAndGridId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link Short }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends Comparable>> getLongitudeAndLatitudeAndGridId() {
            if (longitudeAndLatitudeAndGridId == null) {
                longitudeAndLatitudeAndGridId = new ArrayList<JAXBElement<? extends Comparable>>();
            }
            return this.longitudeAndLatitudeAndGridId;
        }

    }

}
