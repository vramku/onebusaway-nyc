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
import lrms_final_09_07.AddressPoint;


/**
 * <p>Java class for PIAgencyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIAgencyProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agency-id" type="{http://www.TCIP-Final-3-0-5-1}CPT-AgencyID"/>
 *         &lt;element name="name" type="{http://www.TCIP-Final-3-0-5-1}CPT-AgencyName"/>
 *         &lt;element name="nameLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="feedback-email" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="public-contact-phone" type="{http://www.TCIP-Final-3-0-5-1}CPT-PhoneNumber" minOccurs="0"/>
 *         &lt;element name="public-contact-fax" type="{http://www.TCIP-Final-3-0-5-1}CPT-PhoneNumber" minOccurs="0"/>
 *         &lt;element name="public-contact-addr" type="{http://www.lrms-final-09-07}AddressPoint"/>
 *         &lt;element name="public-contact-email" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="public-websiteURL" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="customer-serviceURL" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="trip-plannerURL" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="operation-times" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="operation-timesLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="agency-description" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="agency-descriptionLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="handicap-access-description" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="handicap-access-descriptionLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="fare-range-description" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="ticket-locations" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="customer-group-served" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="fleet-description" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="modes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="mode" type="{http://www.TCIP-Final-3-0-5-1}CPT-Mode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="service-zones" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="service-zone" type="{http://www.TCIP-Final-3-0-5-1}PIGeoZoneIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="service-area" type="{http://www.TCIP-Final-3-0-5-1}SPPolygon" minOccurs="0"/>
 *         &lt;element name="static-files" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="static-file" type="{http://www.TCIP-Final-3-0-5-1}PIAgencyStaticFile"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localPIAgencyProfile" type="{http://www.tcip-3-0-5-local}PIAgencyProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIAgencyProfile", propOrder = {
    "agencyId",
    "name",
    "nameLangs",
    "feedbackEmail",
    "publicContactPhone",
    "publicContactFax",
    "publicContactAddr",
    "publicContactEmail",
    "publicWebsiteURL",
    "customerServiceURL",
    "tripPlannerURL",
    "operationTimes",
    "operationTimesLangs",
    "agencyDescription",
    "agencyDescriptionLangs",
    "handicapAccessDescription",
    "handicapAccessDescriptionLangs",
    "fareRangeDescription",
    "ticketLocations",
    "customerGroupServed",
    "fleetDescription",
    "modes",
    "status",
    "serviceZones",
    "serviceArea",
    "staticFiles",
    "localPIAgencyProfile"
})
public class PIAgencyProfile {

    @XmlElement(name = "agency-id")
    protected long agencyId;
    @XmlElement(required = true)
    protected String name;
    protected CPTAdditionalLanguageContents nameLangs;
    @XmlElement(name = "feedback-email")
    protected String feedbackEmail;
    @XmlElement(name = "public-contact-phone")
    protected String publicContactPhone;
    @XmlElement(name = "public-contact-fax")
    protected String publicContactFax;
    @XmlElement(name = "public-contact-addr", required = true)
    protected AddressPoint publicContactAddr;
    @XmlElement(name = "public-contact-email")
    protected String publicContactEmail;
    @XmlElement(name = "public-websiteURL")
    protected String publicWebsiteURL;
    @XmlElement(name = "customer-serviceURL")
    protected String customerServiceURL;
    @XmlElement(name = "trip-plannerURL")
    protected String tripPlannerURL;
    @XmlElement(name = "operation-times")
    protected String operationTimes;
    @XmlElement(name = "operation-timesLangs")
    protected CPTAdditionalLanguageContents operationTimesLangs;
    @XmlElement(name = "agency-description")
    protected String agencyDescription;
    @XmlElement(name = "agency-descriptionLangs")
    protected CPTAdditionalLanguageContents agencyDescriptionLangs;
    @XmlElement(name = "handicap-access-description")
    protected String handicapAccessDescription;
    @XmlElement(name = "handicap-access-descriptionLangs")
    protected CPTAdditionalLanguageContents handicapAccessDescriptionLangs;
    @XmlElement(name = "fare-range-description")
    protected String fareRangeDescription;
    @XmlElement(name = "ticket-locations")
    protected String ticketLocations;
    @XmlElement(name = "customer-group-served")
    protected String customerGroupServed;
    @XmlElement(name = "fleet-description")
    protected String fleetDescription;
    protected PIAgencyProfile.Modes modes;
    protected String status;
    @XmlElement(name = "service-zones")
    protected PIAgencyProfile.ServiceZones serviceZones;
    @XmlElement(name = "service-area")
    protected SPPolygon serviceArea;
    @XmlElement(name = "static-files")
    protected PIAgencyProfile.StaticFiles staticFiles;
    protected tcip_3_0_5_local.PIAgencyProfile localPIAgencyProfile;

    /**
     * Gets the value of the agencyId property.
     * 
     */
    public long getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     */
    public void setAgencyId(long value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNameLangs() {
        return nameLangs;
    }

    /**
     * Sets the value of the nameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNameLangs(CPTAdditionalLanguageContents value) {
        this.nameLangs = value;
    }

    /**
     * Gets the value of the feedbackEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackEmail() {
        return feedbackEmail;
    }

    /**
     * Sets the value of the feedbackEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackEmail(String value) {
        this.feedbackEmail = value;
    }

    /**
     * Gets the value of the publicContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicContactPhone() {
        return publicContactPhone;
    }

    /**
     * Sets the value of the publicContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicContactPhone(String value) {
        this.publicContactPhone = value;
    }

    /**
     * Gets the value of the publicContactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicContactFax() {
        return publicContactFax;
    }

    /**
     * Sets the value of the publicContactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicContactFax(String value) {
        this.publicContactFax = value;
    }

    /**
     * Gets the value of the publicContactAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPoint }
     *     
     */
    public AddressPoint getPublicContactAddr() {
        return publicContactAddr;
    }

    /**
     * Sets the value of the publicContactAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPoint }
     *     
     */
    public void setPublicContactAddr(AddressPoint value) {
        this.publicContactAddr = value;
    }

    /**
     * Gets the value of the publicContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicContactEmail() {
        return publicContactEmail;
    }

    /**
     * Sets the value of the publicContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicContactEmail(String value) {
        this.publicContactEmail = value;
    }

    /**
     * Gets the value of the publicWebsiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicWebsiteURL() {
        return publicWebsiteURL;
    }

    /**
     * Sets the value of the publicWebsiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicWebsiteURL(String value) {
        this.publicWebsiteURL = value;
    }

    /**
     * Gets the value of the customerServiceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceURL() {
        return customerServiceURL;
    }

    /**
     * Sets the value of the customerServiceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceURL(String value) {
        this.customerServiceURL = value;
    }

    /**
     * Gets the value of the tripPlannerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripPlannerURL() {
        return tripPlannerURL;
    }

    /**
     * Sets the value of the tripPlannerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripPlannerURL(String value) {
        this.tripPlannerURL = value;
    }

    /**
     * Gets the value of the operationTimes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationTimes() {
        return operationTimes;
    }

    /**
     * Sets the value of the operationTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationTimes(String value) {
        this.operationTimes = value;
    }

    /**
     * Gets the value of the operationTimesLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getOperationTimesLangs() {
        return operationTimesLangs;
    }

    /**
     * Sets the value of the operationTimesLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setOperationTimesLangs(CPTAdditionalLanguageContents value) {
        this.operationTimesLangs = value;
    }

    /**
     * Gets the value of the agencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyDescription() {
        return agencyDescription;
    }

    /**
     * Sets the value of the agencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyDescription(String value) {
        this.agencyDescription = value;
    }

    /**
     * Gets the value of the agencyDescriptionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getAgencyDescriptionLangs() {
        return agencyDescriptionLangs;
    }

    /**
     * Sets the value of the agencyDescriptionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setAgencyDescriptionLangs(CPTAdditionalLanguageContents value) {
        this.agencyDescriptionLangs = value;
    }

    /**
     * Gets the value of the handicapAccessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandicapAccessDescription() {
        return handicapAccessDescription;
    }

    /**
     * Sets the value of the handicapAccessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandicapAccessDescription(String value) {
        this.handicapAccessDescription = value;
    }

    /**
     * Gets the value of the handicapAccessDescriptionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getHandicapAccessDescriptionLangs() {
        return handicapAccessDescriptionLangs;
    }

    /**
     * Sets the value of the handicapAccessDescriptionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setHandicapAccessDescriptionLangs(CPTAdditionalLanguageContents value) {
        this.handicapAccessDescriptionLangs = value;
    }

    /**
     * Gets the value of the fareRangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRangeDescription() {
        return fareRangeDescription;
    }

    /**
     * Sets the value of the fareRangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRangeDescription(String value) {
        this.fareRangeDescription = value;
    }

    /**
     * Gets the value of the ticketLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketLocations() {
        return ticketLocations;
    }

    /**
     * Sets the value of the ticketLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketLocations(String value) {
        this.ticketLocations = value;
    }

    /**
     * Gets the value of the customerGroupServed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupServed() {
        return customerGroupServed;
    }

    /**
     * Sets the value of the customerGroupServed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupServed(String value) {
        this.customerGroupServed = value;
    }

    /**
     * Gets the value of the fleetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetDescription() {
        return fleetDescription;
    }

    /**
     * Sets the value of the fleetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetDescription(String value) {
        this.fleetDescription = value;
    }

    /**
     * Gets the value of the modes property.
     * 
     * @return
     *     possible object is
     *     {@link PIAgencyProfile.Modes }
     *     
     */
    public PIAgencyProfile.Modes getModes() {
        return modes;
    }

    /**
     * Sets the value of the modes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAgencyProfile.Modes }
     *     
     */
    public void setModes(PIAgencyProfile.Modes value) {
        this.modes = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceZones property.
     * 
     * @return
     *     possible object is
     *     {@link PIAgencyProfile.ServiceZones }
     *     
     */
    public PIAgencyProfile.ServiceZones getServiceZones() {
        return serviceZones;
    }

    /**
     * Sets the value of the serviceZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAgencyProfile.ServiceZones }
     *     
     */
    public void setServiceZones(PIAgencyProfile.ServiceZones value) {
        this.serviceZones = value;
    }

    /**
     * Gets the value of the serviceArea property.
     * 
     * @return
     *     possible object is
     *     {@link SPPolygon }
     *     
     */
    public SPPolygon getServiceArea() {
        return serviceArea;
    }

    /**
     * Sets the value of the serviceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPolygon }
     *     
     */
    public void setServiceArea(SPPolygon value) {
        this.serviceArea = value;
    }

    /**
     * Gets the value of the staticFiles property.
     * 
     * @return
     *     possible object is
     *     {@link PIAgencyProfile.StaticFiles }
     *     
     */
    public PIAgencyProfile.StaticFiles getStaticFiles() {
        return staticFiles;
    }

    /**
     * Sets the value of the staticFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAgencyProfile.StaticFiles }
     *     
     */
    public void setStaticFiles(PIAgencyProfile.StaticFiles value) {
        this.staticFiles = value;
    }

    /**
     * Gets the value of the localPIAgencyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.PIAgencyProfile }
     *     
     */
    public tcip_3_0_5_local.PIAgencyProfile getLocalPIAgencyProfile() {
        return localPIAgencyProfile;
    }

    /**
     * Sets the value of the localPIAgencyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.PIAgencyProfile }
     *     
     */
    public void setLocalPIAgencyProfile(tcip_3_0_5_local.PIAgencyProfile value) {
        this.localPIAgencyProfile = value;
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
     *         &lt;element name="mode" type="{http://www.TCIP-Final-3-0-5-1}CPT-Mode"/>
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
        "mode"
    })
    public static class Modes {

        @XmlElement(required = true)
        protected List<String> mode;

        /**
         * Gets the value of the mode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMode() {
            if (mode == null) {
                mode = new ArrayList<String>();
            }
            return this.mode;
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
     *         &lt;element name="service-zone" type="{http://www.TCIP-Final-3-0-5-1}PIGeoZoneIden"/>
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
        "serviceZone"
    })
    public static class ServiceZones {

        @XmlElement(name = "service-zone", required = true)
        protected List<PIGeoZoneIden> serviceZone;

        /**
         * Gets the value of the serviceZone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceZone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIGeoZoneIden }
         * 
         * 
         */
        public List<PIGeoZoneIden> getServiceZone() {
            if (serviceZone == null) {
                serviceZone = new ArrayList<PIGeoZoneIden>();
            }
            return this.serviceZone;
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
     *         &lt;element name="static-file" type="{http://www.TCIP-Final-3-0-5-1}PIAgencyStaticFile"/>
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
        "staticFile"
    })
    public static class StaticFiles {

        @XmlElement(name = "static-file", required = true)
        protected List<PIAgencyStaticFile> staticFile;

        /**
         * Gets the value of the staticFile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the staticFile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStaticFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIAgencyStaticFile }
         * 
         * 
         */
        public List<PIAgencyStaticFile> getStaticFile() {
            if (staticFile == null) {
                staticFile = new ArrayList<PIAgencyStaticFile>();
            }
            return this.staticFile;
        }

    }

}
