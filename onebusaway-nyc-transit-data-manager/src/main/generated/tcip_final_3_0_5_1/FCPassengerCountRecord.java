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
 * <p>Java class for FCPassengerCountRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCPassengerCountRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="route" type="{http://www.TCIP-Final-3-0-5-1}SCHRouteIden" minOccurs="0"/>
 *         &lt;element name="trip" type="{http://www.TCIP-Final-3-0-5-1}SCHTripIden" minOccurs="0"/>
 *         &lt;element name="sample-interval-begin" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="sample-interval-end" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPTStoppointIden" minOccurs="0"/>
 *         &lt;element name="boarded" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="alighted" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="entered-stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="exited-stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="waiting-at-stoppoint" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="onboard-vehicle" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="localFCPassengerCountRecord" type="{http://www.tcip-3-0-5-local}FCPassengerCountRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCPassengerCountRecord", propOrder = {
    "route",
    "trip",
    "sampleIntervalBegin",
    "sampleIntervalEnd",
    "stoppoint",
    "boarded",
    "alighted",
    "enteredStoppoint",
    "exitedStoppoint",
    "waitingAtStoppoint",
    "onboardVehicle",
    "localFCPassengerCountRecord"
})
public class FCPassengerCountRecord {

    protected SCHRouteIden route;
    protected SCHTripIden trip;
    @XmlElement(name = "sample-interval-begin", required = true)
    protected String sampleIntervalBegin;
    @XmlElement(name = "sample-interval-end", required = true)
    protected String sampleIntervalEnd;
    protected CPTStoppointIden stoppoint;
    protected Long boarded;
    protected Long alighted;
    @XmlElement(name = "entered-stoppoint")
    protected Long enteredStoppoint;
    @XmlElement(name = "exited-stoppoint")
    protected Long exitedStoppoint;
    @XmlElement(name = "waiting-at-stoppoint")
    protected Long waitingAtStoppoint;
    @XmlElement(name = "onboard-vehicle")
    protected Long onboardVehicle;
    protected tcip_3_0_5_local.FCPassengerCountRecord localFCPassengerCountRecord;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setRoute(SCHRouteIden value) {
        this.route = value;
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

    /**
     * Gets the value of the sampleIntervalBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleIntervalBegin() {
        return sampleIntervalBegin;
    }

    /**
     * Sets the value of the sampleIntervalBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleIntervalBegin(String value) {
        this.sampleIntervalBegin = value;
    }

    /**
     * Gets the value of the sampleIntervalEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleIntervalEnd() {
        return sampleIntervalEnd;
    }

    /**
     * Sets the value of the sampleIntervalEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleIntervalEnd(String value) {
        this.sampleIntervalEnd = value;
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
     * Gets the value of the boarded property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBoarded() {
        return boarded;
    }

    /**
     * Sets the value of the boarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBoarded(Long value) {
        this.boarded = value;
    }

    /**
     * Gets the value of the alighted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlighted() {
        return alighted;
    }

    /**
     * Sets the value of the alighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlighted(Long value) {
        this.alighted = value;
    }

    /**
     * Gets the value of the enteredStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnteredStoppoint() {
        return enteredStoppoint;
    }

    /**
     * Sets the value of the enteredStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnteredStoppoint(Long value) {
        this.enteredStoppoint = value;
    }

    /**
     * Gets the value of the exitedStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExitedStoppoint() {
        return exitedStoppoint;
    }

    /**
     * Sets the value of the exitedStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExitedStoppoint(Long value) {
        this.exitedStoppoint = value;
    }

    /**
     * Gets the value of the waitingAtStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaitingAtStoppoint() {
        return waitingAtStoppoint;
    }

    /**
     * Sets the value of the waitingAtStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaitingAtStoppoint(Long value) {
        this.waitingAtStoppoint = value;
    }

    /**
     * Gets the value of the onboardVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnboardVehicle() {
        return onboardVehicle;
    }

    /**
     * Sets the value of the onboardVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnboardVehicle(Long value) {
        this.onboardVehicle = value;
    }

    /**
     * Gets the value of the localFCPassengerCountRecord property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.FCPassengerCountRecord }
     *     
     */
    public tcip_3_0_5_local.FCPassengerCountRecord getLocalFCPassengerCountRecord() {
        return localFCPassengerCountRecord;
    }

    /**
     * Sets the value of the localFCPassengerCountRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.FCPassengerCountRecord }
     *     
     */
    public void setLocalFCPassengerCountRecord(tcip_3_0_5_local.FCPassengerCountRecord value) {
        this.localFCPassengerCountRecord = value;
    }

}
