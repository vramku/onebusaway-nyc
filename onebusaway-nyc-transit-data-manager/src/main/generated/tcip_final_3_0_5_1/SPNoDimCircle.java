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
 * <p>Java class for SPNoDimCircle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPNoDimCircle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="center" type="{http://www.TCIP-Final-3-0-5-1}SPNoDimPoint"/>
 *         &lt;element name="radius" type="{http://www.TCIP-Final-3-0-5-1}SP-NoDimDist"/>
 *         &lt;element name="fill" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPNoDimCircle", propOrder = {
    "center",
    "radius",
    "fill"
})
public class SPNoDimCircle {

    @XmlElement(required = true)
    protected SPNoDimPoint center;
    protected int radius;
    protected boolean fill;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link SPNoDimPoint }
     *     
     */
    public SPNoDimPoint getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPNoDimPoint }
     *     
     */
    public void setCenter(SPNoDimPoint value) {
        this.center = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(int value) {
        this.radius = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     */
    public boolean isFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     */
    public void setFill(boolean value) {
        this.fill = value;
    }

}
