//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_final_3_0_5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPTAssignedEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPTAssignedEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" type="{http://www.TCIP-Final-3-0-5-1}CPTEmployeeIden" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.TCIP-Final-3-0-5-1}CPT-EmployeeTelephone" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.TCIP-Final-3-0-5-1}CPT-Footnote" minOccurs="0"/>
 *         &lt;element name="roleLangs" type="{http://www.TCIP-Final-3-0-5-1}CPTAdditionalLanguageContents" minOccurs="0"/>
 *         &lt;element name="localCPTAssignedEmployee" type="{http://www.tcip-3-0-5-local}CPTAssignedEmployee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPTAssignedEmployee", propOrder = {
    "employee",
    "phone",
    "role",
    "roleLangs",
    "localCPTAssignedEmployee"
})
public class CPTAssignedEmployee {

    protected CPTEmployeeIden employee;
    protected String phone;
    protected String role;
    protected CPTAdditionalLanguageContents roleLangs;
    protected tcip_3_0_5_local.CPTAssignedEmployee localCPTAssignedEmployee;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public CPTEmployeeIden getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public void setEmployee(CPTEmployeeIden value) {
        this.employee = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the roleLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getRoleLangs() {
        return roleLangs;
    }

    /**
     * Sets the value of the roleLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setRoleLangs(CPTAdditionalLanguageContents value) {
        this.roleLangs = value;
    }

    /**
     * Gets the value of the localCPTAssignedEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.CPTAssignedEmployee }
     *     
     */
    public tcip_3_0_5_local.CPTAssignedEmployee getLocalCPTAssignedEmployee() {
        return localCPTAssignedEmployee;
    }

    /**
     * Sets the value of the localCPTAssignedEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.CPTAssignedEmployee }
     *     
     */
    public void setLocalCPTAssignedEmployee(tcip_3_0_5_local.CPTAssignedEmployee value) {
        this.localCPTAssignedEmployee = value;
    }

}
