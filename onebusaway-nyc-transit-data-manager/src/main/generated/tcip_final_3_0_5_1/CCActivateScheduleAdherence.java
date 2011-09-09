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
 * <p>Java class for CCActivateScheduleAdherence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCActivateScheduleAdherence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tolerance-early" type="{http://www.TCIP-Final-3-0-5-1}CC-ScheduleToleranceEarly"/>
 *         &lt;element name="return-tolerance-early" type="{http://www.TCIP-Final-3-0-5-1}CC-ReturnToleranceEarly" minOccurs="0"/>
 *         &lt;element name="tolerance-late" type="{http://www.TCIP-Final-3-0-5-1}CC-ScheduleToleranceLate"/>
 *         &lt;element name="return-tolerance-late" type="{http://www.TCIP-Final-3-0-5-1}CC-ReturnToleranceLate" minOccurs="0"/>
 *         &lt;element name="report-frequency" type="{http://www.TCIP-Final-3-0-5-1}CC-ExceptionFrequencyReport" minOccurs="0"/>
 *         &lt;element name="response" type="{http://www.TCIP-Final-3-0-5-1}CC-MsgResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCActivateScheduleAdherence", propOrder = {
    "toleranceEarly",
    "returnToleranceEarly",
    "toleranceLate",
    "returnToleranceLate",
    "reportFrequency",
    "response"
})
public class CCActivateScheduleAdherence {

    @XmlElement(name = "tolerance-early")
    protected int toleranceEarly;
    @XmlElement(name = "return-tolerance-early")
    protected Integer returnToleranceEarly;
    @XmlElement(name = "tolerance-late")
    protected int toleranceLate;
    @XmlElement(name = "return-tolerance-late")
    protected Integer returnToleranceLate;
    @XmlElement(name = "report-frequency")
    protected Short reportFrequency;
    @XmlElement(required = true)
    protected String response;

    /**
     * Gets the value of the toleranceEarly property.
     * 
     */
    public int getToleranceEarly() {
        return toleranceEarly;
    }

    /**
     * Sets the value of the toleranceEarly property.
     * 
     */
    public void setToleranceEarly(int value) {
        this.toleranceEarly = value;
    }

    /**
     * Gets the value of the returnToleranceEarly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnToleranceEarly() {
        return returnToleranceEarly;
    }

    /**
     * Sets the value of the returnToleranceEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnToleranceEarly(Integer value) {
        this.returnToleranceEarly = value;
    }

    /**
     * Gets the value of the toleranceLate property.
     * 
     */
    public int getToleranceLate() {
        return toleranceLate;
    }

    /**
     * Sets the value of the toleranceLate property.
     * 
     */
    public void setToleranceLate(int value) {
        this.toleranceLate = value;
    }

    /**
     * Gets the value of the returnToleranceLate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnToleranceLate() {
        return returnToleranceLate;
    }

    /**
     * Sets the value of the returnToleranceLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnToleranceLate(Integer value) {
        this.returnToleranceLate = value;
    }

    /**
     * Gets the value of the reportFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReportFrequency() {
        return reportFrequency;
    }

    /**
     * Sets the value of the reportFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReportFrequency(Short value) {
        this.reportFrequency = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

}
