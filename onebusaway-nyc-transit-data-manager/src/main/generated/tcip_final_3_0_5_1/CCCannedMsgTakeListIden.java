//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_final_3_0_5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCannedMsgTakeListIden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCannedMsgTakeListIden">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listID" type="{http://www.TCIP-Final-3-0-5-1}CC-CannedMsgTakeListID"/>
 *         &lt;element name="agencyID" type="{http://www.TCIP-Final-3-0-5-1}CPT-AgencyID" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.TCIP-Final-3-0-5-1}CC-AnnouncementName" minOccurs="0"/>
 *         &lt;element name="nameLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="designator" type="{http://www.TCIP-Final-3-0-5-1}CC-AnnouncementDesignator" minOccurs="0"/>
 *         &lt;element name="designatorLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="agencydesignator" type="{http://www.TCIP-Final-3-0-5-1}CPT-AgencyDesignator" minOccurs="0"/>
 *         &lt;element name="agencydesignatorLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCannedMsgTakeListIden", propOrder = {
    "listID",
    "agencyID",
    "name",
    "nameLangs",
    "designator",
    "designatorLangs",
    "agencydesignator",
    "agencydesignatorLangs"
})
public class CCCannedMsgTakeListIden {

    protected int listID;
    protected Long agencyID;
    protected String name;
    protected CPTAdditionalLanguageContents nameLangs;
    protected String designator;
    protected CPTAdditionalLanguageContents designatorLangs;
    protected String agencydesignator;
    protected CPTAdditionalLanguageContents agencydesignatorLangs;

    /**
     * Gets the value of the listID property.
     * 
     */
    public int getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     */
    public void setListID(int value) {
        this.listID = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNameLangs() {
        return nameLangs;
    }

    /**
     * Sets the value of the nameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNameLangs(CPTAdditionalLanguageContents value) {
        this.nameLangs = value;
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

    /**
     * Gets the value of the designatorLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDesignatorLangs() {
        return designatorLangs;
    }

    /**
     * Sets the value of the designatorLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDesignatorLangs(CPTAdditionalLanguageContents value) {
        this.designatorLangs = value;
    }

    /**
     * Gets the value of the agencydesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencydesignator() {
        return agencydesignator;
    }

    /**
     * Sets the value of the agencydesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencydesignator(String value) {
        this.agencydesignator = value;
    }

    /**
     * Gets the value of the agencydesignatorLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getAgencydesignatorLangs() {
        return agencydesignatorLangs;
    }

    /**
     * Sets the value of the agencydesignatorLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setAgencydesignatorLangs(CPTAdditionalLanguageContents value) {
        this.agencydesignatorLangs = value;
    }

}
