//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package im_03_00_38_local;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmergencyFacilityCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmergencyFacilityCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="insert-local-values-here"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmergencyFacilityCapability")
@XmlEnum
public enum EmergencyFacilityCapability {

    @XmlEnumValue("insert-local-values-here")
    INSERT_LOCAL_VALUES_HERE("insert-local-values-here");
    private final String value;

    EmergencyFacilityCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmergencyFacilityCapability fromValue(String v) {
        for (EmergencyFacilityCapability c: EmergencyFacilityCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
