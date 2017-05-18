
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST}SuccessType"/&gt;
 *             &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST}WarningsType" minOccurs="0"/&gt;
 *             &lt;element name="Response" maxOccurs="unbounded"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderCancelProcessing" minOccurs="0"/&gt;
 *                       &lt;element name="OrderReference" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
 *                       &lt;element name="ChangeFees" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderPenaltyType"&gt;
 *                             &lt;/extension&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="TicketDocInfos" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="TicketDocInfo" maxOccurs="unbounded"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="Traveler" type="{http://www.iata.org/IATA/EDIST}CouponTravelerDetailType"/&gt;
 *                                           &lt;element name="AgentIDs" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/restriction&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
 *                                           &lt;element name="Payments" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}PaymentMethodType" maxOccurs="unbounded"/&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/restriction&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element name="OriginDestination" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element name="Origin" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
 *                                                     &lt;element name="Destination" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/restriction&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element name="EndorsementText" minOccurs="0"&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                 &lt;pattern value="[0-9a-zA-Z]{1,70} "/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element name="AddlReferenceIDs" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AddlReferenceID" maxOccurs="5"/&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/restriction&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element name="FareInfo" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}Total" maxOccurs="3" minOccurs="0"/&gt;
 *                                                     &lt;element name="Taxes" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;extension base="{http://www.iata.org/IATA/EDIST}TaxDetailType"&gt;
 *                                                           &lt;/extension&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}FareInfo" minOccurs="0"/&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/restriction&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
 *                                           &lt;element name="OrderReference" type="{http://www.iata.org/IATA/EDIST}CouponOrderKeyType" minOccurs="0"/&gt;
 *                                           &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingInfo" minOccurs="0"/&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/restriction&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Errors"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}IATA_PayloadStdAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document",
    "success",
    "warnings",
    "response",
    "errors"
})
@XmlRootElement(name = "OrderCancelRS")
public class OrderCancelRS {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElementWrapper(name = "Warnings")
    @XmlElement(name = "Warning", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<WarningType> warnings;
    @XmlElement(name = "Response")
    protected List<OrderCancelRS.Response> response;
    @XmlElementWrapper(name = "Errors")
    @XmlElement(name = "Error", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ErrorType> errors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "AsynchronousAllowedInd")
    protected Boolean asynchronousAllowedInd;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link MsgDocumentType }
     *     
     */
    public MsgDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgDocumentType }
     *     
     */
    public void setDocument(MsgDocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderCancelRS.Response }
     * 
     * 
     */
    public List<OrderCancelRS.Response> getResponse() {
        if (response == null) {
            response = new ArrayList<OrderCancelRS.Response>();
        }
        return this.response;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the asynchronousAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsynchronousAllowedInd() {
        return asynchronousAllowedInd;
    }

    /**
     * Sets the value of the asynchronousAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsynchronousAllowedInd(Boolean value) {
        this.asynchronousAllowedInd = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    public List<WarningType> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<WarningType>();
        }
        return warnings;
    }

    public void setWarnings(List<WarningType> warnings) {
        this.warnings = warnings;
    }

    public List<ErrorType> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorType>();
        }
        return errors;
    }

    public void setErrors(List<ErrorType> errors) {
        this.errors = errors;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderCancelProcessing" minOccurs="0"/&gt;
     *         &lt;element name="OrderReference" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
     *         &lt;element name="ChangeFees" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderPenaltyType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TicketDocInfos" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TicketDocInfo" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Traveler" type="{http://www.iata.org/IATA/EDIST}CouponTravelerDetailType"/&gt;
     *                             &lt;element name="AgentIDs" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
     *                             &lt;element name="Payments" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}PaymentMethodType" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OriginDestination" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Origin" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
     *                                       &lt;element name="Destination" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="EndorsementText" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="[0-9a-zA-Z]{1,70} "/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AddlReferenceIDs" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AddlReferenceID" maxOccurs="5"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="FareInfo" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Total" maxOccurs="3" minOccurs="0"/&gt;
     *                                       &lt;element name="Taxes" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}TaxDetailType"&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FareInfo" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
     *                             &lt;element name="OrderReference" type="{http://www.iata.org/IATA/EDIST}CouponOrderKeyType" minOccurs="0"/&gt;
     *                             &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingInfo" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "orderCancelProcessing",
        "orderReference",
        "changeFees",
        "ticketDocInfos"
    })
    public static class Response {

        @XmlElement(name = "OrderCancelProcessing")
        protected OrdCancelProcessType orderCancelProcessing;
        @XmlElement(name = "OrderReference", required = true)
        protected String orderReference;
        @XmlElement(name = "ChangeFees")
        protected OrderCancelRS.Response.ChangeFees changeFees;
        @XmlElementWrapper(name = "TicketDocInfos")
        @XmlElement(name = "TicketDocInfo", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderCancelRS.Response.TicketDocInfo> ticketDocInfos;

        /**
         * Transaction Processing Results, including processing status, alerts, notices, business warnings, supplemental marketing messages and policy.
         * 
         * @return
         *     possible object is
         *     {@link OrdCancelProcessType }
         *     
         */
        public OrdCancelProcessType getOrderCancelProcessing() {
            return orderCancelProcessing;
        }

        /**
         * Sets the value of the orderCancelProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdCancelProcessType }
         *     
         */
        public void setOrderCancelProcessing(OrdCancelProcessType value) {
            this.orderCancelProcessing = value;
        }

        /**
         * Gets the value of the orderReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderReference() {
            return orderReference;
        }

        /**
         * Sets the value of the orderReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderReference(String value) {
            this.orderReference = value;
        }

        /**
         * Gets the value of the changeFees property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCancelRS.Response.ChangeFees }
         *     
         */
        public OrderCancelRS.Response.ChangeFees getChangeFees() {
            return changeFees;
        }

        /**
         * Sets the value of the changeFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCancelRS.Response.ChangeFees }
         *     
         */
        public void setChangeFees(OrderCancelRS.Response.ChangeFees value) {
            this.changeFees = value;
        }

        public List<OrderCancelRS.Response.TicketDocInfo> getTicketDocInfos() {
            if (ticketDocInfos == null) {
                ticketDocInfos = new ArrayList<OrderCancelRS.Response.TicketDocInfo>();
            }
            return ticketDocInfos;
        }

        public void setTicketDocInfos(List<OrderCancelRS.Response.TicketDocInfo> ticketDocInfos) {
            this.ticketDocInfos = ticketDocInfos;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderPenaltyType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ChangeFees
            extends OrderPenaltyType
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Traveler" type="{http://www.iata.org/IATA/EDIST}CouponTravelerDetailType"/&gt;
         *         &lt;element name="AgentIDs" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
         *         &lt;element name="Payments" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}PaymentMethodType" maxOccurs="unbounded"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OriginDestination" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Origin" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
         *                   &lt;element name="Destination" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="EndorsementText" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="[0-9a-zA-Z]{1,70} "/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddlReferenceIDs" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AddlReferenceID" maxOccurs="5"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FareInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element name="Taxes" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}TaxDetailType"&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareInfo" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
         *         &lt;element name="OrderReference" type="{http://www.iata.org/IATA/EDIST}CouponOrderKeyType" minOccurs="0"/&gt;
         *         &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingInfo" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "traveler",
            "agentIDs",
            "issuingAirlineInfo",
            "bookingReferences",
            "payments",
            "originDestination",
            "endorsementText",
            "addlReferenceIDs",
            "fareInfo",
            "ticketDocument",
            "orderReference",
            "commission",
            "carrierFeeInfo",
            "originalIssueInfo",
            "pricingInfo"
        })
        public static class TicketDocInfo {

            @XmlElement(name = "Traveler", required = true)
            protected CouponTravelerDetailType traveler;
            @XmlElementWrapper(name = "AgentIDs")
            @XmlElement(name = "AgentID", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<AgentID> agentIDs;
            @XmlElement(name = "IssuingAirlineInfo")
            protected IssuingAirlineInfo issuingAirlineInfo;
            @XmlElementWrapper(name = "BookingReferences")
            @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<BookingReferenceType> bookingReferences;
            @XmlElementWrapper(name = "Payments")
            @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<PaymentMethodType> payments;
            @XmlElement(name = "OriginDestination")
            protected OrderCancelRS.Response.TicketDocInfo.OriginDestination originDestination;
            @XmlElement(name = "EndorsementText")
            protected String endorsementText;
            @XmlElementWrapper(name = "AddlReferenceIDs")
            @XmlElement(name = "AddlReferenceID", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<AdditionalReferenceType> addlReferenceIDs;
            @XmlElement(name = "FareInfo")
            protected OrderCancelRS.Response.TicketDocInfo.FareInfo fareInfo;
            @XmlElement(name = "TicketDocument", required = true)
            protected List<TicketDocument> ticketDocument;
            @XmlElement(name = "OrderReference")
            protected CouponOrderKeyType orderReference;
            @XmlElement(name = "Commission")
            protected CommissionType commission;
            @XmlElement(name = "CarrierFeeInfo")
            protected CarrierFeeInfoType carrierFeeInfo;
            @XmlElement(name = "OriginalIssueInfo")
            protected OriginalIssueInfo originalIssueInfo;
            @XmlElement(name = "PricingInfo")
            protected PricingInfo pricingInfo;

            /**
             * Gets the value of the traveler property.
             * 
             * @return
             *     possible object is
             *     {@link CouponTravelerDetailType }
             *     
             */
            public CouponTravelerDetailType getTraveler() {
                return traveler;
            }

            /**
             * Sets the value of the traveler property.
             * 
             * @param value
             *     allowed object is
             *     {@link CouponTravelerDetailType }
             *     
             */
            public void setTraveler(CouponTravelerDetailType value) {
                this.traveler = value;
            }

            /**
             * Gets the value of the issuingAirlineInfo property.
             * 
             * @return
             *     possible object is
             *     {@link IssuingAirlineInfo }
             *     
             */
            public IssuingAirlineInfo getIssuingAirlineInfo() {
                return issuingAirlineInfo;
            }

            /**
             * Sets the value of the issuingAirlineInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link IssuingAirlineInfo }
             *     
             */
            public void setIssuingAirlineInfo(IssuingAirlineInfo value) {
                this.issuingAirlineInfo = value;
            }

            /**
             * Gets the value of the originDestination property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCancelRS.Response.TicketDocInfo.OriginDestination }
             *     
             */
            public OrderCancelRS.Response.TicketDocInfo.OriginDestination getOriginDestination() {
                return originDestination;
            }

            /**
             * Sets the value of the originDestination property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCancelRS.Response.TicketDocInfo.OriginDestination }
             *     
             */
            public void setOriginDestination(OrderCancelRS.Response.TicketDocInfo.OriginDestination value) {
                this.originDestination = value;
            }

            /**
             * Gets the value of the endorsementText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndorsementText() {
                return endorsementText;
            }

            /**
             * Sets the value of the endorsementText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndorsementText(String value) {
                this.endorsementText = value;
            }

            /**
             * Gets the value of the fareInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCancelRS.Response.TicketDocInfo.FareInfo }
             *     
             */
            public OrderCancelRS.Response.TicketDocInfo.FareInfo getFareInfo() {
                return fareInfo;
            }

            /**
             * Sets the value of the fareInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCancelRS.Response.TicketDocInfo.FareInfo }
             *     
             */
            public void setFareInfo(OrderCancelRS.Response.TicketDocInfo.FareInfo value) {
                this.fareInfo = value;
            }

            /**
             * Gets the value of the ticketDocument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTicketDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketDocument }
             * 
             * 
             */
            public List<TicketDocument> getTicketDocument() {
                if (ticketDocument == null) {
                    ticketDocument = new ArrayList<TicketDocument>();
                }
                return this.ticketDocument;
            }

            /**
             * Gets the value of the orderReference property.
             * 
             * @return
             *     possible object is
             *     {@link CouponOrderKeyType }
             *     
             */
            public CouponOrderKeyType getOrderReference() {
                return orderReference;
            }

            /**
             * Sets the value of the orderReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link CouponOrderKeyType }
             *     
             */
            public void setOrderReference(CouponOrderKeyType value) {
                this.orderReference = value;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link CommissionType }
             *     
             */
            public CommissionType getCommission() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommissionType }
             *     
             */
            public void setCommission(CommissionType value) {
                this.commission = value;
            }

            /**
             * Gets the value of the carrierFeeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link CarrierFeeInfoType }
             *     
             */
            public CarrierFeeInfoType getCarrierFeeInfo() {
                return carrierFeeInfo;
            }

            /**
             * Sets the value of the carrierFeeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarrierFeeInfoType }
             *     
             */
            public void setCarrierFeeInfo(CarrierFeeInfoType value) {
                this.carrierFeeInfo = value;
            }

            /**
             * Gets the value of the originalIssueInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OriginalIssueInfo }
             *     
             */
            public OriginalIssueInfo getOriginalIssueInfo() {
                return originalIssueInfo;
            }

            /**
             * Sets the value of the originalIssueInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginalIssueInfo }
             *     
             */
            public void setOriginalIssueInfo(OriginalIssueInfo value) {
                this.originalIssueInfo = value;
            }

            /**
             * Gets the value of the pricingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PricingInfo }
             *     
             */
            public PricingInfo getPricingInfo() {
                return pricingInfo;
            }

            /**
             * Sets the value of the pricingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingInfo }
             *     
             */
            public void setPricingInfo(PricingInfo value) {
                this.pricingInfo = value;
            }

            public List<AgentID> getAgentIDs() {
                if (agentIDs == null) {
                    agentIDs = new ArrayList<AgentID>();
                }
                return agentIDs;
            }

            public void setAgentIDs(List<AgentID> agentIDs) {
                this.agentIDs = agentIDs;
            }

            public List<BookingReferenceType> getBookingReferences() {
                if (bookingReferences == null) {
                    bookingReferences = new ArrayList<BookingReferenceType>();
                }
                return bookingReferences;
            }

            public void setBookingReferences(List<BookingReferenceType> bookingReferences) {
                this.bookingReferences = bookingReferences;
            }

            public List<PaymentMethodType> getPayments() {
                if (payments == null) {
                    payments = new ArrayList<PaymentMethodType>();
                }
                return payments;
            }

            public void setPayments(List<PaymentMethodType> payments) {
                this.payments = payments;
            }

            public List<AdditionalReferenceType> getAddlReferenceIDs() {
                if (addlReferenceIDs == null) {
                    addlReferenceIDs = new ArrayList<AdditionalReferenceType>();
                }
                return addlReferenceIDs;
            }

            public void setAddlReferenceIDs(List<AdditionalReferenceType> addlReferenceIDs) {
                this.addlReferenceIDs = addlReferenceIDs;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element name="Taxes" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}TaxDetailType"&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareInfo" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseFare",
                "equivFare",
                "total",
                "taxes",
                "unstructuredFareCalcInfo",
                "fareInfo"
            })
            public static class FareInfo {

                @XmlElement(name = "BaseFare")
                protected List<BaseFareTransactionType> baseFare;
                @XmlElement(name = "EquivFare")
                protected List<EquivFareTransactionType> equivFare;
                @XmlElement(name = "Total")
                protected List<TotalFareTransactionType> total;
                @XmlElement(name = "Taxes")
                protected OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes taxes;
                @XmlElement(name = "UnstructuredFareCalcInfo")
                protected List<UnstructuredFareCalcType> unstructuredFareCalcInfo;
                @XmlElement(name = "FareInfo")
                protected ETFareInfoType fareInfo;

                /**
                 * Gets the value of the baseFare property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the baseFare property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBaseFare().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BaseFareTransactionType }
                 * 
                 * 
                 */
                public List<BaseFareTransactionType> getBaseFare() {
                    if (baseFare == null) {
                        baseFare = new ArrayList<BaseFareTransactionType>();
                    }
                    return this.baseFare;
                }

                /**
                 * Gets the value of the equivFare property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the equivFare property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEquivFare().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EquivFareTransactionType }
                 * 
                 * 
                 */
                public List<EquivFareTransactionType> getEquivFare() {
                    if (equivFare == null) {
                        equivFare = new ArrayList<EquivFareTransactionType>();
                    }
                    return this.equivFare;
                }

                /**
                 * Gets the value of the total property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the total property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTotal().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TotalFareTransactionType }
                 * 
                 * 
                 */
                public List<TotalFareTransactionType> getTotal() {
                    if (total == null) {
                        total = new ArrayList<TotalFareTransactionType>();
                    }
                    return this.total;
                }

                /**
                 * Gets the value of the taxes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes }
                 *     
                 */
                public OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes getTaxes() {
                    return taxes;
                }

                /**
                 * Sets the value of the taxes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes }
                 *     
                 */
                public void setTaxes(OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes value) {
                    this.taxes = value;
                }

                /**
                 * Gets the value of the unstructuredFareCalcInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the unstructuredFareCalcInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUnstructuredFareCalcInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UnstructuredFareCalcType }
                 * 
                 * 
                 */
                public List<UnstructuredFareCalcType> getUnstructuredFareCalcInfo() {
                    if (unstructuredFareCalcInfo == null) {
                        unstructuredFareCalcInfo = new ArrayList<UnstructuredFareCalcType>();
                    }
                    return this.unstructuredFareCalcInfo;
                }

                /**
                 * Gets the value of the fareInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ETFareInfoType }
                 *     
                 */
                public ETFareInfoType getFareInfo() {
                    return fareInfo;
                }

                /**
                 * Sets the value of the fareInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ETFareInfoType }
                 *     
                 */
                public void setFareInfo(ETFareInfoType value) {
                    this.fareInfo = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}TaxDetailType"&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Taxes
                    extends TaxDetailType
                {


                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Origin" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
             *         &lt;element name="Destination" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "origin",
                "destination"
            })
            public static class OriginDestination {

                @XmlElement(name = "Origin", required = true)
                protected String origin;
                @XmlElement(name = "Destination", required = true)
                protected String destination;

                /**
                 * Gets the value of the origin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrigin() {
                    return origin;
                }

                /**
                 * Sets the value of the origin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrigin(String value) {
                    this.origin = value;
                }

                /**
                 * Gets the value of the destination property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestination() {
                    return destination;
                }

                /**
                 * Sets the value of the destination property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestination(String value) {
                    this.destination = value;
                }

            }

        }

    }

}
