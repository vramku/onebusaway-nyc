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
 * <p>Java class for FcCommandEnableEquipAck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FcCommandEnableEquipAck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandID" type="{http://www.TCIP-Final-3-0-5-1}CPT-CommandID"/>
 *         &lt;element name="command-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="exit-free-mode" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="command-accepted" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="time-implemented" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="exit-free-mode-ids" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="exit-free-mode-id" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resume-ops-ids" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="resume-ops-id" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
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
@XmlType(name = "FcCommandEnableEquipAck", propOrder = {
    "commandID",
    "commandTime",
    "exitFreeMode",
    "commandAccepted",
    "timeImplemented",
    "exitFreeModeIds",
    "resumeOpsIds"
})
public class FcCommandEnableEquipAck {

    protected long commandID;
    @XmlElement(name = "command-time", required = true)
    protected String commandTime;
    @XmlElement(name = "exit-free-mode")
    protected boolean exitFreeMode;
    @XmlElement(name = "command-accepted")
    protected boolean commandAccepted;
    @XmlElement(name = "time-implemented")
    protected String timeImplemented;
    @XmlElement(name = "exit-free-mode-ids")
    protected FcCommandEnableEquipAck.ExitFreeModeIds exitFreeModeIds;
    @XmlElement(name = "resume-ops-ids")
    protected FcCommandEnableEquipAck.ResumeOpsIds resumeOpsIds;
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
     * Gets the value of the commandTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandTime() {
        return commandTime;
    }

    /**
     * Sets the value of the commandTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandTime(String value) {
        this.commandTime = value;
    }

    /**
     * Gets the value of the exitFreeMode property.
     * 
     */
    public boolean isExitFreeMode() {
        return exitFreeMode;
    }

    /**
     * Sets the value of the exitFreeMode property.
     * 
     */
    public void setExitFreeMode(boolean value) {
        this.exitFreeMode = value;
    }

    /**
     * Gets the value of the commandAccepted property.
     * 
     */
    public boolean isCommandAccepted() {
        return commandAccepted;
    }

    /**
     * Sets the value of the commandAccepted property.
     * 
     */
    public void setCommandAccepted(boolean value) {
        this.commandAccepted = value;
    }

    /**
     * Gets the value of the timeImplemented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeImplemented() {
        return timeImplemented;
    }

    /**
     * Sets the value of the timeImplemented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeImplemented(String value) {
        this.timeImplemented = value;
    }

    /**
     * Gets the value of the exitFreeModeIds property.
     * 
     * @return
     *     possible object is
     *     {@link FcCommandEnableEquipAck.ExitFreeModeIds }
     *     
     */
    public FcCommandEnableEquipAck.ExitFreeModeIds getExitFreeModeIds() {
        return exitFreeModeIds;
    }

    /**
     * Sets the value of the exitFreeModeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcCommandEnableEquipAck.ExitFreeModeIds }
     *     
     */
    public void setExitFreeModeIds(FcCommandEnableEquipAck.ExitFreeModeIds value) {
        this.exitFreeModeIds = value;
    }

    /**
     * Gets the value of the resumeOpsIds property.
     * 
     * @return
     *     possible object is
     *     {@link FcCommandEnableEquipAck.ResumeOpsIds }
     *     
     */
    public FcCommandEnableEquipAck.ResumeOpsIds getResumeOpsIds() {
        return resumeOpsIds;
    }

    /**
     * Sets the value of the resumeOpsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcCommandEnableEquipAck.ResumeOpsIds }
     *     
     */
    public void setResumeOpsIds(FcCommandEnableEquipAck.ResumeOpsIds value) {
        this.resumeOpsIds = value;
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
     *         &lt;element name="exit-free-mode-id" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
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
        "exitFreeModeId"
    })
    public static class ExitFreeModeIds {

        @XmlElement(name = "exit-free-mode-id", required = true)
        protected List<String> exitFreeModeId;

        /**
         * Gets the value of the exitFreeModeId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exitFreeModeId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExitFreeModeId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExitFreeModeId() {
            if (exitFreeModeId == null) {
                exitFreeModeId = new ArrayList<String>();
            }
            return this.exitFreeModeId;
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
     *         &lt;element name="resume-ops-id" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
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
        "resumeOpsId"
    })
    public static class ResumeOpsIds {

        @XmlElement(name = "resume-ops-id", required = true)
        protected List<String> resumeOpsId;

        /**
         * Gets the value of the resumeOpsId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resumeOpsId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResumeOpsId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResumeOpsId() {
            if (resumeOpsId == null) {
                resumeOpsId = new ArrayList<String>();
            }
            return this.resumeOpsId;
        }

    }

}
