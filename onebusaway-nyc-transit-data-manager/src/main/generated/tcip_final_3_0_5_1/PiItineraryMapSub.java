//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_final_3_0_5_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import atis_partial_03_00_74.Route;


/**
 * <p>Java class for PiItineraryMapSub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PiItineraryMapSub">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-3-0-5-1}CPTSubscriptionHeader"/>
 *         &lt;element name="languages" type="{http://www.TCIP-Final-3-0-5-1}CPTLanguageList" minOccurs="0"/>
 *         &lt;element name="itinerarys">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="itinerary" type="{http://www.atis-partial-03-00-74}Route"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="map-contents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="map-content" type="{http://www.TCIP-Final-3-0-5-1}CPT-FeatureType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="highlight-items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="highlight-item" type="{http://www.TCIP-Final-3-0-5-1}CPTGenericIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="highlight-classes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="highlight-classe" type="{http://www.TCIP-Final-3-0-5-1}CPT-FeatureType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.TCIP-Final-3-0-5-1}tcipMsgAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PiItineraryMapSub", propOrder = {
    "subscriptionInfo",
    "languages",
    "itinerarys",
    "mapContents",
    "highlightItems",
    "highlightClasses"
})
public class PiItineraryMapSub {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    @XmlElement(required = true)
    protected PiItineraryMapSub.Itinerarys itinerarys;
    @XmlElement(name = "map-contents")
    protected PiItineraryMapSub.MapContents mapContents;
    @XmlElement(name = "highlight-items")
    protected PiItineraryMapSub.HighlightItems highlightItems;
    @XmlElement(name = "highlight-classes")
    protected PiItineraryMapSub.HighlightClasses highlightClasses;
    @XmlAttribute(name = "created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "schVersion", required = true)
    protected String schVersion;
    @XmlAttribute(name = "sourceapp", required = true)
    protected String sourceapp;
    @XmlAttribute(name = "sourceip", required = true)
    protected String sourceip;
    @XmlAttribute(name = "sourceport", required = true)
    protected BigInteger sourceport;
    @XmlAttribute(name = "noNameSpaceSchemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noNameSpaceSchemaLocation;
    @XmlAttribute(name = "activation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activation;
    @XmlAttribute(name = "deactivation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivation;

    /**
     * Gets the value of the subscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getSubscriptionInfo() {
        return subscriptionInfo;
    }

    /**
     * Sets the value of the subscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setSubscriptionInfo(CPTSubscriptionHeader value) {
        this.subscriptionInfo = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link CPTLanguageList }
     *     
     */
    public CPTLanguageList getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTLanguageList }
     *     
     */
    public void setLanguages(CPTLanguageList value) {
        this.languages = value;
    }

    /**
     * Gets the value of the itinerarys property.
     * 
     * @return
     *     possible object is
     *     {@link PiItineraryMapSub.Itinerarys }
     *     
     */
    public PiItineraryMapSub.Itinerarys getItinerarys() {
        return itinerarys;
    }

    /**
     * Sets the value of the itinerarys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiItineraryMapSub.Itinerarys }
     *     
     */
    public void setItinerarys(PiItineraryMapSub.Itinerarys value) {
        this.itinerarys = value;
    }

    /**
     * Gets the value of the mapContents property.
     * 
     * @return
     *     possible object is
     *     {@link PiItineraryMapSub.MapContents }
     *     
     */
    public PiItineraryMapSub.MapContents getMapContents() {
        return mapContents;
    }

    /**
     * Sets the value of the mapContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiItineraryMapSub.MapContents }
     *     
     */
    public void setMapContents(PiItineraryMapSub.MapContents value) {
        this.mapContents = value;
    }

    /**
     * Gets the value of the highlightItems property.
     * 
     * @return
     *     possible object is
     *     {@link PiItineraryMapSub.HighlightItems }
     *     
     */
    public PiItineraryMapSub.HighlightItems getHighlightItems() {
        return highlightItems;
    }

    /**
     * Sets the value of the highlightItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiItineraryMapSub.HighlightItems }
     *     
     */
    public void setHighlightItems(PiItineraryMapSub.HighlightItems value) {
        this.highlightItems = value;
    }

    /**
     * Gets the value of the highlightClasses property.
     * 
     * @return
     *     possible object is
     *     {@link PiItineraryMapSub.HighlightClasses }
     *     
     */
    public PiItineraryMapSub.HighlightClasses getHighlightClasses() {
        return highlightClasses;
    }

    /**
     * Sets the value of the highlightClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiItineraryMapSub.HighlightClasses }
     *     
     */
    public void setHighlightClasses(PiItineraryMapSub.HighlightClasses value) {
        this.highlightClasses = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the schVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchVersion() {
        return schVersion;
    }

    /**
     * Sets the value of the schVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchVersion(String value) {
        this.schVersion = value;
    }

    /**
     * Gets the value of the sourceapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceapp() {
        return sourceapp;
    }

    /**
     * Sets the value of the sourceapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceapp(String value) {
        this.sourceapp = value;
    }

    /**
     * Gets the value of the sourceip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceip() {
        return sourceip;
    }

    /**
     * Sets the value of the sourceip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceip(String value) {
        this.sourceip = value;
    }

    /**
     * Gets the value of the sourceport property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceport() {
        return sourceport;
    }

    /**
     * Sets the value of the sourceport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceport(BigInteger value) {
        this.sourceport = value;
    }

    /**
     * Gets the value of the noNameSpaceSchemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNameSpaceSchemaLocation() {
        return noNameSpaceSchemaLocation;
    }

    /**
     * Sets the value of the noNameSpaceSchemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNameSpaceSchemaLocation(String value) {
        this.noNameSpaceSchemaLocation = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivation(XMLGregorianCalendar value) {
        this.activation = value;
    }

    /**
     * Gets the value of the deactivation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactivation() {
        return deactivation;
    }

    /**
     * Sets the value of the deactivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactivation(XMLGregorianCalendar value) {
        this.deactivation = value;
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
     *         &lt;element name="highlight-classe" type="{http://www.TCIP-Final-3-0-5-1}CPT-FeatureType"/>
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
        "highlightClasse"
    })
    public static class HighlightClasses {

        @XmlElement(name = "highlight-classe", required = true)
        protected List<String> highlightClasse;

        /**
         * Gets the value of the highlightClasse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the highlightClasse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHighlightClasse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getHighlightClasse() {
            if (highlightClasse == null) {
                highlightClasse = new ArrayList<String>();
            }
            return this.highlightClasse;
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
     *         &lt;element name="highlight-item" type="{http://www.TCIP-Final-3-0-5-1}CPTGenericIden"/>
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
        "highlightItem"
    })
    public static class HighlightItems {

        @XmlElement(name = "highlight-item", required = true)
        protected List<CPTGenericIden> highlightItem;

        /**
         * Gets the value of the highlightItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the highlightItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHighlightItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTGenericIden }
         * 
         * 
         */
        public List<CPTGenericIden> getHighlightItem() {
            if (highlightItem == null) {
                highlightItem = new ArrayList<CPTGenericIden>();
            }
            return this.highlightItem;
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
     *         &lt;element name="itinerary" type="{http://www.atis-partial-03-00-74}Route"/>
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
        "itinerary"
    })
    public static class Itinerarys {

        @XmlElement(required = true)
        protected List<Route> itinerary;

        /**
         * Gets the value of the itinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Route }
         * 
         * 
         */
        public List<Route> getItinerary() {
            if (itinerary == null) {
                itinerary = new ArrayList<Route>();
            }
            return this.itinerary;
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
     *         &lt;element name="map-content" type="{http://www.TCIP-Final-3-0-5-1}CPT-FeatureType"/>
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
        "mapContent"
    })
    public static class MapContents {

        @XmlElement(name = "map-content", required = true)
        protected List<String> mapContent;

        /**
         * Gets the value of the mapContent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mapContent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMapContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMapContent() {
            if (mapContent == null) {
                mapContent = new ArrayList<String>();
            }
            return this.mapContent;
        }

    }

}
