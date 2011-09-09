//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package lrms_final_09_07_for_im;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country-code-text.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="country-code-text">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dummy1"/>
 *     &lt;enumeration value="dummy2"/>
 *     &lt;enumeration value="US"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "country-code-text")
@XmlEnum
public enum CountryCodeText {

    @XmlEnumValue("dummy1")
    DUMMY_1("dummy1"),
    @XmlEnumValue("dummy2")
    DUMMY_2("dummy2"),
    US("US");
    private final String value;

    CountryCodeText(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryCodeText fromValue(String v) {
        for (CountryCodeText c: CountryCodeText.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
