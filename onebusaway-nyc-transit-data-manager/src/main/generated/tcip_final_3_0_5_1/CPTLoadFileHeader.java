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
 * <p>Java class for CPTLoadFileHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPTLoadFileHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="vehicle" type="{http://www.TCIP-Final-3-0-5-1}CPTVehicleIden"/>
 *             &lt;element name="component-identifier" type="{http://www.TCIP-Final-3-0-5-1}OB-MID" minOccurs="0"/>
 *             &lt;element name="component-IP" type="{http://www.TCIP-Final-3-0-5-1}CPT-IPAddress" minOccurs="0"/>
 *             &lt;element name="component-port" type="{http://www.TCIP-Final-3-0-5-1}CPT-UDP-TCP-PortNumber" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPTStoppointIden"/>
 *             &lt;element name="field-address" type="{http://www.TCIP-Final-3-0-5-1}CPT-IPAddress" minOccurs="0"/>
 *             &lt;element name="field-port" type="{http://www.TCIP-Final-3-0-5-1}CPT-UDP-TCP-PortNumber" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="file-identifier" type="{http://www.TCIP-Final-3-0-5-1}CPT-FileIdentifier"/>
 *         &lt;element name="version-number" type="{http://www.TCIP-Final-3-0-5-1}CPT-FileVersion" minOccurs="0"/>
 *         &lt;element name="sched-version" type="{http://www.TCIP-Final-3-0-5-1}SCH-TimetableVersionID" minOccurs="0"/>
 *         &lt;element name="effective-datetime" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="updates-since" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="updated-datetime" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="file-size" type="{http://www.TCIP-Final-3-0-5-1}CPT-FileSize"/>
 *         &lt;element name="applicability" type="{http://www.TCIP-Final-3-0-5-1}CPTFileApplicability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPTLoadFileHeader", propOrder = {
    "vehicle",
    "componentIdentifier",
    "componentIP",
    "componentPort",
    "stoppoint",
    "fieldAddress",
    "fieldPort",
    "fileIdentifier",
    "versionNumber",
    "schedVersion",
    "effectiveDatetime",
    "updatesSince",
    "updatedDatetime",
    "fileSize",
    "applicability"
})
public class CPTLoadFileHeader {

    protected CPTVehicleIden vehicle;
    @XmlElement(name = "component-identifier")
    protected Short componentIdentifier;
    @XmlElement(name = "component-IP")
    protected String componentIP;
    @XmlElement(name = "component-port")
    protected Short componentPort;
    protected CPTStoppointIden stoppoint;
    @XmlElement(name = "field-address")
    protected String fieldAddress;
    @XmlElement(name = "field-port")
    protected Short fieldPort;
    @XmlElement(name = "file-identifier", required = true)
    protected String fileIdentifier;
    @XmlElement(name = "version-number")
    protected Long versionNumber;
    @XmlElement(name = "sched-version")
    protected Long schedVersion;
    @XmlElement(name = "effective-datetime")
    protected String effectiveDatetime;
    @XmlElement(name = "updates-since")
    protected String updatesSince;
    @XmlElement(name = "updated-datetime", required = true)
    protected String updatedDatetime;
    @XmlElement(name = "file-size")
    protected long fileSize;
    protected CPTFileApplicability applicability;

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
     * Gets the value of the componentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getComponentIdentifier() {
        return componentIdentifier;
    }

    /**
     * Sets the value of the componentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setComponentIdentifier(Short value) {
        this.componentIdentifier = value;
    }

    /**
     * Gets the value of the componentIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentIP() {
        return componentIP;
    }

    /**
     * Sets the value of the componentIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentIP(String value) {
        this.componentIP = value;
    }

    /**
     * Gets the value of the componentPort property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getComponentPort() {
        return componentPort;
    }

    /**
     * Sets the value of the componentPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setComponentPort(Short value) {
        this.componentPort = value;
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
     * Gets the value of the fieldAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldAddress() {
        return fieldAddress;
    }

    /**
     * Sets the value of the fieldAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldAddress(String value) {
        this.fieldAddress = value;
    }

    /**
     * Gets the value of the fieldPort property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFieldPort() {
        return fieldPort;
    }

    /**
     * Sets the value of the fieldPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFieldPort(Short value) {
        this.fieldPort = value;
    }

    /**
     * Gets the value of the fileIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileIdentifier() {
        return fileIdentifier;
    }

    /**
     * Sets the value of the fileIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileIdentifier(String value) {
        this.fileIdentifier = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersionNumber(Long value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the schedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchedVersion() {
        return schedVersion;
    }

    /**
     * Sets the value of the schedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchedVersion(Long value) {
        this.schedVersion = value;
    }

    /**
     * Gets the value of the effectiveDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDatetime() {
        return effectiveDatetime;
    }

    /**
     * Sets the value of the effectiveDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDatetime(String value) {
        this.effectiveDatetime = value;
    }

    /**
     * Gets the value of the updatesSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatesSince() {
        return updatesSince;
    }

    /**
     * Sets the value of the updatesSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatesSince(String value) {
        this.updatesSince = value;
    }

    /**
     * Gets the value of the updatedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDatetime() {
        return updatedDatetime;
    }

    /**
     * Sets the value of the updatedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDatetime(String value) {
        this.updatedDatetime = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link CPTFileApplicability }
     *     
     */
    public CPTFileApplicability getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTFileApplicability }
     *     
     */
    public void setApplicability(CPTFileApplicability value) {
        this.applicability = value;
    }

}
