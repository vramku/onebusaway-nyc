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
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for CCWorkOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCWorkOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="work-order-number" type="{http://www.TCIP-Final-3-0-5-1}CC-WorkorderNumber"/>
 *         &lt;element name="agencyID" type="{http://www.TCIP-Final-3-0-5-1}CPT-AgencyID" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://www.TCIP-Final-3-0-5-1}CPTEmployeeIden" minOccurs="0"/>
 *         &lt;element name="request-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="work-location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/>
 *         &lt;element name="work-stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPTStoppointIden" minOccurs="0"/>
 *         &lt;element name="work-vehicles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="work-vehicle" type="{http://www.TCIP-Final-3-0-5-1}CPTVehicleIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="equipmentIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="equipmentID" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="work-description" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote"/>
 *         &lt;element name="work-descriptionLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="needed-by" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="assigned-employees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="assigned-employee" type="{http://www.TCIP-Final-3-0-5-1}CPTAssignedEmployee"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assigned-contractors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="assigned-contractor" type="{http://www.TCIP-Final-3-0-5-1}CPTAssignedContractor"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="needed-parts-materials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="needed-parts-material" type="{http://www.TCIP-Final-3-0-5-1}CPTNeededSupplies"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="updates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="update" type="{http://www.TCIP-Final-3-0-5-1}CCWOUpdate"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="related-work-orders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="related-work-order" type="{http://www.TCIP-Final-3-0-5-1}CC-WorkorderNumber"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assigned-supervisor" type="{http://www.TCIP-Final-3-0-5-1}CPTAssignedEmployee" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="statusLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="closed-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="localCCWorkOrder" type="{http://www.tcip-3-0-5-local}CCWorkOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCWorkOrder", propOrder = {
    "workOrderNumber",
    "agencyID",
    "requester",
    "requestTime",
    "workLocation",
    "workStoppoint",
    "workVehicles",
    "equipmentIDs",
    "workDescription",
    "workDescriptionLangs",
    "neededBy",
    "assignedEmployees",
    "assignedContractors",
    "neededPartsMaterials",
    "updates",
    "relatedWorkOrders",
    "assignedSupervisor",
    "status",
    "statusLangs",
    "closed",
    "closedTime",
    "localCCWorkOrder"
})
public class CCWorkOrder {

    @XmlElement(name = "work-order-number", required = true)
    protected String workOrderNumber;
    protected Long agencyID;
    protected CPTEmployeeIden requester;
    @XmlElement(name = "request-time", required = true)
    protected String requestTime;
    @XmlElement(name = "work-location")
    protected GeoLocation workLocation;
    @XmlElement(name = "work-stoppoint")
    protected CPTStoppointIden workStoppoint;
    @XmlElement(name = "work-vehicles")
    protected CCWorkOrder.WorkVehicles workVehicles;
    protected CCWorkOrder.EquipmentIDs equipmentIDs;
    @XmlElement(name = "work-description", required = true)
    protected String workDescription;
    @XmlElement(name = "work-descriptionLangs")
    protected CPTAdditionalLanguageContents workDescriptionLangs;
    @XmlElement(name = "needed-by")
    protected String neededBy;
    @XmlElement(name = "assigned-employees")
    protected CCWorkOrder.AssignedEmployees assignedEmployees;
    @XmlElement(name = "assigned-contractors")
    protected CCWorkOrder.AssignedContractors assignedContractors;
    @XmlElement(name = "needed-parts-materials")
    protected CCWorkOrder.NeededPartsMaterials neededPartsMaterials;
    protected CCWorkOrder.Updates updates;
    @XmlElement(name = "related-work-orders")
    protected CCWorkOrder.RelatedWorkOrders relatedWorkOrders;
    @XmlElement(name = "assigned-supervisor")
    protected CPTAssignedEmployee assignedSupervisor;
    protected String status;
    protected CPTAdditionalLanguageContents statusLangs;
    protected boolean closed;
    @XmlElement(name = "closed-time")
    protected String closedTime;
    protected tcip_3_0_5_local.CCWorkOrder localCCWorkOrder;

    /**
     * Gets the value of the workOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * Sets the value of the workOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderNumber(String value) {
        this.workOrderNumber = value;
    }

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgencyID(Long value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public CPTEmployeeIden getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public void setRequester(CPTEmployeeIden value) {
        this.requester = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTime(String value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setWorkLocation(GeoLocation value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the workStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getWorkStoppoint() {
        return workStoppoint;
    }

    /**
     * Sets the value of the workStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setWorkStoppoint(CPTStoppointIden value) {
        this.workStoppoint = value;
    }

    /**
     * Gets the value of the workVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.WorkVehicles }
     *     
     */
    public CCWorkOrder.WorkVehicles getWorkVehicles() {
        return workVehicles;
    }

    /**
     * Sets the value of the workVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.WorkVehicles }
     *     
     */
    public void setWorkVehicles(CCWorkOrder.WorkVehicles value) {
        this.workVehicles = value;
    }

    /**
     * Gets the value of the equipmentIDs property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.EquipmentIDs }
     *     
     */
    public CCWorkOrder.EquipmentIDs getEquipmentIDs() {
        return equipmentIDs;
    }

    /**
     * Sets the value of the equipmentIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.EquipmentIDs }
     *     
     */
    public void setEquipmentIDs(CCWorkOrder.EquipmentIDs value) {
        this.equipmentIDs = value;
    }

    /**
     * Gets the value of the workDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDescription() {
        return workDescription;
    }

    /**
     * Sets the value of the workDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDescription(String value) {
        this.workDescription = value;
    }

    /**
     * Gets the value of the workDescriptionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getWorkDescriptionLangs() {
        return workDescriptionLangs;
    }

    /**
     * Sets the value of the workDescriptionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setWorkDescriptionLangs(CPTAdditionalLanguageContents value) {
        this.workDescriptionLangs = value;
    }

    /**
     * Gets the value of the neededBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeededBy() {
        return neededBy;
    }

    /**
     * Sets the value of the neededBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeededBy(String value) {
        this.neededBy = value;
    }

    /**
     * Gets the value of the assignedEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.AssignedEmployees }
     *     
     */
    public CCWorkOrder.AssignedEmployees getAssignedEmployees() {
        return assignedEmployees;
    }

    /**
     * Sets the value of the assignedEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.AssignedEmployees }
     *     
     */
    public void setAssignedEmployees(CCWorkOrder.AssignedEmployees value) {
        this.assignedEmployees = value;
    }

    /**
     * Gets the value of the assignedContractors property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.AssignedContractors }
     *     
     */
    public CCWorkOrder.AssignedContractors getAssignedContractors() {
        return assignedContractors;
    }

    /**
     * Sets the value of the assignedContractors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.AssignedContractors }
     *     
     */
    public void setAssignedContractors(CCWorkOrder.AssignedContractors value) {
        this.assignedContractors = value;
    }

    /**
     * Gets the value of the neededPartsMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.NeededPartsMaterials }
     *     
     */
    public CCWorkOrder.NeededPartsMaterials getNeededPartsMaterials() {
        return neededPartsMaterials;
    }

    /**
     * Sets the value of the neededPartsMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.NeededPartsMaterials }
     *     
     */
    public void setNeededPartsMaterials(CCWorkOrder.NeededPartsMaterials value) {
        this.neededPartsMaterials = value;
    }

    /**
     * Gets the value of the updates property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.Updates }
     *     
     */
    public CCWorkOrder.Updates getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.Updates }
     *     
     */
    public void setUpdates(CCWorkOrder.Updates value) {
        this.updates = value;
    }

    /**
     * Gets the value of the relatedWorkOrders property.
     * 
     * @return
     *     possible object is
     *     {@link CCWorkOrder.RelatedWorkOrders }
     *     
     */
    public CCWorkOrder.RelatedWorkOrders getRelatedWorkOrders() {
        return relatedWorkOrders;
    }

    /**
     * Sets the value of the relatedWorkOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCWorkOrder.RelatedWorkOrders }
     *     
     */
    public void setRelatedWorkOrders(CCWorkOrder.RelatedWorkOrders value) {
        this.relatedWorkOrders = value;
    }

    /**
     * Gets the value of the assignedSupervisor property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAssignedEmployee }
     *     
     */
    public CPTAssignedEmployee getAssignedSupervisor() {
        return assignedSupervisor;
    }

    /**
     * Sets the value of the assignedSupervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAssignedEmployee }
     *     
     */
    public void setAssignedSupervisor(CPTAssignedEmployee value) {
        this.assignedSupervisor = value;
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
     * Gets the value of the statusLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getStatusLangs() {
        return statusLangs;
    }

    /**
     * Sets the value of the statusLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setStatusLangs(CPTAdditionalLanguageContents value) {
        this.statusLangs = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the closedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedTime() {
        return closedTime;
    }

    /**
     * Sets the value of the closedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedTime(String value) {
        this.closedTime = value;
    }

    /**
     * Gets the value of the localCCWorkOrder property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.CCWorkOrder }
     *     
     */
    public tcip_3_0_5_local.CCWorkOrder getLocalCCWorkOrder() {
        return localCCWorkOrder;
    }

    /**
     * Sets the value of the localCCWorkOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.CCWorkOrder }
     *     
     */
    public void setLocalCCWorkOrder(tcip_3_0_5_local.CCWorkOrder value) {
        this.localCCWorkOrder = value;
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
     *         &lt;element name="assigned-contractor" type="{http://www.TCIP-Final-3-0-5-1}CPTAssignedContractor"/>
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
        "assignedContractor"
    })
    public static class AssignedContractors {

        @XmlElement(name = "assigned-contractor", required = true)
        protected List<CPTAssignedContractor> assignedContractor;

        /**
         * Gets the value of the assignedContractor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedContractor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedContractor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTAssignedContractor }
         * 
         * 
         */
        public List<CPTAssignedContractor> getAssignedContractor() {
            if (assignedContractor == null) {
                assignedContractor = new ArrayList<CPTAssignedContractor>();
            }
            return this.assignedContractor;
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
     *         &lt;element name="assigned-employee" type="{http://www.TCIP-Final-3-0-5-1}CPTAssignedEmployee"/>
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
        "assignedEmployee"
    })
    public static class AssignedEmployees {

        @XmlElement(name = "assigned-employee", required = true)
        protected List<CPTAssignedEmployee> assignedEmployee;

        /**
         * Gets the value of the assignedEmployee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedEmployee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedEmployee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTAssignedEmployee }
         * 
         * 
         */
        public List<CPTAssignedEmployee> getAssignedEmployee() {
            if (assignedEmployee == null) {
                assignedEmployee = new ArrayList<CPTAssignedEmployee>();
            }
            return this.assignedEmployee;
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
     *         &lt;element name="equipmentID" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
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
        "equipmentID"
    })
    public static class EquipmentIDs {

        @XmlElement(required = true)
        protected List<String> equipmentID;

        /**
         * Gets the value of the equipmentID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equipmentID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEquipmentID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEquipmentID() {
            if (equipmentID == null) {
                equipmentID = new ArrayList<String>();
            }
            return this.equipmentID;
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
     *         &lt;element name="needed-parts-material" type="{http://www.TCIP-Final-3-0-5-1}CPTNeededSupplies"/>
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
        "neededPartsMaterial"
    })
    public static class NeededPartsMaterials {

        @XmlElement(name = "needed-parts-material", required = true)
        protected List<CPTNeededSupplies> neededPartsMaterial;

        /**
         * Gets the value of the neededPartsMaterial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the neededPartsMaterial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNeededPartsMaterial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTNeededSupplies }
         * 
         * 
         */
        public List<CPTNeededSupplies> getNeededPartsMaterial() {
            if (neededPartsMaterial == null) {
                neededPartsMaterial = new ArrayList<CPTNeededSupplies>();
            }
            return this.neededPartsMaterial;
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
     *         &lt;element name="related-work-order" type="{http://www.TCIP-Final-3-0-5-1}CC-WorkorderNumber"/>
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
        "relatedWorkOrder"
    })
    public static class RelatedWorkOrders {

        @XmlElement(name = "related-work-order", required = true)
        protected List<String> relatedWorkOrder;

        /**
         * Gets the value of the relatedWorkOrder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedWorkOrder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedWorkOrder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRelatedWorkOrder() {
            if (relatedWorkOrder == null) {
                relatedWorkOrder = new ArrayList<String>();
            }
            return this.relatedWorkOrder;
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
     *         &lt;element name="update" type="{http://www.TCIP-Final-3-0-5-1}CCWOUpdate"/>
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
        "update"
    })
    public static class Updates {

        @XmlElement(required = true)
        protected List<CCWOUpdate> update;

        /**
         * Gets the value of the update property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the update property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCWOUpdate }
         * 
         * 
         */
        public List<CCWOUpdate> getUpdate() {
            if (update == null) {
                update = new ArrayList<CCWOUpdate>();
            }
            return this.update;
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
     *         &lt;element name="work-vehicle" type="{http://www.TCIP-Final-3-0-5-1}CPTVehicleIden"/>
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
        "workVehicle"
    })
    public static class WorkVehicles {

        @XmlElement(name = "work-vehicle", required = true)
        protected List<CPTVehicleIden> workVehicle;

        /**
         * Gets the value of the workVehicle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workVehicle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkVehicle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTVehicleIden }
         * 
         * 
         */
        public List<CPTVehicleIden> getWorkVehicle() {
            if (workVehicle == null) {
                workVehicle = new ArrayList<CPTVehicleIden>();
            }
            return this.workVehicle;
        }

    }

}
