//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_3_0_5_local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CcTravelerAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcTravelerAlarm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insert-local-information-elements-here" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CcTravelerAlarm", propOrder = {
    "insertLocalInformationElementsHere"
})
public class CcTravelerAlarm {

    @XmlElement(name = "insert-local-information-elements-here")
    protected String insertLocalInformationElementsHere;

    /**
     * Gets the value of the insertLocalInformationElementsHere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertLocalInformationElementsHere() {
        return insertLocalInformationElementsHere;
    }

    /**
     * Sets the value of the insertLocalInformationElementsHere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertLocalInformationElementsHere(String value) {
        this.insertLocalInformationElementsHere = value;
    }

}
