//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.19 at 04:15:01 PM EDT 
//


package tcip_final_3_0_5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FCActionListEntryUTFS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCActionListEntryUTFS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action-type" type="{http://www.TCIP-Final-3-0-5-1}FC-ActionTypeUTFS"/>
 *         &lt;element name="localFCActionListEntryUTFS" type="{http://www.tcip-3-0-5-local}FCActionListEntryUTFS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCActionListEntryUTFS", propOrder = {
    "actionType",
    "localFCActionListEntryUTFS"
})
public class FCActionListEntryUTFS {

    @XmlElement(name = "action-type")
    protected long actionType;
    protected tcip_3_0_5_local.FCActionListEntryUTFS localFCActionListEntryUTFS;

    /**
     * Gets the value of the actionType property.
     * 
     */
    public long getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     */
    public void setActionType(long value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the localFCActionListEntryUTFS property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.FCActionListEntryUTFS }
     *     
     */
    public tcip_3_0_5_local.FCActionListEntryUTFS getLocalFCActionListEntryUTFS() {
        return localFCActionListEntryUTFS;
    }

    /**
     * Sets the value of the localFCActionListEntryUTFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.FCActionListEntryUTFS }
     *     
     */
    public void setLocalFCActionListEntryUTFS(tcip_3_0_5_local.FCActionListEntryUTFS value) {
        this.localFCActionListEntryUTFS = value;
    }

}
