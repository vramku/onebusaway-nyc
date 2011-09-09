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


/**
 * <p>Java class for FCCashBoxReconciliation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCCashBoxReconciliation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cashboxID" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
 *         &lt;element name="time-reconciled" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="vehicle" type="{http://www.TCIP-Final-3-0-5-1}CPTVehicleIden" minOccurs="0"/>
 *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPTStoppointIden" minOccurs="0"/>
 *         &lt;element name="equipmentID" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber" minOccurs="0"/>
 *         &lt;element name="employee" type="{http://www.TCIP-Final-3-0-5-1}CPTEmployeeIden" minOccurs="0"/>
 *         &lt;element name="employee2" type="{http://www.TCIP-Final-3-0-5-1}CPTEmployeeIden" minOccurs="0"/>
 *         &lt;element name="expected-contents" type="{http://www.TCIP-Final-3-0-5-1}FCCashBoxContents" minOccurs="0"/>
 *         &lt;element name="actual-contents" type="{http://www.TCIP-Final-3-0-5-1}FCCashBoxContents" minOccurs="0"/>
 *         &lt;element name="expected-cash" type="{http://www.TCIP-Final-3-0-5-1}FC-MonetaryValue" minOccurs="0"/>
 *         &lt;element name="actual-cash" type="{http://www.TCIP-Final-3-0-5-1}FC-MonetaryValue" minOccurs="0"/>
 *         &lt;element name="cash-currency" type="{http://www.TCIP-Final-3-0-5-1}FC-MonetaryInstrAuth" minOccurs="0"/>
 *         &lt;element name="reconciliation-ok" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCCashBoxReconciliation", propOrder = {
    "cashboxID",
    "timeReconciled",
    "vehicle",
    "stoppoint",
    "equipmentID",
    "employee",
    "employee2",
    "expectedContents",
    "actualContents",
    "expectedCash",
    "actualCash",
    "cashCurrency",
    "reconciliationOk"
})
public class FCCashBoxReconciliation {

    @XmlElement(required = true)
    protected String cashboxID;
    @XmlElement(name = "time-reconciled", required = true)
    protected String timeReconciled;
    protected CPTVehicleIden vehicle;
    protected CPTStoppointIden stoppoint;
    protected String equipmentID;
    protected CPTEmployeeIden employee;
    protected CPTEmployeeIden employee2;
    @XmlElement(name = "expected-contents")
    protected FCCashBoxContents expectedContents;
    @XmlElement(name = "actual-contents")
    protected FCCashBoxContents actualContents;
    @XmlElement(name = "expected-cash")
    protected Long expectedCash;
    @XmlElement(name = "actual-cash")
    protected Long actualCash;
    @XmlElement(name = "cash-currency")
    protected String cashCurrency;
    @XmlElement(name = "reconciliation-ok")
    protected boolean reconciliationOk;

    /**
     * Gets the value of the cashboxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashboxID() {
        return cashboxID;
    }

    /**
     * Sets the value of the cashboxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashboxID(String value) {
        this.cashboxID = value;
    }

    /**
     * Gets the value of the timeReconciled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeReconciled() {
        return timeReconciled;
    }

    /**
     * Sets the value of the timeReconciled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeReconciled(String value) {
        this.timeReconciled = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setVehicle(CPTVehicleIden value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the stoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getStoppoint() {
        return stoppoint;
    }

    /**
     * Sets the value of the stoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setStoppoint(CPTStoppointIden value) {
        this.stoppoint = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentID(String value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public CPTEmployeeIden getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public void setEmployee(CPTEmployeeIden value) {
        this.employee = value;
    }

    /**
     * Gets the value of the employee2 property.
     * 
     * @return
     *     possible object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public CPTEmployeeIden getEmployee2() {
        return employee2;
    }

    /**
     * Sets the value of the employee2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public void setEmployee2(CPTEmployeeIden value) {
        this.employee2 = value;
    }

    /**
     * Gets the value of the expectedContents property.
     * 
     * @return
     *     possible object is
     *     {@link FCCashBoxContents }
     *     
     */
    public FCCashBoxContents getExpectedContents() {
        return expectedContents;
    }

    /**
     * Sets the value of the expectedContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCCashBoxContents }
     *     
     */
    public void setExpectedContents(FCCashBoxContents value) {
        this.expectedContents = value;
    }

    /**
     * Gets the value of the actualContents property.
     * 
     * @return
     *     possible object is
     *     {@link FCCashBoxContents }
     *     
     */
    public FCCashBoxContents getActualContents() {
        return actualContents;
    }

    /**
     * Sets the value of the actualContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCCashBoxContents }
     *     
     */
    public void setActualContents(FCCashBoxContents value) {
        this.actualContents = value;
    }

    /**
     * Gets the value of the expectedCash property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpectedCash() {
        return expectedCash;
    }

    /**
     * Sets the value of the expectedCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpectedCash(Long value) {
        this.expectedCash = value;
    }

    /**
     * Gets the value of the actualCash property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualCash() {
        return actualCash;
    }

    /**
     * Sets the value of the actualCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualCash(Long value) {
        this.actualCash = value;
    }

    /**
     * Gets the value of the cashCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashCurrency() {
        return cashCurrency;
    }

    /**
     * Sets the value of the cashCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashCurrency(String value) {
        this.cashCurrency = value;
    }

    /**
     * Gets the value of the reconciliationOk property.
     * 
     */
    public boolean isReconciliationOk() {
        return reconciliationOk;
    }

    /**
     * Sets the value of the reconciliationOk property.
     * 
     */
    public void setReconciliationOk(boolean value) {
        this.reconciliationOk = value;
    }

}
