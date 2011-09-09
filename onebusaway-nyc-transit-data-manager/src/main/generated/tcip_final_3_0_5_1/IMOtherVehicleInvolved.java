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
 * <p>Java class for IMOtherVehicleInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMOtherVehicleInvolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="other-veh" type="{http://www.TCIP-Final-3-0-5-1}IM-OtherVehicleInvolvedID" minOccurs="0"/>
 *         &lt;element name="veh-type" type="{http://www.TCIP-Final-3-0-5-1}IM-VehicleInvolvedType"/>
 *         &lt;element name="incident" type="{http://www.TCIP-Final-3-0-5-1}IMIncidentIden"/>
 *         &lt;element name="veh-info" type="{http://www.TCIP-Final-3-0-5-1}IMVehicleIDInformation"/>
 *         &lt;element name="heading" type="{http://www.lrms-final-09-07}Direction"/>
 *         &lt;element name="speed" type="{http://www.TCIP-Final-3-0-5-1}OB-J1587-VelocityVectorSpeed"/>
 *         &lt;element name="damage" type="{http://www.TCIP-Final-3-0-5-1}IM-VehicleDamage" minOccurs="0"/>
 *         &lt;element name="injury-info" type="{http://www.TCIP-Final-3-0-5-1}IMInjuryInfo"/>
 *         &lt;element name="operator" type="{http://www.TCIP-Final-3-0-5-1}IMPerson" minOccurs="0"/>
 *         &lt;element name="passengers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="passenger" type="{http://www.TCIP-Final-3-0-5-1}IMPerson"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="veh-person-count" type="{http://www.TCIP-Final-3-0-5-1}IM-VehicleOccupantCount" minOccurs="0"/>
 *         &lt;element name="post-acc-test" type="{http://www.TCIP-Final-3-0-5-1}IM-PostAccidentTest" minOccurs="0"/>
 *         &lt;element name="footnote" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="footnoteLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="localIMOtherVehicleInvolved" type="{http://www.tcip-3-0-5-local}IMOtherVehicleInvolved" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMOtherVehicleInvolved", propOrder = {
    "otherVeh",
    "vehType",
    "incident",
    "vehInfo",
    "heading",
    "speed",
    "damage",
    "injuryInfo",
    "operator",
    "passengers",
    "vehPersonCount",
    "postAccTest",
    "footnote",
    "footnoteLangs",
    "localIMOtherVehicleInvolved"
})
public class IMOtherVehicleInvolved {

    @XmlElement(name = "other-veh")
    protected Long otherVeh;
    @XmlElement(name = "veh-type", required = true)
    protected String vehType;
    @XmlElement(required = true)
    protected IMIncidentIden incident;
    @XmlElement(name = "veh-info", required = true)
    protected IMVehicleIDInformation vehInfo;
    @XmlElement(required = true)
    protected String heading;
    protected short speed;
    protected String damage;
    @XmlElement(name = "injury-info", required = true)
    protected IMInjuryInfo injuryInfo;
    protected IMPerson operator;
    @XmlElement(required = true)
    protected IMOtherVehicleInvolved.Passengers passengers;
    @XmlElement(name = "veh-person-count")
    protected Short vehPersonCount;
    @XmlElement(name = "post-acc-test")
    protected String postAccTest;
    protected String footnote;
    protected CPTAdditionalLanguageContents footnoteLangs;
    protected tcip_3_0_5_local.IMOtherVehicleInvolved localIMOtherVehicleInvolved;

    /**
     * Gets the value of the otherVeh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherVeh() {
        return otherVeh;
    }

    /**
     * Sets the value of the otherVeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherVeh(Long value) {
        this.otherVeh = value;
    }

    /**
     * Gets the value of the vehType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehType() {
        return vehType;
    }

    /**
     * Sets the value of the vehType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehType(String value) {
        this.vehType = value;
    }

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link IMIncidentIden }
     *     
     */
    public IMIncidentIden getIncident() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMIncidentIden }
     *     
     */
    public void setIncident(IMIncidentIden value) {
        this.incident = value;
    }

    /**
     * Gets the value of the vehInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IMVehicleIDInformation }
     *     
     */
    public IMVehicleIDInformation getVehInfo() {
        return vehInfo;
    }

    /**
     * Sets the value of the vehInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMVehicleIDInformation }
     *     
     */
    public void setVehInfo(IMVehicleIDInformation value) {
        this.vehInfo = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public short getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(short value) {
        this.speed = value;
    }

    /**
     * Gets the value of the damage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamage() {
        return damage;
    }

    /**
     * Sets the value of the damage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamage(String value) {
        this.damage = value;
    }

    /**
     * Gets the value of the injuryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IMInjuryInfo }
     *     
     */
    public IMInjuryInfo getInjuryInfo() {
        return injuryInfo;
    }

    /**
     * Sets the value of the injuryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMInjuryInfo }
     *     
     */
    public void setInjuryInfo(IMInjuryInfo value) {
        this.injuryInfo = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link IMPerson }
     *     
     */
    public IMPerson getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPerson }
     *     
     */
    public void setOperator(IMPerson value) {
        this.operator = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link IMOtherVehicleInvolved.Passengers }
     *     
     */
    public IMOtherVehicleInvolved.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMOtherVehicleInvolved.Passengers }
     *     
     */
    public void setPassengers(IMOtherVehicleInvolved.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the vehPersonCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVehPersonCount() {
        return vehPersonCount;
    }

    /**
     * Sets the value of the vehPersonCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVehPersonCount(Short value) {
        this.vehPersonCount = value;
    }

    /**
     * Gets the value of the postAccTest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAccTest() {
        return postAccTest;
    }

    /**
     * Sets the value of the postAccTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAccTest(String value) {
        this.postAccTest = value;
    }

    /**
     * Gets the value of the footnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootnote() {
        return footnote;
    }

    /**
     * Sets the value of the footnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootnote(String value) {
        this.footnote = value;
    }

    /**
     * Gets the value of the footnoteLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getFootnoteLangs() {
        return footnoteLangs;
    }

    /**
     * Sets the value of the footnoteLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setFootnoteLangs(CPTAdditionalLanguageContents value) {
        this.footnoteLangs = value;
    }

    /**
     * Gets the value of the localIMOtherVehicleInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.IMOtherVehicleInvolved }
     *     
     */
    public tcip_3_0_5_local.IMOtherVehicleInvolved getLocalIMOtherVehicleInvolved() {
        return localIMOtherVehicleInvolved;
    }

    /**
     * Sets the value of the localIMOtherVehicleInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.IMOtherVehicleInvolved }
     *     
     */
    public void setLocalIMOtherVehicleInvolved(tcip_3_0_5_local.IMOtherVehicleInvolved value) {
        this.localIMOtherVehicleInvolved = value;
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
     *         &lt;element name="passenger" type="{http://www.TCIP-Final-3-0-5-1}IMPerson"/>
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
        "passenger"
    })
    public static class Passengers {

        @XmlElement(required = true)
        protected List<IMPerson> passenger;

        /**
         * Gets the value of the passenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMPerson }
         * 
         * 
         */
        public List<IMPerson> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<IMPerson>();
            }
            return this.passenger;
        }

    }

}
