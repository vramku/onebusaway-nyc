//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package lrms_final_09_07_for_im;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Polygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Polygon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="polygonName" type="{http://www.lrms-final-09-07-for-im}Text-name255" minOccurs="0"/>
 *         &lt;element name="vertex" type="{http://www.lrms-final-09-07-for-im}PointLocation" maxOccurs="255" minOccurs="3"/>
 *       &lt;/sequence>
 *       &lt;attribute name="polygonID" type="{http://www.lrms-final-09-07-for-im}String-index64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", propOrder = {
    "polygonName",
    "vertex"
})
public class Polygon {

    protected String polygonName;
    @XmlElement(required = true)
    protected List<PointLocation> vertex;
    @XmlAttribute(name = "polygonID")
    protected String polygonID;

    /**
     * Gets the value of the polygonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolygonName() {
        return polygonName;
    }

    /**
     * Sets the value of the polygonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolygonName(String value) {
        this.polygonName = value;
    }

    /**
     * Gets the value of the vertex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vertex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVertex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointLocation }
     * 
     * 
     */
    public List<PointLocation> getVertex() {
        if (vertex == null) {
            vertex = new ArrayList<PointLocation>();
        }
        return this.vertex;
    }

    /**
     * Gets the value of the polygonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolygonID() {
        return polygonID;
    }

    /**
     * Sets the value of the polygonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolygonID(String value) {
        this.polygonID = value;
    }

}
