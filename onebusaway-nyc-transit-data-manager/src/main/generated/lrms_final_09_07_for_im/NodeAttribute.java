//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package lrms_final_09_07_for_im;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeId" type="{http://www.lrms-final-09-07-for-im}IdType" minOccurs="0"/>
 *         &lt;element name="chainId" type="{http://www.lrms-final-09-07-for-im}IdType" minOccurs="0"/>
 *         &lt;element name="nodeOrigin" type="{http://www.lrms-final-09-07-for-im}NodeOrigin" minOccurs="0"/>
 *         &lt;element name="nodeValence" type="{http://www.lrms-final-09-07-for-im}NodeValence" minOccurs="0"/>
 *         &lt;element name="geoLocation" type="{http://www.lrms-final-09-07-for-im}GeoLocation" minOccurs="0"/>
 *         &lt;element name="streets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="10" minOccurs="0">
 *                   &lt;element name="street" type="{http://www.lrms-final-09-07-for-im}StreetInfo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localNodeAttribute" type="{http://www.lrms-local-for-im}NodeAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeAttribute", propOrder = {
    "nodeId",
    "chainId",
    "nodeOrigin",
    "nodeValence",
    "geoLocation",
    "streets",
    "localNodeAttribute"
})
public class NodeAttribute {

    protected IdType nodeId;
    protected IdType chainId;
    protected String nodeOrigin;
    protected Short nodeValence;
    protected GeoLocation geoLocation;
    protected NodeAttribute.Streets streets;
    protected lrms_local_for_im.NodeAttribute localNodeAttribute;

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setNodeId(IdType value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the chainId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getChainId() {
        return chainId;
    }

    /**
     * Sets the value of the chainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setChainId(IdType value) {
        this.chainId = value;
    }

    /**
     * Gets the value of the nodeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeOrigin() {
        return nodeOrigin;
    }

    /**
     * Sets the value of the nodeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeOrigin(String value) {
        this.nodeOrigin = value;
    }

    /**
     * Gets the value of the nodeValence property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNodeValence() {
        return nodeValence;
    }

    /**
     * Sets the value of the nodeValence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNodeValence(Short value) {
        this.nodeValence = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the streets property.
     * 
     * @return
     *     possible object is
     *     {@link NodeAttribute.Streets }
     *     
     */
    public NodeAttribute.Streets getStreets() {
        return streets;
    }

    /**
     * Sets the value of the streets property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeAttribute.Streets }
     *     
     */
    public void setStreets(NodeAttribute.Streets value) {
        this.streets = value;
    }

    /**
     * Gets the value of the localNodeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link lrms_local_for_im.NodeAttribute }
     *     
     */
    public lrms_local_for_im.NodeAttribute getLocalNodeAttribute() {
        return localNodeAttribute;
    }

    /**
     * Sets the value of the localNodeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link lrms_local_for_im.NodeAttribute }
     *     
     */
    public void setLocalNodeAttribute(lrms_local_for_im.NodeAttribute value) {
        this.localNodeAttribute = value;
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
     *       &lt;sequence maxOccurs="10" minOccurs="0">
     *         &lt;element name="street" type="{http://www.lrms-final-09-07-for-im}StreetInfo"/>
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
        "street"
    })
    public static class Streets {

        protected List<StreetInfo> street;

        /**
         * Gets the value of the street property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the street property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStreet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StreetInfo }
         * 
         * 
         */
        public List<StreetInfo> getStreet() {
            if (street == null) {
                street = new ArrayList<StreetInfo>();
            }
            return this.street;
        }

    }

}
