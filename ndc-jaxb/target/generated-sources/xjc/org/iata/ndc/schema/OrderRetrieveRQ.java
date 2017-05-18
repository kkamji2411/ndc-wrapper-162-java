
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderRetrieveParameters" minOccurs="0"/&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Filters"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/&gt;
 *                             &lt;element name="Flight" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
 *                                       &lt;element name="OriginDestination" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Departure"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="AirportCode"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;simpleContent&gt;
 *                                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
 *                                                                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/simpleContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Arrival"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="AirportCode"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;simpleContent&gt;
 *                                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
 *                                                                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/simpleContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Departure"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="AirportCode"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;simpleContent&gt;
 *                                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
 *                                                                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/simpleContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Arrival"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="AirportCode"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;simpleContent&gt;
 *                                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
 *                                                                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/simpleContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
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
 *                                       &lt;element name="Name" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Surname"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectPolicyMetaAttrGroup"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProfileID" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="FQTV" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
 *                                       &lt;element name="PassengerIDInfo" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="FOID" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                                                           &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TicketDocument" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TicketDocNbr"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="14"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
 *                                       &lt;element name="CouponNumber" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;minInclusive value="1"/&gt;
 *                                             &lt;maxInclusive value="4"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Group" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *                                       &lt;element name="TotalPartySize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Payments" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Method" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CardCode" type="{http://www.iata.org/IATA/EDIST}PayCardCodeSimpleType" minOccurs="0"/&gt;
 *                                                 &lt;element name="MaskedCardNumber" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;MaskedCardNmbrSimpleType"&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="TokenizedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="EffectiveExpireDate" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
 *                                                           &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="CardHolderName" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
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
    "orderRetrieveParameters",
    "query"
})
@XmlRootElement(name = "OrderRetrieveRQ")
public class OrderRetrieveRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "OrderRetrieveParameters")
    protected OrdRetrieveParamsType orderRetrieveParameters;
    @XmlElement(name = "Query", required = true)
    protected OrderRetrieveRQ.Query query;
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
     * Gets the value of the orderRetrieveParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrdRetrieveParamsType }
     *     
     */
    public OrdRetrieveParamsType getOrderRetrieveParameters() {
        return orderRetrieveParameters;
    }

    /**
     * Sets the value of the orderRetrieveParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdRetrieveParamsType }
     *     
     */
    public void setOrderRetrieveParameters(OrdRetrieveParamsType value) {
        this.orderRetrieveParameters = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRetrieveRQ.Query }
     *     
     */
    public OrderRetrieveRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRetrieveRQ.Query }
     *     
     */
    public void setQuery(OrderRetrieveRQ.Query value) {
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
     *         &lt;element name="Filters"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/&gt;
     *                   &lt;element name="Flight" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
     *                             &lt;element name="OriginDestination" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Departure"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="AirportCode"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;simpleContent&gt;
     *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
     *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/simpleContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Arrival"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="AirportCode"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;simpleContent&gt;
     *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
     *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/simpleContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Departure"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="AirportCode"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;simpleContent&gt;
     *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
     *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/simpleContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Arrival"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="AirportCode"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;simpleContent&gt;
     *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
     *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/simpleContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Passengers" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Surname"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectPolicyMetaAttrGroup"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProfileID" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="FQTV" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
     *                             &lt;element name="PassengerIDInfo" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="FOID" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                                                 &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                                       &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TicketDocument" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TicketDocNbr"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="14"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
     *                             &lt;element name="CouponNumber" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;minInclusive value="1"/&gt;
     *                                   &lt;maxInclusive value="4"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Group" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
     *                             &lt;element name="TotalPartySize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Payments" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Method" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CardCode" type="{http://www.iata.org/IATA/EDIST}PayCardCodeSimpleType" minOccurs="0"/&gt;
     *                                       &lt;element name="MaskedCardNumber" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;MaskedCardNmbrSimpleType"&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="TokenizedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="EffectiveExpireDate" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
     *                                                 &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="CardHolderName" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
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
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
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
        "filters"
    })
    public static class Query {

        @XmlElement(name = "Filters", required = true)
        protected OrderRetrieveRQ.Query.Filters filters;

        /**
         * Gets the value of the filters property.
         * 
         * @return
         *     possible object is
         *     {@link OrderRetrieveRQ.Query.Filters }
         *     
         */
        public OrderRetrieveRQ.Query.Filters getFilters() {
            return filters;
        }

        /**
         * Sets the value of the filters property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderRetrieveRQ.Query.Filters }
         *     
         */
        public void setFilters(OrderRetrieveRQ.Query.Filters value) {
            this.filters = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/&gt;
         *         &lt;element name="Flight" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
         *                   &lt;element name="OriginDestination" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Departure"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="AirportCode"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;simpleContent&gt;
         *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
         *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/simpleContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Arrival"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="AirportCode"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;simpleContent&gt;
         *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
         *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/simpleContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Departure"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="AirportCode"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;simpleContent&gt;
         *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
         *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/simpleContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Arrival"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="AirportCode"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;simpleContent&gt;
         *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
         *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/simpleContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
         *                   &lt;element name="Name" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Surname"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectPolicyMetaAttrGroup"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProfileID" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FQTV" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
         *                   &lt;element name="PassengerIDInfo" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="FOID" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *                                       &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                             &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TicketDocument" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TicketDocNbr"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="14"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
         *                   &lt;element name="CouponNumber" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;minInclusive value="1"/&gt;
         *                         &lt;maxInclusive value="4"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Group" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
         *                   &lt;element name="TotalPartySize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Payments" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Method" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CardCode" type="{http://www.iata.org/IATA/EDIST}PayCardCodeSimpleType" minOccurs="0"/&gt;
         *                             &lt;element name="MaskedCardNumber" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;MaskedCardNmbrSimpleType"&gt;
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="TokenizedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="EffectiveExpireDate" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
         *                                       &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="CardHolderName" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
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
            "orderID",
            "flight",
            "passengers",
            "ticketDocument",
            "group",
            "payments",
            "bookingReferences"
        })
        public static class Filters {

            @XmlElement(name = "OrderID")
            protected OrderIDType orderID;
            @XmlElement(name = "Flight")
            protected OrderRetrieveRQ.Query.Filters.Flight flight;
            @XmlElement(name = "Passengers")
            protected OrderRetrieveRQ.Query.Filters.Passengers passengers;
            @XmlElement(name = "TicketDocument")
            protected OrderRetrieveRQ.Query.Filters.TicketDocument ticketDocument;
            @XmlElement(name = "Group")
            protected OrderRetrieveRQ.Query.Filters.Group group;
            @XmlElement(name = "Payments")
            protected OrderRetrieveRQ.Query.Filters.Payments payments;
            @XmlElementWrapper(name = "BookingReferences")
            @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<BookingReferenceType> bookingReferences;

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
             * Gets the value of the flight property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRetrieveRQ.Query.Filters.Flight }
             *     
             */
            public OrderRetrieveRQ.Query.Filters.Flight getFlight() {
                return flight;
            }

            /**
             * Sets the value of the flight property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRetrieveRQ.Query.Filters.Flight }
             *     
             */
            public void setFlight(OrderRetrieveRQ.Query.Filters.Flight value) {
                this.flight = value;
            }

            /**
             * Gets the value of the passengers property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRetrieveRQ.Query.Filters.Passengers }
             *     
             */
            public OrderRetrieveRQ.Query.Filters.Passengers getPassengers() {
                return passengers;
            }

            /**
             * Sets the value of the passengers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRetrieveRQ.Query.Filters.Passengers }
             *     
             */
            public void setPassengers(OrderRetrieveRQ.Query.Filters.Passengers value) {
                this.passengers = value;
            }

            /**
             * Gets the value of the ticketDocument property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRetrieveRQ.Query.Filters.TicketDocument }
             *     
             */
            public OrderRetrieveRQ.Query.Filters.TicketDocument getTicketDocument() {
                return ticketDocument;
            }

            /**
             * Sets the value of the ticketDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRetrieveRQ.Query.Filters.TicketDocument }
             *     
             */
            public void setTicketDocument(OrderRetrieveRQ.Query.Filters.TicketDocument value) {
                this.ticketDocument = value;
            }

            /**
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRetrieveRQ.Query.Filters.Group }
             *     
             */
            public OrderRetrieveRQ.Query.Filters.Group getGroup() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRetrieveRQ.Query.Filters.Group }
             *     
             */
            public void setGroup(OrderRetrieveRQ.Query.Filters.Group value) {
                this.group = value;
            }

            /**
             * Gets the value of the payments property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRetrieveRQ.Query.Filters.Payments }
             *     
             */
            public OrderRetrieveRQ.Query.Filters.Payments getPayments() {
                return payments;
            }

            /**
             * Sets the value of the payments property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRetrieveRQ.Query.Filters.Payments }
             *     
             */
            public void setPayments(OrderRetrieveRQ.Query.Filters.Payments value) {
                this.payments = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
             *         &lt;element name="OriginDestination" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Departure"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="AirportCode"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;simpleContent&gt;
             *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
             *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/simpleContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Arrival"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="AirportCode"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;simpleContent&gt;
             *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
             *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/simpleContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Departure"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="AirportCode"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;simpleContent&gt;
             *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
             *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/simpleContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Arrival"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="AirportCode"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;simpleContent&gt;
             *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
             *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/simpleContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                "classOfService",
                "fareBasisCode",
                "originDestination",
                "segment"
            })
            public static class Flight {

                @XmlElement(name = "ClassOfService")
                protected FlightCOSCoreType classOfService;
                @XmlElement(name = "FareBasisCode")
                protected FareBasisCodeType fareBasisCode;
                @XmlElement(name = "OriginDestination")
                protected OrderRetrieveRQ.Query.Filters.Flight.OriginDestination originDestination;
                @XmlElement(name = "Segment")
                protected List<OrderRetrieveRQ.Query.Filters.Flight.Segment> segment;

                /**
                 * Gets the value of the classOfService property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightCOSCoreType }
                 *     
                 */
                public FlightCOSCoreType getClassOfService() {
                    return classOfService;
                }

                /**
                 * Sets the value of the classOfService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightCOSCoreType }
                 *     
                 */
                public void setClassOfService(FlightCOSCoreType value) {
                    this.classOfService = value;
                }

                /**
                 * Gets the value of the fareBasisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareBasisCodeType }
                 *     
                 */
                public FareBasisCodeType getFareBasisCode() {
                    return fareBasisCode;
                }

                /**
                 * Sets the value of the fareBasisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareBasisCodeType }
                 *     
                 */
                public void setFareBasisCode(FareBasisCodeType value) {
                    this.fareBasisCode = value;
                }

                /**
                 * Gets the value of the originDestination property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination }
                 *     
                 */
                public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination getOriginDestination() {
                    return originDestination;
                }

                /**
                 * Sets the value of the originDestination property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination }
                 *     
                 */
                public void setOriginDestination(OrderRetrieveRQ.Query.Filters.Flight.OriginDestination value) {
                    this.originDestination = value;
                }

                /**
                 * Gets the value of the segment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the segment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSegment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OrderRetrieveRQ.Query.Filters.Flight.Segment }
                 * 
                 * 
                 */
                public List<OrderRetrieveRQ.Query.Filters.Flight.Segment> getSegment() {
                    if (segment == null) {
                        segment = new ArrayList<OrderRetrieveRQ.Query.Filters.Flight.Segment>();
                    }
                    return this.segment;
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
                 *         &lt;element name="Departure"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="AirportCode"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;simpleContent&gt;
                 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/simpleContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Arrival"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="AirportCode"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;simpleContent&gt;
                 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/simpleContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "departure",
                    "arrival"
                })
                public static class OriginDestination {

                    @XmlElement(name = "Departure", required = true)
                    protected OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure departure;
                    @XmlElement(name = "Arrival", required = true)
                    protected OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival arrival;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

                    /**
                     * Gets the value of the departure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure getDeparture() {
                        return departure;
                    }

                    /**
                     * Sets the value of the departure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure }
                     *     
                     */
                    public void setDeparture(OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure value) {
                        this.departure = value;
                    }

                    /**
                     * Gets the value of the arrival property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival getArrival() {
                        return arrival;
                    }

                    /**
                     * Sets the value of the arrival property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival }
                     *     
                     */
                    public void setArrival(OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival value) {
                        this.arrival = value;
                    }

                    /**
                     * Gets the value of the refs property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the refs property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRefs().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getRefs() {
                        if (refs == null) {
                            refs = new ArrayList<Object>();
                        }
                        return this.refs;
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
                     *         &lt;element name="AirportCode"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;simpleContent&gt;
                     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                     *               &lt;/extension&gt;
                     *             &lt;/simpleContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                        "airportCode",
                        "date"
                    })
                    public static class Arrival {

                        @XmlElement(name = "AirportCode", required = true)
                        protected OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode }
                         *     
                         */
                        public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode value) {
                            this.airportCode = value;
                        }

                        /**
                         * Gets the value of the date property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * Sets the value of the date property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
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
                        public static class AirportCode {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Application")
                            protected String application;
                            @XmlAttribute(name = "Area")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger area;
                            @XmlAttribute(name = "UOM")
                            protected DistanceUnitListType uom;

                            /**
                             * Examples: JFK, NYC
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
                             * Gets the value of the application property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getApplication() {
                                return application;
                            }

                            /**
                             * Sets the value of the application property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setApplication(String value) {
                                this.application = value;
                            }

                            /**
                             * Gets the value of the area property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getArea() {
                                return area;
                            }

                            /**
                             * Sets the value of the area property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setArea(BigInteger value) {
                                this.area = value;
                            }

                            /**
                             * Gets the value of the uom property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public DistanceUnitListType getUOM() {
                                return uom;
                            }

                            /**
                             * Sets the value of the uom property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public void setUOM(DistanceUnitListType value) {
                                this.uom = value;
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
                     *         &lt;element name="AirportCode"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;simpleContent&gt;
                     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                     *               &lt;/extension&gt;
                     *             &lt;/simpleContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                        "airportCode",
                        "date"
                    })
                    public static class Departure {

                        @XmlElement(name = "AirportCode", required = true)
                        protected OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode }
                         *     
                         */
                        public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode value) {
                            this.airportCode = value;
                        }

                        /**
                         * Gets the value of the date property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * Sets the value of the date property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
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
                        public static class AirportCode {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Application")
                            protected String application;
                            @XmlAttribute(name = "Area")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger area;
                            @XmlAttribute(name = "UOM")
                            protected DistanceUnitListType uom;

                            /**
                             * Examples: JFK, NYC
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
                             * Gets the value of the application property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getApplication() {
                                return application;
                            }

                            /**
                             * Sets the value of the application property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setApplication(String value) {
                                this.application = value;
                            }

                            /**
                             * Gets the value of the area property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getArea() {
                                return area;
                            }

                            /**
                             * Sets the value of the area property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setArea(BigInteger value) {
                                this.area = value;
                            }

                            /**
                             * Gets the value of the uom property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public DistanceUnitListType getUOM() {
                                return uom;
                            }

                            /**
                             * Sets the value of the uom property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public void setUOM(DistanceUnitListType value) {
                                this.uom = value;
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
                 *         &lt;element name="Departure"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="AirportCode"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;simpleContent&gt;
                 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/simpleContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Arrival"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="AirportCode"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;simpleContent&gt;
                 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/simpleContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "departure",
                    "arrival"
                })
                public static class Segment {

                    @XmlElement(name = "Departure", required = true)
                    protected OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure departure;
                    @XmlElement(name = "Arrival", required = true)
                    protected OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival arrival;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

                    /**
                     * Gets the value of the departure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure getDeparture() {
                        return departure;
                    }

                    /**
                     * Sets the value of the departure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure }
                     *     
                     */
                    public void setDeparture(OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure value) {
                        this.departure = value;
                    }

                    /**
                     * Gets the value of the arrival property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival getArrival() {
                        return arrival;
                    }

                    /**
                     * Sets the value of the arrival property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival }
                     *     
                     */
                    public void setArrival(OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival value) {
                        this.arrival = value;
                    }

                    /**
                     * Gets the value of the refs property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the refs property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRefs().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getRefs() {
                        if (refs == null) {
                            refs = new ArrayList<Object>();
                        }
                        return this.refs;
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
                     *         &lt;element name="AirportCode"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;simpleContent&gt;
                     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                     *               &lt;/extension&gt;
                     *             &lt;/simpleContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                        "airportCode",
                        "date"
                    })
                    public static class Arrival {

                        @XmlElement(name = "AirportCode", required = true)
                        protected OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode }
                         *     
                         */
                        public OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode value) {
                            this.airportCode = value;
                        }

                        /**
                         * Gets the value of the date property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * Sets the value of the date property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
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
                        public static class AirportCode {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Application")
                            protected String application;
                            @XmlAttribute(name = "Area")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger area;
                            @XmlAttribute(name = "UOM")
                            protected DistanceUnitListType uom;

                            /**
                             * Examples: JFK, NYC
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
                             * Gets the value of the application property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getApplication() {
                                return application;
                            }

                            /**
                             * Sets the value of the application property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setApplication(String value) {
                                this.application = value;
                            }

                            /**
                             * Gets the value of the area property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getArea() {
                                return area;
                            }

                            /**
                             * Sets the value of the area property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setArea(BigInteger value) {
                                this.area = value;
                            }

                            /**
                             * Gets the value of the uom property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public DistanceUnitListType getUOM() {
                                return uom;
                            }

                            /**
                             * Sets the value of the uom property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public void setUOM(DistanceUnitListType value) {
                                this.uom = value;
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
                     *         &lt;element name="AirportCode"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;simpleContent&gt;
                     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
                     *               &lt;/extension&gt;
                     *             &lt;/simpleContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                        "airportCode",
                        "date"
                    })
                    public static class Departure {

                        @XmlElement(name = "AirportCode", required = true)
                        protected OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode }
                         *     
                         */
                        public OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode value) {
                            this.airportCode = value;
                        }

                        /**
                         * Gets the value of the date property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * Sets the value of the date property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirportCitySimpleType"&gt;
                         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/&gt;
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
                        public static class AirportCode {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Application")
                            protected String application;
                            @XmlAttribute(name = "Area")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger area;
                            @XmlAttribute(name = "UOM")
                            protected DistanceUnitListType uom;

                            /**
                             * Examples: JFK, NYC
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
                             * Gets the value of the application property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getApplication() {
                                return application;
                            }

                            /**
                             * Sets the value of the application property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setApplication(String value) {
                                this.application = value;
                            }

                            /**
                             * Gets the value of the area property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getArea() {
                                return area;
                            }

                            /**
                             * Sets the value of the area property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setArea(BigInteger value) {
                                this.area = value;
                            }

                            /**
                             * Gets the value of the uom property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public DistanceUnitListType getUOM() {
                                return uom;
                            }

                            /**
                             * Sets the value of the uom property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link DistanceUnitListType }
                             *     
                             */
                            public void setUOM(DistanceUnitListType value) {
                                this.uom = value;
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
             *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
             *         &lt;element name="TotalPartySize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
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
                "name",
                "totalPartySize",
                "contacts"
            })
            public static class Group {

                @XmlElement(name = "Name")
                protected String name;
                @XmlElement(name = "TotalPartySize")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger totalPartySize;
                @XmlElementWrapper(name = "Contacts")
                @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST")
                protected List<Contact> contacts;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the totalPartySize property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotalPartySize() {
                    return totalPartySize;
                }

                /**
                 * Sets the value of the totalPartySize property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotalPartySize(BigInteger value) {
                    this.totalPartySize = value;
                }

                public List<Contact> getContacts() {
                    if (contacts == null) {
                        contacts = new ArrayList<Contact>();
                    }
                    return contacts;
                }

                public void setContacts(List<Contact> contacts) {
                    this.contacts = contacts;
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
             *         &lt;element name="Name" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Surname"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectPolicyMetaAttrGroup"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProfileID" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="FQTV" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
             *         &lt;element name="PassengerIDInfo" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="FOID" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
             *                             &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *                   &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
                "name",
                "profileID",
                "fqtv",
                "contacts",
                "passengerIDInfo"
            })
            public static class Passengers {

                @XmlElement(name = "Name")
                protected OrderRetrieveRQ.Query.Filters.Passengers.Name name;
                @XmlElement(name = "ProfileID")
                protected OrderRetrieveRQ.Query.Filters.Passengers.ProfileID profileID;
                @XmlElement(name = "FQTV")
                protected TravelerFQTVType fqtv;
                @XmlElementWrapper(name = "Contacts")
                @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST")
                protected List<Contact> contacts;
                @XmlElement(name = "PassengerIDInfo")
                protected OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo passengerIDInfo;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Passengers.Name }
                 *     
                 */
                public OrderRetrieveRQ.Query.Filters.Passengers.Name getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Passengers.Name }
                 *     
                 */
                public void setName(OrderRetrieveRQ.Query.Filters.Passengers.Name value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the profileID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Passengers.ProfileID }
                 *     
                 */
                public OrderRetrieveRQ.Query.Filters.Passengers.ProfileID getProfileID() {
                    return profileID;
                }

                /**
                 * Sets the value of the profileID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Passengers.ProfileID }
                 *     
                 */
                public void setProfileID(OrderRetrieveRQ.Query.Filters.Passengers.ProfileID value) {
                    this.profileID = value;
                }

                /**
                 * Gets the value of the fqtv property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelerFQTVType }
                 *     
                 */
                public TravelerFQTVType getFQTV() {
                    return fqtv;
                }

                /**
                 * Sets the value of the fqtv property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelerFQTVType }
                 *     
                 */
                public void setFQTV(TravelerFQTVType value) {
                    this.fqtv = value;
                }

                /**
                 * Gets the value of the passengerIDInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo }
                 *     
                 */
                public OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo getPassengerIDInfo() {
                    return passengerIDInfo;
                }

                /**
                 * Sets the value of the passengerIDInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo }
                 *     
                 */
                public void setPassengerIDInfo(OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo value) {
                    this.passengerIDInfo = value;
                }

                public List<Contact> getContacts() {
                    if (contacts == null) {
                        contacts = new ArrayList<Contact>();
                    }
                    return contacts;
                }

                public void setContacts(List<Contact> contacts) {
                    this.contacts = contacts;
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
                 *         &lt;element name="Surname"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectPolicyMetaAttrGroup"/&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "surname",
                    "given",
                    "middle"
                })
                public static class Name {

                    @XmlElement(name = "Surname", required = true)
                    protected OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname surname;
                    @XmlElement(name = "Given")
                    protected List<OrderRetrieveRQ.Query.Filters.Passengers.Name.Given> given;
                    @XmlElement(name = "Middle")
                    protected List<OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle> middle;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;
                    @XmlAttribute(name = "ObjectMetaReferences")
                    @XmlIDREF
                    protected List<Object> objectMetaReferences;

                    /**
                     * Gets the value of the surname property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname getSurname() {
                        return surname;
                    }

                    /**
                     * Sets the value of the surname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname }
                     *     
                     */
                    public void setSurname(OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname value) {
                        this.surname = value;
                    }

                    /**
                     * Gets the value of the given property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the given property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getGiven().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Given }
                     * 
                     * 
                     */
                    public List<OrderRetrieveRQ.Query.Filters.Passengers.Name.Given> getGiven() {
                        if (given == null) {
                            given = new ArrayList<OrderRetrieveRQ.Query.Filters.Passengers.Name.Given>();
                        }
                        return this.given;
                    }

                    /**
                     * Gets the value of the middle property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the middle property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMiddle().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle }
                     * 
                     * 
                     */
                    public List<OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle> getMiddle() {
                        if (middle == null) {
                            middle = new ArrayList<OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle>();
                        }
                        return this.middle;
                    }

                    /**
                     * Gets the value of the refs property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the refs property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRefs().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getRefs() {
                        if (refs == null) {
                            refs = new ArrayList<Object>();
                        }
                        return this.refs;
                    }

                    /**
                     * Gets the value of the objectMetaReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the objectMetaReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getObjectMetaReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getObjectMetaReferences() {
                        if (objectMetaReferences == null) {
                            objectMetaReferences = new ArrayList<Object>();
                        }
                        return this.objectMetaReferences;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                    public static class Given {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

                        /**
                         * A data type for Proper Name size constraint.
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
                         * Gets the value of the refs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the refs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRefs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getRefs() {
                            if (refs == null) {
                                refs = new ArrayList<Object>();
                            }
                            return this.refs;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                    public static class Middle {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

                        /**
                         * Gets the value of the value property.
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
                         * Gets the value of the refs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the refs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRefs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getRefs() {
                            if (refs == null) {
                                refs = new ArrayList<Object>();
                            }
                            return this.refs;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                    public static class Surname {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

                        /**
                         * A data type for Proper Name size constraint.
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
                         * Gets the value of the refs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the refs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRefs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getRefs() {
                            if (refs == null) {
                                refs = new ArrayList<Object>();
                            }
                            return this.refs;
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
                 *         &lt;element name="FOID" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
                 *                   &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
                 *         &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "foid",
                    "dateOfIssue",
                    "dateOfExpiration",
                    "countryOfIssuance",
                    "applicabilityLocation",
                    "countryOfResidence"
                })
                public static class PassengerIDInfo {

                    @XmlElement(name = "FOID")
                    protected OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID foid;
                    @XmlElement(name = "DateOfIssue")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dateOfIssue;
                    @XmlElement(name = "DateOfExpiration")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dateOfExpiration;
                    @XmlElement(name = "CountryOfIssuance")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar countryOfIssuance;
                    @XmlElement(name = "ApplicabilityLocation")
                    protected String applicabilityLocation;
                    @XmlElement(name = "CountryOfResidence")
                    protected String countryOfResidence;
                    @XmlAttribute(name = "AllowDocumentInd")
                    protected Boolean allowDocumentInd;

                    /**
                     * Gets the value of the foid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID getFOID() {
                        return foid;
                    }

                    /**
                     * Sets the value of the foid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID }
                     *     
                     */
                    public void setFOID(OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID value) {
                        this.foid = value;
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
                     * Gets the value of the dateOfExpiration property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDateOfExpiration() {
                        return dateOfExpiration;
                    }

                    /**
                     * Sets the value of the dateOfExpiration property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDateOfExpiration(XMLGregorianCalendar value) {
                        this.dateOfExpiration = value;
                    }

                    /**
                     * Gets the value of the countryOfIssuance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getCountryOfIssuance() {
                        return countryOfIssuance;
                    }

                    /**
                     * Sets the value of the countryOfIssuance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setCountryOfIssuance(XMLGregorianCalendar value) {
                        this.countryOfIssuance = value;
                    }

                    /**
                     * Gets the value of the applicabilityLocation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getApplicabilityLocation() {
                        return applicabilityLocation;
                    }

                    /**
                     * Sets the value of the applicabilityLocation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setApplicabilityLocation(String value) {
                        this.applicabilityLocation = value;
                    }

                    /**
                     * Gets the value of the countryOfResidence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryOfResidence() {
                        return countryOfResidence;
                    }

                    /**
                     * Sets the value of the countryOfResidence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryOfResidence(String value) {
                        this.countryOfResidence = value;
                    }

                    /**
                     * Gets the value of the allowDocumentInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isAllowDocumentInd() {
                        return allowDocumentInd;
                    }

                    /**
                     * Sets the value of the allowDocumentInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setAllowDocumentInd(Boolean value) {
                        this.allowDocumentInd = value;
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
                     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
                     *         &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
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
                        "type",
                        "id"
                    })
                    public static class FOID
                        extends KeyWithMetaObjectBaseType
                    {

                        @XmlElement(name = "Type", required = true)
                        protected String type;
                        @XmlElement(name = "ID", required = true)
                        protected String id;

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
                         * Gets the value of the id property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getID() {
                            return id;
                        }

                        /**
                         * Sets the value of the id property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setID(String value) {
                            this.id = value;
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
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                public static class ProfileID {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

                    /**
                     * Gets the value of the value property.
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
                     * Gets the value of the refs property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the refs property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRefs().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getRefs() {
                        if (refs == null) {
                            refs = new ArrayList<Object>();
                        }
                        return this.refs;
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
             *         &lt;element name="Method" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CardCode" type="{http://www.iata.org/IATA/EDIST}PayCardCodeSimpleType" minOccurs="0"/&gt;
             *                   &lt;element name="MaskedCardNumber" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;MaskedCardNmbrSimpleType"&gt;
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="TokenizedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="EffectiveExpireDate" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
             *                             &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="CardHolderName" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                "method"
            })
            public static class Payments {

                @XmlElement(name = "Method")
                protected OrderRetrieveRQ.Query.Filters.Payments.Method method;

                /**
                 * Gets the value of the method property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method }
                 *     
                 */
                public OrderRetrieveRQ.Query.Filters.Payments.Method getMethod() {
                    return method;
                }

                /**
                 * Sets the value of the method property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method }
                 *     
                 */
                public void setMethod(OrderRetrieveRQ.Query.Filters.Payments.Method value) {
                    this.method = value;
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
                 *         &lt;element name="CardCode" type="{http://www.iata.org/IATA/EDIST}PayCardCodeSimpleType" minOccurs="0"/&gt;
                 *         &lt;element name="MaskedCardNumber" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;MaskedCardNmbrSimpleType"&gt;
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="TokenizedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="EffectiveExpireDate" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
                 *                   &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="CardHolderName" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                    "cardCode",
                    "maskedCardNumber",
                    "tokenizedCardNumber",
                    "effectiveExpireDate",
                    "cardHolderName"
                })
                public static class Method
                    extends KeyWithMetaObjectBaseType
                {

                    @XmlElement(name = "CardCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String cardCode;
                    @XmlElement(name = "MaskedCardNumber")
                    protected OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber maskedCardNumber;
                    @XmlElement(name = "TokenizedCardNumber")
                    protected String tokenizedCardNumber;
                    @XmlElement(name = "EffectiveExpireDate")
                    protected OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate effectiveExpireDate;
                    @XmlElement(name = "CardHolderName")
                    protected OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName cardHolderName;

                    /**
                     * Gets the value of the cardCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardCode() {
                        return cardCode;
                    }

                    /**
                     * Sets the value of the cardCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardCode(String value) {
                        this.cardCode = value;
                    }

                    /**
                     * Gets the value of the maskedCardNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber getMaskedCardNumber() {
                        return maskedCardNumber;
                    }

                    /**
                     * Sets the value of the maskedCardNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber }
                     *     
                     */
                    public void setMaskedCardNumber(OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber value) {
                        this.maskedCardNumber = value;
                    }

                    /**
                     * Gets the value of the tokenizedCardNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTokenizedCardNumber() {
                        return tokenizedCardNumber;
                    }

                    /**
                     * Sets the value of the tokenizedCardNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTokenizedCardNumber(String value) {
                        this.tokenizedCardNumber = value;
                    }

                    /**
                     * Gets the value of the effectiveExpireDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate getEffectiveExpireDate() {
                        return effectiveExpireDate;
                    }

                    /**
                     * Sets the value of the effectiveExpireDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate }
                     *     
                     */
                    public void setEffectiveExpireDate(OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate value) {
                        this.effectiveExpireDate = value;
                    }

                    /**
                     * Gets the value of the cardHolderName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName }
                     *     
                     */
                    public OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName getCardHolderName() {
                        return cardHolderName;
                    }

                    /**
                     * Sets the value of the cardHolderName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName }
                     *     
                     */
                    public void setCardHolderName(OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName value) {
                        this.cardHolderName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                    public static class CardHolderName {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

                        /**
                         * A data type for Proper Name size constraint.
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
                         * Gets the value of the refs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the refs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRefs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getRefs() {
                            if (refs == null) {
                                refs = new ArrayList<Object>();
                            }
                            return this.refs;
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
                     *         &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
                     *         &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}PayCardDateSimpleType" minOccurs="0"/&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "effective",
                        "expiration"
                    })
                    public static class EffectiveExpireDate {

                        @XmlElement(name = "Effective")
                        protected String effective;
                        @XmlElement(name = "Expiration")
                        protected String expiration;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

                        /**
                         * Gets the value of the effective property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEffective() {
                            return effective;
                        }

                        /**
                         * Sets the value of the effective property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEffective(String value) {
                            this.effective = value;
                        }

                        /**
                         * Gets the value of the expiration property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExpiration() {
                            return expiration;
                        }

                        /**
                         * Sets the value of the expiration property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExpiration(String value) {
                            this.expiration = value;
                        }

                        /**
                         * Gets the value of the refs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the refs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRefs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getRefs() {
                            if (refs == null) {
                                refs = new ArrayList<Object>();
                            }
                            return this.refs;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;MaskedCardNmbrSimpleType"&gt;
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
                    public static class MaskedCardNumber {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

                        /**
                         * A data type for a Masked Payment Card Number constraint.
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
                         * Gets the value of the refs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the refs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRefs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getRefs() {
                            if (refs == null) {
                                refs = new ArrayList<Object>();
                            }
                            return this.refs;
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
             *         &lt;element name="TicketDocNbr"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="14"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
             *         &lt;element name="CouponNumber" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *               &lt;minInclusive value="1"/&gt;
             *               &lt;maxInclusive value="4"/&gt;
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
            @XmlType(name = "", propOrder = {
                "ticketDocNbr",
                "dateOfIssue",
                "ticketingLocation",
                "couponNumber"
            })
            public static class TicketDocument {

                @XmlElement(name = "TicketDocNbr", required = true)
                protected String ticketDocNbr;
                @XmlElement(name = "DateOfIssue")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateOfIssue;
                @XmlElement(name = "TicketingLocation")
                protected String ticketingLocation;
                @XmlElement(name = "CouponNumber")
                protected Integer couponNumber;

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
                 * Gets the value of the couponNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCouponNumber() {
                    return couponNumber;
                }

                /**
                 * Sets the value of the couponNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCouponNumber(Integer value) {
                    this.couponNumber = value;
                }

            }

        }

    }

}
