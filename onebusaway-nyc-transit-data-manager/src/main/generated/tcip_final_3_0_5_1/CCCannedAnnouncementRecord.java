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
 * <p>Java class for CCCannedAnnouncementRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCannedAnnouncementRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="announcementID" type="{http://www.TCIP-Final-3-0-5-1}CCAnnouncementIden"/>
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-3-0-5-1}CPTRowMetaData"/>
 *         &lt;element name="announcementText" type="{http://www.TCIP-Final-3-0-5-1}OB-TextMessage" minOccurs="0"/>
 *         &lt;element name="announcementTextLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="text-color" type="{http://www.TCIP-Final-3-0-5-1}PI-PIDTextColor" minOccurs="0"/>
 *         &lt;element name="text-attributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="text-attribute" type="{http://www.TCIP-Final-3-0-5-1}PI-PIDTextAttribute"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="announcementGraphic" type="{http://www.TCIP-Final-3-0-5-1}PI-BinaryImageData" minOccurs="0"/>
 *         &lt;element name="announcementAudio" type="{http://www.TCIP-Final-3-0-5-1}PI-BinaryAudioData" minOccurs="0"/>
 *         &lt;element name="graphicFormat" type="{http://www.TCIP-Final-3-0-5-1}PI-GraphicFormat" minOccurs="0"/>
 *         &lt;element name="audioFormat" type="{http://www.TCIP-Final-3-0-5-1}PI-AudioFormat" minOccurs="0"/>
 *         &lt;element name="audio-inside" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="audio-outside" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="text-passenger-displays" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="text-destination-signs" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="graphic-passenger-displays" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="graphic-destination-signs" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="tts-audio-text" type="{http://www.TCIP-Final-3-0-5-1}PI-DMSMessage" minOccurs="0"/>
 *         &lt;element name="tts-audio-textLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCannedAnnouncementRecord", propOrder = {
    "announcementID",
    "metadata",
    "announcementText",
    "announcementTextLangs",
    "textColor",
    "textAttributes",
    "announcementGraphic",
    "announcementAudio",
    "graphicFormat",
    "audioFormat",
    "audioInside",
    "audioOutside",
    "textPassengerDisplays",
    "textDestinationSigns",
    "graphicPassengerDisplays",
    "graphicDestinationSigns",
    "ttsAudioText",
    "ttsAudioTextLangs"
})
public class CCCannedAnnouncementRecord {

    @XmlElement(required = true)
    protected CCAnnouncementIden announcementID;
    @XmlElement(required = true)
    protected CPTRowMetaData metadata;
    protected String announcementText;
    protected CPTAdditionalLanguageContents announcementTextLangs;
    @XmlElement(name = "text-color")
    protected String textColor;
    @XmlElement(name = "text-attributes")
    protected CCCannedAnnouncementRecord.TextAttributes textAttributes;
    protected PIBinaryImageData announcementGraphic;
    protected PIBinaryAudioData announcementAudio;
    protected String graphicFormat;
    protected String audioFormat;
    @XmlElement(name = "audio-inside")
    protected boolean audioInside;
    @XmlElement(name = "audio-outside")
    protected boolean audioOutside;
    @XmlElement(name = "text-passenger-displays")
    protected boolean textPassengerDisplays;
    @XmlElement(name = "text-destination-signs")
    protected boolean textDestinationSigns;
    @XmlElement(name = "graphic-passenger-displays")
    protected boolean graphicPassengerDisplays;
    @XmlElement(name = "graphic-destination-signs")
    protected boolean graphicDestinationSigns;
    @XmlElement(name = "tts-audio-text")
    protected String ttsAudioText;
    @XmlElement(name = "tts-audio-textLangs")
    protected CPTAdditionalLanguageContents ttsAudioTextLangs;

    /**
     * Gets the value of the announcementID property.
     * 
     * @return
     *     possible object is
     *     {@link CCAnnouncementIden }
     *     
     */
    public CCAnnouncementIden getAnnouncementID() {
        return announcementID;
    }

    /**
     * Sets the value of the announcementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAnnouncementIden }
     *     
     */
    public void setAnnouncementID(CCAnnouncementIden value) {
        this.announcementID = value;
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
     * Gets the value of the announcementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementText() {
        return announcementText;
    }

    /**
     * Sets the value of the announcementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementText(String value) {
        this.announcementText = value;
    }

    /**
     * Gets the value of the announcementTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getAnnouncementTextLangs() {
        return announcementTextLangs;
    }

    /**
     * Sets the value of the announcementTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setAnnouncementTextLangs(CPTAdditionalLanguageContents value) {
        this.announcementTextLangs = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the textAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CCCannedAnnouncementRecord.TextAttributes }
     *     
     */
    public CCCannedAnnouncementRecord.TextAttributes getTextAttributes() {
        return textAttributes;
    }

    /**
     * Sets the value of the textAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCannedAnnouncementRecord.TextAttributes }
     *     
     */
    public void setTextAttributes(CCCannedAnnouncementRecord.TextAttributes value) {
        this.textAttributes = value;
    }

    /**
     * Gets the value of the announcementGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link PIBinaryImageData }
     *     
     */
    public PIBinaryImageData getAnnouncementGraphic() {
        return announcementGraphic;
    }

    /**
     * Sets the value of the announcementGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIBinaryImageData }
     *     
     */
    public void setAnnouncementGraphic(PIBinaryImageData value) {
        this.announcementGraphic = value;
    }

    /**
     * Gets the value of the announcementAudio property.
     * 
     * @return
     *     possible object is
     *     {@link PIBinaryAudioData }
     *     
     */
    public PIBinaryAudioData getAnnouncementAudio() {
        return announcementAudio;
    }

    /**
     * Sets the value of the announcementAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIBinaryAudioData }
     *     
     */
    public void setAnnouncementAudio(PIBinaryAudioData value) {
        this.announcementAudio = value;
    }

    /**
     * Gets the value of the graphicFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicFormat() {
        return graphicFormat;
    }

    /**
     * Sets the value of the graphicFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicFormat(String value) {
        this.graphicFormat = value;
    }

    /**
     * Gets the value of the audioFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    /**
     * Sets the value of the audioFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioFormat(String value) {
        this.audioFormat = value;
    }

    /**
     * Gets the value of the audioInside property.
     * 
     */
    public boolean isAudioInside() {
        return audioInside;
    }

    /**
     * Sets the value of the audioInside property.
     * 
     */
    public void setAudioInside(boolean value) {
        this.audioInside = value;
    }

    /**
     * Gets the value of the audioOutside property.
     * 
     */
    public boolean isAudioOutside() {
        return audioOutside;
    }

    /**
     * Sets the value of the audioOutside property.
     * 
     */
    public void setAudioOutside(boolean value) {
        this.audioOutside = value;
    }

    /**
     * Gets the value of the textPassengerDisplays property.
     * 
     */
    public boolean isTextPassengerDisplays() {
        return textPassengerDisplays;
    }

    /**
     * Sets the value of the textPassengerDisplays property.
     * 
     */
    public void setTextPassengerDisplays(boolean value) {
        this.textPassengerDisplays = value;
    }

    /**
     * Gets the value of the textDestinationSigns property.
     * 
     */
    public boolean isTextDestinationSigns() {
        return textDestinationSigns;
    }

    /**
     * Sets the value of the textDestinationSigns property.
     * 
     */
    public void setTextDestinationSigns(boolean value) {
        this.textDestinationSigns = value;
    }

    /**
     * Gets the value of the graphicPassengerDisplays property.
     * 
     */
    public boolean isGraphicPassengerDisplays() {
        return graphicPassengerDisplays;
    }

    /**
     * Sets the value of the graphicPassengerDisplays property.
     * 
     */
    public void setGraphicPassengerDisplays(boolean value) {
        this.graphicPassengerDisplays = value;
    }

    /**
     * Gets the value of the graphicDestinationSigns property.
     * 
     */
    public boolean isGraphicDestinationSigns() {
        return graphicDestinationSigns;
    }

    /**
     * Sets the value of the graphicDestinationSigns property.
     * 
     */
    public void setGraphicDestinationSigns(boolean value) {
        this.graphicDestinationSigns = value;
    }

    /**
     * Gets the value of the ttsAudioText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtsAudioText() {
        return ttsAudioText;
    }

    /**
     * Sets the value of the ttsAudioText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtsAudioText(String value) {
        this.ttsAudioText = value;
    }

    /**
     * Gets the value of the ttsAudioTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getTtsAudioTextLangs() {
        return ttsAudioTextLangs;
    }

    /**
     * Sets the value of the ttsAudioTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setTtsAudioTextLangs(CPTAdditionalLanguageContents value) {
        this.ttsAudioTextLangs = value;
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
     *         &lt;element name="text-attribute" type="{http://www.TCIP-Final-3-0-5-1}PI-PIDTextAttribute"/>
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
        "textAttribute"
    })
    public static class TextAttributes {

        @XmlElement(name = "text-attribute", required = true)
        protected List<String> textAttribute;

        /**
         * Gets the value of the textAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the textAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTextAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTextAttribute() {
            if (textAttribute == null) {
                textAttribute = new ArrayList<String>();
            }
            return this.textAttribute;
        }

    }

}
