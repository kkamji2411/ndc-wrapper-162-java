
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


/**
 * Notice definition.
 * 
 * <p>Java class for OrdChangeNoticesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdChangeNoticesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}NoticeBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CampaignReferral" type="{http://www.iata.org/IATA/EDIST}CampaignReferralType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ProceedOnFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PricingParameters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="AutoExchRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="IncludeAwardRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AwardOnlyRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="SimpleRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PriceVarianceRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PriceVarianceRule" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                             &lt;element name="RuleID"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AcceptableVariance"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Name" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="RuleValid" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}YearPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}YearMonthPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TimePeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}QuarterPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}MonthPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}DayPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}DateTimePeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}DatePeriod"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Currencies" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="InputCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                                       &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="VarianceRuleIndicatoricator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxExemptionRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Named" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Countries" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryCode" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Entities" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Entity" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType"&gt;
 *                                             &lt;pattern value="[A-Z]{2}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Territories" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Territory" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType"&gt;
 *                                             &lt;pattern value="[A-Z]{2}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TaxCodes" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Designator"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;pattern value="[A-Z]{1,2}"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Nature" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;pattern value="[A-Z]{1,2}"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
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
 *                   &lt;element name="Rules" type="{http://www.iata.org/IATA/EDIST}RuleSetType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "OrdChangeNoticesType", propOrder = {
    "campaignReferral",
    "paymentRules",
    "pricingParameters",
    "priceVarianceRules",
    "taxExemptionRules"
})
public class OrdChangeNoticesType
    extends NoticeBaseType
{

    @XmlElement(name = "CampaignReferral")
    protected CampaignReferralType campaignReferral;
    @XmlElement(name = "PaymentRules")
    protected OrdChangeNoticesType.PaymentRules paymentRules;
    @XmlElement(name = "PricingParameters")
    protected OrdChangeNoticesType.PricingParameters pricingParameters;
    @XmlElement(name = "PriceVarianceRules")
    protected OrdChangeNoticesType.PriceVarianceRules priceVarianceRules;
    @XmlElement(name = "TaxExemptionRules")
    protected OrdChangeNoticesType.TaxExemptionRules taxExemptionRules;

    /**
     * Gets the value of the campaignReferral property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignReferralType }
     *     
     */
    public CampaignReferralType getCampaignReferral() {
        return campaignReferral;
    }

    /**
     * Sets the value of the campaignReferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignReferralType }
     *     
     */
    public void setCampaignReferral(CampaignReferralType value) {
        this.campaignReferral = value;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeNoticesType.PaymentRules }
     *     
     */
    public OrdChangeNoticesType.PaymentRules getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeNoticesType.PaymentRules }
     *     
     */
    public void setPaymentRules(OrdChangeNoticesType.PaymentRules value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the pricingParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeNoticesType.PricingParameters }
     *     
     */
    public OrdChangeNoticesType.PricingParameters getPricingParameters() {
        return pricingParameters;
    }

    /**
     * Sets the value of the pricingParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeNoticesType.PricingParameters }
     *     
     */
    public void setPricingParameters(OrdChangeNoticesType.PricingParameters value) {
        this.pricingParameters = value;
    }

    /**
     * Gets the value of the priceVarianceRules property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeNoticesType.PriceVarianceRules }
     *     
     */
    public OrdChangeNoticesType.PriceVarianceRules getPriceVarianceRules() {
        return priceVarianceRules;
    }

    /**
     * Sets the value of the priceVarianceRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeNoticesType.PriceVarianceRules }
     *     
     */
    public void setPriceVarianceRules(OrdChangeNoticesType.PriceVarianceRules value) {
        this.priceVarianceRules = value;
    }

    /**
     * Gets the value of the taxExemptionRules property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeNoticesType.TaxExemptionRules }
     *     
     */
    public OrdChangeNoticesType.TaxExemptionRules getTaxExemptionRules() {
        return taxExemptionRules;
    }

    /**
     * Sets the value of the taxExemptionRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeNoticesType.TaxExemptionRules }
     *     
     */
    public void setTaxExemptionRules(OrdChangeNoticesType.TaxExemptionRules value) {
        this.taxExemptionRules = value;
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
     *       &lt;attribute name="ProceedOnFailureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentRules {

        @XmlAttribute(name = "ProceedOnFailureInd")
        protected Boolean proceedOnFailureInd;

        /**
         * Gets the value of the proceedOnFailureInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isProceedOnFailureInd() {
            return proceedOnFailureInd;
        }

        /**
         * Sets the value of the proceedOnFailureInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setProceedOnFailureInd(Boolean value) {
            this.proceedOnFailureInd = value;
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
     *         &lt;element name="PriceVarianceRule" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                   &lt;element name="RuleID"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AcceptableVariance"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Name" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="RuleValid" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}YearPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}YearMonthPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TimePeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}QuarterPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}MonthPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DayPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DateTimePeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DatePeriod"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Currencies" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="InputCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *                             &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="VarianceRuleIndicatoricator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceVarianceRule"
    })
    public static class PriceVarianceRules {

        @XmlElement(name = "PriceVarianceRule", required = true)
        protected List<OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule> priceVarianceRule;
        @XmlAttribute(name = "trxItemKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String trxItemKey;
        @XmlAttribute(name = "VarianceRuleIndicatoricator")
        protected Boolean varianceRuleIndicatoricator;

        /**
         * Gets the value of the priceVarianceRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceVarianceRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceVarianceRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule }
         * 
         * 
         */
        public List<OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule> getPriceVarianceRule() {
            if (priceVarianceRule == null) {
                priceVarianceRule = new ArrayList<OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule>();
            }
            return this.priceVarianceRule;
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
         * Gets the value of the varianceRuleIndicatoricator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVarianceRuleIndicatoricator() {
            return varianceRuleIndicatoricator;
        }

        /**
         * Sets the value of the varianceRuleIndicatoricator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVarianceRuleIndicatoricator(Boolean value) {
            this.varianceRuleIndicatoricator = value;
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
         *         &lt;element name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *         &lt;element name="RuleID"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AcceptableVariance"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Name" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="RuleValid" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}YearPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}YearMonthPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TimePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}QuarterPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MonthPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DayPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DateTimePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DatePeriod"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Currencies" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="InputCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
         *                   &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
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
            "sequenceNbr",
            "ruleID",
            "acceptableVariance",
            "name",
            "owner",
            "ruleValid",
            "currencies",
            "associations",
            "remarks"
        })
        public static class PriceVarianceRule
            extends KeyWithMetaObjectBaseType
        {

            @XmlElement(name = "SequenceNbr")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger sequenceNbr;
            @XmlElement(name = "RuleID", required = true)
            protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID ruleID;
            @XmlElement(name = "AcceptableVariance", required = true)
            protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance acceptableVariance;
            @XmlElement(name = "Name")
            protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name name;
            @XmlElement(name = "Owner")
            protected String owner;
            @XmlElement(name = "RuleValid")
            protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid ruleValid;
            @XmlElement(name = "Currencies")
            protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies currencies;
            @XmlElement(name = "Associations")
            protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations associations;
            @XmlElement(name = "Remarks")
            protected RemarkType remarks;

            /**
             * Gets the value of the sequenceNbr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSequenceNbr() {
                return sequenceNbr;
            }

            /**
             * Sets the value of the sequenceNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSequenceNbr(BigInteger value) {
                this.sequenceNbr = value;
            }

            /**
             * Gets the value of the ruleID property.
             * 
             * @return
             *     possible object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID }
             *     
             */
            public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID getRuleID() {
                return ruleID;
            }

            /**
             * Sets the value of the ruleID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID }
             *     
             */
            public void setRuleID(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID value) {
                this.ruleID = value;
            }

            /**
             * Gets the value of the acceptableVariance property.
             * 
             * @return
             *     possible object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance }
             *     
             */
            public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance getAcceptableVariance() {
                return acceptableVariance;
            }

            /**
             * Sets the value of the acceptableVariance property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance }
             *     
             */
            public void setAcceptableVariance(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance value) {
                this.acceptableVariance = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name }
             *     
             */
            public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name }
             *     
             */
            public void setName(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name value) {
                this.name = value;
            }

            /**
             * Gets the value of the owner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Sets the value of the owner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Gets the value of the ruleValid property.
             * 
             * @return
             *     possible object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid }
             *     
             */
            public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid getRuleValid() {
                return ruleValid;
            }

            /**
             * Sets the value of the ruleValid property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid }
             *     
             */
            public void setRuleValid(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid value) {
                this.ruleValid = value;
            }

            /**
             * Gets the value of the currencies property.
             * 
             * @return
             *     possible object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies }
             *     
             */
            public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies getCurrencies() {
                return currencies;
            }

            /**
             * Sets the value of the currencies property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies }
             *     
             */
            public void setCurrencies(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies value) {
                this.currencies = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations }
             *     
             */
            public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations }
             *     
             */
            public void setAssociations(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations value) {
                this.associations = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/&gt;
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
                "percentageValue",
                "currencyAmountValue"
            })
            public static class AcceptableVariance {

                @XmlElement(name = "PercentageValue", required = true)
                protected BigDecimal percentageValue;
                @XmlElement(name = "CurrencyAmountValue", required = true)
                protected CurrencyAmountOptType currencyAmountValue;

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
             *         &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "offerSetReferences",
                "offerItemID",
                "passengers",
                "otherAssociation"
            })
            public static class Associations {

                @XmlList
                @XmlElement(name = "OfferSetReferences")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> offerSetReferences;
                @XmlElement(name = "OfferItemID")
                protected List<ItemIDType> offerItemID;
                @XmlElement(name = "Passengers")
                protected OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers passengers;
                @XmlElement(name = "OtherAssociation")
                protected List<OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation> otherAssociation;

                /**
                 * Gets the value of the offerSetReferences property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerSetReferences property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferSetReferences().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getOfferSetReferences() {
                    if (offerSetReferences == null) {
                        offerSetReferences = new ArrayList<Object>();
                    }
                    return this.offerSetReferences;
                }

                /**
                 * Associated Offer Item ID(s).
                 * Example: OFFER1226 Gets the value of the offerItemID property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerItemID property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferItemID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItemIDType }
                 * 
                 * 
                 */
                public List<ItemIDType> getOfferItemID() {
                    if (offerItemID == null) {
                        offerItemID = new ArrayList<ItemIDType>();
                    }
                    return this.offerItemID;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers }
                 *     
                 */
                public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers }
                 *     
                 */
                public void setPassengers(OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers value) {
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
                 * {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation }
                 * 
                 * 
                 */
                public List<OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation>();
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
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="InputCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "inputCode",
                "settlementCode"
            })
            public static class Currencies {

                @XmlElement(name = "InputCode")
                protected List<CurrencyCodeType> inputCode;
                @XmlElement(name = "SettlementCode")
                protected List<CurrencyCodeType> settlementCode;

                /**
                 * Gets the value of the inputCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the inputCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInputCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CurrencyCodeType }
                 * 
                 * 
                 */
                public List<CurrencyCodeType> getInputCode() {
                    if (inputCode == null) {
                        inputCode = new ArrayList<CurrencyCodeType>();
                    }
                    return this.inputCode;
                }

                /**
                 * Gets the value of the settlementCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the settlementCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSettlementCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CurrencyCodeType }
                 * 
                 * 
                 */
                public List<CurrencyCodeType> getSettlementCode() {
                    if (settlementCode == null) {
                        settlementCode = new ArrayList<CurrencyCodeType>();
                    }
                    return this.settlementCode;
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
            public static class Name {

                @XmlValue
                protected String value;

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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}YearPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}YearMonthPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TimePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}QuarterPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MonthPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DayPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DateTimePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DatePeriod"/&gt;
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
                "yearPeriod",
                "yearMonthPeriod",
                "timePeriod",
                "quarterPeriod",
                "monthPeriod",
                "dayPeriod",
                "dateTimePeriod",
                "datePeriod"
            })
            public static class RuleValid {

                @XmlElement(name = "YearPeriod", required = true)
                protected YearPeriodRepType yearPeriod;
                @XmlElement(name = "YearMonthPeriod", required = true)
                protected YearMonthPeriodRepType yearMonthPeriod;
                @XmlElement(name = "TimePeriod", required = true)
                protected TimePeriodRepType timePeriod;
                @XmlElement(name = "QuarterPeriod", required = true)
                protected QuarterPeriodRepType quarterPeriod;
                @XmlElement(name = "MonthPeriod", required = true)
                protected MonthPeriodRepType monthPeriod;
                @XmlElement(name = "DayPeriod", required = true)
                protected DayPeriodRepType dayPeriod;
                @XmlElement(name = "DateTimePeriod", required = true)
                protected DateTimePeriodRepType dateTimePeriod;
                @XmlElement(name = "DatePeriod", required = true)
                protected DatePeriodRepType datePeriod;

                /**
                 * Gets the value of the yearPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public YearPeriodRepType getYearPeriod() {
                    return yearPeriod;
                }

                /**
                 * Sets the value of the yearPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public void setYearPeriod(YearPeriodRepType value) {
                    this.yearPeriod = value;
                }

                /**
                 * Gets the value of the yearMonthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public YearMonthPeriodRepType getYearMonthPeriod() {
                    return yearMonthPeriod;
                }

                /**
                 * Sets the value of the yearMonthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public void setYearMonthPeriod(YearMonthPeriodRepType value) {
                    this.yearMonthPeriod = value;
                }

                /**
                 * Gets the value of the timePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public TimePeriodRepType getTimePeriod() {
                    return timePeriod;
                }

                /**
                 * Sets the value of the timePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public void setTimePeriod(TimePeriodRepType value) {
                    this.timePeriod = value;
                }

                /**
                 * Gets the value of the quarterPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public QuarterPeriodRepType getQuarterPeriod() {
                    return quarterPeriod;
                }

                /**
                 * Sets the value of the quarterPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public void setQuarterPeriod(QuarterPeriodRepType value) {
                    this.quarterPeriod = value;
                }

                /**
                 * Gets the value of the monthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public MonthPeriodRepType getMonthPeriod() {
                    return monthPeriod;
                }

                /**
                 * Sets the value of the monthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public void setMonthPeriod(MonthPeriodRepType value) {
                    this.monthPeriod = value;
                }

                /**
                 * Gets the value of the dayPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public DayPeriodRepType getDayPeriod() {
                    return dayPeriod;
                }

                /**
                 * Sets the value of the dayPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public void setDayPeriod(DayPeriodRepType value) {
                    this.dayPeriod = value;
                }

                /**
                 * Gets the value of the dateTimePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public DateTimePeriodRepType getDateTimePeriod() {
                    return dateTimePeriod;
                }

                /**
                 * Sets the value of the dateTimePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public void setDateTimePeriod(DateTimePeriodRepType value) {
                    this.dateTimePeriod = value;
                }

                /**
                 * Gets the value of the datePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public DatePeriodRepType getDatePeriod() {
                    return datePeriod;
                }

                /**
                 * Sets the value of the datePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public void setDatePeriod(DatePeriodRepType value) {
                    this.datePeriod = value;
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
     *       &lt;attribute name="AutoExchRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="IncludeAwardRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AwardOnlyRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="SimpleRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PricingParameters {

        @XmlAttribute(name = "AutoExchRequestInd")
        protected Boolean autoExchRequestInd;
        @XmlAttribute(name = "IncludeAwardRequestInd")
        protected Boolean includeAwardRequestInd;
        @XmlAttribute(name = "AwardOnlyRequestInd")
        protected Boolean awardOnlyRequestInd;
        @XmlAttribute(name = "SimpleRequestInd")
        protected Boolean simpleRequestInd;

        /**
         * Gets the value of the autoExchRequestInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoExchRequestInd() {
            return autoExchRequestInd;
        }

        /**
         * Sets the value of the autoExchRequestInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoExchRequestInd(Boolean value) {
            this.autoExchRequestInd = value;
        }

        /**
         * Gets the value of the includeAwardRequestInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeAwardRequestInd() {
            return includeAwardRequestInd;
        }

        /**
         * Sets the value of the includeAwardRequestInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeAwardRequestInd(Boolean value) {
            this.includeAwardRequestInd = value;
        }

        /**
         * Gets the value of the awardOnlyRequestInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardOnlyRequestInd() {
            return awardOnlyRequestInd;
        }

        /**
         * Sets the value of the awardOnlyRequestInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardOnlyRequestInd(Boolean value) {
            this.awardOnlyRequestInd = value;
        }

        /**
         * Gets the value of the simpleRequestInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSimpleRequestInd() {
            return simpleRequestInd;
        }

        /**
         * Sets the value of the simpleRequestInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSimpleRequestInd(Boolean value) {
            this.simpleRequestInd = value;
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
     *         &lt;element name="Named" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Countries" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryCode" maxOccurs="unbounded"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Entities" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Entity" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType"&gt;
     *                                   &lt;pattern value="[A-Z]{2}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Territories" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Territory" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType"&gt;
     *                                   &lt;pattern value="[A-Z]{2}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TaxCodes" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Designator"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;pattern value="[A-Z]{1,2}"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Nature" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;pattern value="[A-Z]{1,2}"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
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
     *         &lt;element name="Rules" type="{http://www.iata.org/IATA/EDIST}RuleSetType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "named",
        "rules"
    })
    public static class TaxExemptionRules {

        @XmlElement(name = "Named")
        protected OrdChangeNoticesType.TaxExemptionRules.Named named;
        @XmlElement(name = "Rules")
        protected RuleSetType rules;
        @XmlAttribute(name = "trxItemKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String trxItemKey;
        @XmlAttribute(name = "ExemptAllInd")
        protected Boolean exemptAllInd;

        /**
         * Gets the value of the named property.
         * 
         * @return
         *     possible object is
         *     {@link OrdChangeNoticesType.TaxExemptionRules.Named }
         *     
         */
        public OrdChangeNoticesType.TaxExemptionRules.Named getNamed() {
            return named;
        }

        /**
         * Sets the value of the named property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdChangeNoticesType.TaxExemptionRules.Named }
         *     
         */
        public void setNamed(OrdChangeNoticesType.TaxExemptionRules.Named value) {
            this.named = value;
        }

        /**
         * Gets the value of the rules property.
         * 
         * @return
         *     possible object is
         *     {@link RuleSetType }
         *     
         */
        public RuleSetType getRules() {
            return rules;
        }

        /**
         * Sets the value of the rules property.
         * 
         * @param value
         *     allowed object is
         *     {@link RuleSetType }
         *     
         */
        public void setRules(RuleSetType value) {
            this.rules = value;
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
         * Gets the value of the exemptAllInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExemptAllInd() {
            return exemptAllInd;
        }

        /**
         * Sets the value of the exemptAllInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExemptAllInd(Boolean value) {
            this.exemptAllInd = value;
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
         *         &lt;element name="Countries" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryCode" maxOccurs="unbounded"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Entities" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Entity" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType"&gt;
         *                         &lt;pattern value="[A-Z]{2}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Territories" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Territory" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType"&gt;
         *                         &lt;pattern value="[A-Z]{2}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TaxCodes" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Designator"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;pattern value="[A-Z]{1,2}"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Nature" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;pattern value="[A-Z]{1,2}"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
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
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "countries",
            "entities",
            "territories",
            "taxCodes"
        })
        public static class Named {

            @XmlElementWrapper(name = "Countries")
            @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<CountryCode> countries;
            @XmlElementWrapper(name = "Entities")
            @XmlElement(name = "Entity", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<String> entities;
            @XmlElementWrapper(name = "Territories")
            @XmlElement(name = "Territory", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<String> territories;
            @XmlElementWrapper(name = "TaxCodes")
            @XmlElement(name = "TaxCode", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode> taxCodes;

            public List<CountryCode> getCountries() {
                if (countries == null) {
                    countries = new ArrayList<CountryCode>();
                }
                return countries;
            }

            public void setCountries(List<CountryCode> countries) {
                this.countries = countries;
            }

            public List<String> getEntities() {
                if (entities == null) {
                    entities = new ArrayList<String>();
                }
                return entities;
            }

            public void setEntities(List<String> entities) {
                this.entities = entities;
            }

            public List<String> getTerritories() {
                if (territories == null) {
                    territories = new ArrayList<String>();
                }
                return territories;
            }

            public void setTerritories(List<String> territories) {
                this.territories = territories;
            }

            public List<OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode> getTaxCodes() {
                if (taxCodes == null) {
                    taxCodes = new ArrayList<OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode>();
                }
                return taxCodes;
            }

            public void setTaxCodes(List<OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode> taxCodes) {
                this.taxCodes = taxCodes;
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
             *         &lt;element name="Designator"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[A-Z]{1,2}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Nature" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[A-Z]{1,2}"/&gt;
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
                "designator",
                "nature"
            })
            public static class TaxCode {

                @XmlElement(name = "Designator", required = true)
                protected String designator;
                @XmlElement(name = "Nature")
                protected String nature;

                /**
                 * Gets the value of the designator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDesignator() {
                    return designator;
                }

                /**
                 * Sets the value of the designator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDesignator(String value) {
                    this.designator = value;
                }

                /**
                 * Gets the value of the nature property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNature() {
                    return nature;
                }

                /**
                 * Sets the value of the nature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNature(String value) {
                    this.nature = value;
                }

            }

        }

    }

}
