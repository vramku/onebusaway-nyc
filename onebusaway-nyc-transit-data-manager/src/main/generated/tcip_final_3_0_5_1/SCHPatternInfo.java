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
import lrms_final_09_07.Distance;


/**
 * <p>Java class for SCHPatternInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHPatternInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pattern" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternIden"/>
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-3-0-5-1}CPTRowMetaData" minOccurs="0"/>
 *         &lt;element name="pattern-notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="pattern-note" type="{http://www.TCIP-Final-3-0-5-1}SCHNoteIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="triggers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="trigger" type="{http://www.TCIP-Final-3-0-5-1}SCHActivationIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="segments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="segment" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternSegmentIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="segmentOffsets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="segmentOffset" type="{http://www.lrms-final-09-07}Distance"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="radio-zones" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="radio-zone" type="{http://www.TCIP-Final-3-0-5-1}CPTRadioZone"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="events" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="event" type="{http://www.TCIP-Final-3-0-5-1}SCHEvent"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="eventOffsets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="eventOffset" type="{http://www.lrms-final-09-07}Distance"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="route" type="{http://www.TCIP-Final-3-0-5-1}SCHRouteIden" minOccurs="0"/>
 *         &lt;element name="routeDirection" type="{http://www.TCIP-Final-3-0-5-1}SCH-RouteDirectionName" minOccurs="0"/>
 *         &lt;element name="routeDirectionLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="destinationLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="localSCHPatternInfo" type="{http://www.tcip-3-0-5-local}SCHPatternInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHPatternInfo", propOrder = {
    "pattern",
    "metadata",
    "patternNotes",
    "triggers",
    "segments",
    "segmentOffsets",
    "radioZones",
    "events",
    "eventOffsets",
    "route",
    "routeDirection",
    "routeDirectionLangs",
    "destination",
    "destinationLangs",
    "localSCHPatternInfo"
})
public class SCHPatternInfo {

    @XmlElement(required = true)
    protected SCHPatternIden pattern;
    protected CPTRowMetaData metadata;
    @XmlElement(name = "pattern-notes")
    protected SCHPatternInfo.PatternNotes patternNotes;
    protected SCHPatternInfo.Triggers triggers;
    @XmlElement(required = true)
    protected SCHPatternInfo.Segments segments;
    protected SCHPatternInfo.SegmentOffsets segmentOffsets;
    @XmlElement(name = "radio-zones")
    protected SCHPatternInfo.RadioZones radioZones;
    protected SCHPatternInfo.Events events;
    protected SCHPatternInfo.EventOffsets eventOffsets;
    protected SCHRouteIden route;
    protected String routeDirection;
    protected CPTAdditionalLanguageContents routeDirectionLangs;
    protected String destination;
    protected CPTAdditionalLanguageContents destinationLangs;
    protected tcip_3_0_5_local.SCHPatternInfo localSCHPatternInfo;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternIden }
     *     
     */
    public SCHPatternIden getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternIden }
     *     
     */
    public void setPattern(SCHPatternIden value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the patternNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.PatternNotes }
     *     
     */
    public SCHPatternInfo.PatternNotes getPatternNotes() {
        return patternNotes;
    }

    /**
     * Sets the value of the patternNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.PatternNotes }
     *     
     */
    public void setPatternNotes(SCHPatternInfo.PatternNotes value) {
        this.patternNotes = value;
    }

    /**
     * Gets the value of the triggers property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.Triggers }
     *     
     */
    public SCHPatternInfo.Triggers getTriggers() {
        return triggers;
    }

    /**
     * Sets the value of the triggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.Triggers }
     *     
     */
    public void setTriggers(SCHPatternInfo.Triggers value) {
        this.triggers = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.Segments }
     *     
     */
    public SCHPatternInfo.Segments getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.Segments }
     *     
     */
    public void setSegments(SCHPatternInfo.Segments value) {
        this.segments = value;
    }

    /**
     * Gets the value of the segmentOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.SegmentOffsets }
     *     
     */
    public SCHPatternInfo.SegmentOffsets getSegmentOffsets() {
        return segmentOffsets;
    }

    /**
     * Sets the value of the segmentOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.SegmentOffsets }
     *     
     */
    public void setSegmentOffsets(SCHPatternInfo.SegmentOffsets value) {
        this.segmentOffsets = value;
    }

    /**
     * Gets the value of the radioZones property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.RadioZones }
     *     
     */
    public SCHPatternInfo.RadioZones getRadioZones() {
        return radioZones;
    }

    /**
     * Sets the value of the radioZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.RadioZones }
     *     
     */
    public void setRadioZones(SCHPatternInfo.RadioZones value) {
        this.radioZones = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.Events }
     *     
     */
    public SCHPatternInfo.Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.Events }
     *     
     */
    public void setEvents(SCHPatternInfo.Events value) {
        this.events = value;
    }

    /**
     * Gets the value of the eventOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternInfo.EventOffsets }
     *     
     */
    public SCHPatternInfo.EventOffsets getEventOffsets() {
        return eventOffsets;
    }

    /**
     * Sets the value of the eventOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternInfo.EventOffsets }
     *     
     */
    public void setEventOffsets(SCHPatternInfo.EventOffsets value) {
        this.eventOffsets = value;
    }

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
     * Gets the value of the routeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDirection() {
        return routeDirection;
    }

    /**
     * Sets the value of the routeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDirection(String value) {
        this.routeDirection = value;
    }

    /**
     * Gets the value of the routeDirectionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getRouteDirectionLangs() {
        return routeDirectionLangs;
    }

    /**
     * Sets the value of the routeDirectionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setRouteDirectionLangs(CPTAdditionalLanguageContents value) {
        this.routeDirectionLangs = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the destinationLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDestinationLangs() {
        return destinationLangs;
    }

    /**
     * Sets the value of the destinationLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDestinationLangs(CPTAdditionalLanguageContents value) {
        this.destinationLangs = value;
    }

    /**
     * Gets the value of the localSCHPatternInfo property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.SCHPatternInfo }
     *     
     */
    public tcip_3_0_5_local.SCHPatternInfo getLocalSCHPatternInfo() {
        return localSCHPatternInfo;
    }

    /**
     * Sets the value of the localSCHPatternInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.SCHPatternInfo }
     *     
     */
    public void setLocalSCHPatternInfo(tcip_3_0_5_local.SCHPatternInfo value) {
        this.localSCHPatternInfo = value;
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
     *         &lt;element name="eventOffset" type="{http://www.lrms-final-09-07}Distance"/>
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
        "eventOffset"
    })
    public static class EventOffsets {

        @XmlElement(required = true)
        protected List<Distance> eventOffset;

        /**
         * Gets the value of the eventOffset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventOffset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventOffset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Distance }
         * 
         * 
         */
        public List<Distance> getEventOffset() {
            if (eventOffset == null) {
                eventOffset = new ArrayList<Distance>();
            }
            return this.eventOffset;
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
     *         &lt;element name="event" type="{http://www.TCIP-Final-3-0-5-1}SCHEvent"/>
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
        "event"
    })
    public static class Events {

        @XmlElement(required = true)
        protected List<SCHEvent> event;

        /**
         * Gets the value of the event property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHEvent }
         * 
         * 
         */
        public List<SCHEvent> getEvent() {
            if (event == null) {
                event = new ArrayList<SCHEvent>();
            }
            return this.event;
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
     *         &lt;element name="pattern-note" type="{http://www.TCIP-Final-3-0-5-1}SCHNoteIden"/>
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
        "patternNote"
    })
    public static class PatternNotes {

        @XmlElement(name = "pattern-note", required = true)
        protected List<SCHNoteIden> patternNote;

        /**
         * Gets the value of the patternNote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patternNote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatternNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHNoteIden }
         * 
         * 
         */
        public List<SCHNoteIden> getPatternNote() {
            if (patternNote == null) {
                patternNote = new ArrayList<SCHNoteIden>();
            }
            return this.patternNote;
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
     *         &lt;element name="radio-zone" type="{http://www.TCIP-Final-3-0-5-1}CPTRadioZone"/>
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
        "radioZone"
    })
    public static class RadioZones {

        @XmlElement(name = "radio-zone", required = true)
        protected List<CPTRadioZone> radioZone;

        /**
         * Gets the value of the radioZone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the radioZone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRadioZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTRadioZone }
         * 
         * 
         */
        public List<CPTRadioZone> getRadioZone() {
            if (radioZone == null) {
                radioZone = new ArrayList<CPTRadioZone>();
            }
            return this.radioZone;
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
     *         &lt;element name="segmentOffset" type="{http://www.lrms-final-09-07}Distance"/>
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
        "segmentOffset"
    })
    public static class SegmentOffsets {

        @XmlElement(required = true)
        protected List<Distance> segmentOffset;

        /**
         * Gets the value of the segmentOffset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentOffset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentOffset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Distance }
         * 
         * 
         */
        public List<Distance> getSegmentOffset() {
            if (segmentOffset == null) {
                segmentOffset = new ArrayList<Distance>();
            }
            return this.segmentOffset;
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
     *         &lt;element name="segment" type="{http://www.TCIP-Final-3-0-5-1}SCHPatternSegmentIden"/>
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
        "segment"
    })
    public static class Segments {

        @XmlElement(required = true)
        protected List<SCHPatternSegmentIden> segment;

        /**
         * Gets the value of the segment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHPatternSegmentIden }
         * 
         * 
         */
        public List<SCHPatternSegmentIden> getSegment() {
            if (segment == null) {
                segment = new ArrayList<SCHPatternSegmentIden>();
            }
            return this.segment;
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
     *         &lt;element name="trigger" type="{http://www.TCIP-Final-3-0-5-1}SCHActivationIden"/>
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
        "trigger"
    })
    public static class Triggers {

        @XmlElement(required = true)
        protected List<SCHActivationIden> trigger;

        /**
         * Gets the value of the trigger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trigger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrigger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHActivationIden }
         * 
         * 
         */
        public List<SCHActivationIden> getTrigger() {
            if (trigger == null) {
                trigger = new ArrayList<SCHActivationIden>();
            }
            return this.trigger;
        }

    }

}
