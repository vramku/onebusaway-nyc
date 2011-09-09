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


/**
 * <p>Java class for SchRunningTimeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchRunningTimeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-3-0-5-1}CPTSubscriptionHeader"/>
 *         &lt;element name="languages" type="{http://www.TCIP-Final-3-0-5-1}CPTLanguageList" minOccurs="0"/>
 *         &lt;element name="patternVersion" type="{http://www.TCIP-Final-3-0-5-1}SCH-TimetableVersionID" minOccurs="0"/>
 *         &lt;element name="pattern-eff" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="routes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="route" type="{http://www.TCIP-Final-3-0-5-1}SCHRouteIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="patterns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="pattern" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pattern-segments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="pattern-segment" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternSegmentIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stoppoint-intervals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="stoppoint-interval" type="{http://www.TCIP-Final-3-0-5-1}SCHStoppointPair"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timepoint-intervals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="timepoint-interval" type="{http://www.TCIP-Final-3-0-5-1}SCHTimepointInterval"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="running-times">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="running-time" type="{http://www.TCIP-Final-3-0-5-1}SCHRunningTimeEntry"/>
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
@XmlType(name = "SchRunningTimeList", propOrder = {
    "subscriptionInfo",
    "languages",
    "patternVersion",
    "patternEff",
    "routes",
    "patterns",
    "patternSegments",
    "stoppointIntervals",
    "timepointIntervals",
    "runningTimes"
})
public class SchRunningTimeList {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    protected Long patternVersion;
    @XmlElement(name = "pattern-eff")
    protected String patternEff;
    protected SchRunningTimeList.Routes routes;
    protected SchRunningTimeList.Patterns patterns;
    @XmlElement(name = "pattern-segments")
    protected SchRunningTimeList.PatternSegments patternSegments;
    @XmlElement(name = "stoppoint-intervals")
    protected SchRunningTimeList.StoppointIntervals stoppointIntervals;
    @XmlElement(name = "timepoint-intervals")
    protected SchRunningTimeList.TimepointIntervals timepointIntervals;
    @XmlElement(name = "running-times", required = true)
    protected SchRunningTimeList.RunningTimes runningTimes;
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
     * Gets the value of the patternVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPatternVersion() {
        return patternVersion;
    }

    /**
     * Sets the value of the patternVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPatternVersion(Long value) {
        this.patternVersion = value;
    }

    /**
     * Gets the value of the patternEff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternEff() {
        return patternEff;
    }

    /**
     * Sets the value of the patternEff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternEff(String value) {
        this.patternEff = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunningTimeList.Routes }
     *     
     */
    public SchRunningTimeList.Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunningTimeList.Routes }
     *     
     */
    public void setRoutes(SchRunningTimeList.Routes value) {
        this.routes = value;
    }

    /**
     * Gets the value of the patterns property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunningTimeList.Patterns }
     *     
     */
    public SchRunningTimeList.Patterns getPatterns() {
        return patterns;
    }

    /**
     * Sets the value of the patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunningTimeList.Patterns }
     *     
     */
    public void setPatterns(SchRunningTimeList.Patterns value) {
        this.patterns = value;
    }

    /**
     * Gets the value of the patternSegments property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunningTimeList.PatternSegments }
     *     
     */
    public SchRunningTimeList.PatternSegments getPatternSegments() {
        return patternSegments;
    }

    /**
     * Sets the value of the patternSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunningTimeList.PatternSegments }
     *     
     */
    public void setPatternSegments(SchRunningTimeList.PatternSegments value) {
        this.patternSegments = value;
    }

    /**
     * Gets the value of the stoppointIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunningTimeList.StoppointIntervals }
     *     
     */
    public SchRunningTimeList.StoppointIntervals getStoppointIntervals() {
        return stoppointIntervals;
    }

    /**
     * Sets the value of the stoppointIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunningTimeList.StoppointIntervals }
     *     
     */
    public void setStoppointIntervals(SchRunningTimeList.StoppointIntervals value) {
        this.stoppointIntervals = value;
    }

    /**
     * Gets the value of the timepointIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunningTimeList.TimepointIntervals }
     *     
     */
    public SchRunningTimeList.TimepointIntervals getTimepointIntervals() {
        return timepointIntervals;
    }

    /**
     * Sets the value of the timepointIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunningTimeList.TimepointIntervals }
     *     
     */
    public void setTimepointIntervals(SchRunningTimeList.TimepointIntervals value) {
        this.timepointIntervals = value;
    }

    /**
     * Gets the value of the runningTimes property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunningTimeList.RunningTimes }
     *     
     */
    public SchRunningTimeList.RunningTimes getRunningTimes() {
        return runningTimes;
    }

    /**
     * Sets the value of the runningTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunningTimeList.RunningTimes }
     *     
     */
    public void setRunningTimes(SchRunningTimeList.RunningTimes value) {
        this.runningTimes = value;
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
     *         &lt;element name="pattern-segment" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternSegmentIden"/>
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
        "patternSegment"
    })
    public static class PatternSegments {

        @XmlElement(name = "pattern-segment", required = true)
        protected List<SCHPatternSegmentIden> patternSegment;

        /**
         * Gets the value of the patternSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patternSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatternSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHPatternSegmentIden }
         * 
         * 
         */
        public List<SCHPatternSegmentIden> getPatternSegment() {
            if (patternSegment == null) {
                patternSegment = new ArrayList<SCHPatternSegmentIden>();
            }
            return this.patternSegment;
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
     *         &lt;element name="pattern" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternIden"/>
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
        "pattern"
    })
    public static class Patterns {

        @XmlElement(required = true)
        protected List<SCHPatternIden> pattern;

        /**
         * Gets the value of the pattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHPatternIden }
         * 
         * 
         */
        public List<SCHPatternIden> getPattern() {
            if (pattern == null) {
                pattern = new ArrayList<SCHPatternIden>();
            }
            return this.pattern;
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
     *         &lt;element name="route" type="{http://www.TCIP-Final-3-0-5-1}SCHRouteIden"/>
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
        "route"
    })
    public static class Routes {

        @XmlElement(required = true)
        protected List<SCHRouteIden> route;

        /**
         * Gets the value of the route property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the route property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRouteIden }
         * 
         * 
         */
        public List<SCHRouteIden> getRoute() {
            if (route == null) {
                route = new ArrayList<SCHRouteIden>();
            }
            return this.route;
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
     *         &lt;element name="running-time" type="{http://www.TCIP-Final-3-0-5-1}SCHRunningTimeEntry"/>
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
        "runningTime"
    })
    public static class RunningTimes {

        @XmlElement(name = "running-time", required = true)
        protected List<SCHRunningTimeEntry> runningTime;

        /**
         * Gets the value of the runningTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runningTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRunningTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRunningTimeEntry }
         * 
         * 
         */
        public List<SCHRunningTimeEntry> getRunningTime() {
            if (runningTime == null) {
                runningTime = new ArrayList<SCHRunningTimeEntry>();
            }
            return this.runningTime;
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
     *         &lt;element name="stoppoint-interval" type="{http://www.TCIP-Final-3-0-5-1}SCHStoppointPair"/>
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
        "stoppointInterval"
    })
    public static class StoppointIntervals {

        @XmlElement(name = "stoppoint-interval", required = true)
        protected List<SCHStoppointPair> stoppointInterval;

        /**
         * Gets the value of the stoppointInterval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stoppointInterval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStoppointInterval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHStoppointPair }
         * 
         * 
         */
        public List<SCHStoppointPair> getStoppointInterval() {
            if (stoppointInterval == null) {
                stoppointInterval = new ArrayList<SCHStoppointPair>();
            }
            return this.stoppointInterval;
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
     *         &lt;element name="timepoint-interval" type="{http://www.TCIP-Final-3-0-5-1}SCHTimepointInterval"/>
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
        "timepointInterval"
    })
    public static class TimepointIntervals {

        @XmlElement(name = "timepoint-interval", required = true)
        protected List<SCHTimepointInterval> timepointInterval;

        /**
         * Gets the value of the timepointInterval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timepointInterval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimepointInterval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimepointInterval }
         * 
         * 
         */
        public List<SCHTimepointInterval> getTimepointInterval() {
            if (timepointInterval == null) {
                timepointInterval = new ArrayList<SCHTimepointInterval>();
            }
            return this.timepointInterval;
        }

    }

}
