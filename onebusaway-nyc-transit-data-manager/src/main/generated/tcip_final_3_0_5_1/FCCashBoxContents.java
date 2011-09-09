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
 * <p>Java class for FCCashBoxContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCCashBoxContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="last-empty-time" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="time-recorded" type="{http://www.TCIP-Final-3-0-5-1}CPT-DateTime"/>
 *         &lt;element name="cashboxID" type="{http://www.TCIP-Final-3-0-5-1}CPT-SerialNumber"/>
 *         &lt;element name="total-cash" type="{http://www.TCIP-Final-3-0-5-1}FC-MonetaryValue" minOccurs="0"/>
 *         &lt;element name="currency-type" type="{http://www.TCIP-Final-3-0-5-1}FC-MonetaryInstrAuth" minOccurs="0"/>
 *         &lt;element name="pennies" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="nickels" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="dimes" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="quarters" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="fifty-cent-pieces" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="dollar-coins" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="two-dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="five-dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="ten-dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="twenty-dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="fifty-dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="hundred-dollar-bills" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="token-typeA" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="token-typeB" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="token-typeC" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="token-typeD" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="token-typeE" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeA" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeB" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeC" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeD" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeE" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeF" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="transfer-typeG" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="ticket-typeA" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="ticket-typeB" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="ticket-typeC" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="ticket-typeD" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="ticket-typeE" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="tear-off-typeA" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="tear-off-typeB" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="tear-off-typeC" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="tear-off-typeD" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="tear-off-typeE" type="{http://www.TCIP-Final-3-0-5-1}CPT-GenericCounter" minOccurs="0"/>
 *         &lt;element name="localFCCashBoxContents" type="{http://www.tcip-3-0-5-local}FCCashBoxContents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCCashBoxContents", propOrder = {
    "lastEmptyTime",
    "timeRecorded",
    "cashboxID",
    "totalCash",
    "currencyType",
    "pennies",
    "nickels",
    "dimes",
    "quarters",
    "fiftyCentPieces",
    "dollarCoins",
    "dollarBills",
    "twoDollarBills",
    "fiveDollarBills",
    "tenDollarBills",
    "twentyDollarBills",
    "fiftyDollarBills",
    "hundredDollarBills",
    "tokenTypeA",
    "tokenTypeB",
    "tokenTypeC",
    "tokenTypeD",
    "tokenTypeE",
    "transferTypeA",
    "transferTypeB",
    "transferTypeC",
    "transferTypeD",
    "transferTypeE",
    "transferTypeF",
    "transferTypeG",
    "ticketTypeA",
    "ticketTypeB",
    "ticketTypeC",
    "ticketTypeD",
    "ticketTypeE",
    "tearOffTypeA",
    "tearOffTypeB",
    "tearOffTypeC",
    "tearOffTypeD",
    "tearOffTypeE",
    "localFCCashBoxContents"
})
public class FCCashBoxContents {

    @XmlElement(name = "last-empty-time", required = true)
    protected String lastEmptyTime;
    @XmlElement(name = "time-recorded", required = true)
    protected String timeRecorded;
    @XmlElement(required = true)
    protected String cashboxID;
    @XmlElement(name = "total-cash")
    protected Long totalCash;
    @XmlElement(name = "currency-type")
    protected String currencyType;
    protected Long pennies;
    protected Long nickels;
    protected Long dimes;
    protected Long quarters;
    @XmlElement(name = "fifty-cent-pieces")
    protected Long fiftyCentPieces;
    @XmlElement(name = "dollar-coins")
    protected Long dollarCoins;
    @XmlElement(name = "dollar-bills")
    protected Long dollarBills;
    @XmlElement(name = "two-dollar-bills")
    protected Long twoDollarBills;
    @XmlElement(name = "five-dollar-bills")
    protected Long fiveDollarBills;
    @XmlElement(name = "ten-dollar-bills")
    protected Long tenDollarBills;
    @XmlElement(name = "twenty-dollar-bills")
    protected Long twentyDollarBills;
    @XmlElement(name = "fifty-dollar-bills")
    protected Long fiftyDollarBills;
    @XmlElement(name = "hundred-dollar-bills")
    protected Long hundredDollarBills;
    @XmlElement(name = "token-typeA")
    protected Long tokenTypeA;
    @XmlElement(name = "token-typeB")
    protected Long tokenTypeB;
    @XmlElement(name = "token-typeC")
    protected Long tokenTypeC;
    @XmlElement(name = "token-typeD")
    protected Long tokenTypeD;
    @XmlElement(name = "token-typeE")
    protected Long tokenTypeE;
    @XmlElement(name = "transfer-typeA")
    protected Long transferTypeA;
    @XmlElement(name = "transfer-typeB")
    protected Long transferTypeB;
    @XmlElement(name = "transfer-typeC")
    protected Long transferTypeC;
    @XmlElement(name = "transfer-typeD")
    protected Long transferTypeD;
    @XmlElement(name = "transfer-typeE")
    protected Long transferTypeE;
    @XmlElement(name = "transfer-typeF")
    protected Long transferTypeF;
    @XmlElement(name = "transfer-typeG")
    protected Long transferTypeG;
    @XmlElement(name = "ticket-typeA")
    protected Long ticketTypeA;
    @XmlElement(name = "ticket-typeB")
    protected Long ticketTypeB;
    @XmlElement(name = "ticket-typeC")
    protected Long ticketTypeC;
    @XmlElement(name = "ticket-typeD")
    protected Long ticketTypeD;
    @XmlElement(name = "ticket-typeE")
    protected Long ticketTypeE;
    @XmlElement(name = "tear-off-typeA")
    protected Long tearOffTypeA;
    @XmlElement(name = "tear-off-typeB")
    protected Long tearOffTypeB;
    @XmlElement(name = "tear-off-typeC")
    protected Long tearOffTypeC;
    @XmlElement(name = "tear-off-typeD")
    protected Long tearOffTypeD;
    @XmlElement(name = "tear-off-typeE")
    protected Long tearOffTypeE;
    protected tcip_3_0_5_local.FCCashBoxContents localFCCashBoxContents;

    /**
     * Gets the value of the lastEmptyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEmptyTime() {
        return lastEmptyTime;
    }

    /**
     * Sets the value of the lastEmptyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEmptyTime(String value) {
        this.lastEmptyTime = value;
    }

    /**
     * Gets the value of the timeRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeRecorded() {
        return timeRecorded;
    }

    /**
     * Sets the value of the timeRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeRecorded(String value) {
        this.timeRecorded = value;
    }

    /**
     * Gets the value of the cashboxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashboxID() {
        return cashboxID;
    }

    /**
     * Sets the value of the cashboxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashboxID(String value) {
        this.cashboxID = value;
    }

    /**
     * Gets the value of the totalCash property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCash() {
        return totalCash;
    }

    /**
     * Sets the value of the totalCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCash(Long value) {
        this.totalCash = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the pennies property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPennies() {
        return pennies;
    }

    /**
     * Sets the value of the pennies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPennies(Long value) {
        this.pennies = value;
    }

    /**
     * Gets the value of the nickels property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNickels() {
        return nickels;
    }

    /**
     * Sets the value of the nickels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNickels(Long value) {
        this.nickels = value;
    }

    /**
     * Gets the value of the dimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDimes() {
        return dimes;
    }

    /**
     * Sets the value of the dimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDimes(Long value) {
        this.dimes = value;
    }

    /**
     * Gets the value of the quarters property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuarters() {
        return quarters;
    }

    /**
     * Sets the value of the quarters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuarters(Long value) {
        this.quarters = value;
    }

    /**
     * Gets the value of the fiftyCentPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFiftyCentPieces() {
        return fiftyCentPieces;
    }

    /**
     * Sets the value of the fiftyCentPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFiftyCentPieces(Long value) {
        this.fiftyCentPieces = value;
    }

    /**
     * Gets the value of the dollarCoins property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDollarCoins() {
        return dollarCoins;
    }

    /**
     * Sets the value of the dollarCoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDollarCoins(Long value) {
        this.dollarCoins = value;
    }

    /**
     * Gets the value of the dollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDollarBills() {
        return dollarBills;
    }

    /**
     * Sets the value of the dollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDollarBills(Long value) {
        this.dollarBills = value;
    }

    /**
     * Gets the value of the twoDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTwoDollarBills() {
        return twoDollarBills;
    }

    /**
     * Sets the value of the twoDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTwoDollarBills(Long value) {
        this.twoDollarBills = value;
    }

    /**
     * Gets the value of the fiveDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFiveDollarBills() {
        return fiveDollarBills;
    }

    /**
     * Sets the value of the fiveDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFiveDollarBills(Long value) {
        this.fiveDollarBills = value;
    }

    /**
     * Gets the value of the tenDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenDollarBills() {
        return tenDollarBills;
    }

    /**
     * Sets the value of the tenDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenDollarBills(Long value) {
        this.tenDollarBills = value;
    }

    /**
     * Gets the value of the twentyDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTwentyDollarBills() {
        return twentyDollarBills;
    }

    /**
     * Sets the value of the twentyDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTwentyDollarBills(Long value) {
        this.twentyDollarBills = value;
    }

    /**
     * Gets the value of the fiftyDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFiftyDollarBills() {
        return fiftyDollarBills;
    }

    /**
     * Sets the value of the fiftyDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFiftyDollarBills(Long value) {
        this.fiftyDollarBills = value;
    }

    /**
     * Gets the value of the hundredDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHundredDollarBills() {
        return hundredDollarBills;
    }

    /**
     * Sets the value of the hundredDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHundredDollarBills(Long value) {
        this.hundredDollarBills = value;
    }

    /**
     * Gets the value of the tokenTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenTypeA() {
        return tokenTypeA;
    }

    /**
     * Sets the value of the tokenTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenTypeA(Long value) {
        this.tokenTypeA = value;
    }

    /**
     * Gets the value of the tokenTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenTypeB() {
        return tokenTypeB;
    }

    /**
     * Sets the value of the tokenTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenTypeB(Long value) {
        this.tokenTypeB = value;
    }

    /**
     * Gets the value of the tokenTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenTypeC() {
        return tokenTypeC;
    }

    /**
     * Sets the value of the tokenTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenTypeC(Long value) {
        this.tokenTypeC = value;
    }

    /**
     * Gets the value of the tokenTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenTypeD() {
        return tokenTypeD;
    }

    /**
     * Sets the value of the tokenTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenTypeD(Long value) {
        this.tokenTypeD = value;
    }

    /**
     * Gets the value of the tokenTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenTypeE() {
        return tokenTypeE;
    }

    /**
     * Sets the value of the tokenTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenTypeE(Long value) {
        this.tokenTypeE = value;
    }

    /**
     * Gets the value of the transferTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeA() {
        return transferTypeA;
    }

    /**
     * Sets the value of the transferTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeA(Long value) {
        this.transferTypeA = value;
    }

    /**
     * Gets the value of the transferTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeB() {
        return transferTypeB;
    }

    /**
     * Sets the value of the transferTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeB(Long value) {
        this.transferTypeB = value;
    }

    /**
     * Gets the value of the transferTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeC() {
        return transferTypeC;
    }

    /**
     * Sets the value of the transferTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeC(Long value) {
        this.transferTypeC = value;
    }

    /**
     * Gets the value of the transferTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeD() {
        return transferTypeD;
    }

    /**
     * Sets the value of the transferTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeD(Long value) {
        this.transferTypeD = value;
    }

    /**
     * Gets the value of the transferTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeE() {
        return transferTypeE;
    }

    /**
     * Sets the value of the transferTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeE(Long value) {
        this.transferTypeE = value;
    }

    /**
     * Gets the value of the transferTypeF property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeF() {
        return transferTypeF;
    }

    /**
     * Sets the value of the transferTypeF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeF(Long value) {
        this.transferTypeF = value;
    }

    /**
     * Gets the value of the transferTypeG property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeG() {
        return transferTypeG;
    }

    /**
     * Sets the value of the transferTypeG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeG(Long value) {
        this.transferTypeG = value;
    }

    /**
     * Gets the value of the ticketTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketTypeA() {
        return ticketTypeA;
    }

    /**
     * Sets the value of the ticketTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketTypeA(Long value) {
        this.ticketTypeA = value;
    }

    /**
     * Gets the value of the ticketTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketTypeB() {
        return ticketTypeB;
    }

    /**
     * Sets the value of the ticketTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketTypeB(Long value) {
        this.ticketTypeB = value;
    }

    /**
     * Gets the value of the ticketTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketTypeC() {
        return ticketTypeC;
    }

    /**
     * Sets the value of the ticketTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketTypeC(Long value) {
        this.ticketTypeC = value;
    }

    /**
     * Gets the value of the ticketTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketTypeD() {
        return ticketTypeD;
    }

    /**
     * Sets the value of the ticketTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketTypeD(Long value) {
        this.ticketTypeD = value;
    }

    /**
     * Gets the value of the ticketTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketTypeE() {
        return ticketTypeE;
    }

    /**
     * Sets the value of the ticketTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketTypeE(Long value) {
        this.ticketTypeE = value;
    }

    /**
     * Gets the value of the tearOffTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTearOffTypeA() {
        return tearOffTypeA;
    }

    /**
     * Sets the value of the tearOffTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTearOffTypeA(Long value) {
        this.tearOffTypeA = value;
    }

    /**
     * Gets the value of the tearOffTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTearOffTypeB() {
        return tearOffTypeB;
    }

    /**
     * Sets the value of the tearOffTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTearOffTypeB(Long value) {
        this.tearOffTypeB = value;
    }

    /**
     * Gets the value of the tearOffTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTearOffTypeC() {
        return tearOffTypeC;
    }

    /**
     * Sets the value of the tearOffTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTearOffTypeC(Long value) {
        this.tearOffTypeC = value;
    }

    /**
     * Gets the value of the tearOffTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTearOffTypeD() {
        return tearOffTypeD;
    }

    /**
     * Sets the value of the tearOffTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTearOffTypeD(Long value) {
        this.tearOffTypeD = value;
    }

    /**
     * Gets the value of the tearOffTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTearOffTypeE() {
        return tearOffTypeE;
    }

    /**
     * Sets the value of the tearOffTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTearOffTypeE(Long value) {
        this.tearOffTypeE = value;
    }

    /**
     * Gets the value of the localFCCashBoxContents property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_3_0_5_local.FCCashBoxContents }
     *     
     */
    public tcip_3_0_5_local.FCCashBoxContents getLocalFCCashBoxContents() {
        return localFCCashBoxContents;
    }

    /**
     * Sets the value of the localFCCashBoxContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_3_0_5_local.FCCashBoxContents }
     *     
     */
    public void setLocalFCCashBoxContents(tcip_3_0_5_local.FCCashBoxContents value) {
        this.localFCCashBoxContents = value;
    }

}
