
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * COUPON TICKET DOCUMENT definition.
 * 
 * <p>Java class for CouponTicketDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponTicketDocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketDocNbr"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
 *         &lt;element name="InConnectionDocNbr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9a-zA-Z]{1,14}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumberofBooklets" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TimeOfIssue" type="{http://www.iata.org/IATA/EDIST}TimeSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingDomIntCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeOwner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddlBaggageInfo" type="{http://www.iata.org/IATA/EDIST}AddlBaggageInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponInfo" type="{http://www.iata.org/IATA/EDIST}CouponInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/&gt;
 *         &lt;element name="ReportingType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="BSP"/&gt;
 *               &lt;enumeration value="ARC"/&gt;
 *               &lt;enumeration value="Airline"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponTicketDocType", propOrder = {
    "ticketDocNbr",
    "type",
    "inConnectionDocNbr",
    "numberofBooklets",
    "dateOfIssue",
    "timeOfIssue",
    "ticketingLocation",
    "routingDomIntCode",
    "feeOwner",
    "addlBaggageInfo",
    "remark",
    "couponInfo",
    "penaltyReferences",
    "reportingType"
})
@XmlSeeAlso({
    TicketDocument.class
})
public class CouponTicketDocType {

    @XmlElement(name = "TicketDocNbr", required = true)
    protected String ticketDocNbr;
    @XmlElement(name = "Type", required = true)
    protected CodesetType type;
    @XmlElement(name = "InConnectionDocNbr")
    protected String inConnectionDocNbr;
    @XmlElement(name = "NumberofBooklets", required = true)
    protected BigInteger numberofBooklets;
    @XmlElement(name = "DateOfIssue", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfIssue;
    @XmlElement(name = "TimeOfIssue")
    protected String timeOfIssue;
    @XmlElement(name = "TicketingLocation")
    protected String ticketingLocation;
    @XmlElement(name = "RoutingDomIntCode")
    protected String routingDomIntCode;
    @XmlElement(name = "FeeOwner")
    protected AirlineIDType feeOwner;
    @XmlElement(name = "AddlBaggageInfo")
    protected AddlBaggageInfoType addlBaggageInfo;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "CouponInfo")
    protected List<CouponInfoType> couponInfo;
    @XmlList
    @XmlElement(name = "PenaltyReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> penaltyReferences;
    @XmlElement(name = "ReportingType")
    protected String reportingType;

    /**
     * Gets the value of the ticketDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocNbr() {
        return ticketDocNbr;
    }

    /**
     * Sets the value of the ticketDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocNbr(String value) {
        this.ticketDocNbr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setType(CodesetType value) {
        this.type = value;
    }

    /**
     * Gets the value of the inConnectionDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConnectionDocNbr() {
        return inConnectionDocNbr;
    }

    /**
     * Sets the value of the inConnectionDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConnectionDocNbr(String value) {
        this.inConnectionDocNbr = value;
    }

    /**
     * Gets the value of the numberofBooklets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofBooklets() {
        return numberofBooklets;
    }

    /**
     * Sets the value of the numberofBooklets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofBooklets(BigInteger value) {
        this.numberofBooklets = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIssue(XMLGregorianCalendar value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the timeOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfIssue() {
        return timeOfIssue;
    }

    /**
     * Sets the value of the timeOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfIssue(String value) {
        this.timeOfIssue = value;
    }

    /**
     * Gets the value of the ticketingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingLocation() {
        return ticketingLocation;
    }

    /**
     * Sets the value of the ticketingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingLocation(String value) {
        this.ticketingLocation = value;
    }

    /**
     * Gets the value of the routingDomIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingDomIntCode() {
        return routingDomIntCode;
    }

    /**
     * Sets the value of the routingDomIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingDomIntCode(String value) {
        this.routingDomIntCode = value;
    }

    /**
     * Gets the value of the feeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineIDType }
     *     
     */
    public AirlineIDType getFeeOwner() {
        return feeOwner;
    }

    /**
     * Sets the value of the feeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineIDType }
     *     
     */
    public void setFeeOwner(AirlineIDType value) {
        this.feeOwner = value;
    }

    /**
     * Gets the value of the addlBaggageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public AddlBaggageInfoType getAddlBaggageInfo() {
        return addlBaggageInfo;
    }

    /**
     * Sets the value of the addlBaggageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public void setAddlBaggageInfo(AddlBaggageInfoType value) {
        this.addlBaggageInfo = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the couponInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponInfoType }
     * 
     * 
     */
    public List<CouponInfoType> getCouponInfo() {
        if (couponInfo == null) {
            couponInfo = new ArrayList<CouponInfoType>();
        }
        return this.couponInfo;
    }

    /**
     * Gets the value of the penaltyReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPenaltyReferences() {
        if (penaltyReferences == null) {
            penaltyReferences = new ArrayList<Object>();
        }
        return this.penaltyReferences;
    }

    /**
     * Gets the value of the reportingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingType() {
        return reportingType;
    }

    /**
     * Sets the value of the reportingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingType(String value) {
        this.reportingType = value;
    }

}
