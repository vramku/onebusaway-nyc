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


/**
 * <p>Java class for TSPStrategyEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPStrategyEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultantStrategyID" type="{http://www.TCIP-Final-3-0-5-1}SCP-PriorityStrategyNumber"/>
 *         &lt;element name="resultantClassType" type="{http://www.TCIP-Final-3-0-5-1}SCP-VehicleClassType"/>
 *         &lt;element name="resultantClassLevel" type="{http://www.TCIP-Final-3-0-5-1}SCP-VehicleClassLevel"/>
 *         &lt;element name="strategyTimeBegin" type="{http://www.TCIP-Final-3-0-5-1}SCH-Time" minOccurs="0"/>
 *         &lt;element name="strategyTimeEnd" type="{http://www.TCIP-Final-3-0-5-1}SCH-Time" minOccurs="0"/>
 *         &lt;element name="schLateMinimum" type="{http://www.TCIP-Final-3-0-5-1}OB-ScheduleAdherenceOffset" minOccurs="0"/>
 *         &lt;element name="schLateMaximum" type="{http://www.TCIP-Final-3-0-5-1}OB-ScheduleAdherenceOffset" minOccurs="0"/>
 *         &lt;element name="schRecoveryMinimum" type="{http://www.TCIP-Final-3-0-5-1}OB-ScheduleAdherenceOffset" minOccurs="0"/>
 *         &lt;element name="prgLoadMinimum" type="{http://www.TCIP-Final-3-0-5-1}OB-J1587-PassengerCounterPatronCount" minOccurs="0"/>
 *         &lt;element name="travelPath" type="{http://www.TCIP-Final-3-0-5-1}TSP-IntersectionPath" minOccurs="0"/>
 *         &lt;element name="allowed-boundaries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="allowed-boundary" type="{http://www.TCIP-Final-3-0-5-1}TSP-BoundaryID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allowed-intersections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="allowed-intersection" type="{http://www.TCIP-Final-3-0-5-1}TSPAllowedIntersection"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPStrategyEntry", propOrder = {
    "resultantStrategyID",
    "resultantClassType",
    "resultantClassLevel",
    "strategyTimeBegin",
    "strategyTimeEnd",
    "schLateMinimum",
    "schLateMaximum",
    "schRecoveryMinimum",
    "prgLoadMinimum",
    "travelPath",
    "allowedBoundaries",
    "allowedIntersections"
})
public class TSPStrategyEntry {

    protected short resultantStrategyID;
    protected short resultantClassType;
    protected short resultantClassLevel;
    protected Integer strategyTimeBegin;
    protected Integer strategyTimeEnd;
    protected Integer schLateMinimum;
    protected Integer schLateMaximum;
    protected Integer schRecoveryMinimum;
    protected Short prgLoadMinimum;
    protected String travelPath;
    @XmlElement(name = "allowed-boundaries", required = true)
    protected TSPStrategyEntry.AllowedBoundaries allowedBoundaries;
    @XmlElement(name = "allowed-intersections")
    protected TSPStrategyEntry.AllowedIntersections allowedIntersections;

    /**
     * Gets the value of the resultantStrategyID property.
     * 
     */
    public short getResultantStrategyID() {
        return resultantStrategyID;
    }

    /**
     * Sets the value of the resultantStrategyID property.
     * 
     */
    public void setResultantStrategyID(short value) {
        this.resultantStrategyID = value;
    }

    /**
     * Gets the value of the resultantClassType property.
     * 
     */
    public short getResultantClassType() {
        return resultantClassType;
    }

    /**
     * Sets the value of the resultantClassType property.
     * 
     */
    public void setResultantClassType(short value) {
        this.resultantClassType = value;
    }

    /**
     * Gets the value of the resultantClassLevel property.
     * 
     */
    public short getResultantClassLevel() {
        return resultantClassLevel;
    }

    /**
     * Sets the value of the resultantClassLevel property.
     * 
     */
    public void setResultantClassLevel(short value) {
        this.resultantClassLevel = value;
    }

    /**
     * Gets the value of the strategyTimeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrategyTimeBegin() {
        return strategyTimeBegin;
    }

    /**
     * Sets the value of the strategyTimeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrategyTimeBegin(Integer value) {
        this.strategyTimeBegin = value;
    }

    /**
     * Gets the value of the strategyTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrategyTimeEnd() {
        return strategyTimeEnd;
    }

    /**
     * Sets the value of the strategyTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrategyTimeEnd(Integer value) {
        this.strategyTimeEnd = value;
    }

    /**
     * Gets the value of the schLateMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchLateMinimum() {
        return schLateMinimum;
    }

    /**
     * Sets the value of the schLateMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchLateMinimum(Integer value) {
        this.schLateMinimum = value;
    }

    /**
     * Gets the value of the schLateMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchLateMaximum() {
        return schLateMaximum;
    }

    /**
     * Sets the value of the schLateMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchLateMaximum(Integer value) {
        this.schLateMaximum = value;
    }

    /**
     * Gets the value of the schRecoveryMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchRecoveryMinimum() {
        return schRecoveryMinimum;
    }

    /**
     * Sets the value of the schRecoveryMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchRecoveryMinimum(Integer value) {
        this.schRecoveryMinimum = value;
    }

    /**
     * Gets the value of the prgLoadMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrgLoadMinimum() {
        return prgLoadMinimum;
    }

    /**
     * Sets the value of the prgLoadMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrgLoadMinimum(Short value) {
        this.prgLoadMinimum = value;
    }

    /**
     * Gets the value of the travelPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPath() {
        return travelPath;
    }

    /**
     * Sets the value of the travelPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPath(String value) {
        this.travelPath = value;
    }

    /**
     * Gets the value of the allowedBoundaries property.
     * 
     * @return
     *     possible object is
     *     {@link TSPStrategyEntry.AllowedBoundaries }
     *     
     */
    public TSPStrategyEntry.AllowedBoundaries getAllowedBoundaries() {
        return allowedBoundaries;
    }

    /**
     * Sets the value of the allowedBoundaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPStrategyEntry.AllowedBoundaries }
     *     
     */
    public void setAllowedBoundaries(TSPStrategyEntry.AllowedBoundaries value) {
        this.allowedBoundaries = value;
    }

    /**
     * Gets the value of the allowedIntersections property.
     * 
     * @return
     *     possible object is
     *     {@link TSPStrategyEntry.AllowedIntersections }
     *     
     */
    public TSPStrategyEntry.AllowedIntersections getAllowedIntersections() {
        return allowedIntersections;
    }

    /**
     * Sets the value of the allowedIntersections property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPStrategyEntry.AllowedIntersections }
     *     
     */
    public void setAllowedIntersections(TSPStrategyEntry.AllowedIntersections value) {
        this.allowedIntersections = value;
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
     *         &lt;element name="allowed-boundary" type="{http://www.TCIP-Final-3-0-5-1}TSP-BoundaryID"/>
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
        "allowedBoundary"
    })
    public static class AllowedBoundaries {

        @XmlElement(name = "allowed-boundary", type = Long.class)
        protected List<Long> allowedBoundary;

        /**
         * Gets the value of the allowedBoundary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedBoundary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedBoundary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getAllowedBoundary() {
            if (allowedBoundary == null) {
                allowedBoundary = new ArrayList<Long>();
            }
            return this.allowedBoundary;
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
     *         &lt;element name="allowed-intersection" type="{http://www.TCIP-Final-3-0-5-1}TSPAllowedIntersection"/>
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
        "allowedIntersection"
    })
    public static class AllowedIntersections {

        @XmlElement(name = "allowed-intersection", required = true)
        protected List<TSPAllowedIntersection> allowedIntersection;

        /**
         * Gets the value of the allowedIntersection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedIntersection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedIntersection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TSPAllowedIntersection }
         * 
         * 
         */
        public List<TSPAllowedIntersection> getAllowedIntersection() {
            if (allowedIntersection == null) {
                allowedIntersection = new ArrayList<TSPAllowedIntersection>();
            }
            return this.allowedIntersection;
        }

    }

}
