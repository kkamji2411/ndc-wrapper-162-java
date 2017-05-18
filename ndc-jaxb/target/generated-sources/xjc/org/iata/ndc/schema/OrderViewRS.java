
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST}SuccessType"/&gt;
 *             &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST}WarningsType" minOccurs="0"/&gt;
 *             &lt;element name="Response"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderViewProcessing" minOccurs="0"/&gt;
 *                       &lt;element name="Passengers"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                 &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="Order" maxOccurs="unbounded"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="OrderItems"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
 *                                       &lt;/extension&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/extension&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="Payments" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentMethodType" maxOccurs="unbounded"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
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
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="unbounded"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReference"/&gt;
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
 *                       &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
 *                       &lt;element name="Amendments" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="Amendment" maxOccurs="unbounded"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="ActionType"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;simpleContent&gt;
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/simpleContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element name="OfferItem" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
 *                                                     &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;choice&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                             &lt;/choice&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element name="Services" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
 *                                                               &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                                 &lt;complexType&gt;
 *                                                                   &lt;complexContent&gt;
 *                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                       &lt;choice&gt;
 *                                                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                                       &lt;/choice&gt;
 *                                                                     &lt;/restriction&gt;
 *                                                                   &lt;/complexContent&gt;
 *                                                                 &lt;/complexType&gt;
 *                                                               &lt;/element&gt;
 *                                                             &lt;/sequence&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                             &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                           &lt;element name="TicketDocInfo" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element name="AgentIDs" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
 *                                                             &lt;/sequence&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
 *                                                     &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;choice&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                             &lt;/choice&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                   &lt;/sequence&gt;
 *                                                 &lt;/restriction&gt;
 *                                               &lt;/complexContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
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
 *                       &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
 *                       &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}OrdViewMetadataType" minOccurs="0"/&gt;
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
    "party",
    "success",
    "warnings",
    "response",
    "errors"
})
@XmlRootElement(name = "OrderViewRS")
public class OrderViewRS {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party")
    protected MsgPartiesType party;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElementWrapper(name = "Warnings")
    @XmlElement(name = "Warning", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<WarningType> warnings;
    @XmlElement(name = "Response")
    protected OrderViewRS.Response response;
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
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType }
     *     
     */
    public MsgPartiesType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType }
     *     
     */
    public void setParty(MsgPartiesType value) {
        this.party = value;
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
     * @return
     *     possible object is
     *     {@link OrderViewRS.Response }
     *     
     */
    public OrderViewRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderViewRS.Response }
     *     
     */
    public void setResponse(OrderViewRS.Response value) {
        this.response = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderViewProcessing" minOccurs="0"/&gt;
     *         &lt;element name="Passengers"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Order" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OrderItems"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Payments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentMethodType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
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
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="unbounded"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReference"/&gt;
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
     *         &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
     *         &lt;element name="Amendments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amendment" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ActionType"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OfferItem" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
     *                                       &lt;element name="Passengers" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;choice&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                               &lt;/choice&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Services" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
     *                                                 &lt;element name="Passengers" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;choice&gt;
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                                         &lt;/choice&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
     *                                               &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TicketDocInfo" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AgentIDs" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
     *                                       &lt;element name="Passengers" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;choice&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                               &lt;/choice&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
     *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
     *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}OrdViewMetadataType" minOccurs="0"/&gt;
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
        "orderViewProcessing",
        "passengers",
        "order",
        "payments",
        "ticketDocInfos",
        "commission",
        "amendments",
        "dataLists",
        "metadata"
    })
    public static class Response {

        @XmlElement(name = "OrderViewProcessing")
        protected OrderViewProcessType orderViewProcessing;
        @XmlElement(name = "Passengers", required = true)
        protected OrderViewRS.Response.Passengers passengers;
        @XmlElement(name = "Order", required = true)
        protected List<OrderViewRS.Response.Order> order;
        @XmlElementWrapper(name = "Payments")
        @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderPaymentMethodType> payments;
        @XmlElementWrapper(name = "TicketDocInfos")
        @XmlElement(name = "TicketDocInfo", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderViewRS.Response.TicketDocInfo> ticketDocInfos;
        @XmlElement(name = "Commission")
        protected CommissionType commission;
        @XmlElementWrapper(name = "Amendments")
        @XmlElement(name = "Amendment", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderViewRS.Response.Amendment> amendments;
        @XmlElement(name = "DataLists")
        protected DataListType dataLists;
        @XmlElement(name = "Metadata")
        protected OrdViewMetadataType metadata;

        /**
         * Transaction Processing Results, including processing status, alerts, notices, business warnings, supplemental marketing messages and policy.
         * 
         * @return
         *     possible object is
         *     {@link OrderViewProcessType }
         *     
         */
        public OrderViewProcessType getOrderViewProcessing() {
            return orderViewProcessing;
        }

        /**
         * Sets the value of the orderViewProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderViewProcessType }
         *     
         */
        public void setOrderViewProcessing(OrderViewProcessType value) {
            this.orderViewProcessing = value;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderViewRS.Response.Passengers }
         *     
         */
        public OrderViewRS.Response.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderViewRS.Response.Passengers }
         *     
         */
        public void setPassengers(OrderViewRS.Response.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the order property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderViewRS.Response.Order }
         * 
         * 
         */
        public List<OrderViewRS.Response.Order> getOrder() {
            if (order == null) {
                order = new ArrayList<OrderViewRS.Response.Order>();
            }
            return this.order;
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
         * Gets the value of the dataLists property.
         * 
         * @return
         *     possible object is
         *     {@link DataListType }
         *     
         */
        public DataListType getDataLists() {
            return dataLists;
        }

        /**
         * Sets the value of the dataLists property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataListType }
         *     
         */
        public void setDataLists(DataListType value) {
            this.dataLists = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link OrdViewMetadataType }
         *     
         */
        public OrdViewMetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdViewMetadataType }
         *     
         */
        public void setMetadata(OrdViewMetadataType value) {
            this.metadata = value;
        }

        public List<OrderPaymentMethodType> getPayments() {
            if (payments == null) {
                payments = new ArrayList<OrderPaymentMethodType>();
            }
            return payments;
        }

        public void setPayments(List<OrderPaymentMethodType> payments) {
            this.payments = payments;
        }

        public List<OrderViewRS.Response.TicketDocInfo> getTicketDocInfos() {
            if (ticketDocInfos == null) {
                ticketDocInfos = new ArrayList<OrderViewRS.Response.TicketDocInfo>();
            }
            return ticketDocInfos;
        }

        public void setTicketDocInfos(List<OrderViewRS.Response.TicketDocInfo> ticketDocInfos) {
            this.ticketDocInfos = ticketDocInfos;
        }

        public List<OrderViewRS.Response.Amendment> getAmendments() {
            if (amendments == null) {
                amendments = new ArrayList<OrderViewRS.Response.Amendment>();
            }
            return amendments;
        }

        public void setAmendments(List<OrderViewRS.Response.Amendment> amendments) {
            this.amendments = amendments;
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
         *         &lt;element name="ActionType"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OfferItem" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
         *                   &lt;element name="Passengers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                           &lt;/choice&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Services" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
         *                             &lt;element name="Passengers" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;choice&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                                     &lt;/choice&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
         *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TicketDocInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AgentIDs" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
         *                   &lt;element name="Passengers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                           &lt;/choice&gt;
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
            "actionType",
            "offerItem",
            "ticketDocInfo"
        })
        public static class Amendment {

            @XmlElement(name = "ActionType", required = true)
            protected OrderViewRS.Response.Amendment.ActionType actionType;
            @XmlElement(name = "OfferItem")
            protected OrderViewRS.Response.Amendment.OfferItem offerItem;
            @XmlElement(name = "TicketDocInfo")
            protected OrderViewRS.Response.Amendment.TicketDocInfo ticketDocInfo;

            /**
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link OrderViewRS.Response.Amendment.ActionType }
             *     
             */
            public OrderViewRS.Response.Amendment.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderViewRS.Response.Amendment.ActionType }
             *     
             */
            public void setActionType(OrderViewRS.Response.Amendment.ActionType value) {
                this.actionType = value;
            }

            /**
             * Gets the value of the offerItem property.
             * 
             * @return
             *     possible object is
             *     {@link OrderViewRS.Response.Amendment.OfferItem }
             *     
             */
            public OrderViewRS.Response.Amendment.OfferItem getOfferItem() {
                return offerItem;
            }

            /**
             * Sets the value of the offerItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderViewRS.Response.Amendment.OfferItem }
             *     
             */
            public void setOfferItem(OrderViewRS.Response.Amendment.OfferItem value) {
                this.offerItem = value;
            }

            /**
             * Gets the value of the ticketDocInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OrderViewRS.Response.Amendment.TicketDocInfo }
             *     
             */
            public OrderViewRS.Response.Amendment.TicketDocInfo getTicketDocInfo() {
                return ticketDocInfo;
            }

            /**
             * Sets the value of the ticketDocInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderViewRS.Response.Amendment.TicketDocInfo }
             *     
             */
            public void setTicketDocInfo(OrderViewRS.Response.Amendment.TicketDocInfo value) {
                this.ticketDocInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
             *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ActionType {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Context")
                protected String context;

                /**
                 * 
                 *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
                 *       
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the context property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContext() {
                    return context;
                }

                /**
                 * Sets the value of the context property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContext(String value) {
                    this.context = value;
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
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
             *         &lt;element name="Passengers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                 &lt;/choice&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Services" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
             *                   &lt;element name="Passengers" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;choice&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                           &lt;/choice&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
             *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "offerItemID",
                "passengers",
                "services",
                "otherAssociation"
            })
            public static class OfferItem
                extends AssociatedObjectBaseType
            {

                @XmlElement(name = "OfferItemID", required = true)
                protected ItemIDType offerItemID;
                @XmlElement(name = "Passengers")
                protected OrderViewRS.Response.Amendment.OfferItem.Passengers passengers;
                @XmlElement(name = "Services")
                protected OrderViewRS.Response.Amendment.OfferItem.Services services;
                @XmlElement(name = "OtherAssociation")
                protected List<OrderViewRS.Response.Amendment.OfferItem.OtherAssociation> otherAssociation;

                /**
                 * Gets the value of the offerItemID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemIDType }
                 *     
                 */
                public ItemIDType getOfferItemID() {
                    return offerItemID;
                }

                /**
                 * Sets the value of the offerItemID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemIDType }
                 *     
                 */
                public void setOfferItemID(ItemIDType value) {
                    this.offerItemID = value;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderViewRS.Response.Amendment.OfferItem.Passengers }
                 *     
                 */
                public OrderViewRS.Response.Amendment.OfferItem.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderViewRS.Response.Amendment.OfferItem.Passengers }
                 *     
                 */
                public void setPassengers(OrderViewRS.Response.Amendment.OfferItem.Passengers value) {
                    this.passengers = value;
                }

                /**
                 * Gets the value of the services property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderViewRS.Response.Amendment.OfferItem.Services }
                 *     
                 */
                public OrderViewRS.Response.Amendment.OfferItem.Services getServices() {
                    return services;
                }

                /**
                 * Sets the value of the services property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderViewRS.Response.Amendment.OfferItem.Services }
                 *     
                 */
                public void setServices(OrderViewRS.Response.Amendment.OfferItem.Services value) {
                    this.services = value;
                }

                /**
                 * Gets the value of the otherAssociation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherAssociation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OrderViewRS.Response.Amendment.OfferItem.OtherAssociation }
                 * 
                 * 
                 */
                public List<OrderViewRS.Response.Amendment.OfferItem.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<OrderViewRS.Response.Amendment.OfferItem.OtherAssociation>();
                    }
                    return this.otherAssociation;
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
                 *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
                 *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OtherAssociation {

                    @XmlAttribute(name = "Type", required = true)
                    protected String type;
                    @XmlAttribute(name = "ReferenceValue", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object referenceValue;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the referenceValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getReferenceValue() {
                        return referenceValue;
                    }

                    /**
                     * Sets the value of the referenceValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setReferenceValue(Object value) {
                        this.referenceValue = value;
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
                 *       &lt;choice&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *       &lt;/choice&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object groupReference;

                    /**
                     * Association to multiple Passenger instance(s). Example: pax1 pax2 Gets the value of the passengerReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPassengerReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getPassengerReferences() {
                        if (passengerReferences == null) {
                            passengerReferences = new ArrayList<Object>();
                        }
                        return this.passengerReferences;
                    }

                    /**
                     * Gets the value of the groupReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getGroupReference() {
                        return groupReference;
                    }

                    /**
                     * Sets the value of the groupReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setGroupReference(Object value) {
                        this.groupReference = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
                 *         &lt;element name="Passengers" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;choice&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *                 &lt;/choice&gt;
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
                    "serviceID",
                    "passengers"
                })
                public static class Services {

                    @XmlElement(name = "ServiceID", required = true)
                    protected List<ServiceIDType> serviceID;
                    @XmlElement(name = "Passengers")
                    protected OrderViewRS.Response.Amendment.OfferItem.Services.Passengers passengers;

                    /**
                     * Gets the value of the serviceID property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the serviceID property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getServiceID().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ServiceIDType }
                     * 
                     * 
                     */
                    public List<ServiceIDType> getServiceID() {
                        if (serviceID == null) {
                            serviceID = new ArrayList<ServiceIDType>();
                        }
                        return this.serviceID;
                    }

                    /**
                     * Gets the value of the passengers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderViewRS.Response.Amendment.OfferItem.Services.Passengers }
                     *     
                     */
                    public OrderViewRS.Response.Amendment.OfferItem.Services.Passengers getPassengers() {
                        return passengers;
                    }

                    /**
                     * Sets the value of the passengers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderViewRS.Response.Amendment.OfferItem.Services.Passengers }
                     *     
                     */
                    public void setPassengers(OrderViewRS.Response.Amendment.OfferItem.Services.Passengers value) {
                        this.passengers = value;
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
                     *       &lt;choice&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                     *       &lt;/choice&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "passengerReferences",
                        "groupReference"
                    })
                    public static class Passengers {

                        @XmlList
                        @XmlElement(name = "PassengerReferences")
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREFS")
                        protected List<Object> passengerReferences;
                        @XmlElement(name = "GroupReference")
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREF")
                        protected Object groupReference;

                        /**
                         * Association to multiple Passenger instance(s). Example: pax1 pax2 Gets the value of the passengerReferences property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPassengerReferences().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getPassengerReferences() {
                            if (passengerReferences == null) {
                                passengerReferences = new ArrayList<Object>();
                            }
                            return this.passengerReferences;
                        }

                        /**
                         * Gets the value of the groupReference property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getGroupReference() {
                            return groupReference;
                        }

                        /**
                         * Sets the value of the groupReference property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setGroupReference(Object value) {
                            this.groupReference = value;
                        }

                    }

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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
             *         &lt;element name="Passengers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                 &lt;/choice&gt;
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
                "agentIDs",
                "issuingAirlineInfo",
                "ticketDocument",
                "carrierFeeInfo",
                "originalIssueInfo",
                "passengers"
            })
            public static class TicketDocInfo {

                @XmlElementWrapper(name = "AgentIDs")
                @XmlElement(name = "AgentID", namespace = "http://www.iata.org/IATA/EDIST")
                protected List<AgentID> agentIDs;
                @XmlElement(name = "IssuingAirlineInfo")
                protected IssuingAirlineInfo issuingAirlineInfo;
                @XmlElement(name = "TicketDocument", required = true)
                protected List<TicketDocument> ticketDocument;
                @XmlElement(name = "CarrierFeeInfo")
                protected CarrierFeeInfoType carrierFeeInfo;
                @XmlElement(name = "OriginalIssueInfo")
                protected OriginalIssueInfo originalIssueInfo;
                @XmlElement(name = "Passengers")
                protected OrderViewRS.Response.Amendment.TicketDocInfo.Passengers passengers;

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
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderViewRS.Response.Amendment.TicketDocInfo.Passengers }
                 *     
                 */
                public OrderViewRS.Response.Amendment.TicketDocInfo.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderViewRS.Response.Amendment.TicketDocInfo.Passengers }
                 *     
                 */
                public void setPassengers(OrderViewRS.Response.Amendment.TicketDocInfo.Passengers value) {
                    this.passengers = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;choice&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *       &lt;/choice&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object groupReference;

                    /**
                     * Association to multiple Passenger instance(s). Example: pax1 pax2 Gets the value of the passengerReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPassengerReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getPassengerReferences() {
                        if (passengerReferences == null) {
                            passengerReferences = new ArrayList<Object>();
                        }
                        return this.passengerReferences;
                    }

                    /**
                     * Gets the value of the groupReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getGroupReference() {
                        return groupReference;
                    }

                    /**
                     * Sets the value of the groupReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setGroupReference(Object value) {
                        this.groupReference = value;
                    }

                }

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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="OrderItems"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "orderItems"
        })
        public static class Order
            extends OrderCoreType
        {

            @XmlElement(name = "OrderItems", required = true)
            protected OrderViewRS.Response.Order.OrderItems orderItems;

            /**
             * Gets the value of the orderItems property.
             * 
             * @return
             *     possible object is
             *     {@link OrderViewRS.Response.Order.OrderItems }
             *     
             */
            public OrderViewRS.Response.Order.OrderItems getOrderItems() {
                return orderItems;
            }

            /**
             * Sets the value of the orderItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderViewRS.Response.Order.OrderItems }
             *     
             */
            public void setOrderItems(OrderViewRS.Response.Order.OrderItems value) {
                this.orderItems = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OrderItems
                extends OrderItemDetailType
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/&gt;
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
            "passenger",
            "group"
        })
        public static class Passengers {

            @XmlElement(name = "Passenger")
            protected List<Passenger> passenger;
            @XmlElement(name = "Group")
            protected GroupType group;

            /**
             * Gets the value of the passenger property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passenger property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassenger().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Passenger }
             * 
             * 
             */
            public List<Passenger> getPassenger() {
                if (passenger == null) {
                    passenger = new ArrayList<Passenger>();
                }
                return this.passenger;
            }

            /**
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link GroupType }
             *     
             */
            public GroupType getGroup() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link GroupType }
             *     
             */
            public void setGroup(GroupType value) {
                this.group = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="unbounded"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReference"/&gt;
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
            "agentIDs",
            "issuingAirlineInfo",
            "ticketDocument",
            "carrierFeeInfo",
            "originalIssueInfo",
            "passengerReference"
        })
        public static class TicketDocInfo {

            @XmlElementWrapper(name = "AgentIDs")
            @XmlElement(name = "AgentID", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<AgentID> agentIDs;
            @XmlElement(name = "IssuingAirlineInfo")
            protected IssuingAirlineInfo issuingAirlineInfo;
            @XmlElement(name = "TicketDocument", required = true)
            protected List<TicketDocument> ticketDocument;
            @XmlElement(name = "CarrierFeeInfo")
            protected CarrierFeeInfoType carrierFeeInfo;
            @XmlElement(name = "OriginalIssueInfo")
            protected OriginalIssueInfo originalIssueInfo;
            @XmlList
            @XmlElement(name = "PassengerReference", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> passengerReference;

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
             * Gets the value of the passengerReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getPassengerReference() {
                if (passengerReference == null) {
                    passengerReference = new ArrayList<Object>();
                }
                return this.passengerReference;
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

        }

    }

}
