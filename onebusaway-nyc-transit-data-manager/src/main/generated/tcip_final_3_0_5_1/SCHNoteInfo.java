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
 * <p>Java class for SCHNoteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHNoteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="note" type="{http://www.TCIP-Final-3-0-5-1}SCHNoteIden"/>
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-3-0-5-1}CPTRowMetaData" minOccurs="0"/>
 *         &lt;element name="public" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="note-text" type="{http://www.TCIP-Final-3-0-5-1}SCH-NoteMsg"/>
 *         &lt;element name="note-textLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="localSCHNoteInfo" type="{http://www.tcip-3-0-5-local}SCHNoteInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHNoteInfo", propOrder = {
    "note",
    "metadata",
    "_public",
    "noteText",
    "noteTextLangs",
    "localSCHNoteInfo"
})
public class SCHNoteInfo {

    @XmlElement(required = true)
    protected SCHNoteIden note;
    protected CPTRowMetaData metadata;
    @XmlElement(name = "public")
    protected boolean _public;
    @XmlElement(name = "note-text", required = true)
    protected String noteText;
    @XmlElement(name = "note-textLangs")
    protected CPTAdditionalLanguageContents noteTextLangs;
    protected tcip_3_0_5_local.SCHNoteInfo localSCHNoteInfo;

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link SCHNoteIden }
     *     
     */
    public SCHNoteIden getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHNoteIden }
     *     
     */
    public void setNote(SCHNoteIden value) {
        this.note = value;
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
     * Gets the value of the public property.
     * 
     */
    public boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     */
    public void setPublic(boolean value) {
        this._public = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the noteTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNoteTextLangs() {
        return noteTextLangs;
    }

    /**
     * Sets the value of the noteTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNoteTextLangs(CPTAdditionalLanguageContents value) {
        this.noteTextLangs = value;
    }

    /**
     * Gets the value of the localSCHNoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.SCHNoteInfo }
     *     
     */
    public tcip_3_0_5_local.SCHNoteInfo getLocalSCHNoteInfo() {
        return localSCHNoteInfo;
    }

    /**
     * Sets the value of the localSCHNoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.SCHNoteInfo }
     *     
     */
    public void setLocalSCHNoteInfo(tcip_3_0_5_local.SCHNoteInfo value) {
        this.localSCHNoteInfo = value;
    }

}
