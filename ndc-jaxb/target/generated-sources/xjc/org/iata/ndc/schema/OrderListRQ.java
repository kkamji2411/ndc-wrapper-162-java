
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderListParameters" minOccurs="0"/&gt;
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
 *                             &lt;element name="Agency" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/&gt;
 *                                       &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *                                       &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Airline" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID" minOccurs="0"/&gt;
 *                                       &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
 *                             &lt;element name="CancelDateRange" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CreateDateRange" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Flight" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
 *                                       &lt;element name="Arrival" minOccurs="0"&gt;
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
 *                                       &lt;element name="Departure" minOccurs="0"&gt;
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
 *                                                 &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}EmailAddress" minOccurs="0"/&gt;
 *                                       &lt;element name="PhoneNbrValue" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                               &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
 *                                               &lt;attribute name="AreaCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
 *                                               &lt;attribute name="Extension" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
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
 *                                       &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType" minOccurs="0"/&gt;
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
 *                                       &lt;element name="Status" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusListType"&gt;
 *                                               &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
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
 *                                       &lt;element name="IssueDateRange" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TicketDocNbr" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="14"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
 *                                       &lt;element name="CouponNumber" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;minInclusive value="1"/&gt;
 *                                             &lt;maxInclusive value="4"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Status" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TicketDesigAppListType"&gt;
 *                                               &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TravelDateRange" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Service" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Description" minOccurs="0"/&gt;
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
    "orderListParameters",
    "query"
})
@XmlRootElement(name = "OrderListRQ")
public class OrderListRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "OrderListParameters")
    protected OrderListParamsType orderListParameters;
    @XmlElement(name = "Query", required = true)
    protected OrderListRQ.Query query;
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
     * Gets the value of the orderListParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrderListParamsType }
     *     
     */
    public OrderListParamsType getOrderListParameters() {
        return orderListParameters;
    }

    /**
     * Sets the value of the orderListParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderListParamsType }
     *     
     */
    public void setOrderListParameters(OrderListParamsType value) {
        this.orderListParameters = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link OrderListRQ.Query }
     *     
     */
    public OrderListRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderListRQ.Query }
     *     
     */
    public void setQuery(OrderListRQ.Query value) {
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
     *                   &lt;element name="Agency" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/&gt;
     *                             &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
     *                             &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Airline" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID" minOccurs="0"/&gt;
     *                             &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
     *                   &lt;element name="CancelDateRange" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CreateDateRange" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Flight" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
     *                             &lt;element name="Arrival" minOccurs="0"&gt;
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
     *                             &lt;element name="Departure" minOccurs="0"&gt;
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
     *                                       &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}EmailAddress" minOccurs="0"/&gt;
     *                             &lt;element name="PhoneNbrValue" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                     &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
     *                                     &lt;attribute name="AreaCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
     *                                     &lt;attribute name="Extension" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
     *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType" minOccurs="0"/&gt;
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
     *                             &lt;element name="Status" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusListType"&gt;
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
     *                   &lt;element name="TicketDocument" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IssueDateRange" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TicketDocNbr" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="14"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
     *                             &lt;element name="CouponNumber" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;minInclusive value="1"/&gt;
     *                                   &lt;maxInclusive value="4"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Status" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TicketDesigAppListType"&gt;
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
     *                   &lt;element name="TravelDateRange" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Service" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Description" minOccurs="0"/&gt;
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
        "filters"
    })
    public static class Query {

        @XmlElement(name = "Filters", required = true)
        protected OrderListRQ.Query.Filters filters;

        /**
         * Gets the value of the filters property.
         * 
         * @return
         *     possible object is
         *     {@link OrderListRQ.Query.Filters }
         *     
         */
        public OrderListRQ.Query.Filters getFilters() {
            return filters;
        }

        /**
         * Sets the value of the filters property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderListRQ.Query.Filters }
         *     
         */
        public void setFilters(OrderListRQ.Query.Filters value) {
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
         *         &lt;element name="Agency" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/&gt;
         *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
         *                   &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Airline" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID" minOccurs="0"/&gt;
         *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
         *         &lt;element name="CancelDateRange" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CreateDateRange" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Flight" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
         *                   &lt;element name="Arrival" minOccurs="0"&gt;
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
         *                   &lt;element name="Departure" minOccurs="0"&gt;
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
         *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EmailAddress" minOccurs="0"/&gt;
         *                   &lt;element name="PhoneNbrValue" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                           &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
         *                           &lt;attribute name="AreaCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
         *                           &lt;attribute name="Extension" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
         *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType" minOccurs="0"/&gt;
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
         *                   &lt;element name="Status" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusListType"&gt;
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
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
         *                   &lt;element name="IssueDateRange" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TicketDocNbr" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="14"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
         *                   &lt;element name="CouponNumber" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;minInclusive value="1"/&gt;
         *                         &lt;maxInclusive value="4"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Status" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TicketDesigAppListType"&gt;
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TravelDateRange" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Service" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Description" minOccurs="0"/&gt;
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
            "agency",
            "airline",
            "bookingReferences",
            "cancelDateRange",
            "createDateRange",
            "flight",
            "group",
            "passengers",
            "payments",
            "ticketDocument",
            "travelDateRange",
            "service"
        })
        public static class Filters {

            @XmlElement(name = "Agency")
            protected OrderListRQ.Query.Filters.Agency agency;
            @XmlElement(name = "Airline")
            protected OrderListRQ.Query.Filters.Airline airline;
            @XmlElementWrapper(name = "BookingReferences")
            @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<BookingReferenceType> bookingReferences;
            @XmlElement(name = "CancelDateRange")
            protected OrderListRQ.Query.Filters.CancelDateRange cancelDateRange;
            @XmlElement(name = "CreateDateRange")
            protected OrderListRQ.Query.Filters.CreateDateRange createDateRange;
            @XmlElement(name = "Flight")
            protected OrderListRQ.Query.Filters.Flight flight;
            @XmlElement(name = "Group")
            protected OrderListRQ.Query.Filters.Group group;
            @XmlElement(name = "Passengers")
            protected OrderListRQ.Query.Filters.Passengers passengers;
            @XmlElement(name = "Payments")
            protected OrderListRQ.Query.Filters.Payments payments;
            @XmlElement(name = "TicketDocument")
            protected OrderListRQ.Query.Filters.TicketDocument ticketDocument;
            @XmlElement(name = "TravelDateRange")
            protected OrderListRQ.Query.Filters.TravelDateRange travelDateRange;
            @XmlElement(name = "Service")
            protected OrderListRQ.Query.Filters.Service service;

            /**
             * Gets the value of the agency property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Agency }
             *     
             */
            public OrderListRQ.Query.Filters.Agency getAgency() {
                return agency;
            }

            /**
             * Sets the value of the agency property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Agency }
             *     
             */
            public void setAgency(OrderListRQ.Query.Filters.Agency value) {
                this.agency = value;
            }

            /**
             * Gets the value of the airline property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Airline }
             *     
             */
            public OrderListRQ.Query.Filters.Airline getAirline() {
                return airline;
            }

            /**
             * Sets the value of the airline property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Airline }
             *     
             */
            public void setAirline(OrderListRQ.Query.Filters.Airline value) {
                this.airline = value;
            }

            /**
             * Gets the value of the cancelDateRange property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.CancelDateRange }
             *     
             */
            public OrderListRQ.Query.Filters.CancelDateRange getCancelDateRange() {
                return cancelDateRange;
            }

            /**
             * Sets the value of the cancelDateRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.CancelDateRange }
             *     
             */
            public void setCancelDateRange(OrderListRQ.Query.Filters.CancelDateRange value) {
                this.cancelDateRange = value;
            }

            /**
             * Gets the value of the createDateRange property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.CreateDateRange }
             *     
             */
            public OrderListRQ.Query.Filters.CreateDateRange getCreateDateRange() {
                return createDateRange;
            }

            /**
             * Sets the value of the createDateRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.CreateDateRange }
             *     
             */
            public void setCreateDateRange(OrderListRQ.Query.Filters.CreateDateRange value) {
                this.createDateRange = value;
            }

            /**
             * Gets the value of the flight property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Flight }
             *     
             */
            public OrderListRQ.Query.Filters.Flight getFlight() {
                return flight;
            }

            /**
             * Sets the value of the flight property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Flight }
             *     
             */
            public void setFlight(OrderListRQ.Query.Filters.Flight value) {
                this.flight = value;
            }

            /**
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Group }
             *     
             */
            public OrderListRQ.Query.Filters.Group getGroup() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Group }
             *     
             */
            public void setGroup(OrderListRQ.Query.Filters.Group value) {
                this.group = value;
            }

            /**
             * Gets the value of the passengers property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Passengers }
             *     
             */
            public OrderListRQ.Query.Filters.Passengers getPassengers() {
                return passengers;
            }

            /**
             * Sets the value of the passengers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Passengers }
             *     
             */
            public void setPassengers(OrderListRQ.Query.Filters.Passengers value) {
                this.passengers = value;
            }

            /**
             * Gets the value of the payments property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Payments }
             *     
             */
            public OrderListRQ.Query.Filters.Payments getPayments() {
                return payments;
            }

            /**
             * Sets the value of the payments property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Payments }
             *     
             */
            public void setPayments(OrderListRQ.Query.Filters.Payments value) {
                this.payments = value;
            }

            /**
             * Gets the value of the ticketDocument property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.TicketDocument }
             *     
             */
            public OrderListRQ.Query.Filters.TicketDocument getTicketDocument() {
                return ticketDocument;
            }

            /**
             * Sets the value of the ticketDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.TicketDocument }
             *     
             */
            public void setTicketDocument(OrderListRQ.Query.Filters.TicketDocument value) {
                this.ticketDocument = value;
            }

            /**
             * Gets the value of the travelDateRange property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.TravelDateRange }
             *     
             */
            public OrderListRQ.Query.Filters.TravelDateRange getTravelDateRange() {
                return travelDateRange;
            }

            /**
             * Sets the value of the travelDateRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.TravelDateRange }
             *     
             */
            public void setTravelDateRange(OrderListRQ.Query.Filters.TravelDateRange value) {
                this.travelDateRange = value;
            }

            /**
             * Gets the value of the service property.
             * 
             * @return
             *     possible object is
             *     {@link OrderListRQ.Query.Filters.Service }
             *     
             */
            public OrderListRQ.Query.Filters.Service getService() {
                return service;
            }

            /**
             * Sets the value of the service property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderListRQ.Query.Filters.Service }
             *     
             */
            public void setService(OrderListRQ.Query.Filters.Service value) {
                this.service = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/&gt;
             *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
             *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/&gt;
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
                "agencyID",
                "name",
                "iataNumber"
            })
            public static class Agency {

                @XmlElement(name = "AgencyID")
                protected AgencyIDType agencyID;
                @XmlElement(name = "Name")
                protected String name;
                @XmlElement(name = "IATA_Number")
                protected String iataNumber;

                /**
                 * Gets the value of the agencyID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AgencyIDType }
                 *     
                 */
                public AgencyIDType getAgencyID() {
                    return agencyID;
                }

                /**
                 * Sets the value of the agencyID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AgencyIDType }
                 *     
                 */
                public void setAgencyID(AgencyIDType value) {
                    this.agencyID = value;
                }

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
                 * Gets the value of the iataNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIATANumber() {
                    return iataNumber;
                }

                /**
                 * Sets the value of the iataNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIATANumber(String value) {
                    this.iataNumber = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID" minOccurs="0"/&gt;
             *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
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
                "airlineID",
                "name"
            })
            public static class Airline {

                @XmlElement(name = "AirlineID")
                protected AirlineID airlineID;
                @XmlElement(name = "Name")
                protected String name;

                /**
                 * Gets the value of the airlineID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirlineID }
                 *     
                 */
                public AirlineID getAirlineID() {
                    return airlineID;
                }

                /**
                 * Sets the value of the airlineID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirlineID }
                 *     
                 */
                public void setAirlineID(AirlineID value) {
                    this.airlineID = value;
                }

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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CancelDateRange
                extends DatePeriodRepType
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
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CreateDateRange
                extends DatePeriodRepType
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/&gt;
             *         &lt;element name="Arrival" minOccurs="0"&gt;
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
             *         &lt;element name="Departure" minOccurs="0"&gt;
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
                "flightNumber",
                "classOfService",
                "fareBasisCode",
                "arrival",
                "departure",
                "originDestination",
                "segment"
            })
            public static class Flight {

                @XmlElement(name = "FlightNumber")
                protected FlightNumber flightNumber;
                @XmlElement(name = "ClassOfService")
                protected FlightCOSCoreType classOfService;
                @XmlElement(name = "FareBasisCode")
                protected FareBasisCodeType fareBasisCode;
                @XmlElement(name = "Arrival")
                protected OrderListRQ.Query.Filters.Flight.Arrival arrival;
                @XmlElement(name = "Departure")
                protected OrderListRQ.Query.Filters.Flight.Departure departure;
                @XmlElement(name = "OriginDestination")
                protected OrderListRQ.Query.Filters.Flight.OriginDestination originDestination;
                @XmlElement(name = "Segment")
                protected List<OrderListRQ.Query.Filters.Flight.Segment> segment;

                /**
                 * Gets the value of the flightNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightNumber }
                 *     
                 */
                public FlightNumber getFlightNumber() {
                    return flightNumber;
                }

                /**
                 * Sets the value of the flightNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightNumber }
                 *     
                 */
                public void setFlightNumber(FlightNumber value) {
                    this.flightNumber = value;
                }

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
                 * Gets the value of the arrival property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Flight.Arrival }
                 *     
                 */
                public OrderListRQ.Query.Filters.Flight.Arrival getArrival() {
                    return arrival;
                }

                /**
                 * Sets the value of the arrival property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Flight.Arrival }
                 *     
                 */
                public void setArrival(OrderListRQ.Query.Filters.Flight.Arrival value) {
                    this.arrival = value;
                }

                /**
                 * Gets the value of the departure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Flight.Departure }
                 *     
                 */
                public OrderListRQ.Query.Filters.Flight.Departure getDeparture() {
                    return departure;
                }

                /**
                 * Sets the value of the departure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Flight.Departure }
                 *     
                 */
                public void setDeparture(OrderListRQ.Query.Filters.Flight.Departure value) {
                    this.departure = value;
                }

                /**
                 * Gets the value of the originDestination property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination }
                 *     
                 */
                public OrderListRQ.Query.Filters.Flight.OriginDestination getOriginDestination() {
                    return originDestination;
                }

                /**
                 * Sets the value of the originDestination property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination }
                 *     
                 */
                public void setOriginDestination(OrderListRQ.Query.Filters.Flight.OriginDestination value) {
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
                 * {@link OrderListRQ.Query.Filters.Flight.Segment }
                 * 
                 * 
                 */
                public List<OrderListRQ.Query.Filters.Flight.Segment> getSegment() {
                    if (segment == null) {
                        segment = new ArrayList<OrderListRQ.Query.Filters.Flight.Segment>();
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
                    protected OrderListRQ.Query.Filters.Flight.Arrival.AirportCode airportCode;
                    @XmlElement(name = "Date", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;

                    /**
                     * Gets the value of the airportCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Arrival.AirportCode }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Flight.Arrival.AirportCode getAirportCode() {
                        return airportCode;
                    }

                    /**
                     * Sets the value of the airportCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Arrival.AirportCode }
                     *     
                     */
                    public void setAirportCode(OrderListRQ.Query.Filters.Flight.Arrival.AirportCode value) {
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
                    protected OrderListRQ.Query.Filters.Flight.Departure.AirportCode airportCode;
                    @XmlElement(name = "Date", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;

                    /**
                     * Gets the value of the airportCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Departure.AirportCode }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Flight.Departure.AirportCode getAirportCode() {
                        return airportCode;
                    }

                    /**
                     * Sets the value of the airportCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Departure.AirportCode }
                     *     
                     */
                    public void setAirportCode(OrderListRQ.Query.Filters.Flight.Departure.AirportCode value) {
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
                    protected OrderListRQ.Query.Filters.Flight.OriginDestination.Departure departure;
                    @XmlElement(name = "Arrival", required = true)
                    protected OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival arrival;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

                    /**
                     * Gets the value of the departure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Departure }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Flight.OriginDestination.Departure getDeparture() {
                        return departure;
                    }

                    /**
                     * Sets the value of the departure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Departure }
                     *     
                     */
                    public void setDeparture(OrderListRQ.Query.Filters.Flight.OriginDestination.Departure value) {
                        this.departure = value;
                    }

                    /**
                     * Gets the value of the arrival property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival getArrival() {
                        return arrival;
                    }

                    /**
                     * Sets the value of the arrival property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival }
                     *     
                     */
                    public void setArrival(OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival value) {
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
                        protected OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode }
                         *     
                         */
                        public OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode value) {
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
                        protected OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode }
                         *     
                         */
                        public OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode value) {
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
                    protected OrderListRQ.Query.Filters.Flight.Segment.Departure departure;
                    @XmlElement(name = "Arrival", required = true)
                    protected OrderListRQ.Query.Filters.Flight.Segment.Arrival arrival;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

                    /**
                     * Gets the value of the departure property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Segment.Departure }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Flight.Segment.Departure getDeparture() {
                        return departure;
                    }

                    /**
                     * Sets the value of the departure property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Segment.Departure }
                     *     
                     */
                    public void setDeparture(OrderListRQ.Query.Filters.Flight.Segment.Departure value) {
                        this.departure = value;
                    }

                    /**
                     * Gets the value of the arrival property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Segment.Arrival }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Flight.Segment.Arrival getArrival() {
                        return arrival;
                    }

                    /**
                     * Sets the value of the arrival property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Flight.Segment.Arrival }
                     *     
                     */
                    public void setArrival(OrderListRQ.Query.Filters.Flight.Segment.Arrival value) {
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
                        protected OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode }
                         *     
                         */
                        public OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode value) {
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
                        protected OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode airportCode;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;

                        /**
                         * Gets the value of the airportCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode }
                         *     
                         */
                        public OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode getAirportCode() {
                            return airportCode;
                        }

                        /**
                         * Sets the value of the airportCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode }
                         *     
                         */
                        public void setAirportCode(OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode value) {
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
             *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EmailAddress" minOccurs="0"/&gt;
             *         &lt;element name="PhoneNbrValue" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *                 &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
             *                 &lt;attribute name="AreaCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
             *                 &lt;attribute name="Extension" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
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
                "name",
                "profileID",
                "fqtv",
                "foid",
                "emailAddress",
                "phoneNbrValue"
            })
            public static class Passengers {

                @XmlElement(name = "Name")
                protected OrderListRQ.Query.Filters.Passengers.Name name;
                @XmlElement(name = "ProfileID")
                protected OrderListRQ.Query.Filters.Passengers.ProfileID profileID;
                @XmlElement(name = "FQTV")
                protected TravelerFQTVType fqtv;
                @XmlElement(name = "FOID")
                protected OrderListRQ.Query.Filters.Passengers.FOID foid;
                @XmlElement(name = "EmailAddress")
                protected EmailType emailAddress;
                @XmlElement(name = "PhoneNbrValue")
                protected OrderListRQ.Query.Filters.Passengers.PhoneNbrValue phoneNbrValue;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.Name }
                 *     
                 */
                public OrderListRQ.Query.Filters.Passengers.Name getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.Name }
                 *     
                 */
                public void setName(OrderListRQ.Query.Filters.Passengers.Name value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the profileID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.ProfileID }
                 *     
                 */
                public OrderListRQ.Query.Filters.Passengers.ProfileID getProfileID() {
                    return profileID;
                }

                /**
                 * Sets the value of the profileID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.ProfileID }
                 *     
                 */
                public void setProfileID(OrderListRQ.Query.Filters.Passengers.ProfileID value) {
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
                 * Gets the value of the foid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.FOID }
                 *     
                 */
                public OrderListRQ.Query.Filters.Passengers.FOID getFOID() {
                    return foid;
                }

                /**
                 * Sets the value of the foid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.FOID }
                 *     
                 */
                public void setFOID(OrderListRQ.Query.Filters.Passengers.FOID value) {
                    this.foid = value;
                }

                /**
                 * Gets the value of the emailAddress property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EmailType }
                 *     
                 */
                public EmailType getEmailAddress() {
                    return emailAddress;
                }

                /**
                 * Sets the value of the emailAddress property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EmailType }
                 *     
                 */
                public void setEmailAddress(EmailType value) {
                    this.emailAddress = value;
                }

                /**
                 * Gets the value of the phoneNbrValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.PhoneNbrValue }
                 *     
                 */
                public OrderListRQ.Query.Filters.Passengers.PhoneNbrValue getPhoneNbrValue() {
                    return phoneNbrValue;
                }

                /**
                 * Sets the value of the phoneNbrValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Passengers.PhoneNbrValue }
                 *     
                 */
                public void setPhoneNbrValue(OrderListRQ.Query.Filters.Passengers.PhoneNbrValue value) {
                    this.phoneNbrValue = value;
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
                 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                    "title",
                    "surnameSuffix",
                    "middle"
                })
                public static class Name {

                    @XmlElement(name = "Surname", required = true)
                    protected OrderListRQ.Query.Filters.Passengers.Name.Surname surname;
                    @XmlElement(name = "Given")
                    protected List<OrderListRQ.Query.Filters.Passengers.Name.Given> given;
                    @XmlElement(name = "Title")
                    protected String title;
                    @XmlElement(name = "SurnameSuffix")
                    protected Object surnameSuffix;
                    @XmlElement(name = "Middle")
                    protected List<OrderListRQ.Query.Filters.Passengers.Name.Middle> middle;
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
                     *     {@link OrderListRQ.Query.Filters.Passengers.Name.Surname }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Passengers.Name.Surname getSurname() {
                        return surname;
                    }

                    /**
                     * Sets the value of the surname property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Passengers.Name.Surname }
                     *     
                     */
                    public void setSurname(OrderListRQ.Query.Filters.Passengers.Name.Surname value) {
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
                     * {@link OrderListRQ.Query.Filters.Passengers.Name.Given }
                     * 
                     * 
                     */
                    public List<OrderListRQ.Query.Filters.Passengers.Name.Given> getGiven() {
                        if (given == null) {
                            given = new ArrayList<OrderListRQ.Query.Filters.Passengers.Name.Given>();
                        }
                        return this.given;
                    }

                    /**
                     * Gets the value of the title property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Sets the value of the title property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Gets the value of the surnameSuffix property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getSurnameSuffix() {
                        return surnameSuffix;
                    }

                    /**
                     * Sets the value of the surnameSuffix property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setSurnameSuffix(Object value) {
                        this.surnameSuffix = value;
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
                     * {@link OrderListRQ.Query.Filters.Passengers.Name.Middle }
                     * 
                     * 
                     */
                    public List<OrderListRQ.Query.Filters.Passengers.Name.Middle> getMiddle() {
                        if (middle == null) {
                            middle = new ArrayList<OrderListRQ.Query.Filters.Passengers.Name.Middle>();
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
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
                 *       &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
                 *       &lt;attribute name="AreaCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
                 *       &lt;attribute name="Extension" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
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
                public static class PhoneNbrValue {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "CountryCode")
                    protected String countryCode;
                    @XmlAttribute(name = "AreaCode")
                    protected String areaCode;
                    @XmlAttribute(name = "Extension")
                    protected String extension;
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
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the areaCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAreaCode() {
                        return areaCode;
                    }

                    /**
                     * Sets the value of the areaCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAreaCode(String value) {
                        this.areaCode = value;
                    }

                    /**
                     * Gets the value of the extension property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExtension() {
                        return extension;
                    }

                    /**
                     * Sets the value of the extension property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExtension(String value) {
                        this.extension = value;
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
             *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType" minOccurs="0"/&gt;
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
             *         &lt;element name="Status" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusListType"&gt;
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
                "amount",
                "method",
                "status"
            })
            public static class Payments {

                @XmlElement(name = "Amount")
                protected SimpleCurrencyPriceType amount;
                @XmlElement(name = "Method")
                protected OrderListRQ.Query.Filters.Payments.Method method;
                @XmlElement(name = "Status")
                protected OrderListRQ.Query.Filters.Payments.Status status;

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SimpleCurrencyPriceType }
                 *     
                 */
                public SimpleCurrencyPriceType getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SimpleCurrencyPriceType }
                 *     
                 */
                public void setAmount(SimpleCurrencyPriceType value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the method property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Payments.Method }
                 *     
                 */
                public OrderListRQ.Query.Filters.Payments.Method getMethod() {
                    return method;
                }

                /**
                 * Sets the value of the method property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Payments.Method }
                 *     
                 */
                public void setMethod(OrderListRQ.Query.Filters.Payments.Method value) {
                    this.method = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.Payments.Status }
                 *     
                 */
                public OrderListRQ.Query.Filters.Payments.Status getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.Payments.Status }
                 *     
                 */
                public void setStatus(OrderListRQ.Query.Filters.Payments.Status value) {
                    this.status = value;
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
                    protected OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber maskedCardNumber;
                    @XmlElement(name = "TokenizedCardNumber")
                    protected String tokenizedCardNumber;
                    @XmlElement(name = "EffectiveExpireDate")
                    protected OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate effectiveExpireDate;
                    @XmlElement(name = "CardHolderName")
                    protected OrderListRQ.Query.Filters.Payments.Method.CardHolderName cardHolderName;

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
                     *     {@link OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber getMaskedCardNumber() {
                        return maskedCardNumber;
                    }

                    /**
                     * Sets the value of the maskedCardNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber }
                     *     
                     */
                    public void setMaskedCardNumber(OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber value) {
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
                     *     {@link OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate getEffectiveExpireDate() {
                        return effectiveExpireDate;
                    }

                    /**
                     * Sets the value of the effectiveExpireDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate }
                     *     
                     */
                    public void setEffectiveExpireDate(OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate value) {
                        this.effectiveExpireDate = value;
                    }

                    /**
                     * Gets the value of the cardHolderName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRQ.Query.Filters.Payments.Method.CardHolderName }
                     *     
                     */
                    public OrderListRQ.Query.Filters.Payments.Method.CardHolderName getCardHolderName() {
                        return cardHolderName;
                    }

                    /**
                     * Sets the value of the cardHolderName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRQ.Query.Filters.Payments.Method.CardHolderName }
                     *     
                     */
                    public void setCardHolderName(OrderListRQ.Query.Filters.Payments.Method.CardHolderName value) {
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusListType"&gt;
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
                public static class Status {

                    @XmlValue
                    protected PaymentStatusListType value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * 
                     *         A data type for Payment Status contextual list. Examples: Canceled, Complete, Failed, MoreInformation, Partial
                     *       
                     * 
                     * @return
                     *     possible object is
                     *     {@link PaymentStatusListType }
                     *     
                     */
                    public PaymentStatusListType getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PaymentStatusListType }
                     *     
                     */
                    public void setValue(PaymentStatusListType value) {
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Description" minOccurs="0"/&gt;
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
                "description"
            })
            public static class Service {

                @XmlElement(name = "ServiceID")
                protected ServiceIDType serviceID;
                @XmlElement(name = "Description")
                protected Description description;

                /**
                 * Gets the value of the serviceID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServiceIDType }
                 *     
                 */
                public ServiceIDType getServiceID() {
                    return serviceID;
                }

                /**
                 * Sets the value of the serviceID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServiceIDType }
                 *     
                 */
                public void setServiceID(ServiceIDType value) {
                    this.serviceID = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Description }
                 *     
                 */
                public Description getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Description }
                 *     
                 */
                public void setDescription(Description value) {
                    this.description = value;
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
             *         &lt;element name="IssueDateRange" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
             *               &lt;/extension&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TicketDocNbr" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="14"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/EDIST}AirportCitySimpleType" minOccurs="0"/&gt;
             *         &lt;element name="CouponNumber" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *               &lt;minInclusive value="1"/&gt;
             *               &lt;maxInclusive value="4"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Status" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TicketDesigAppListType"&gt;
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
                "issueDateRange",
                "ticketDocNbr",
                "ticketingLocation",
                "couponNumber",
                "status"
            })
            public static class TicketDocument {

                @XmlElement(name = "IssueDateRange")
                protected OrderListRQ.Query.Filters.TicketDocument.IssueDateRange issueDateRange;
                @XmlElement(name = "TicketDocNbr")
                protected String ticketDocNbr;
                @XmlElement(name = "TicketingLocation")
                protected String ticketingLocation;
                @XmlElement(name = "CouponNumber")
                protected Integer couponNumber;
                @XmlElement(name = "Status")
                protected OrderListRQ.Query.Filters.TicketDocument.Status status;

                /**
                 * Gets the value of the issueDateRange property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.TicketDocument.IssueDateRange }
                 *     
                 */
                public OrderListRQ.Query.Filters.TicketDocument.IssueDateRange getIssueDateRange() {
                    return issueDateRange;
                }

                /**
                 * Sets the value of the issueDateRange property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.TicketDocument.IssueDateRange }
                 *     
                 */
                public void setIssueDateRange(OrderListRQ.Query.Filters.TicketDocument.IssueDateRange value) {
                    this.issueDateRange = value;
                }

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

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRQ.Query.Filters.TicketDocument.Status }
                 *     
                 */
                public OrderListRQ.Query.Filters.TicketDocument.Status getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRQ.Query.Filters.TicketDocument.Status }
                 *     
                 */
                public void setStatus(OrderListRQ.Query.Filters.TicketDocument.Status value) {
                    this.status = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
                 *     &lt;/extension&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class IssueDateRange
                    extends DatePeriodRepType
                {


                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TicketDesigAppListType"&gt;
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
                public static class Status {

                    @XmlValue
                    protected TicketDesigAppListType value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * A data type for Ticket Designator Application list constraint.
                     * 
                     * Examples: Requested, Ticketed, Other
                     * 
                     * @return
                     *     possible object is
                     *     {@link TicketDesigAppListType }
                     *     
                     */
                    public TicketDesigAppListType getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TicketDesigAppListType }
                     *     
                     */
                    public void setValue(TicketDesigAppListType value) {
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
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TravelDateRange
                extends DatePeriodRepType
            {


            }

        }

    }

}
