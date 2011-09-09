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
 * <p>Java class for SPFeatureGeometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPFeatureGeometry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geometry">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="point" type="{http://www.TCIP-Final-3-0-5-1}SPPoint"/>
 *                   &lt;element name="linePoints">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="linePoint" type="{http://www.TCIP-Final-3-0-5-1}SPPoint"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="polygon" type="{http://www.TCIP-Final-3-0-5-1}SPPolygon"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fill" type="{http://www.TCIP-Final-3-0-5-1}CPT-Boolean" minOccurs="0"/>
 *         &lt;element name="thickness" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPFeatureGeometry", propOrder = {
    "geometry",
    "fill",
    "thickness"
})
public class SPFeatureGeometry {

    @XmlElement(required = true)
    protected SPFeatureGeometry.Geometry geometry;
    protected Boolean fill;
    protected Long thickness;

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link SPFeatureGeometry.Geometry }
     *     
     */
    public SPFeatureGeometry.Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPFeatureGeometry.Geometry }
     *     
     */
    public void setGeometry(SPFeatureGeometry.Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFill(Boolean value) {
        this.fill = value;
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThickness(Long value) {
        this.thickness = value;
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
     *         &lt;element name="point" type="{http://www.TCIP-Final-3-0-5-1}SPPoint"/>
     *         &lt;element name="linePoints">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="linePoint" type="{http://www.TCIP-Final-3-0-5-1}SPPoint"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="polygon" type="{http://www.TCIP-Final-3-0-5-1}SPPolygon"/>
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
        "point",
        "linePoints",
        "polygon"
    })
    public static class Geometry {

        protected SPPoint point;
        protected SPFeatureGeometry.Geometry.LinePoints linePoints;
        protected SPPolygon polygon;

        /**
         * Gets the value of the point property.
         * 
         * @return
         *     possible object is
         *     {@link SPPoint }
         *     
         */
        public SPPoint getPoint() {
            return point;
        }

        /**
         * Sets the value of the point property.
         * 
         * @param value
         *     allowed object is
         *     {@link SPPoint }
         *     
         */
        public void setPoint(SPPoint value) {
            this.point = value;
        }

        /**
         * Gets the value of the linePoints property.
         * 
         * @return
         *     possible object is
         *     {@link SPFeatureGeometry.Geometry.LinePoints }
         *     
         */
        public SPFeatureGeometry.Geometry.LinePoints getLinePoints() {
            return linePoints;
        }

        /**
         * Sets the value of the linePoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link SPFeatureGeometry.Geometry.LinePoints }
         *     
         */
        public void setLinePoints(SPFeatureGeometry.Geometry.LinePoints value) {
            this.linePoints = value;
        }

        /**
         * Gets the value of the polygon property.
         * 
         * @return
         *     possible object is
         *     {@link SPPolygon }
         *     
         */
        public SPPolygon getPolygon() {
            return polygon;
        }

        /**
         * Sets the value of the polygon property.
         * 
         * @param value
         *     allowed object is
         *     {@link SPPolygon }
         *     
         */
        public void setPolygon(SPPolygon value) {
            this.polygon = value;
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
         *         &lt;element name="linePoint" type="{http://www.TCIP-Final-3-0-5-1}SPPoint"/>
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
            "linePoint"
        })
        public static class LinePoints {

            @XmlElement(required = true)
            protected List<SPPoint> linePoint;

            /**
             * Gets the value of the linePoint property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linePoint property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinePoint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPPoint }
             * 
             * 
             */
            public List<SPPoint> getLinePoint() {
                if (linePoint == null) {
                    linePoint = new ArrayList<SPPoint>();
                }
                return this.linePoint;
            }

        }

    }

}
