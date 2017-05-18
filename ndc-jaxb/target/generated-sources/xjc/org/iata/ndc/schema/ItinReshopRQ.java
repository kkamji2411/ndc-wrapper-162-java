
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PointOfSale" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ItinReshopParameters" minOccurs="0"/&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="RepriceOnly"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OrderItems" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RepriceAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Reshop"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Actions" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ActionType"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                               &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
 *                                       &lt;element name="OfferItemSets" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="OfferItemSet" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="OrderItems" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TicketDocuments" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Passengers" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                 &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Qualifier" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Preference" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences" minOccurs="0"/&gt;
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
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/&gt;
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
    "itinReshopParameters",
    "query",
    "dataLists"
})
@XmlRootElement(name = "ItinReshopRQ")
public class ItinReshopRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "ItinReshopParameters")
    protected ItinReshopParamsType itinReshopParameters;
    @XmlElement(name = "Query", required = true)
    protected ItinReshopRQ.Query query;
    @XmlElement(name = "DataLists")
    protected DataListType dataLists;
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
     * Gets the value of the itinReshopParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopParamsType }
     *     
     */
    public ItinReshopParamsType getItinReshopParameters() {
        return itinReshopParameters;
    }

    /**
     * Sets the value of the itinReshopParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopParamsType }
     *     
     */
    public void setItinReshopParameters(ItinReshopParamsType value) {
        this.itinReshopParameters = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopRQ.Query }
     *     
     */
    public ItinReshopRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopRQ.Query }
     *     
     */
    public void setQuery(ItinReshopRQ.Query value) {
        this.query = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="RepriceOnly"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OrderItems" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RepriceAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Reshop"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Actions" maxOccurs="unbounded"&gt;
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
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
     *                             &lt;element name="OfferItemSets" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="OfferItemSet" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OrderItems" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TicketDocuments" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Passengers" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                       &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Qualifier" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Preference" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences" minOccurs="0"/&gt;
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
        "repriceOnly",
        "reshop"
    })
    public static class Query {

        @XmlElement(name = "RepriceOnly")
        protected ItinReshopRQ.Query.RepriceOnly repriceOnly;
        @XmlElementWrapper(name = "Reshop")
        @XmlElement(name = "Actions", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ItinReshopRQ.Query.Actions> reshop;

        /**
         * Gets the value of the repriceOnly property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRQ.Query.RepriceOnly }
         *     
         */
        public ItinReshopRQ.Query.RepriceOnly getRepriceOnly() {
            return repriceOnly;
        }

        /**
         * Sets the value of the repriceOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRQ.Query.RepriceOnly }
         *     
         */
        public void setRepriceOnly(ItinReshopRQ.Query.RepriceOnly value) {
            this.repriceOnly = value;
        }

        public List<ItinReshopRQ.Query.Actions> getReshop() {
            if (reshop == null) {
                reshop = new ArrayList<ItinReshopRQ.Query.Actions>();
            }
            return reshop;
        }

        public void setReshop(List<ItinReshopRQ.Query.Actions> reshop) {
            this.reshop = reshop;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
         *         &lt;element name="OfferItemSets" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferItemSet" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrderItems" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TicketDocuments" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Passengers" minOccurs="0"&gt;
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
         *         &lt;element name="Qualifier" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Preference" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences" minOccurs="0"/&gt;
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
            "bookingReferences",
            "orderID",
            "offerItemSets",
            "orderItems",
            "ticketDocuments",
            "passengers",
            "qualifier",
            "preference"
        })
        public static class Actions {

            @XmlElement(name = "ActionType", required = true)
            protected ItinReshopRQ.Query.Actions.ActionType actionType;
            @XmlElementWrapper(name = "BookingReferences")
            @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<BookingReferenceType> bookingReferences;
            @XmlElement(name = "OrderID", required = true)
            protected OrderIDType orderID;
            @XmlElementWrapper(name = "OfferItemSets")
            @XmlElement(name = "OfferItemSet", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<ItinReshopRQ.Query.Actions.OfferItemSet> offerItemSets;
            @XmlElement(name = "OrderItems")
            protected ItinReshopRQ.Query.Actions.OrderItems orderItems;
            @XmlElementWrapper(name = "TicketDocuments")
            @XmlElement(name = "TicketDocument", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<TicketDocumentType> ticketDocuments;
            @XmlElement(name = "Passengers")
            protected ItinReshopRQ.Query.Actions.Passengers passengers;
            @XmlElement(name = "Qualifier")
            protected ItinReshopRQ.Query.Actions.Qualifier qualifier;
            @XmlElement(name = "Preference")
            protected ItinReshopRQ.Query.Actions.Preference preference;

            /**
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.Actions.ActionType }
             *     
             */
            public ItinReshopRQ.Query.Actions.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.Actions.ActionType }
             *     
             */
            public void setActionType(ItinReshopRQ.Query.Actions.ActionType value) {
                this.actionType = value;
            }

            /**
             * Gets the value of the orderID property.
             * 
             * @return
             *     possible object is
             *     {@link OrderIDType }
             *     
             */
            public OrderIDType getOrderID() {
                return orderID;
            }

            /**
             * Sets the value of the orderID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderIDType }
             *     
             */
            public void setOrderID(OrderIDType value) {
                this.orderID = value;
            }

            /**
             * Gets the value of the orderItems property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.Actions.OrderItems }
             *     
             */
            public ItinReshopRQ.Query.Actions.OrderItems getOrderItems() {
                return orderItems;
            }

            /**
             * Sets the value of the orderItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.Actions.OrderItems }
             *     
             */
            public void setOrderItems(ItinReshopRQ.Query.Actions.OrderItems value) {
                this.orderItems = value;
            }

            /**
             * Gets the value of the passengers property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.Actions.Passengers }
             *     
             */
            public ItinReshopRQ.Query.Actions.Passengers getPassengers() {
                return passengers;
            }

            /**
             * Sets the value of the passengers property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.Actions.Passengers }
             *     
             */
            public void setPassengers(ItinReshopRQ.Query.Actions.Passengers value) {
                this.passengers = value;
            }

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.Actions.Qualifier }
             *     
             */
            public ItinReshopRQ.Query.Actions.Qualifier getQualifier() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.Actions.Qualifier }
             *     
             */
            public void setQualifier(ItinReshopRQ.Query.Actions.Qualifier value) {
                this.qualifier = value;
            }

            /**
             * Gets the value of the preference property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.Actions.Preference }
             *     
             */
            public ItinReshopRQ.Query.Actions.Preference getPreference() {
                return preference;
            }

            /**
             * Sets the value of the preference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.Actions.Preference }
             *     
             */
            public void setPreference(ItinReshopRQ.Query.Actions.Preference value) {
                this.preference = value;
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

            public List<ItinReshopRQ.Query.Actions.OfferItemSet> getOfferItemSets() {
                if (offerItemSets == null) {
                    offerItemSets = new ArrayList<ItinReshopRQ.Query.Actions.OfferItemSet>();
                }
                return offerItemSets;
            }

            public void setOfferItemSets(List<ItinReshopRQ.Query.Actions.OfferItemSet> offerItemSets) {
                this.offerItemSets = offerItemSets;
            }

            public List<TicketDocumentType> getTicketDocuments() {
                if (ticketDocuments == null) {
                    ticketDocuments = new ArrayList<TicketDocumentType>();
                }
                return ticketDocuments;
            }

            public void setTicketDocuments(List<TicketDocumentType> ticketDocuments) {
                this.ticketDocuments = ticketDocuments;
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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "offerItem"
            })
            public static class OfferItemSet
                extends KeyWithMetaObjectBaseType
            {

                @XmlElement(name = "OfferItem", required = true)
                protected List<OrderOfferItemType> offerItem;
                @XmlAttribute(name = "SetItemQuantity")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger setItemQuantity;

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
                 * Gets the value of the setItemQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSetItemQuantity() {
                    return setItemQuantity;
                }

                /**
                 * Sets the value of the setItemQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSetItemQuantity(BigInteger value) {
                    this.setItemQuantity = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences" minOccurs="0"/&gt;
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
                "airlinePreferences",
                "alliancePreferences",
                "farePreferences",
                "flightPreferences",
                "pricingMethodPreference",
                "segMaxTimePreferences",
                "servicePricingOnlyPreference",
                "transferPreferences",
                "cabinPreferences"
            })
            public static class Preference {

                @XmlElement(name = "AirlinePreferences")
                protected AirlinePreferencesType airlinePreferences;
                @XmlElement(name = "AlliancePreferences")
                protected AlliancePreferencesType alliancePreferences;
                @XmlElement(name = "FarePreferences")
                protected FarePreferencesType farePreferences;
                @XmlElement(name = "FlightPreferences")
                protected FlightPreferencesType flightPreferences;
                @XmlElement(name = "PricingMethodPreference")
                protected BestPricingPreferencesType pricingMethodPreference;
                @XmlElement(name = "SegMaxTimePreferences")
                protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;
                @XmlElement(name = "ServicePricingOnlyPreference")
                protected ServicePricingOnlyPreference servicePricingOnlyPreference;
                @XmlElement(name = "TransferPreferences")
                protected TransferPreferencesType transferPreferences;
                @XmlElement(name = "CabinPreferences")
                protected CabinPreferencesType cabinPreferences;

                /**
                 * Gets the value of the airlinePreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirlinePreferencesType }
                 *     
                 */
                public AirlinePreferencesType getAirlinePreferences() {
                    return airlinePreferences;
                }

                /**
                 * Sets the value of the airlinePreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirlinePreferencesType }
                 *     
                 */
                public void setAirlinePreferences(AirlinePreferencesType value) {
                    this.airlinePreferences = value;
                }

                /**
                 * Gets the value of the alliancePreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AlliancePreferencesType }
                 *     
                 */
                public AlliancePreferencesType getAlliancePreferences() {
                    return alliancePreferences;
                }

                /**
                 * Sets the value of the alliancePreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AlliancePreferencesType }
                 *     
                 */
                public void setAlliancePreferences(AlliancePreferencesType value) {
                    this.alliancePreferences = value;
                }

                /**
                 * Gets the value of the farePreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FarePreferencesType }
                 *     
                 */
                public FarePreferencesType getFarePreferences() {
                    return farePreferences;
                }

                /**
                 * Sets the value of the farePreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FarePreferencesType }
                 *     
                 */
                public void setFarePreferences(FarePreferencesType value) {
                    this.farePreferences = value;
                }

                /**
                 * Gets the value of the flightPreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightPreferencesType }
                 *     
                 */
                public FlightPreferencesType getFlightPreferences() {
                    return flightPreferences;
                }

                /**
                 * Sets the value of the flightPreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightPreferencesType }
                 *     
                 */
                public void setFlightPreferences(FlightPreferencesType value) {
                    this.flightPreferences = value;
                }

                /**
                 * Gets the value of the pricingMethodPreference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BestPricingPreferencesType }
                 *     
                 */
                public BestPricingPreferencesType getPricingMethodPreference() {
                    return pricingMethodPreference;
                }

                /**
                 * Sets the value of the pricingMethodPreference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BestPricingPreferencesType }
                 *     
                 */
                public void setPricingMethodPreference(BestPricingPreferencesType value) {
                    this.pricingMethodPreference = value;
                }

                /**
                 * Gets the value of the segMaxTimePreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FltSegmentMaxTimePreferencesType }
                 *     
                 */
                public FltSegmentMaxTimePreferencesType getSegMaxTimePreferences() {
                    return segMaxTimePreferences;
                }

                /**
                 * Sets the value of the segMaxTimePreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FltSegmentMaxTimePreferencesType }
                 *     
                 */
                public void setSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
                    this.segMaxTimePreferences = value;
                }

                /**
                 * Gets the value of the servicePricingOnlyPreference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServicePricingOnlyPreference }
                 *     
                 */
                public ServicePricingOnlyPreference getServicePricingOnlyPreference() {
                    return servicePricingOnlyPreference;
                }

                /**
                 * Sets the value of the servicePricingOnlyPreference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServicePricingOnlyPreference }
                 *     
                 */
                public void setServicePricingOnlyPreference(ServicePricingOnlyPreference value) {
                    this.servicePricingOnlyPreference = value;
                }

                /**
                 * Gets the value of the transferPreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransferPreferencesType }
                 *     
                 */
                public TransferPreferencesType getTransferPreferences() {
                    return transferPreferences;
                }

                /**
                 * Sets the value of the transferPreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransferPreferencesType }
                 *     
                 */
                public void setTransferPreferences(TransferPreferencesType value) {
                    this.transferPreferences = value;
                }

                /**
                 * Gets the value of the cabinPreferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CabinPreferencesType }
                 *     
                 */
                public CabinPreferencesType getCabinPreferences() {
                    return cabinPreferences;
                }

                /**
                 * Sets the value of the cabinPreferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CabinPreferencesType }
                 *     
                 */
                public void setCabinPreferences(CabinPreferencesType value) {
                    this.cabinPreferences = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier" minOccurs="0"/&gt;
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
                "baggagePricingQualifier",
                "existingOrderQualifier",
                "paymentCardQualifiers",
                "programQualifiers",
                "promotionQualifiers",
                "seatQualifier",
                "serviceQualifier",
                "socialMediaQualifiers",
                "specialFareQualifiers",
                "specialNeedQualifiers",
                "tripPurposeQualifier"
            })
            public static class Qualifier {

                @XmlElement(name = "BaggagePricingQualifier")
                protected BaggagePricingQualifierType baggagePricingQualifier;
                @XmlElement(name = "ExistingOrderQualifier")
                protected ExistingOrderQualifier existingOrderQualifier;
                @XmlElement(name = "PaymentCardQualifiers")
                protected CardQualifierType paymentCardQualifiers;
                @XmlElement(name = "ProgramQualifiers")
                protected ProgramQualifiers programQualifiers;
                @XmlElement(name = "PromotionQualifiers")
                protected PromotionQualifiers promotionQualifiers;
                @XmlElementWrapper(name = "SeatQualifier")
                @XmlElement(name = "Assignment", namespace = "http://www.iata.org/IATA/EDIST")
                protected List<Assignment> seatQualifier;
                @XmlElement(name = "ServiceQualifier")
                protected ServiceQualifierPriceType serviceQualifier;
                @XmlElement(name = "SocialMediaQualifiers")
                protected SocialQualiferType socialMediaQualifiers;
                @XmlElement(name = "SpecialFareQualifiers")
                protected FareQualifierType specialFareQualifiers;
                @XmlElement(name = "SpecialNeedQualifiers")
                protected SpecialQualiferType specialNeedQualifiers;
                @XmlElement(name = "TripPurposeQualifier")
                @XmlSchemaType(name = "string")
                protected TripPurposeListType tripPurposeQualifier;

                /**
                 * Gets the value of the baggagePricingQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaggagePricingQualifierType }
                 *     
                 */
                public BaggagePricingQualifierType getBaggagePricingQualifier() {
                    return baggagePricingQualifier;
                }

                /**
                 * Sets the value of the baggagePricingQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaggagePricingQualifierType }
                 *     
                 */
                public void setBaggagePricingQualifier(BaggagePricingQualifierType value) {
                    this.baggagePricingQualifier = value;
                }

                /**
                 * Gets the value of the existingOrderQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ExistingOrderQualifier }
                 *     
                 */
                public ExistingOrderQualifier getExistingOrderQualifier() {
                    return existingOrderQualifier;
                }

                /**
                 * Sets the value of the existingOrderQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExistingOrderQualifier }
                 *     
                 */
                public void setExistingOrderQualifier(ExistingOrderQualifier value) {
                    this.existingOrderQualifier = value;
                }

                /**
                 * Gets the value of the paymentCardQualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CardQualifierType }
                 *     
                 */
                public CardQualifierType getPaymentCardQualifiers() {
                    return paymentCardQualifiers;
                }

                /**
                 * Sets the value of the paymentCardQualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CardQualifierType }
                 *     
                 */
                public void setPaymentCardQualifiers(CardQualifierType value) {
                    this.paymentCardQualifiers = value;
                }

                /**
                 * Gets the value of the programQualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProgramQualifiers }
                 *     
                 */
                public ProgramQualifiers getProgramQualifiers() {
                    return programQualifiers;
                }

                /**
                 * Sets the value of the programQualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProgramQualifiers }
                 *     
                 */
                public void setProgramQualifiers(ProgramQualifiers value) {
                    this.programQualifiers = value;
                }

                /**
                 * Gets the value of the promotionQualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PromotionQualifiers }
                 *     
                 */
                public PromotionQualifiers getPromotionQualifiers() {
                    return promotionQualifiers;
                }

                /**
                 * Sets the value of the promotionQualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PromotionQualifiers }
                 *     
                 */
                public void setPromotionQualifiers(PromotionQualifiers value) {
                    this.promotionQualifiers = value;
                }

                /**
                 * Gets the value of the serviceQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServiceQualifierPriceType }
                 *     
                 */
                public ServiceQualifierPriceType getServiceQualifier() {
                    return serviceQualifier;
                }

                /**
                 * Sets the value of the serviceQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServiceQualifierPriceType }
                 *     
                 */
                public void setServiceQualifier(ServiceQualifierPriceType value) {
                    this.serviceQualifier = value;
                }

                /**
                 * Gets the value of the socialMediaQualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SocialQualiferType }
                 *     
                 */
                public SocialQualiferType getSocialMediaQualifiers() {
                    return socialMediaQualifiers;
                }

                /**
                 * Sets the value of the socialMediaQualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SocialQualiferType }
                 *     
                 */
                public void setSocialMediaQualifiers(SocialQualiferType value) {
                    this.socialMediaQualifiers = value;
                }

                /**
                 * Gets the value of the specialFareQualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareQualifierType }
                 *     
                 */
                public FareQualifierType getSpecialFareQualifiers() {
                    return specialFareQualifiers;
                }

                /**
                 * Sets the value of the specialFareQualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareQualifierType }
                 *     
                 */
                public void setSpecialFareQualifiers(FareQualifierType value) {
                    this.specialFareQualifiers = value;
                }

                /**
                 * Gets the value of the specialNeedQualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialQualiferType }
                 *     
                 */
                public SpecialQualiferType getSpecialNeedQualifiers() {
                    return specialNeedQualifiers;
                }

                /**
                 * Sets the value of the specialNeedQualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialQualiferType }
                 *     
                 */
                public void setSpecialNeedQualifiers(SpecialQualiferType value) {
                    this.specialNeedQualifiers = value;
                }

                /**
                 * Gets the value of the tripPurposeQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TripPurposeListType }
                 *     
                 */
                public TripPurposeListType getTripPurposeQualifier() {
                    return tripPurposeQualifier;
                }

                /**
                 * Sets the value of the tripPurposeQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TripPurposeListType }
                 *     
                 */
                public void setTripPurposeQualifier(TripPurposeListType value) {
                    this.tripPurposeQualifier = value;
                }

                public List<Assignment> getSeatQualifier() {
                    if (seatQualifier == null) {
                        seatQualifier = new ArrayList<Assignment>();
                    }
                    return seatQualifier;
                }

                public void setSeatQualifier(List<Assignment> seatQualifier) {
                    this.seatQualifier = seatQualifier;
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
         *         &lt;element name="OrderItems" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RepriceAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "orderItems",
            "orderID",
            "bookingReferences"
        })
        public static class RepriceOnly {

            @XmlElement(name = "OrderItems")
            protected ItinReshopRQ.Query.RepriceOnly.OrderItems orderItems;
            @XmlElement(name = "OrderID", required = true)
            protected OrderIDType orderID;
            @XmlElementWrapper(name = "BookingReferences")
            @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<BookingReferenceType> bookingReferences;
            @XmlAttribute(name = "RepriceAllInd")
            protected Boolean repriceAllInd;

            /**
             * Gets the value of the orderItems property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.RepriceOnly.OrderItems }
             *     
             */
            public ItinReshopRQ.Query.RepriceOnly.OrderItems getOrderItems() {
                return orderItems;
            }

            /**
             * Sets the value of the orderItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.RepriceOnly.OrderItems }
             *     
             */
            public void setOrderItems(ItinReshopRQ.Query.RepriceOnly.OrderItems value) {
                this.orderItems = value;
            }

            /**
             * Gets the value of the orderID property.
             * 
             * @return
             *     possible object is
             *     {@link OrderIDType }
             *     
             */
            public OrderIDType getOrderID() {
                return orderID;
            }

            /**
             * Sets the value of the orderID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderIDType }
             *     
             */
            public void setOrderID(OrderIDType value) {
                this.orderID = value;
            }

            /**
             * Gets the value of the repriceAllInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRepriceAllInd() {
                return repriceAllInd;
            }

            /**
             * Sets the value of the repriceAllInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRepriceAllInd(Boolean value) {
                this.repriceAllInd = value;
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
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType"&gt;
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
                extends OrderItemCoreType
            {


            }

        }

    }

}
