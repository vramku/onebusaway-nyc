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
 * <p>Java class for CCTimepointHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTimepointHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timepoint" type="{http://www.TCIP-Final-3-0-5-1}SCHTimepointIden"/>
 *         &lt;element name="run" type="{http://www.TCIP-Final-3-0-5-1}SCHRunIden"/>
 *         &lt;element name="scheduledTime" type="{http://www.TCIP-Final-3-0-5-1}SCH-Time"/>
 *         &lt;element name="actualTime" type="{http://www.TCIP-Final-3-0-5-1}SCH-Time"/>
 *         &lt;element name="trip" type="{http://www.TCIP-Final-3-0-5-1}SCHTripIden" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCTimepointHistory", propOrder = {
    "timepoint",
    "run",
    "scheduledTime",
    "actualTime",
    "trip"
})
public class CCTimepointHistory {

    @XmlElement(required = true)
    protected SCHTimepointIden timepoint;
    @XmlElement(required = true)
    protected SCHRunIden run;
    protected int scheduledTime;
    protected int actualTime;
    protected SCHTripIden trip;

    /**
     * Gets the value of the timepoint property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getTimepoint() {
        return timepoint;
    }

    /**
     * Sets the value of the timepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setTimepoint(SCHTimepointIden value) {
        this.timepoint = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRunIden }
     *     
     */
    public SCHRunIden getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRunIden }
     *     
     */
    public void setRun(SCHRunIden value) {
        this.run = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     */
    public int getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     */
    public void setScheduledTime(int value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the actualTime property.
     * 
     */
    public int getActualTime() {
        return actualTime;
    }

    /**
     * Sets the value of the actualTime property.
     * 
     */
    public void setActualTime(int value) {
        this.actualTime = value;
    }

    /**
     * Gets the value of the trip property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTripIden }
     *     
     */
    public SCHTripIden getTrip() {
        return trip;
    }

    /**
     * Sets the value of the trip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTripIden }
     *     
     */
    public void setTrip(SCHTripIden value) {
        this.trip = value;
    }

}
