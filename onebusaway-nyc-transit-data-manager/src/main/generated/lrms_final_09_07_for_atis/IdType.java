//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package lrms_final_09_07_for_atis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intOrAlpha">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="id" type="{http://www.lrms-final-09-07-for-atis}Int-index32"/>
 *                   &lt;element name="idAlpha" type="{http://www.lrms-final-09-07-for-atis}String-index64"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="databaseID" type="{http://www.lrms-final-09-07-for-atis}String-index64"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdType", propOrder = {
    "intOrAlpha",
    "databaseID"
})
public class IdType {

    @XmlElement(required = true)
    protected IdType.IntOrAlpha intOrAlpha;
    @XmlElement(required = true)
    protected String databaseID;

    /**
     * Gets the value of the intOrAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link IdType.IntOrAlpha }
     *     
     */
    public IdType.IntOrAlpha getIntOrAlpha() {
        return intOrAlpha;
    }

    /**
     * Sets the value of the intOrAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType.IntOrAlpha }
     *     
     */
    public void setIntOrAlpha(IdType.IntOrAlpha value) {
        this.intOrAlpha = value;
    }

    /**
     * Gets the value of the databaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseID() {
        return databaseID;
    }

    /**
     * Sets the value of the databaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseID(String value) {
        this.databaseID = value;
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
     *       &lt;choice>
     *         &lt;element name="id" type="{http://www.lrms-final-09-07-for-atis}Int-index32"/>
     *         &lt;element name="idAlpha" type="{http://www.lrms-final-09-07-for-atis}String-index64"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "idAlpha"
    })
    public static class IntOrAlpha {

        protected Long id;
        protected String idAlpha;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setId(Long value) {
            this.id = value;
        }

        /**
         * Gets the value of the idAlpha property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdAlpha() {
            return idAlpha;
        }

        /**
         * Sets the value of the idAlpha property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdAlpha(String value) {
            this.idAlpha = value;
        }

    }

}
