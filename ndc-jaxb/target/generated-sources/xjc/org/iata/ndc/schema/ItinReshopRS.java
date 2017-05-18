
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
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST}SuccessType"/&gt;
 *             &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST}WarningsType" minOccurs="0"/&gt;
 *             &lt;element name="Response"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ItinReshopProcessing" minOccurs="0"/&gt;
 *                       &lt;element name="ReShoppingResponseID" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseID_Type" minOccurs="0"/&gt;
 *                       &lt;element name="Passengers"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="Passenger" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="ActionType" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;simpleContent&gt;
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/simpleContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/extension&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                                 &lt;element name="Group" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="ActionType" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;simpleContent&gt;
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/simpleContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/extension&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="Order"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="OrderItems" type="{http://www.iata.org/IATA/EDIST}OrderItemRepriceType"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/extension&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="ReShopOffers"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="ReShopOffer" maxOccurs="unbounded"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/&gt;
 *                                           &lt;element name="ReshopDifferential" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;complexContent&gt;
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                   &lt;sequence&gt;
 *                                                     &lt;element name="OriginalOrder"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *                                                             &lt;/sequence&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element name="NewOffer"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *                                                             &lt;/sequence&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element name="PenaltyAmount" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *                                                             &lt;/sequence&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element name="FeesAmount" minOccurs="0"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *                                                             &lt;/sequence&gt;
 *                                                           &lt;/restriction&gt;
 *                                                         &lt;/complexContent&gt;
 *                                                       &lt;/complexType&gt;
 *                                                     &lt;/element&gt;
 *                                                     &lt;element name="ReshopDue"&gt;
 *                                                       &lt;complexType&gt;
 *                                                         &lt;complexContent&gt;
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                             &lt;sequence&gt;
 *                                                               &lt;choice&gt;
 *                                                                 &lt;element name="ByPassenger"&gt;
 *                                                                   &lt;complexType&gt;
 *                                                                     &lt;complexContent&gt;
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                         &lt;sequence&gt;
 *                                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
 *                                                                         &lt;/sequence&gt;
 *                                                                       &lt;/restriction&gt;
 *                                                                     &lt;/complexContent&gt;
 *                                                                   &lt;/complexType&gt;
 *                                                                 &lt;/element&gt;
 *                                                                 &lt;element name="ByAirline"&gt;
 *                                                                   &lt;complexType&gt;
 *                                                                     &lt;complexContent&gt;
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                         &lt;sequence&gt;
 *                                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
 *                                                                         &lt;/sequence&gt;
 *                                                                       &lt;/restriction&gt;
 *                                                                     &lt;/complexContent&gt;
 *                                                                   &lt;/complexType&gt;
 *                                                                 &lt;/element&gt;
 *                                                               &lt;/choice&gt;
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *                                                             &lt;/sequence&gt;
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
 *                                       &lt;/extension&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/&gt;
 *                       &lt;element name="Payments" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="Payment" maxOccurs="unbounded"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;complexContent&gt;
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType"&gt;
 *                                         &lt;sequence&gt;
 *                                           &lt;element name="ActionType" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;simpleContent&gt;
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/simpleContent&gt;
 *                                             &lt;/complexType&gt;
 *                                           &lt;/element&gt;
 *                                         &lt;/sequence&gt;
 *                                       &lt;/extension&gt;
 *                                     &lt;/complexContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
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
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
 *                                           &lt;element name="ActionType" minOccurs="0"&gt;
 *                                             &lt;complexType&gt;
 *                                               &lt;simpleContent&gt;
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                                 &lt;/extension&gt;
 *                                               &lt;/simpleContent&gt;
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
 *                       &lt;element name="Commission" minOccurs="0"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;extension base="{http://www.iata.org/IATA/EDIST}CommissionType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="ActionType" minOccurs="0"&gt;
 *                                   &lt;complexType&gt;
 *                                     &lt;simpleContent&gt;
 *                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                         &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                       &lt;/extension&gt;
 *                                     &lt;/simpleContent&gt;
 *                                   &lt;/complexType&gt;
 *                                 &lt;/element&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/extension&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                       &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
 *                       &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}ItinReshopMetadataType" minOccurs="0"/&gt;
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
@XmlRootElement(name = "ItinReshopRS")
public class ItinReshopRS {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElementWrapper(name = "Warnings")
    @XmlElement(name = "Warning", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<WarningType> warnings;
    @XmlElement(name = "Response")
    protected ItinReshopRS.Response response;
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
     * @return
     *     possible object is
     *     {@link ItinReshopRS.Response }
     *     
     */
    public ItinReshopRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopRS.Response }
     *     
     */
    public void setResponse(ItinReshopRS.Response value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ItinReshopProcessing" minOccurs="0"/&gt;
     *         &lt;element name="ReShoppingResponseID" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseID_Type" minOccurs="0"/&gt;
     *         &lt;element name="Passengers"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Passenger" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ActionType" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Group" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ActionType" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Order"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OrderItems" type="{http://www.iata.org/IATA/EDIST}OrderItemRepriceType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ReShopOffers"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ReShopOffer" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/&gt;
     *                             &lt;element name="ReshopDifferential" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="OriginalOrder"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="NewOffer"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PenaltyAmount" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="FeesAmount" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ReshopDue"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;choice&gt;
     *                                                   &lt;element name="ByPassenger"&gt;
     *                                                     &lt;complexType&gt;
     *                                                       &lt;complexContent&gt;
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                           &lt;sequence&gt;
     *                                                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
     *                                                           &lt;/sequence&gt;
     *                                                         &lt;/restriction&gt;
     *                                                       &lt;/complexContent&gt;
     *                                                     &lt;/complexType&gt;
     *                                                   &lt;/element&gt;
     *                                                   &lt;element name="ByAirline"&gt;
     *                                                     &lt;complexType&gt;
     *                                                       &lt;complexContent&gt;
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                           &lt;sequence&gt;
     *                                                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
     *                                                           &lt;/sequence&gt;
     *                                                         &lt;/restriction&gt;
     *                                                       &lt;/complexContent&gt;
     *                                                     &lt;/complexType&gt;
     *                                                   &lt;/element&gt;
     *                                                 &lt;/choice&gt;
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
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
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/&gt;
     *         &lt;element name="Payments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Payment" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ActionType" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
     *                             &lt;element name="ActionType" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
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
     *         &lt;element name="Commission" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CommissionType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ActionType" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
     *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}ItinReshopMetadataType" minOccurs="0"/&gt;
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
        "itinReshopProcessing",
        "reShoppingResponseID",
        "passengers",
        "order",
        "reShopOffers",
        "changeFees",
        "payments",
        "ticketDocInfos",
        "commission",
        "dataLists",
        "metadata"
    })
    public static class Response {

        @XmlElement(name = "ItinReshopProcessing")
        protected ItinReshopProcessType itinReshopProcessing;
        @XmlElement(name = "ReShoppingResponseID")
        protected ShoppingResponseIDType reShoppingResponseID;
        @XmlElement(name = "Passengers", required = true)
        protected ItinReshopRS.Response.Passengers passengers;
        @XmlElement(name = "Order", required = true)
        protected ItinReshopRS.Response.Order order;
        @XmlElementWrapper(name = "ReShopOffers", required = true)
        @XmlElement(name = "ReShopOffer", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ItinReshopRS.Response.ReShopOffer> reShopOffers;
        @XmlElement(name = "ChangeFees")
        protected OrderPenaltyType changeFees;
        @XmlElementWrapper(name = "Payments")
        @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ItinReshopRS.Response.Payment> payments;
        @XmlElementWrapper(name = "TicketDocInfos")
        @XmlElement(name = "TicketDocInfo", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ItinReshopRS.Response.TicketDocInfo> ticketDocInfos;
        @XmlElement(name = "Commission")
        protected ItinReshopRS.Response.Commission commission;
        @XmlElement(name = "DataLists")
        protected DataListType dataLists;
        @XmlElement(name = "Metadata")
        protected ItinReshopMetadataType metadata;

        /**
         * Transaction Processing Results, including processing status, alerts, notices, business warnings, supplemental marketing messages and policy.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopProcessType }
         *     
         */
        public ItinReshopProcessType getItinReshopProcessing() {
            return itinReshopProcessing;
        }

        /**
         * Sets the value of the itinReshopProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopProcessType }
         *     
         */
        public void setItinReshopProcessing(ItinReshopProcessType value) {
            this.itinReshopProcessing = value;
        }

        /**
         * Gets the value of the reShoppingResponseID property.
         * 
         * @return
         *     possible object is
         *     {@link ShoppingResponseIDType }
         *     
         */
        public ShoppingResponseIDType getReShoppingResponseID() {
            return reShoppingResponseID;
        }

        /**
         * Sets the value of the reShoppingResponseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShoppingResponseIDType }
         *     
         */
        public void setReShoppingResponseID(ShoppingResponseIDType value) {
            this.reShoppingResponseID = value;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Passengers }
         *     
         */
        public ItinReshopRS.Response.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Passengers }
         *     
         */
        public void setPassengers(ItinReshopRS.Response.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Order }
         *     
         */
        public ItinReshopRS.Response.Order getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Order }
         *     
         */
        public void setOrder(ItinReshopRS.Response.Order value) {
            this.order = value;
        }

        /**
         * Gets the value of the changeFees property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPenaltyType }
         *     
         */
        public OrderPenaltyType getChangeFees() {
            return changeFees;
        }

        /**
         * Sets the value of the changeFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPenaltyType }
         *     
         */
        public void setChangeFees(OrderPenaltyType value) {
            this.changeFees = value;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Commission }
         *     
         */
        public ItinReshopRS.Response.Commission getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Commission }
         *     
         */
        public void setCommission(ItinReshopRS.Response.Commission value) {
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
         *     {@link ItinReshopMetadataType }
         *     
         */
        public ItinReshopMetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopMetadataType }
         *     
         */
        public void setMetadata(ItinReshopMetadataType value) {
            this.metadata = value;
        }

        public List<ItinReshopRS.Response.ReShopOffer> getReShopOffers() {
            if (reShopOffers == null) {
                reShopOffers = new ArrayList<ItinReshopRS.Response.ReShopOffer>();
            }
            return reShopOffers;
        }

        public void setReShopOffers(List<ItinReshopRS.Response.ReShopOffer> reShopOffers) {
            this.reShopOffers = reShopOffers;
        }

        public List<ItinReshopRS.Response.Payment> getPayments() {
            if (payments == null) {
                payments = new ArrayList<ItinReshopRS.Response.Payment>();
            }
            return payments;
        }

        public void setPayments(List<ItinReshopRS.Response.Payment> payments) {
            this.payments = payments;
        }

        public List<ItinReshopRS.Response.TicketDocInfo> getTicketDocInfos() {
            if (ticketDocInfos == null) {
                ticketDocInfos = new ArrayList<ItinReshopRS.Response.TicketDocInfo>();
            }
            return ticketDocInfos;
        }

        public void setTicketDocInfos(List<ItinReshopRS.Response.TicketDocInfo> ticketDocInfos) {
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CommissionType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ActionType" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
            "actionType"
        })
        public static class Commission
            extends CommissionType
        {

            @XmlElement(name = "ActionType")
            protected ItinReshopRS.Response.Commission.ActionType actionType;

            /**
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.Commission.ActionType }
             *     
             */
            public ItinReshopRS.Response.Commission.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.Commission.ActionType }
             *     
             */
            public void setActionType(ItinReshopRS.Response.Commission.ActionType value) {
                this.actionType = value;
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
         *         &lt;element name="OrderItems" type="{http://www.iata.org/IATA/EDIST}OrderItemRepriceType"/&gt;
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

            @XmlElementWrapper(name = "OrderItems", required = true)
            @XmlElement(name = "OrderItem", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<OrderItem> orderItems;

            public List<OrderItem> getOrderItems() {
                if (orderItems == null) {
                    orderItems = new ArrayList<OrderItem>();
                }
                return orderItems;
            }

            public void setOrderItems(List<OrderItem> orderItems) {
                this.orderItems = orderItems;
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
         *         &lt;element name="Passenger" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ActionType" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Group" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ActionType" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
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
            "passenger",
            "group"
        })
        public static class Passengers {

            @XmlElement(name = "Passenger")
            protected List<ItinReshopRS.Response.Passengers.Passenger> passenger;
            @XmlElement(name = "Group")
            protected ItinReshopRS.Response.Passengers.Group group;

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
             * {@link ItinReshopRS.Response.Passengers.Passenger }
             * 
             * 
             */
            public List<ItinReshopRS.Response.Passengers.Passenger> getPassenger() {
                if (passenger == null) {
                    passenger = new ArrayList<ItinReshopRS.Response.Passengers.Passenger>();
                }
                return this.passenger;
            }

            /**
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.Passengers.Group }
             *     
             */
            public ItinReshopRS.Response.Passengers.Group getGroup() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.Passengers.Group }
             *     
             */
            public void setGroup(ItinReshopRS.Response.Passengers.Group value) {
                this.group = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ActionType" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
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
                "actionType"
            })
            public static class Group
                extends GroupType
            {

                @XmlElement(name = "ActionType")
                protected ItinReshopRS.Response.Passengers.Group.ActionType actionType;

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.Passengers.Group.ActionType }
                 *     
                 */
                public ItinReshopRS.Response.Passengers.Group.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.Passengers.Group.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRS.Response.Passengers.Group.ActionType value) {
                    this.actionType = value;
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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ActionType" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
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
                "actionType"
            })
            public static class Passenger
                extends PassengerDetailType
            {

                @XmlElement(name = "ActionType")
                protected ItinReshopRS.Response.Passengers.Passenger.ActionType actionType;

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.Passengers.Passenger.ActionType }
                 *     
                 */
                public ItinReshopRS.Response.Passengers.Passenger.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.Passengers.Passenger.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRS.Response.Passengers.Passenger.ActionType value) {
                    this.actionType = value;
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ActionType" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
            "actionType"
        })
        public static class Payment
            extends PaymentMethodType
        {

            @XmlElement(name = "ActionType")
            protected ItinReshopRS.Response.Payment.ActionType actionType;

            /**
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.Payment.ActionType }
             *     
             */
            public ItinReshopRS.Response.Payment.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.Payment.ActionType }
             *     
             */
            public void setActionType(ItinReshopRS.Response.Payment.ActionType value) {
                this.actionType = value;
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/&gt;
         *         &lt;element name="ReshopDifferential" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OriginalOrder"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
         *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NewOffer"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
         *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PenaltyAmount" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
         *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FeesAmount" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
         *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ReshopDue"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;choice&gt;
         *                               &lt;element name="ByPassenger"&gt;
         *                                 &lt;complexType&gt;
         *                                   &lt;complexContent&gt;
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                       &lt;sequence&gt;
         *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
         *                                       &lt;/sequence&gt;
         *                                     &lt;/restriction&gt;
         *                                   &lt;/complexContent&gt;
         *                                 &lt;/complexType&gt;
         *                               &lt;/element&gt;
         *                               &lt;element name="ByAirline"&gt;
         *                                 &lt;complexType&gt;
         *                                   &lt;complexContent&gt;
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                       &lt;sequence&gt;
         *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
         *                                       &lt;/sequence&gt;
         *                                     &lt;/restriction&gt;
         *                                   &lt;/complexContent&gt;
         *                                 &lt;/complexType&gt;
         *                               &lt;/element&gt;
         *                             &lt;/choice&gt;
         *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reShopPricedOffer",
            "reshopDifferential"
        })
        public static class ReShopOffer
            extends OfferType
        {

            @XmlElement(name = "ReShopPricedOffer")
            protected PricedFlightOfferType reShopPricedOffer;
            @XmlElement(name = "ReshopDifferential")
            protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential reshopDifferential;

            /**
             * Gets the value of the reShopPricedOffer property.
             * 
             * @return
             *     possible object is
             *     {@link PricedFlightOfferType }
             *     
             */
            public PricedFlightOfferType getReShopPricedOffer() {
                return reShopPricedOffer;
            }

            /**
             * Sets the value of the reShopPricedOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricedFlightOfferType }
             *     
             */
            public void setReShopPricedOffer(PricedFlightOfferType value) {
                this.reShopPricedOffer = value;
            }

            /**
             * Gets the value of the reshopDifferential property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential }
             *     
             */
            public ItinReshopRS.Response.ReShopOffer.ReshopDifferential getReshopDifferential() {
                return reshopDifferential;
            }

            /**
             * Sets the value of the reshopDifferential property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential }
             *     
             */
            public void setReshopDifferential(ItinReshopRS.Response.ReShopOffer.ReshopDifferential value) {
                this.reshopDifferential = value;
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
             *         &lt;element name="OriginalOrder"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
             *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NewOffer"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
             *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PenaltyAmount" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
             *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="FeesAmount" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
             *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ReshopDue"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;choice&gt;
             *                     &lt;element name="ByPassenger"&gt;
             *                       &lt;complexType&gt;
             *                         &lt;complexContent&gt;
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                             &lt;sequence&gt;
             *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
             *                             &lt;/sequence&gt;
             *                           &lt;/restriction&gt;
             *                         &lt;/complexContent&gt;
             *                       &lt;/complexType&gt;
             *                     &lt;/element&gt;
             *                     &lt;element name="ByAirline"&gt;
             *                       &lt;complexType&gt;
             *                         &lt;complexContent&gt;
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                             &lt;sequence&gt;
             *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
             *                             &lt;/sequence&gt;
             *                           &lt;/restriction&gt;
             *                         &lt;/complexContent&gt;
             *                       &lt;/complexType&gt;
             *                     &lt;/element&gt;
             *                   &lt;/choice&gt;
             *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
                "originalOrder",
                "newOffer",
                "penaltyAmount",
                "feesAmount",
                "reshopDue"
            })
            public static class ReshopDifferential {

                @XmlElement(name = "OriginalOrder", required = true)
                protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder originalOrder;
                @XmlElement(name = "NewOffer", required = true)
                protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer newOffer;
                @XmlElement(name = "PenaltyAmount")
                protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount penaltyAmount;
                @XmlElement(name = "FeesAmount")
                protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount feesAmount;
                @XmlElement(name = "ReshopDue", required = true)
                protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue reshopDue;

                /**
                 * Gets the value of the originalOrder property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder }
                 *     
                 */
                public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder getOriginalOrder() {
                    return originalOrder;
                }

                /**
                 * Sets the value of the originalOrder property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder }
                 *     
                 */
                public void setOriginalOrder(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder value) {
                    this.originalOrder = value;
                }

                /**
                 * Gets the value of the newOffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer }
                 *     
                 */
                public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer getNewOffer() {
                    return newOffer;
                }

                /**
                 * Sets the value of the newOffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer }
                 *     
                 */
                public void setNewOffer(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer value) {
                    this.newOffer = value;
                }

                /**
                 * Gets the value of the penaltyAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount }
                 *     
                 */
                public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount getPenaltyAmount() {
                    return penaltyAmount;
                }

                /**
                 * Sets the value of the penaltyAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount }
                 *     
                 */
                public void setPenaltyAmount(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount value) {
                    this.penaltyAmount = value;
                }

                /**
                 * Gets the value of the feesAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount }
                 *     
                 */
                public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount getFeesAmount() {
                    return feesAmount;
                }

                /**
                 * Sets the value of the feesAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount }
                 *     
                 */
                public void setFeesAmount(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount value) {
                    this.feesAmount = value;
                }

                /**
                 * Gets the value of the reshopDue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue }
                 *     
                 */
                public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue getReshopDue() {
                    return reshopDue;
                }

                /**
                 * Sets the value of the reshopDue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue }
                 *     
                 */
                public void setReshopDue(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue value) {
                    this.reshopDue = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
                 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
                    "total",
                    "taxes"
                })
                public static class FeesAmount {

                    @XmlElement(name = "Total", required = true)
                    protected TotalFareTransactionType total;
                    @XmlElement(name = "Taxes")
                    protected TaxDetailType taxes;

                    /**
                     * Gets the value of the total property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public TotalFareTransactionType getTotal() {
                        return total;
                    }

                    /**
                     * Sets the value of the total property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public void setTotal(TotalFareTransactionType value) {
                        this.total = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public TaxDetailType getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public void setTaxes(TaxDetailType value) {
                        this.taxes = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
                 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
                    "total",
                    "taxes"
                })
                public static class NewOffer {

                    @XmlElement(name = "Total", required = true)
                    protected TotalFareTransactionType total;
                    @XmlElement(name = "Taxes")
                    protected TaxDetailType taxes;

                    /**
                     * Gets the value of the total property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public TotalFareTransactionType getTotal() {
                        return total;
                    }

                    /**
                     * Sets the value of the total property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public void setTotal(TotalFareTransactionType value) {
                        this.total = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public TaxDetailType getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public void setTaxes(TaxDetailType value) {
                        this.taxes = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
                 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
                    "total",
                    "taxes"
                })
                public static class OriginalOrder {

                    @XmlElement(name = "Total", required = true)
                    protected TotalFareTransactionType total;
                    @XmlElement(name = "Taxes")
                    protected TaxDetailType taxes;

                    /**
                     * Gets the value of the total property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public TotalFareTransactionType getTotal() {
                        return total;
                    }

                    /**
                     * Sets the value of the total property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public void setTotal(TotalFareTransactionType value) {
                        this.total = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public TaxDetailType getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public void setTaxes(TaxDetailType value) {
                        this.taxes = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
                 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
                    "total",
                    "taxes"
                })
                public static class PenaltyAmount {

                    @XmlElement(name = "Total", required = true)
                    protected TotalFareTransactionType total;
                    @XmlElement(name = "Taxes")
                    protected TaxDetailType taxes;

                    /**
                     * Gets the value of the total property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public TotalFareTransactionType getTotal() {
                        return total;
                    }

                    /**
                     * Sets the value of the total property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TotalFareTransactionType }
                     *     
                     */
                    public void setTotal(TotalFareTransactionType value) {
                        this.total = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public TaxDetailType getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public void setTaxes(TaxDetailType value) {
                        this.taxes = value;
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
                 *         &lt;choice&gt;
                 *           &lt;element name="ByPassenger"&gt;
                 *             &lt;complexType&gt;
                 *               &lt;complexContent&gt;
                 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                   &lt;sequence&gt;
                 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
                 *                   &lt;/sequence&gt;
                 *                 &lt;/restriction&gt;
                 *               &lt;/complexContent&gt;
                 *             &lt;/complexType&gt;
                 *           &lt;/element&gt;
                 *           &lt;element name="ByAirline"&gt;
                 *             &lt;complexType&gt;
                 *               &lt;complexContent&gt;
                 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                   &lt;sequence&gt;
                 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
                 *                   &lt;/sequence&gt;
                 *                 &lt;/restriction&gt;
                 *               &lt;/complexContent&gt;
                 *             &lt;/complexType&gt;
                 *           &lt;/element&gt;
                 *         &lt;/choice&gt;
                 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
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
                    "byPassenger",
                    "byAirline",
                    "taxes"
                })
                public static class ReshopDue {

                    @XmlElement(name = "ByPassenger")
                    protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger byPassenger;
                    @XmlElement(name = "ByAirline")
                    protected ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline byAirline;
                    @XmlElement(name = "Taxes")
                    protected TaxDetailType taxes;

                    /**
                     * Gets the value of the byPassenger property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger getByPassenger() {
                        return byPassenger;
                    }

                    /**
                     * Sets the value of the byPassenger property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger }
                     *     
                     */
                    public void setByPassenger(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger value) {
                        this.byPassenger = value;
                    }

                    /**
                     * Gets the value of the byAirline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline getByAirline() {
                        return byAirline;
                    }

                    /**
                     * Sets the value of the byAirline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline }
                     *     
                     */
                    public void setByAirline(ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline value) {
                        this.byAirline = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public TaxDetailType getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxDetailType }
                     *     
                     */
                    public void setTaxes(TaxDetailType value) {
                        this.taxes = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
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
                        "total"
                    })
                    public static class ByAirline {

                        @XmlElement(name = "Total", required = true)
                        protected TotalFareTransactionType total;

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public TotalFareTransactionType getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public void setTotal(TotalFareTransactionType value) {
                            this.total = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/&gt;
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
                        "total"
                    })
                    public static class ByPassenger {

                        @XmlElement(name = "Total", required = true)
                        protected TotalFareTransactionType total;

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public TotalFareTransactionType getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public void setTotal(TotalFareTransactionType value) {
                            this.total = value;
                        }

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
         *         &lt;element name="ActionType" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
            "actionType"
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
            @XmlElement(name = "ActionType")
            protected ItinReshopRS.Response.TicketDocInfo.ActionType actionType;

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
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.TicketDocInfo.ActionType }
             *     
             */
            public ItinReshopRS.Response.TicketDocInfo.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.TicketDocInfo.ActionType }
             *     
             */
            public void setActionType(ItinReshopRS.Response.TicketDocInfo.ActionType value) {
                this.actionType = value;
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

        }

    }

}
