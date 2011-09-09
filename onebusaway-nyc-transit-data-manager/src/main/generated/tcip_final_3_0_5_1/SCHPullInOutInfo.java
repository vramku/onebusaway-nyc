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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SCHPullInOutInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHPullInOutInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pull-in" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *         &lt;element name="garage" type="{http://www.TCIP-Final-3-0-5-1}CPTTransitFacilityIden"/>
 *         &lt;element name="vehicle" type="{http://www.TCIP-Final-3-0-5-1}CPTVehicleIden" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.TCIP-Final-3-0-5-1}CPTOperatorIden" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.TCIP-Final-3-0-5-1}CPT-Date"/>
 *         &lt;element name="time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="note" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="noteLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="trip" type="{http://www.TCIP-Final-3-0-5-1}SCHTripIden" minOccurs="0"/>
 *         &lt;element name="run" type="{http://www.TCIP-Final-3-0-5-1}SCHRunIden" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.TCIP-Final-3-0-5-1}SCHBlockIden" minOccurs="0"/>
 *         &lt;element name="parking-location" type="{http://www.TCIP-Final-3-0-5-1}CPTParkingSpace" minOccurs="0"/>
 *         &lt;element name="localSCHPullInOutInfo" type="{http://www.tcip-3-0-5-local}SCHPullInOutInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHPullInOutInfo", propOrder = {
    "pullIn",
    "garage",
    "vehicle",
    "operator",
    "date",
    "time",
    "note",
    "noteLangs",
    "trip",
    "run",
    "block",
    "parkingLocation",
    "localSCHPullInOutInfo"
})
public class SCHPullInOutInfo {

    @XmlElement(name = "pull-in")
    protected boolean pullIn;
    @XmlElement(required = true)
    protected CPTTransitFacilityIden garage;
    protected CPTVehicleIden vehicle;
    protected CPTOperatorIden operator;
    @XmlElement(required = true)
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected XMLGregorianCalendar time;
    protected String note;
    protected CPTAdditionalLanguageContents noteLangs;
    protected SCHTripIden trip;
    protected SCHRunIden run;
    protected SCHBlockIden block;
    @XmlElement(name = "parking-location")
    protected CPTParkingSpace parkingLocation;
    protected tcip_3_0_5_local.SCHPullInOutInfo localSCHPullInOutInfo;

    /**
     * Gets the value of the pullIn property.
     * 
     */
    public boolean isPullIn() {
        return pullIn;
    }

    /**
     * Sets the value of the pullIn property.
     * 
     */
    public void setPullIn(boolean value) {
        this.pullIn = value;
    }

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link CPTTransitFacilityIden }
     *     
     */
    public CPTTransitFacilityIden getGarage() {
        return garage;
    }

    /**
     * Sets the value of the garage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTTransitFacilityIden }
     *     
     */
    public void setGarage(CPTTransitFacilityIden value) {
        this.garage = value;
    }

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
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorIden }
     *     
     */
    public CPTOperatorIden getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorIden }
     *     
     */
    public void setOperator(CPTOperatorIden value) {
        this.operator = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param aDay
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(XMLGregorianCalendar aDay) {
        this.date = aDay;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param beginTime
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(XMLGregorianCalendar beginTime) {
        this.time = beginTime;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNoteLangs() {
        return noteLangs;
    }

    /**
     * Sets the value of the noteLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNoteLangs(CPTAdditionalLanguageContents value) {
        this.noteLangs = value;
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
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link SCHBlockIden }
     *     
     */
    public SCHBlockIden getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHBlockIden }
     *     
     */
    public void setBlock(SCHBlockIden value) {
        this.block = value;
    }

    /**
     * Gets the value of the parkingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CPTParkingSpace }
     *     
     */
    public CPTParkingSpace getParkingLocation() {
        return parkingLocation;
    }

    /**
     * Sets the value of the parkingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTParkingSpace }
     *     
     */
    public void setParkingLocation(CPTParkingSpace value) {
        this.parkingLocation = value;
    }

    /**
     * Gets the value of the localSCHPullInOutInfo property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.SCHPullInOutInfo }
     *     
     */
    public tcip_3_0_5_local.SCHPullInOutInfo getLocalSCHPullInOutInfo() {
        return localSCHPullInOutInfo;
    }

    /**
     * Sets the value of the localSCHPullInOutInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.SCHPullInOutInfo }
     *     
     */
    public void setLocalSCHPullInOutInfo(tcip_3_0_5_local.SCHPullInOutInfo value) {
        this.localSCHPullInOutInfo = value;
    }

}
