//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package atis_partial_03_00_74;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpaceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSpaceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.atis-partial-03-00-74}ParkingSpaceKind"/>
 *         &lt;element name="spaces" type="{http://www.atis-partial-03-00-74}PI-ParkingSpacesTotal"/>
 *         &lt;element name="vehicleClass" type="{http://www.atis-partial-03-00-74}PI-ParkingVehicleClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSpaceTypes", propOrder = {
    "type",
    "spaces",
    "vehicleClass"
})
public class ParkingSpaceTypes {

    @XmlElement(required = true)
    protected String type;
    protected int spaces;
    protected String vehicleClass;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the spaces property.
     * 
     */
    public int getSpaces() {
        return spaces;
    }

    /**
     * Sets the value of the spaces property.
     * 
     */
    public void setSpaces(int value) {
        this.spaces = value;
    }

    /**
     * Gets the value of the vehicleClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the value of the vehicleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleClass(String value) {
        this.vehicleClass = value;
    }

}
