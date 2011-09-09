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
 * <p>Java class for CcChangeAssignments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcChangeAssignments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languages" type="{http://www.TCIP-Final-3-0-5-1}CPTLanguageList" minOccurs="0"/>
 *         &lt;element name="commandID" type="{http://www.TCIP-Final-3-0-5-1}CPT-CommandID"/>
 *         &lt;element name="time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="operator-changes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="operator-change" type="{http://www.TCIP-Final-3-0-5-1}CCOperatorAssignmentChange"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vehicle-changes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="vehicle-change" type="{http://www.TCIP-Final-3-0-5-1}CCVehicleAssignmentChange"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localCcChangeAssignments" type="{http://www.tcip-3-0-5-local}CcChangeAssignments" minOccurs="0"/>
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
@XmlType(name = "CcChangeAssignments", propOrder = {
    "languages",
    "commandID",
    "time",
    "operatorChanges",
    "vehicleChanges",
    "localCcChangeAssignments"
})
public class CcChangeAssignments {

    protected CPTLanguageList languages;
    protected long commandID;
    @XmlElement(required = true)
    protected String time;
    @XmlElement(name = "operator-changes")
    protected CcChangeAssignments.OperatorChanges operatorChanges;
    @XmlElement(name = "vehicle-changes")
    protected CcChangeAssignments.VehicleChanges vehicleChanges;
    protected tcip_3_0_5_local.CcChangeAssignments localCcChangeAssignments;
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
     * Gets the value of the commandID property.
     * 
     */
    public long getCommandID() {
        return commandID;
    }

    /**
     * Sets the value of the commandID property.
     * 
     */
    public void setCommandID(long value) {
        this.commandID = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the operatorChanges property.
     * 
     * @return
     *     possible object is
     *     {@link CcChangeAssignments.OperatorChanges }
     *     
     */
    public CcChangeAssignments.OperatorChanges getOperatorChanges() {
        return operatorChanges;
    }

    /**
     * Sets the value of the operatorChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcChangeAssignments.OperatorChanges }
     *     
     */
    public void setOperatorChanges(CcChangeAssignments.OperatorChanges value) {
        this.operatorChanges = value;
    }

    /**
     * Gets the value of the vehicleChanges property.
     * 
     * @return
     *     possible object is
     *     {@link CcChangeAssignments.VehicleChanges }
     *     
     */
    public CcChangeAssignments.VehicleChanges getVehicleChanges() {
        return vehicleChanges;
    }

    /**
     * Sets the value of the vehicleChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcChangeAssignments.VehicleChanges }
     *     
     */
    public void setVehicleChanges(CcChangeAssignments.VehicleChanges value) {
        this.vehicleChanges = value;
    }

    /**
     * Gets the value of the localCcChangeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.CcChangeAssignments }
     *     
     */
    public tcip_3_0_5_local.CcChangeAssignments getLocalCcChangeAssignments() {
        return localCcChangeAssignments;
    }

    /**
     * Sets the value of the localCcChangeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.CcChangeAssignments }
     *     
     */
    public void setLocalCcChangeAssignments(tcip_3_0_5_local.CcChangeAssignments value) {
        this.localCcChangeAssignments = value;
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
     *         &lt;element name="operator-change" type="{http://www.TCIP-Final-3-0-5-1}CCOperatorAssignmentChange"/>
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
        "operatorChange"
    })
    public static class OperatorChanges {

        @XmlElement(name = "operator-change", required = true)
        protected List<CCOperatorAssignmentChange> operatorChange;

        /**
         * Gets the value of the operatorChange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operatorChange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperatorChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCOperatorAssignmentChange }
         * 
         * 
         */
        public List<CCOperatorAssignmentChange> getOperatorChange() {
            if (operatorChange == null) {
                operatorChange = new ArrayList<CCOperatorAssignmentChange>();
            }
            return this.operatorChange;
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
     *         &lt;element name="vehicle-change" type="{http://www.TCIP-Final-3-0-5-1}CCVehicleAssignmentChange"/>
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
        "vehicleChange"
    })
    public static class VehicleChanges {

        @XmlElement(name = "vehicle-change", required = true)
        protected List<CCVehicleAssignmentChange> vehicleChange;

        /**
         * Gets the value of the vehicleChange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleChange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCVehicleAssignmentChange }
         * 
         * 
         */
        public List<CCVehicleAssignmentChange> getVehicleChange() {
            if (vehicleChange == null) {
                vehicleChange = new ArrayList<CCVehicleAssignmentChange>();
            }
            return this.vehicleChange;
        }

    }

}
