
package org.iata.ndc.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Alerts definition.
 * 
 * <p>Java class for ItinReshopAlertsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinReshopAlertsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PIN_AuthRequest" type="{http://www.iata.org/IATA/EDIST}PinPhraseQuestionType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemExceptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Exception" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
 *                             &lt;element name="Code" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ExpiredTimeLimits" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ExpiredTimeLimit" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}TimeLimitTypeSimpleType"/&gt;
 *                                                 &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                                 &lt;element name="Associations" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;choice&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                                   &lt;/choice&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                                   &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="AlternateOffers" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                                           &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
 *                                                           &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="references" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *                                               &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="InvDiscrepency" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Associations" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
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
 *                                                 &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                         &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AlternateOffers" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                                 &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
 *                                                 &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="policy" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
 *                                     &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
 *                                     &lt;attribute name="objectMetaReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *                                     &lt;attribute name="objectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                                     &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="NoInventoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PriceVariances" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="RuleID" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                                                         &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                                         &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Amount" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Associations" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                                   &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="RuleExceptionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Eligibility" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Promotions" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Promotion" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType"&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Associations" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
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
 *                                                 &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                         &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AlternateOffers" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                                                 &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
 *                                                 &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="policy" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
 *                                     &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
 *                                     &lt;attribute name="objectMetaReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *                                     &lt;attribute name="objectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                                     &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="PaxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="PromotionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinReshopAlertsType", propOrder = {
    "pinAuthRequest",
    "orderItemExceptions"
})
public class ItinReshopAlertsType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "PIN_AuthRequest")
    protected PinPhraseQuestionType pinAuthRequest;
    @XmlElementWrapper(name = "OrderItemExceptions")
    @XmlElement(name = "Exception", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ItinReshopAlertsType.Exception> orderItemExceptions;

    /**
     * Gets the value of the pinAuthRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType }
     *     
     */
    public PinPhraseQuestionType getPINAuthRequest() {
        return pinAuthRequest;
    }

    /**
     * Sets the value of the pinAuthRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType }
     *     
     */
    public void setPINAuthRequest(PinPhraseQuestionType value) {
        this.pinAuthRequest = value;
    }

    public List<ItinReshopAlertsType.Exception> getOrderItemExceptions() {
        if (orderItemExceptions == null) {
            orderItemExceptions = new ArrayList<ItinReshopAlertsType.Exception>();
        }
        return orderItemExceptions;
    }

    public void setOrderItemExceptions(List<ItinReshopAlertsType.Exception> orderItemExceptions) {
        this.orderItemExceptions = orderItemExceptions;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ExpiredTimeLimits" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ExpiredTimeLimit" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}TimeLimitTypeSimpleType"/&gt;
     *                             &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="Associations" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AlternateOffers" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                                       &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
     *                                       &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="references" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *                           &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="InvDiscrepency" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Associations" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
     *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
     *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AlternateOffers" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                             &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
     *                             &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="policy" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
     *                 &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
     *                 &lt;attribute name="objectMetaReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *                 &lt;attribute name="objectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                 &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="NoInventoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PriceVariances" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="RuleID" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Amount" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Associations" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Passengers" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
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
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RuleExceptionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Eligibility" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Promotions" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Promotion" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType"&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Associations" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
     *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
     *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AlternateOffers" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                             &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
     *                             &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="policy" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
     *                 &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
     *                 &lt;attribute name="objectMetaReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
     *                 &lt;attribute name="objectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                 &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="PaxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="PromotionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "orderItemID",
        "code",
        "expiredTimeLimits",
        "invDiscrepency",
        "priceVariances",
        "eligibility"
    })
    public static class Exception {

        @XmlElement(name = "OrderItemID", required = true)
        protected ItemIDType orderItemID;
        @XmlElement(name = "Code")
        protected ItinReshopAlertsType.Exception.Code code;
        @XmlElement(name = "ExpiredTimeLimits")
        protected ItinReshopAlertsType.Exception.ExpiredTimeLimits expiredTimeLimits;
        @XmlElement(name = "InvDiscrepency")
        protected ItinReshopAlertsType.Exception.InvDiscrepency invDiscrepency;
        @XmlElement(name = "PriceVariances")
        protected ItinReshopAlertsType.Exception.PriceVariances priceVariances;
        @XmlElement(name = "Eligibility")
        protected ItinReshopAlertsType.Exception.Eligibility eligibility;

        /**
         * Associated Order Item ID(s).
         * Example: ORD7333-001
         * 
         * @return
         *     possible object is
         *     {@link ItemIDType }
         *     
         */
        public ItemIDType getOrderItemID() {
            return orderItemID;
        }

        /**
         * Sets the value of the orderItemID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemIDType }
         *     
         */
        public void setOrderItemID(ItemIDType value) {
            this.orderItemID = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopAlertsType.Exception.Code }
         *     
         */
        public ItinReshopAlertsType.Exception.Code getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopAlertsType.Exception.Code }
         *     
         */
        public void setCode(ItinReshopAlertsType.Exception.Code value) {
            this.code = value;
        }

        /**
         * Gets the value of the expiredTimeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits }
         *     
         */
        public ItinReshopAlertsType.Exception.ExpiredTimeLimits getExpiredTimeLimits() {
            return expiredTimeLimits;
        }

        /**
         * Sets the value of the expiredTimeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits }
         *     
         */
        public void setExpiredTimeLimits(ItinReshopAlertsType.Exception.ExpiredTimeLimits value) {
            this.expiredTimeLimits = value;
        }

        /**
         * Gets the value of the invDiscrepency property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopAlertsType.Exception.InvDiscrepency }
         *     
         */
        public ItinReshopAlertsType.Exception.InvDiscrepency getInvDiscrepency() {
            return invDiscrepency;
        }

        /**
         * Sets the value of the invDiscrepency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopAlertsType.Exception.InvDiscrepency }
         *     
         */
        public void setInvDiscrepency(ItinReshopAlertsType.Exception.InvDiscrepency value) {
            this.invDiscrepency = value;
        }

        /**
         * Gets the value of the priceVariances property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopAlertsType.Exception.PriceVariances }
         *     
         */
        public ItinReshopAlertsType.Exception.PriceVariances getPriceVariances() {
            return priceVariances;
        }

        /**
         * Sets the value of the priceVariances property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopAlertsType.Exception.PriceVariances }
         *     
         */
        public void setPriceVariances(ItinReshopAlertsType.Exception.PriceVariances value) {
            this.priceVariances = value;
        }

        /**
         * Gets the value of the eligibility property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopAlertsType.Exception.Eligibility }
         *     
         */
        public ItinReshopAlertsType.Exception.Eligibility getEligibility() {
            return eligibility;
        }

        /**
         * Sets the value of the eligibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopAlertsType.Exception.Eligibility }
         *     
         */
        public void setEligibility(ItinReshopAlertsType.Exception.Eligibility value) {
            this.eligibility = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Code
            extends CodesetType
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
         *         &lt;element name="Promotions" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Promotion" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType"&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Associations" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
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
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AlternateOffers" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
         *                   &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="policy" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
         *       &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
         *       &lt;attribute name="objectMetaReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
         *       &lt;attribute name="objectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *       &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="PaxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="PromotionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "promotions",
            "associations",
            "alternateOffers",
            "remarks"
        })
        public static class Eligibility {

            @XmlElementWrapper(name = "Promotions")
            @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<ItinReshopAlertsType.Exception.Eligibility.Promotion> promotions;
            @XmlElement(name = "Associations")
            protected ItinReshopAlertsType.Exception.Eligibility.Associations associations;
            @XmlElement(name = "AlternateOffers")
            protected ItinReshopAlertsType.Exception.Eligibility.AlternateOffers alternateOffers;
            @XmlElement(name = "Remarks")
            protected RemarkType remarks;
            @XmlAttribute(name = "policy")
            @XmlIDREF
            protected List<Object> policy;
            @XmlAttribute(name = "References")
            @XmlIDREF
            protected List<Object> references;
            @XmlAttribute(name = "objectMetaReferences")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> objectMetaReferences;
            @XmlAttribute(name = "objectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String objectKey;
            @XmlAttribute(name = "AltOfferInd")
            protected Boolean altOfferInd;
            @XmlAttribute(name = "PaxInd")
            protected Boolean paxInd;
            @XmlAttribute(name = "PromotionInd")
            protected Boolean promotionInd;

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopAlertsType.Exception.Eligibility.Associations }
             *     
             */
            public ItinReshopAlertsType.Exception.Eligibility.Associations getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopAlertsType.Exception.Eligibility.Associations }
             *     
             */
            public void setAssociations(ItinReshopAlertsType.Exception.Eligibility.Associations value) {
                this.associations = value;
            }

            /**
             * Gets the value of the alternateOffers property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopAlertsType.Exception.Eligibility.AlternateOffers }
             *     
             */
            public ItinReshopAlertsType.Exception.Eligibility.AlternateOffers getAlternateOffers() {
                return alternateOffers;
            }

            /**
             * Sets the value of the alternateOffers property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopAlertsType.Exception.Eligibility.AlternateOffers }
             *     
             */
            public void setAlternateOffers(ItinReshopAlertsType.Exception.Eligibility.AlternateOffers value) {
                this.alternateOffers = value;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link RemarkType }
             *     
             */
            public RemarkType getRemarks() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link RemarkType }
             *     
             */
            public void setRemarks(RemarkType value) {
                this.remarks = value;
            }

            /**
             * Gets the value of the policy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the policy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getPolicy() {
                if (policy == null) {
                    policy = new ArrayList<Object>();
                }
                return this.policy;
            }

            /**
             * Gets the value of the references property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the references property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getReferences() {
                if (references == null) {
                    references = new ArrayList<Object>();
                }
                return this.references;
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
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
            }

            /**
             * Gets the value of the altOfferInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAltOfferInd() {
                return altOfferInd;
            }

            /**
             * Sets the value of the altOfferInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAltOfferInd(Boolean value) {
                this.altOfferInd = value;
            }

            /**
             * Gets the value of the paxInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPaxInd() {
                return paxInd;
            }

            /**
             * Sets the value of the paxInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPaxInd(Boolean value) {
                this.paxInd = value;
            }

            /**
             * Gets the value of the promotionInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPromotionInd() {
                return promotionInd;
            }

            /**
             * Sets the value of the promotionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPromotionInd(Boolean value) {
                this.promotionInd = value;
            }

            public List<ItinReshopAlertsType.Exception.Eligibility.Promotion> getPromotions() {
                if (promotions == null) {
                    promotions = new ArrayList<ItinReshopAlertsType.Exception.Eligibility.Promotion>();
                }
                return promotions;
            }

            public void setPromotions(List<ItinReshopAlertsType.Exception.Eligibility.Promotion> promotions) {
                this.promotions = promotions;
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
             *         &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
             *         &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
                "totalOfferQuantity",
                "owner",
                "alternateOffer"
            })
            public static class AlternateOffers {

                @XmlElement(name = "TotalOfferQuantity")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger totalOfferQuantity;
                @XmlElement(name = "Owner", required = true)
                protected AirlineIDType owner;
                @XmlElement(name = "AlternateOffer", required = true)
                protected List<ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer> alternateOffer;

                /**
                 * Gets the value of the totalOfferQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotalOfferQuantity() {
                    return totalOfferQuantity;
                }

                /**
                 * Sets the value of the totalOfferQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotalOfferQuantity(BigInteger value) {
                    this.totalOfferQuantity = value;
                }

                /**
                 * Gets the value of the owner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirlineIDType }
                 *     
                 */
                public AirlineIDType getOwner() {
                    return owner;
                }

                /**
                 * Sets the value of the owner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirlineIDType }
                 *     
                 */
                public void setOwner(AirlineIDType value) {
                    this.owner = value;
                }

                /**
                 * Gets the value of the alternateOffer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the alternateOffer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAlternateOffer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer }
                 * 
                 * 
                 */
                public List<ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer> getAlternateOffer() {
                    if (alternateOffer == null) {
                        alternateOffer = new ArrayList<ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer>();
                    }
                    return this.alternateOffer;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
                    "altBaggageOffer",
                    "altPricedFlightOffer",
                    "altOtherOffer",
                    "altSeatOffer"
                })
                public static class AlternateOffer
                    extends OfferType
                {

                    @XmlElement(name = "AltBaggageOffer")
                    protected AltBaggageOfferType altBaggageOffer;
                    @XmlElement(name = "AltPricedFlightOffer")
                    protected AltPricedFlightOfferType altPricedFlightOffer;
                    @XmlElement(name = "AltOtherOffer")
                    protected AltOtherOfferType altOtherOffer;
                    @XmlElement(name = "AltSeatOffer")
                    protected AltSeatOfferType altSeatOffer;

                    /**
                     * Gets the value of the altBaggageOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltBaggageOfferType }
                     *     
                     */
                    public AltBaggageOfferType getAltBaggageOffer() {
                        return altBaggageOffer;
                    }

                    /**
                     * Sets the value of the altBaggageOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltBaggageOfferType }
                     *     
                     */
                    public void setAltBaggageOffer(AltBaggageOfferType value) {
                        this.altBaggageOffer = value;
                    }

                    /**
                     * Gets the value of the altPricedFlightOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltPricedFlightOfferType }
                     *     
                     */
                    public AltPricedFlightOfferType getAltPricedFlightOffer() {
                        return altPricedFlightOffer;
                    }

                    /**
                     * Sets the value of the altPricedFlightOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltPricedFlightOfferType }
                     *     
                     */
                    public void setAltPricedFlightOffer(AltPricedFlightOfferType value) {
                        this.altPricedFlightOffer = value;
                    }

                    /**
                     * Gets the value of the altOtherOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltOtherOfferType }
                     *     
                     */
                    public AltOtherOfferType getAltOtherOffer() {
                        return altOtherOffer;
                    }

                    /**
                     * Sets the value of the altOtherOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltOtherOfferType }
                     *     
                     */
                    public void setAltOtherOffer(AltOtherOfferType value) {
                        this.altOtherOffer = value;
                    }

                    /**
                     * Gets the value of the altSeatOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltSeatOfferType }
                     *     
                     */
                    public AltSeatOfferType getAltSeatOffer() {
                        return altSeatOffer;
                    }

                    /**
                     * Sets the value of the altSeatOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltSeatOfferType }
                     *     
                     */
                    public void setAltSeatOffer(AltSeatOfferType value) {
                        this.altSeatOffer = value;
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
                "otherAssociation"
            })
            public static class Associations {

                @XmlElement(name = "Passengers")
                protected ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers passengers;
                @XmlElement(name = "OtherAssociation")
                protected List<ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation> otherAssociation;

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers }
                 *     
                 */
                public ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers }
                 *     
                 */
                public void setPassengers(ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers value) {
                    this.passengers = value;
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
                 * {@link ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation }
                 * 
                 * 
                 */
                public List<ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation>();
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
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Promotion
                extends PromotionType
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
         *         &lt;element name="ExpiredTimeLimit" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}TimeLimitTypeSimpleType"/&gt;
         *                   &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="Associations" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
         *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
         *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AlternateOffers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                             &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
         *                             &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="references" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
         *                 &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "expiredTimeLimit"
        })
        public static class ExpiredTimeLimits {

            @XmlElement(name = "ExpiredTimeLimit", required = true)
            protected List<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit> expiredTimeLimit;
            @XmlAttribute(name = "AltOfferInd")
            protected Boolean altOfferInd;

            /**
             * Gets the value of the expiredTimeLimit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the expiredTimeLimit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExpiredTimeLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit }
             * 
             * 
             */
            public List<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit> getExpiredTimeLimit() {
                if (expiredTimeLimit == null) {
                    expiredTimeLimit = new ArrayList<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit>();
                }
                return this.expiredTimeLimit;
            }

            /**
             * Gets the value of the altOfferInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAltOfferInd() {
                return altOfferInd;
            }

            /**
             * Sets the value of the altOfferInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAltOfferInd(Boolean value) {
                this.altOfferInd = value;
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
             *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}TimeLimitTypeSimpleType"/&gt;
             *         &lt;element name="ExpiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="Associations" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
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
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AlternateOffers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
             *                   &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
             *       &lt;/sequence&gt;
             *       &lt;attribute name="references" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
             *       &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "type",
                "expiredDate",
                "associations",
                "alternateOffers"
            })
            public static class ExpiredTimeLimit {

                @XmlElement(name = "Type", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlElement(name = "ExpiredDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar expiredDate;
                @XmlElement(name = "Associations")
                protected ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations associations;
                @XmlElement(name = "AlternateOffers")
                protected ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers alternateOffers;
                @XmlAttribute(name = "references")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> references;
                @XmlAttribute(name = "trxItemKey")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String trxItemKey;

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
                 * Gets the value of the expiredDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getExpiredDate() {
                    return expiredDate;
                }

                /**
                 * Sets the value of the expiredDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setExpiredDate(XMLGregorianCalendar value) {
                    this.expiredDate = value;
                }

                /**
                 * Gets the value of the associations property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations }
                 *     
                 */
                public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations getAssociations() {
                    return associations;
                }

                /**
                 * Sets the value of the associations property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations }
                 *     
                 */
                public void setAssociations(ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations value) {
                    this.associations = value;
                }

                /**
                 * Gets the value of the alternateOffers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers }
                 *     
                 */
                public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers getAlternateOffers() {
                    return alternateOffers;
                }

                /**
                 * Sets the value of the alternateOffers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers }
                 *     
                 */
                public void setAlternateOffers(ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers value) {
                    this.alternateOffers = value;
                }

                /**
                 * Gets the value of the references property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the references property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReferences().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getReferences() {
                    if (references == null) {
                        references = new ArrayList<Object>();
                    }
                    return this.references;
                }

                /**
                 * Gets the value of the trxItemKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrxItemKey() {
                    return trxItemKey;
                }

                /**
                 * Sets the value of the trxItemKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrxItemKey(String value) {
                    this.trxItemKey = value;
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
                 *         &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
                 *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
                 *         &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
                    "totalOfferQuantity",
                    "owner",
                    "alternateOffer"
                })
                public static class AlternateOffers {

                    @XmlElement(name = "TotalOfferQuantity")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger totalOfferQuantity;
                    @XmlElement(name = "Owner", required = true)
                    protected AirlineIDType owner;
                    @XmlElement(name = "AlternateOffer", required = true)
                    protected List<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer> alternateOffer;

                    /**
                     * Gets the value of the totalOfferQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTotalOfferQuantity() {
                        return totalOfferQuantity;
                    }

                    /**
                     * Sets the value of the totalOfferQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTotalOfferQuantity(BigInteger value) {
                        this.totalOfferQuantity = value;
                    }

                    /**
                     * Gets the value of the owner property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AirlineIDType }
                     *     
                     */
                    public AirlineIDType getOwner() {
                        return owner;
                    }

                    /**
                     * Sets the value of the owner property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AirlineIDType }
                     *     
                     */
                    public void setOwner(AirlineIDType value) {
                        this.owner = value;
                    }

                    /**
                     * Gets the value of the alternateOffer property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the alternateOffer property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAlternateOffer().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer }
                     * 
                     * 
                     */
                    public List<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer> getAlternateOffer() {
                        if (alternateOffer == null) {
                            alternateOffer = new ArrayList<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer>();
                        }
                        return this.alternateOffer;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
                        "altBaggageOffer",
                        "altPricedFlightOffer",
                        "altOtherOffer",
                        "altSeatOffer"
                    })
                    public static class AlternateOffer
                        extends OfferType
                    {

                        @XmlElement(name = "AltBaggageOffer")
                        protected AltBaggageOfferType altBaggageOffer;
                        @XmlElement(name = "AltPricedFlightOffer")
                        protected AltPricedFlightOfferType altPricedFlightOffer;
                        @XmlElement(name = "AltOtherOffer")
                        protected AltOtherOfferType altOtherOffer;
                        @XmlElement(name = "AltSeatOffer")
                        protected AltSeatOfferType altSeatOffer;

                        /**
                         * Gets the value of the altBaggageOffer property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AltBaggageOfferType }
                         *     
                         */
                        public AltBaggageOfferType getAltBaggageOffer() {
                            return altBaggageOffer;
                        }

                        /**
                         * Sets the value of the altBaggageOffer property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AltBaggageOfferType }
                         *     
                         */
                        public void setAltBaggageOffer(AltBaggageOfferType value) {
                            this.altBaggageOffer = value;
                        }

                        /**
                         * Gets the value of the altPricedFlightOffer property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AltPricedFlightOfferType }
                         *     
                         */
                        public AltPricedFlightOfferType getAltPricedFlightOffer() {
                            return altPricedFlightOffer;
                        }

                        /**
                         * Sets the value of the altPricedFlightOffer property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AltPricedFlightOfferType }
                         *     
                         */
                        public void setAltPricedFlightOffer(AltPricedFlightOfferType value) {
                            this.altPricedFlightOffer = value;
                        }

                        /**
                         * Gets the value of the altOtherOffer property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AltOtherOfferType }
                         *     
                         */
                        public AltOtherOfferType getAltOtherOffer() {
                            return altOtherOffer;
                        }

                        /**
                         * Sets the value of the altOtherOffer property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AltOtherOfferType }
                         *     
                         */
                        public void setAltOtherOffer(AltOtherOfferType value) {
                            this.altOtherOffer = value;
                        }

                        /**
                         * Gets the value of the altSeatOffer property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AltSeatOfferType }
                         *     
                         */
                        public AltSeatOfferType getAltSeatOffer() {
                            return altSeatOffer;
                        }

                        /**
                         * Sets the value of the altSeatOffer property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AltSeatOfferType }
                         *     
                         */
                        public void setAltSeatOffer(AltSeatOfferType value) {
                            this.altSeatOffer = value;
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
                    "otherAssociation"
                })
                public static class Associations {

                    @XmlElement(name = "Passengers")
                    protected ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers passengers;
                    @XmlElement(name = "OtherAssociation")
                    protected List<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation> otherAssociation;

                    /**
                     * Gets the value of the passengers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers }
                     *     
                     */
                    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers getPassengers() {
                        return passengers;
                    }

                    /**
                     * Sets the value of the passengers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers }
                     *     
                     */
                    public void setPassengers(ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers value) {
                        this.passengers = value;
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
                     * {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation }
                     * 
                     * 
                     */
                    public List<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation> getOtherAssociation() {
                        if (otherAssociation == null) {
                            otherAssociation = new ArrayList<ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation>();
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
         *         &lt;element name="Associations" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
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
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AlternateOffers" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
         *                   &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="policy" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
         *       &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
         *       &lt;attribute name="objectMetaReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
         *       &lt;attribute name="objectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *       &lt;attribute name="AltOfferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="NoInventoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "associations",
            "alternateOffers",
            "remarks"
        })
        public static class InvDiscrepency {

            @XmlElement(name = "Associations")
            protected ItinReshopAlertsType.Exception.InvDiscrepency.Associations associations;
            @XmlElement(name = "AlternateOffers")
            protected ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers alternateOffers;
            @XmlElement(name = "Remarks")
            protected RemarkType remarks;
            @XmlAttribute(name = "policy")
            @XmlIDREF
            protected List<Object> policy;
            @XmlAttribute(name = "References")
            @XmlIDREF
            protected List<Object> references;
            @XmlAttribute(name = "objectMetaReferences")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> objectMetaReferences;
            @XmlAttribute(name = "objectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String objectKey;
            @XmlAttribute(name = "AltOfferInd")
            protected Boolean altOfferInd;
            @XmlAttribute(name = "NoInventoryInd")
            protected Boolean noInventoryInd;

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations }
             *     
             */
            public ItinReshopAlertsType.Exception.InvDiscrepency.Associations getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations }
             *     
             */
            public void setAssociations(ItinReshopAlertsType.Exception.InvDiscrepency.Associations value) {
                this.associations = value;
            }

            /**
             * Gets the value of the alternateOffers property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers }
             *     
             */
            public ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers getAlternateOffers() {
                return alternateOffers;
            }

            /**
             * Sets the value of the alternateOffers property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers }
             *     
             */
            public void setAlternateOffers(ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers value) {
                this.alternateOffers = value;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link RemarkType }
             *     
             */
            public RemarkType getRemarks() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link RemarkType }
             *     
             */
            public void setRemarks(RemarkType value) {
                this.remarks = value;
            }

            /**
             * Gets the value of the policy property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the policy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPolicy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getPolicy() {
                if (policy == null) {
                    policy = new ArrayList<Object>();
                }
                return this.policy;
            }

            /**
             * Gets the value of the references property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the references property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getReferences() {
                if (references == null) {
                    references = new ArrayList<Object>();
                }
                return this.references;
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
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
            }

            /**
             * Gets the value of the altOfferInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAltOfferInd() {
                return altOfferInd;
            }

            /**
             * Sets the value of the altOfferInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAltOfferInd(Boolean value) {
                this.altOfferInd = value;
            }

            /**
             * Gets the value of the noInventoryInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNoInventoryInd() {
                return noInventoryInd;
            }

            /**
             * Sets the value of the noInventoryInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNoInventoryInd(Boolean value) {
                this.noInventoryInd = value;
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
             *         &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
             *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
             *         &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
                "totalOfferQuantity",
                "owner",
                "alternateOffer"
            })
            public static class AlternateOffers {

                @XmlElement(name = "TotalOfferQuantity")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger totalOfferQuantity;
                @XmlElement(name = "Owner", required = true)
                protected AirlineIDType owner;
                @XmlElement(name = "AlternateOffer", required = true)
                protected List<ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer> alternateOffer;

                /**
                 * Gets the value of the totalOfferQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTotalOfferQuantity() {
                    return totalOfferQuantity;
                }

                /**
                 * Sets the value of the totalOfferQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTotalOfferQuantity(BigInteger value) {
                    this.totalOfferQuantity = value;
                }

                /**
                 * Gets the value of the owner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirlineIDType }
                 *     
                 */
                public AirlineIDType getOwner() {
                    return owner;
                }

                /**
                 * Sets the value of the owner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirlineIDType }
                 *     
                 */
                public void setOwner(AirlineIDType value) {
                    this.owner = value;
                }

                /**
                 * Gets the value of the alternateOffer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the alternateOffer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAlternateOffer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer }
                 * 
                 * 
                 */
                public List<ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer> getAlternateOffer() {
                    if (alternateOffer == null) {
                        alternateOffer = new ArrayList<ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer>();
                    }
                    return this.alternateOffer;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer" minOccurs="0"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer" minOccurs="0"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer" minOccurs="0"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer" minOccurs="0"/&gt;
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
                    "altBaggageOffer",
                    "altPricedFlightOffer",
                    "altOtherOffer",
                    "altSeatOffer"
                })
                public static class AlternateOffer
                    extends OfferType
                {

                    @XmlElement(name = "AltBaggageOffer")
                    protected AltBaggageOfferType altBaggageOffer;
                    @XmlElement(name = "AltPricedFlightOffer")
                    protected AltPricedFlightOfferType altPricedFlightOffer;
                    @XmlElement(name = "AltOtherOffer")
                    protected AltOtherOfferType altOtherOffer;
                    @XmlElement(name = "AltSeatOffer")
                    protected AltSeatOfferType altSeatOffer;

                    /**
                     * Gets the value of the altBaggageOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltBaggageOfferType }
                     *     
                     */
                    public AltBaggageOfferType getAltBaggageOffer() {
                        return altBaggageOffer;
                    }

                    /**
                     * Sets the value of the altBaggageOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltBaggageOfferType }
                     *     
                     */
                    public void setAltBaggageOffer(AltBaggageOfferType value) {
                        this.altBaggageOffer = value;
                    }

                    /**
                     * Gets the value of the altPricedFlightOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltPricedFlightOfferType }
                     *     
                     */
                    public AltPricedFlightOfferType getAltPricedFlightOffer() {
                        return altPricedFlightOffer;
                    }

                    /**
                     * Sets the value of the altPricedFlightOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltPricedFlightOfferType }
                     *     
                     */
                    public void setAltPricedFlightOffer(AltPricedFlightOfferType value) {
                        this.altPricedFlightOffer = value;
                    }

                    /**
                     * Gets the value of the altOtherOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltOtherOfferType }
                     *     
                     */
                    public AltOtherOfferType getAltOtherOffer() {
                        return altOtherOffer;
                    }

                    /**
                     * Sets the value of the altOtherOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltOtherOfferType }
                     *     
                     */
                    public void setAltOtherOffer(AltOtherOfferType value) {
                        this.altOtherOffer = value;
                    }

                    /**
                     * Gets the value of the altSeatOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AltSeatOfferType }
                     *     
                     */
                    public AltSeatOfferType getAltSeatOffer() {
                        return altSeatOffer;
                    }

                    /**
                     * Sets the value of the altSeatOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AltSeatOfferType }
                     *     
                     */
                    public void setAltSeatOffer(AltSeatOfferType value) {
                        this.altSeatOffer = value;
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
                "otherAssociation"
            })
            public static class Associations {

                @XmlElement(name = "Passengers")
                protected ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers passengers;
                @XmlElement(name = "OtherAssociation")
                protected List<ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation> otherAssociation;

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers }
                 *     
                 */
                public ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers }
                 *     
                 */
                public void setPassengers(ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers value) {
                    this.passengers = value;
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
                 * {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation }
                 * 
                 * 
                 */
                public List<ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation>();
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
         *         &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="RuleID" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Amount" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Associations" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Passengers" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
         *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
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
         *                 &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RuleExceptionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceVariance"
        })
        public static class PriceVariances {

            @XmlElement(name = "PriceVariance")
            protected List<ItinReshopAlertsType.Exception.PriceVariances.PriceVariance> priceVariance;
            @XmlAttribute(name = "RuleExceptionInd")
            protected Boolean ruleExceptionInd;

            /**
             * Gets the value of the priceVariance property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceVariance property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceVariance().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance }
             * 
             * 
             */
            public List<ItinReshopAlertsType.Exception.PriceVariances.PriceVariance> getPriceVariance() {
                if (priceVariance == null) {
                    priceVariance = new ArrayList<ItinReshopAlertsType.Exception.PriceVariances.PriceVariance>();
                }
                return this.priceVariance;
            }

            /**
             * Gets the value of the ruleExceptionInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRuleExceptionInd() {
                return ruleExceptionInd;
            }

            /**
             * Sets the value of the ruleExceptionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRuleExceptionInd(Boolean value) {
                this.ruleExceptionInd = value;
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
             *         &lt;element name="RuleID" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
             *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Amount" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Associations" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Passengers" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
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
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ruleID",
                "amount",
                "associations"
            })
            public static class PriceVariance {

                @XmlElement(name = "RuleID")
                protected ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID ruleID;
                @XmlElement(name = "Amount")
                protected ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount amount;
                @XmlElement(name = "Associations")
                protected ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations associations;
                @XmlAttribute(name = "trxItemKey")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String trxItemKey;

                /**
                 * Gets the value of the ruleID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID }
                 *     
                 */
                public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID getRuleID() {
                    return ruleID;
                }

                /**
                 * Sets the value of the ruleID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID }
                 *     
                 */
                public void setRuleID(ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID value) {
                    this.ruleID = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount }
                 *     
                 */
                public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount }
                 *     
                 */
                public void setAmount(ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the associations property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations }
                 *     
                 */
                public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations getAssociations() {
                    return associations;
                }

                /**
                 * Sets the value of the associations property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations }
                 *     
                 */
                public void setAssociations(ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations value) {
                    this.associations = value;
                }

                /**
                 * Gets the value of the trxItemKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrxItemKey() {
                    return trxItemKey;
                }

                /**
                 * Sets the value of the trxItemKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrxItemKey(String value) {
                    this.trxItemKey = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
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
                    "currencyAmountValue",
                    "percentageValue"
                })
                public static class Amount {

                    @XmlElement(name = "CurrencyAmountValue", required = true)
                    protected CurrencyAmountOptType currencyAmountValue;
                    @XmlElement(name = "PercentageValue", required = true)
                    protected BigDecimal percentageValue;

                    /**
                     * Gets the value of the currencyAmountValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public CurrencyAmountOptType getCurrencyAmountValue() {
                        return currencyAmountValue;
                    }

                    /**
                     * Sets the value of the currencyAmountValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public void setCurrencyAmountValue(CurrencyAmountOptType value) {
                        this.currencyAmountValue = value;
                    }

                    /**
                     * Gets the value of the percentageValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPercentageValue() {
                        return percentageValue;
                    }

                    /**
                     * Sets the value of the percentageValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPercentageValue(BigDecimal value) {
                        this.percentageValue = value;
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
                 *         &lt;element name="Passengers" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
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
                    "otherAssociation"
                })
                public static class Associations {

                    @XmlElement(name = "Passengers")
                    protected ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers passengers;
                    @XmlElement(name = "OtherAssociation")
                    protected List<ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation> otherAssociation;

                    /**
                     * Gets the value of the passengers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers }
                     *     
                     */
                    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers getPassengers() {
                        return passengers;
                    }

                    /**
                     * Sets the value of the passengers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers }
                     *     
                     */
                    public void setPassengers(ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers value) {
                        this.passengers = value;
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
                     * {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation }
                     * 
                     * 
                     */
                    public List<ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation> getOtherAssociation() {
                        if (otherAssociation == null) {
                            otherAssociation = new ArrayList<ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation>();
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
                     *       &lt;sequence&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
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
                        "passengerReferences",
                        "groupReference"
                    })
                    public static class Passengers {

                        @XmlList
                        @XmlElement(name = "PassengerReferences", required = true)
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREFS")
                        protected List<Object> passengerReferences;
                        @XmlElement(name = "GroupReference", required = true)
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
                 *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
                 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
                public static class RuleID {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Context")
                    protected String context;
                    @XmlAttribute(name = "Name")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String name;

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

            }

        }

    }

}
