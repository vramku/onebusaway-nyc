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
 * <p>Java class for SchPushBlockSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchPushBlockSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pushHeader" type="{http://www.TCIP-Final-3-0-5-1}CPTPushHeader"/>
 *         &lt;element name="languages" type="{http://www.TCIP-Final-3-0-5-1}CPTLanguageList" minOccurs="0"/>
 *         &lt;element name="effective" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="update-since" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="expires" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="sched-blocks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="sched-block" type="{http://www.TCIP-Final-3-0-5-1}SCHBlockScheduleEntry"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="deleted-blocks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="deleted-block" type="{http://www.TCIP-Final-3-0-5-1}SCHBlockIden"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="note" type="{http://www.TCIP-Final-3-0-5-1}SCHNoteInfo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localSchPushBlockSchedule" type="{http://www.tcip-3-0-5-local}SchPushBlockSchedule" minOccurs="0"/>
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
@XmlType(name = "SchPushBlockSchedule", propOrder = {
    "pushHeader",
    "languages",
    "effective",
    "updateSince",
    "expires",
    "schedBlocks",
    "deletedBlocks",
    "notes",
    "localSchPushBlockSchedule"
})
public class SchPushBlockSchedule {

    @XmlElement(required = true)
    protected CPTPushHeader pushHeader;
    protected CPTLanguageList languages;
    @XmlElement(required = true)
    protected String effective;
    @XmlElement(name = "update-since")
    protected String updateSince;
    protected String expires;
    @XmlElement(name = "sched-blocks")
    protected SchPushBlockSchedule.SchedBlocks schedBlocks;
    @XmlElement(name = "deleted-blocks")
    protected SchPushBlockSchedule.DeletedBlocks deletedBlocks;
    protected SchPushBlockSchedule.Notes notes;
    protected tcip_3_0_5_local.SchPushBlockSchedule localSchPushBlockSchedule;
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
     * Gets the value of the pushHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CPTPushHeader }
     *     
     */
    public CPTPushHeader getPushHeader() {
        return pushHeader;
    }

    /**
     * Sets the value of the pushHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTPushHeader }
     *     
     */
    public void setPushHeader(CPTPushHeader value) {
        this.pushHeader = value;
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
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffective(String value) {
        this.effective = value;
    }

    /**
     * Gets the value of the updateSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateSince() {
        return updateSince;
    }

    /**
     * Sets the value of the updateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateSince(String value) {
        this.updateSince = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpires(String value) {
        this.expires = value;
    }

    /**
     * Gets the value of the schedBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link SchPushBlockSchedule.SchedBlocks }
     *     
     */
    public SchPushBlockSchedule.SchedBlocks getSchedBlocks() {
        return schedBlocks;
    }

    /**
     * Sets the value of the schedBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchPushBlockSchedule.SchedBlocks }
     *     
     */
    public void setSchedBlocks(SchPushBlockSchedule.SchedBlocks value) {
        this.schedBlocks = value;
    }

    /**
     * Gets the value of the deletedBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link SchPushBlockSchedule.DeletedBlocks }
     *     
     */
    public SchPushBlockSchedule.DeletedBlocks getDeletedBlocks() {
        return deletedBlocks;
    }

    /**
     * Sets the value of the deletedBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchPushBlockSchedule.DeletedBlocks }
     *     
     */
    public void setDeletedBlocks(SchPushBlockSchedule.DeletedBlocks value) {
        this.deletedBlocks = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link SchPushBlockSchedule.Notes }
     *     
     */
    public SchPushBlockSchedule.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchPushBlockSchedule.Notes }
     *     
     */
    public void setNotes(SchPushBlockSchedule.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the localSchPushBlockSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.SchPushBlockSchedule }
     *     
     */
    public tcip_3_0_5_local.SchPushBlockSchedule getLocalSchPushBlockSchedule() {
        return localSchPushBlockSchedule;
    }

    /**
     * Sets the value of the localSchPushBlockSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.SchPushBlockSchedule }
     *     
     */
    public void setLocalSchPushBlockSchedule(tcip_3_0_5_local.SchPushBlockSchedule value) {
        this.localSchPushBlockSchedule = value;
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
     *         &lt;element name="deleted-block" type="{http://www.TCIP-Final-3-0-5-1}SCHBlockIden"/>
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
        "deletedBlock"
    })
    public static class DeletedBlocks {

        @XmlElement(name = "deleted-block", required = true)
        protected List<SCHBlockIden> deletedBlock;

        /**
         * Gets the value of the deletedBlock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deletedBlock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeletedBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHBlockIden }
         * 
         * 
         */
        public List<SCHBlockIden> getDeletedBlock() {
            if (deletedBlock == null) {
                deletedBlock = new ArrayList<SCHBlockIden>();
            }
            return this.deletedBlock;
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
     *         &lt;element name="note" type="{http://www.TCIP-Final-3-0-5-1}SCHNoteInfo"/>
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
        "note"
    })
    public static class Notes {

        @XmlElement(required = true)
        protected List<SCHNoteInfo> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHNoteInfo }
         * 
         * 
         */
        public List<SCHNoteInfo> getNote() {
            if (note == null) {
                note = new ArrayList<SCHNoteInfo>();
            }
            return this.note;
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
     *         &lt;element name="sched-block" type="{http://www.TCIP-Final-3-0-5-1}SCHBlockScheduleEntry"/>
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
        "schedBlock"
    })
    public static class SchedBlocks {

        @XmlElement(name = "sched-block", required = true)
        protected List<SCHBlockScheduleEntry> schedBlock;

        /**
         * Gets the value of the schedBlock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schedBlock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchedBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHBlockScheduleEntry }
         * 
         * 
         */
        public List<SCHBlockScheduleEntry> getSchedBlock() {
            if (schedBlock == null) {
                schedBlock = new ArrayList<SCHBlockScheduleEntry>();
            }
            return this.schedBlock;
        }

    }

}
