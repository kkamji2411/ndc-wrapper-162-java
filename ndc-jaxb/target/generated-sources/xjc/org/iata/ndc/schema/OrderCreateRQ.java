
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PointOfSale" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderCreateParameters" minOccurs="0"/&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Passengers"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OrderItems"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseOrderType"/&gt;
 *                             &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="OfferItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Payments" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentFormType" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Promotions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Promotion" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType"&gt;
 *                                     &lt;sequence&gt;
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
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
 *                   &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
 *                   &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}OrdCreateMetadataType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "pointOfSale",
    "document",
    "party",
    "orderCreateParameters",
    "query"
})
@XmlRootElement(name = "OrderCreateRQ")
public class OrderCreateRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "OrderCreateParameters")
    protected OrderCreateParameters orderCreateParameters;
    @XmlElement(name = "Query", required = true)
    protected OrderCreateRQ.Query query;
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
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType }
     *     
     */
    public PointOfSaleType getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType }
     *     
     */
    public void setPointOfSale(PointOfSaleType value) {
        this.pointOfSale = value;
    }

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
     * Gets the value of the orderCreateParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreateParameters }
     *     
     */
    public OrderCreateParameters getOrderCreateParameters() {
        return orderCreateParameters;
    }

    /**
     * Sets the value of the orderCreateParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreateParameters }
     *     
     */
    public void setOrderCreateParameters(OrderCreateParameters value) {
        this.orderCreateParameters = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreateRQ.Query }
     *     
     */
    public OrderCreateRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreateRQ.Query }
     *     
     */
    public void setQuery(OrderCreateRQ.Query value) {
        this.query = value;
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
     *         &lt;element name="OrderItems"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseOrderType"/&gt;
     *                   &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="OfferItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Payments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentFormType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Promotions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Promotion" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType"&gt;
     *                           &lt;sequence&gt;
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
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
     *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
     *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}OrdCreateMetadataType" minOccurs="0"/&gt;
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
        "passengers",
        "orderItems",
        "payments",
        "promotions",
        "commission",
        "bookingReferences",
        "dataLists",
        "metadata"
    })
    public static class Query {

        @XmlElement(name = "Passengers", required = true)
        protected OrderCreateRQ.Query.Passengers passengers;
        @XmlElement(name = "OrderItems", required = true)
        protected OrderCreateRQ.Query.OrderItems orderItems;
        @XmlElementWrapper(name = "Payments")
        @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderPaymentFormType> payments;
        @XmlElementWrapper(name = "Promotions")
        @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderCreateRQ.Query.Promotion> promotions;
        @XmlElement(name = "Commission")
        protected CommissionType commission;
        @XmlElementWrapper(name = "BookingReferences")
        @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<BookingReferenceType> bookingReferences;
        @XmlElement(name = "DataLists")
        protected DataListType dataLists;
        @XmlElement(name = "Metadata")
        protected OrdCreateMetadataType metadata;

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCreateRQ.Query.Passengers }
         *     
         */
        public OrderCreateRQ.Query.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCreateRQ.Query.Passengers }
         *     
         */
        public void setPassengers(OrderCreateRQ.Query.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the orderItems property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCreateRQ.Query.OrderItems }
         *     
         */
        public OrderCreateRQ.Query.OrderItems getOrderItems() {
            return orderItems;
        }

        /**
         * Sets the value of the orderItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCreateRQ.Query.OrderItems }
         *     
         */
        public void setOrderItems(OrderCreateRQ.Query.OrderItems value) {
            this.orderItems = value;
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
         *     {@link OrdCreateMetadataType }
         *     
         */
        public OrdCreateMetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdCreateMetadataType }
         *     
         */
        public void setMetadata(OrdCreateMetadataType value) {
            this.metadata = value;
        }

        public List<OrderPaymentFormType> getPayments() {
            if (payments == null) {
                payments = new ArrayList<OrderPaymentFormType>();
            }
            return payments;
        }

        public void setPayments(List<OrderPaymentFormType> payments) {
            this.payments = payments;
        }

        public List<OrderCreateRQ.Query.Promotion> getPromotions() {
            if (promotions == null) {
                promotions = new ArrayList<OrderCreateRQ.Query.Promotion>();
            }
            return promotions;
        }

        public void setPromotions(List<OrderCreateRQ.Query.Promotion> promotions) {
            this.promotions = promotions;
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
         *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseOrderType"/&gt;
         *         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="OfferItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "shoppingResponse",
            "offerItem"
        })
        public static class OrderItems {

            @XmlElement(name = "ShoppingResponse", required = true)
            protected ShoppingResponseOrderType shoppingResponse;
            @XmlElement(name = "OfferItem")
            protected List<OrderOfferItemType> offerItem;
            @XmlAttribute(name = "OfferItemQuantity")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger offerItemQuantity;

            /**
             * Gets the value of the shoppingResponse property.
             * 
             * @return
             *     possible object is
             *     {@link ShoppingResponseOrderType }
             *     
             */
            public ShoppingResponseOrderType getShoppingResponse() {
                return shoppingResponse;
            }

            /**
             * Sets the value of the shoppingResponse property.
             * 
             * @param value
             *     allowed object is
             *     {@link ShoppingResponseOrderType }
             *     
             */
            public void setShoppingResponse(ShoppingResponseOrderType value) {
                this.shoppingResponse = value;
            }

            /**
             * Gets the value of the offerItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offerItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOfferItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderOfferItemType }
             * 
             * 
             */
            public List<OrderOfferItemType> getOfferItem() {
                if (offerItem == null) {
                    offerItem = new ArrayList<OrderOfferItemType>();
                }
                return this.offerItem;
            }

            /**
             * Gets the value of the offerItemQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOfferItemQuantity() {
                return offerItemQuantity;
            }

            /**
             * Sets the value of the offerItemQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOfferItemQuantity(BigInteger value) {
                this.offerItemQuantity = value;
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType"&gt;
         *       &lt;sequence&gt;
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
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "passengers"
        })
        public static class Promotion
            extends PromotionType
        {

            @XmlElement(name = "Passengers")
            protected OrderCreateRQ.Query.Promotion.Passengers passengers;

            /**
             * Gets the value of the passengers property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCreateRQ.Query.Promotion.Passengers }
             *     
             */
            public OrderCreateRQ.Query.Promotion.Passengers getPassengers() {
                return passengers;
            }

            /**
             * Sets the value of the passengers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCreateRQ.Query.Promotion.Passengers }
             *     
             */
            public void setPassengers(OrderCreateRQ.Query.Promotion.Passengers value) {
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

}
