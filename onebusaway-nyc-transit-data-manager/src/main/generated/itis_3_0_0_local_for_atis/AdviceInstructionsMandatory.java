//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package itis_3_0_0_local_for_atis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdviceInstructionsMandatory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdviceInstructionsMandatory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="insert-here"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdviceInstructionsMandatory", namespace = "http://www.itis-3-0-0-local-for-atis")
@XmlEnum
public enum AdviceInstructionsMandatory {

    @XmlEnumValue("insert-here")
    INSERT_HERE("insert-here");
    private final String value;

    AdviceInstructionsMandatory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdviceInstructionsMandatory fromValue(String v) {
        for (AdviceInstructionsMandatory c: AdviceInstructionsMandatory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
