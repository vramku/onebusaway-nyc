//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_3_0_5_local;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IM-IncidentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IM-IncidentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="locally defined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IM-IncidentStatus")
@XmlEnum
public enum IMIncidentStatus {

    @XmlEnumValue("locally defined")
    LOCALLY_DEFINED("locally defined");
    private final String value;

    IMIncidentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IMIncidentStatus fromValue(String v) {
        for (IMIncidentStatus c: IMIncidentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
