
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PointOfSale" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party"/&gt;
 *         &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST}AirShopReqParamsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Travelers"/&gt;
 *         &lt;element name="CoreQuery"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Affinity"/&gt;
 *                   &lt;element name="OriginDestinations" type="{http://www.iata.org/IATA/EDIST}AirShopReqAttributeQueryType"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSpecific"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseID"/&gt;
 *                 &lt;/choice&gt;
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
 *         &lt;element name="Metadata" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AirShopReqMetadataType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Policies" minOccurs="0"/&gt;
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
    "parameters",
    "travelers",
    "coreQuery",
    "qualifier",
    "preference",
    "metadata",
    "policies"
})
@XmlRootElement(name = "AirShoppingRQ")
public class AirShoppingRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "Parameters")
    protected AirShopReqParamsType parameters;
    @XmlElementWrapper(name = "Travelers", required = true)
    @XmlElement(name = "Traveler", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<TravelersTraveler> travelers;
    @XmlElement(name = "CoreQuery", required = true)
    protected AirShoppingRQ.CoreQuery coreQuery;
    @XmlElement(name = "Qualifier")
    protected AirShoppingRQ.Qualifier qualifier;
    @XmlElement(name = "Preference")
    protected AirShoppingRQ.Preference preference;
    @XmlElement(name = "Metadata")
    protected AirShoppingRQ.Metadata metadata;
    @XmlElementWrapper(name = "Policies")
    @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Policy> policies;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopReqParamsType }
     *     
     */
    public AirShopReqParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopReqParamsType }
     *     
     */
    public void setParameters(AirShopReqParamsType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the coreQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.CoreQuery }
     *     
     */
    public AirShoppingRQ.CoreQuery getCoreQuery() {
        return coreQuery;
    }

    /**
     * Sets the value of the coreQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.CoreQuery }
     *     
     */
    public void setCoreQuery(AirShoppingRQ.CoreQuery value) {
        this.coreQuery = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.Qualifier }
     *     
     */
    public AirShoppingRQ.Qualifier getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.Qualifier }
     *     
     */
    public void setQualifier(AirShoppingRQ.Qualifier value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.Preference }
     *     
     */
    public AirShoppingRQ.Preference getPreference() {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.Preference }
     *     
     */
    public void setPreference(AirShoppingRQ.Preference value) {
        this.preference = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.Metadata }
     *     
     */
    public AirShoppingRQ.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.Metadata }
     *     
     */
    public void setMetadata(AirShoppingRQ.Metadata value) {
        this.metadata = value;
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

    public List<TravelersTraveler> getTravelers() {
        if (travelers == null) {
            travelers = new ArrayList<TravelersTraveler>();
        }
        return travelers;
    }

    public void setTravelers(List<TravelersTraveler> travelers) {
        this.travelers = travelers;
    }

    public List<Policy> getPolicies() {
        if (policies == null) {
            policies = new ArrayList<Policy>();
        }
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Affinity"/&gt;
     *         &lt;element name="OriginDestinations" type="{http://www.iata.org/IATA/EDIST}AirShopReqAttributeQueryType"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSpecific"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseID"/&gt;
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
        "affinity",
        "originDestinations",
        "flightSpecific",
        "shoppingResponseID"
    })
    public static class CoreQuery {

        @XmlElement(name = "Affinity")
        protected AirShopReqAffinityQueryType affinity;
        @XmlElementWrapper(name = "OriginDestinations")
        @XmlElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<AirShopReqAttributeQueryTypeOriginDestination> originDestinations;
        @XmlElement(name = "FlightSpecific")
        protected AirShopFlightSpecificType flightSpecific;
        @XmlElement(name = "ShoppingResponseID")
        protected ShoppingResponseIDType shoppingResponseID;

        /**
         * Gets the value of the affinity property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopReqAffinityQueryType }
         *     
         */
        public AirShopReqAffinityQueryType getAffinity() {
            return affinity;
        }

        /**
         * Sets the value of the affinity property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopReqAffinityQueryType }
         *     
         */
        public void setAffinity(AirShopReqAffinityQueryType value) {
            this.affinity = value;
        }

        /**
         * Gets the value of the flightSpecific property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopFlightSpecificType }
         *     
         */
        public AirShopFlightSpecificType getFlightSpecific() {
            return flightSpecific;
        }

        /**
         * Sets the value of the flightSpecific property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopFlightSpecificType }
         *     
         */
        public void setFlightSpecific(AirShopFlightSpecificType value) {
            this.flightSpecific = value;
        }

        /**
         * Gets the value of the shoppingResponseID property.
         * 
         * @return
         *     possible object is
         *     {@link ShoppingResponseIDType }
         *     
         */
        public ShoppingResponseIDType getShoppingResponseID() {
            return shoppingResponseID;
        }

        /**
         * Sets the value of the shoppingResponseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShoppingResponseIDType }
         *     
         */
        public void setShoppingResponseID(ShoppingResponseIDType value) {
            this.shoppingResponseID = value;
        }

        public List<AirShopReqAttributeQueryTypeOriginDestination> getOriginDestinations() {
            if (originDestinations == null) {
                originDestinations = new ArrayList<AirShopReqAttributeQueryTypeOriginDestination>();
            }
            return originDestinations;
        }

        public void setOriginDestinations(List<AirShopReqAttributeQueryTypeOriginDestination> originDestinations) {
            this.originDestinations = originDestinations;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AirShopReqMetadataType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Metadata
        extends AirShopReqMetadataType
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
