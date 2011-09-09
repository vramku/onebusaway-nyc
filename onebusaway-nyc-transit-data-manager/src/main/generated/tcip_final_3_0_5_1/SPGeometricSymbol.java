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
 * <p>Java class for SPGeometricSymbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPGeometricSymbol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="part" type="{http://www.TCIP-Final-3-0-5-1}SPSymbolPart"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="default-color" type="{http://www.TCIP-Final-3-0-5-1}CPT-Color" minOccurs="0"/>
 *         &lt;element name="highlight-color" type="{http://www.TCIP-Final-3-0-5-1}CPT-Color" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPGeometricSymbol", propOrder = {
    "parts",
    "defaultColor",
    "highlightColor"
})
public class SPGeometricSymbol {

    @XmlElement(required = true)
    protected SPGeometricSymbol.Parts parts;
    @XmlElement(name = "default-color")
    protected String defaultColor;
    @XmlElement(name = "highlight-color")
    protected String highlightColor;

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link SPGeometricSymbol.Parts }
     *     
     */
    public SPGeometricSymbol.Parts getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPGeometricSymbol.Parts }
     *     
     */
    public void setParts(SPGeometricSymbol.Parts value) {
        this.parts = value;
    }

    /**
     * Gets the value of the defaultColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultColor() {
        return defaultColor;
    }

    /**
     * Sets the value of the defaultColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultColor(String value) {
        this.defaultColor = value;
    }

    /**
     * Gets the value of the highlightColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighlightColor() {
        return highlightColor;
    }

    /**
     * Sets the value of the highlightColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighlightColor(String value) {
        this.highlightColor = value;
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
     *         &lt;element name="part" type="{http://www.TCIP-Final-3-0-5-1}SPSymbolPart"/>
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
        "part"
    })
    public static class Parts {

        @XmlElement(required = true)
        protected List<SPSymbolPart> part;

        /**
         * Gets the value of the part property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the part property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPSymbolPart }
         * 
         * 
         */
        public List<SPSymbolPart> getPart() {
            if (part == null) {
                part = new ArrayList<SPSymbolPart>();
            }
            return this.part;
        }

    }

}
