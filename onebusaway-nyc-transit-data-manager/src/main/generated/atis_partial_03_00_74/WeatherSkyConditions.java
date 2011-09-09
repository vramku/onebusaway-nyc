//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package atis_partial_03_00_74;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Weather-SkyConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weather-SkyConditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="weatherConditions" type="{http://www.itis-final-3-0-0-for-atis}WeatherConditions"/>
 *         &lt;element name="precipitation" type="{http://www.itis-final-3-0-0-for-atis}Precipitation"/>
 *         &lt;element name="winds" type="{http://www.itis-final-3-0-0-for-atis}Winds"/>
 *         &lt;element name="visibilityAndAirQuality" type="{http://www.itis-final-3-0-0-for-atis}VisibilityAndAirQuality"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weather-SkyConditions", propOrder = {
    "weatherConditions",
    "precipitation",
    "winds",
    "visibilityAndAirQuality"
})
public class WeatherSkyConditions {

    protected String weatherConditions;
    protected String precipitation;
    protected String winds;
    protected String visibilityAndAirQuality;

    /**
     * Gets the value of the weatherConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherConditions() {
        return weatherConditions;
    }

    /**
     * Sets the value of the weatherConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherConditions(String value) {
        this.weatherConditions = value;
    }

    /**
     * Gets the value of the precipitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecipitation() {
        return precipitation;
    }

    /**
     * Sets the value of the precipitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecipitation(String value) {
        this.precipitation = value;
    }

    /**
     * Gets the value of the winds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinds() {
        return winds;
    }

    /**
     * Sets the value of the winds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinds(String value) {
        this.winds = value;
    }

    /**
     * Gets the value of the visibilityAndAirQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityAndAirQuality() {
        return visibilityAndAirQuality;
    }

    /**
     * Sets the value of the visibilityAndAirQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityAndAirQuality(String value) {
        this.visibilityAndAirQuality = value;
    }

}
