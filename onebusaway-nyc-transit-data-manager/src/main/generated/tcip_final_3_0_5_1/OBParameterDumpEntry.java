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
 * <p>Java class for OBParameterDumpEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBParameterDumpEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recorded-Time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime" minOccurs="0"/>
 *         &lt;element name="parameter-id" type="{http://www.TCIP-Final-3-0-5-1}OBParameterID"/>
 *         &lt;element name="parameter-value" type="{http://www.TCIP-Final-3-0-5-1}OBParameterValue"/>
 *         &lt;element name="localOBParameterDumpEntry" type="{http://www.tcip-3-0-5-local}OBParameterDumpEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBParameterDumpEntry", propOrder = {
    "recordedTime",
    "parameterId",
    "parameterValue",
    "localOBParameterDumpEntry"
})
public class OBParameterDumpEntry {

    @XmlElement(name = "recorded-Time")
    protected String recordedTime;
    @XmlElement(name = "parameter-id", required = true)
    protected OBParameterID parameterId;
    @XmlElement(name = "parameter-value", required = true)
    protected OBParameterValue parameterValue;
    protected tcip_3_0_5_local.OBParameterDumpEntry localOBParameterDumpEntry;

    /**
     * Gets the value of the recordedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordedTime() {
        return recordedTime;
    }

    /**
     * Sets the value of the recordedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordedTime(String value) {
        this.recordedTime = value;
    }

    /**
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link OBParameterID }
     *     
     */
    public OBParameterID getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBParameterID }
     *     
     */
    public void setParameterId(OBParameterID value) {
        this.parameterId = value;
    }

    /**
     * Gets the value of the parameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link OBParameterValue }
     *     
     */
    public OBParameterValue getParameterValue() {
        return parameterValue;
    }

    /**
     * Sets the value of the parameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBParameterValue }
     *     
     */
    public void setParameterValue(OBParameterValue value) {
        this.parameterValue = value;
    }

    /**
     * Gets the value of the localOBParameterDumpEntry property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.OBParameterDumpEntry }
     *     
     */
    public tcip_3_0_5_local.OBParameterDumpEntry getLocalOBParameterDumpEntry() {
        return localOBParameterDumpEntry;
    }

    /**
     * Sets the value of the localOBParameterDumpEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.OBParameterDumpEntry }
     *     
     */
    public void setLocalOBParameterDumpEntry(tcip_3_0_5_local.OBParameterDumpEntry value) {
        this.localOBParameterDumpEntry = value;
    }

}
