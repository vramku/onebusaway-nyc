//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package atis_partial_03_00_74;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoardingInstructions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardingInstructions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardingTime" type="{http://www.atis-partial-03-00-74}DateTimePair" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://www.atis-partial-03-00-74}DateTimePair" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://www.atis-partial-03-00-74}DateTimePair" minOccurs="0"/>
 *         &lt;element name="platformNumber" type="{http://www.atis-partial-03-00-74}Flight-GateNumber" minOccurs="0"/>
 *         &lt;element name="gateNumber" type="{http://www.atis-partial-03-00-74}Flight-GateNumber" minOccurs="0"/>
 *         &lt;element name="stoppoint" type="{http://www.atis-partial-03-00-74}CPTStoppointIden" minOccurs="0"/>
 *         &lt;element name="routeName" type="{http://www.atis-partial-03-00-74}Name" minOccurs="0"/>
 *         &lt;element name="estimatedDelay" type="{http://www.atis-partial-03-00-74}TimeInterval" minOccurs="0"/>
 *         &lt;element name="getTransfer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="overallStatus" type="{http://www.itis-final-3-0-0-for-atis}DelayStatusCancellation" minOccurs="0"/>
 *         &lt;element name="agencyName" type="{http://www.atis-partial-03-00-74}Freetext" minOccurs="0"/>
 *         &lt;element name="agencyID" type="{http://www.atis-partial-03-00-74}Organization-contact-center-identifier" minOccurs="0"/>
 *         &lt;element name="furtherData" type="{http://www.atis-partial-03-00-74}URL-Link" minOccurs="0"/>
 *         &lt;element name="tail" type="{http://www.atis-partial-03-00-74}Tail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingInstructions", propOrder = {
    "boardingTime",
    "departureTime",
    "arrivalTime",
    "platformNumber",
    "gateNumber",
    "stoppoint",
    "routeName",
    "estimatedDelay",
    "getTransfer",
    "overallStatus",
    "agencyName",
    "agencyID",
    "furtherData",
    "tail"
})
public class BoardingInstructions {

    protected DateTimePair boardingTime;
    protected DateTimePair departureTime;
    protected DateTimePair arrivalTime;
    protected String platformNumber;
    protected String gateNumber;
    protected CPTStoppointIden stoppoint;
    protected String routeName;
    protected Integer estimatedDelay;
    protected Boolean getTransfer;
    protected String overallStatus;
    protected String agencyName;
    protected String agencyID;
    protected String furtherData;
    protected Tail tail;

    /**
     * Gets the value of the boardingTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePair }
     *     
     */
    public DateTimePair getBoardingTime() {
        return boardingTime;
    }

    /**
     * Sets the value of the boardingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePair }
     *     
     */
    public void setBoardingTime(DateTimePair value) {
        this.boardingTime = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePair }
     *     
     */
    public DateTimePair getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePair }
     *     
     */
    public void setDepartureTime(DateTimePair value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePair }
     *     
     */
    public DateTimePair getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePair }
     *     
     */
    public void setArrivalTime(DateTimePair value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the platformNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformNumber() {
        return platformNumber;
    }

    /**
     * Sets the value of the platformNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformNumber(String value) {
        this.platformNumber = value;
    }

    /**
     * Gets the value of the gateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateNumber() {
        return gateNumber;
    }

    /**
     * Sets the value of the gateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateNumber(String value) {
        this.gateNumber = value;
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
     * Gets the value of the routeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets the value of the routeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    /**
     * Gets the value of the estimatedDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedDelay() {
        return estimatedDelay;
    }

    /**
     * Sets the value of the estimatedDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedDelay(Integer value) {
        this.estimatedDelay = value;
    }

    /**
     * Gets the value of the getTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetTransfer() {
        return getTransfer;
    }

    /**
     * Sets the value of the getTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetTransfer(Boolean value) {
        this.getTransfer = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallStatus(String value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the furtherData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherData() {
        return furtherData;
    }

    /**
     * Sets the value of the furtherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherData(String value) {
        this.furtherData = value;
    }

    /**
     * Gets the value of the tail property.
     * 
     * @return
     *     possible object is
     *     {@link Tail }
     *     
     */
    public Tail getTail() {
        return tail;
    }

    /**
     * Sets the value of the tail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tail }
     *     
     */
    public void setTail(Tail value) {
        this.tail = value;
    }

}
