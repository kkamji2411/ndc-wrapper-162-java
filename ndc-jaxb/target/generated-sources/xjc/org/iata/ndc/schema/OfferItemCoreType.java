
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * CORE OFFER definition.
 * 
 * <p>Java class for OfferItemCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PTC_Priced" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ApplyToAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RedemptionOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST}ItemID_Type"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ValidatingCarrier" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST}OfferTimeLimitSetType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DescriptionReferences" minOccurs="0"/&gt;
 *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST}DisclosureType" minOccurs="0"/&gt;
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST}OfferPenaltyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="RequestedDateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemCoreType", propOrder = {
    "parameters",
    "offerID",
    "validatingCarrier",
    "timeLimits",
    "totalPrice",
    "descriptionReferences",
    "disclosure",
    "penalty"
})
@XmlSeeAlso({
    OfferItemDetailType.class
})
public class OfferItemCoreType {

    @XmlElement(name = "Parameters")
    protected OfferItemCoreType.Parameters parameters;
    @XmlElement(name = "OfferID", required = true)
    protected ItemIDType offerID;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "TimeLimits")
    protected OfferTimeLimitSetType timeLimits;
    @XmlElement(name = "TotalPrice")
    protected OfferItemCoreType.TotalPrice totalPrice;
    @XmlList
    @XmlElement(name = "DescriptionReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> descriptionReferences;
    @XmlElement(name = "Disclosure")
    protected DisclosureType disclosure;
    @XmlElement(name = "Penalty")
    protected OfferPenaltyType penalty;
    @XmlAttribute(name = "RequestedDateInd")
    protected Boolean requestedDateInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemCoreType.Parameters }
     *     
     */
    public OfferItemCoreType.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemCoreType.Parameters }
     *     
     */
    public void setParameters(OfferItemCoreType.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOfferID(ItemIDType value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrier(String value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType }
     *     
     */
    public OfferTimeLimitSetType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType }
     *     
     */
    public void setTimeLimits(OfferTimeLimitSetType value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemCoreType.TotalPrice }
     *     
     */
    public OfferItemCoreType.TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemCoreType.TotalPrice }
     *     
     */
    public void setTotalPrice(OfferItemCoreType.TotalPrice value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the descriptionReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDescriptionReferences() {
        if (descriptionReferences == null) {
            descriptionReferences = new ArrayList<Object>();
        }
        return this.descriptionReferences;
    }

    /**
     * Gets the value of the disclosure property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureType }
     *     
     */
    public DisclosureType getDisclosure() {
        return disclosure;
    }

    /**
     * Sets the value of the disclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureType }
     *     
     */
    public void setDisclosure(DisclosureType value) {
        this.disclosure = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPenaltyType }
     *     
     */
    public OfferPenaltyType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPenaltyType }
     *     
     */
    public void setPenalty(OfferPenaltyType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
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
     *         &lt;element name="TotalItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PTC_Priced" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ApplyToAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RedemptionOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalItemQuantity",
        "ptcPriced"
    })
    public static class Parameters {

        @XmlElement(name = "TotalItemQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger totalItemQuantity;
        @XmlElement(name = "PTC_Priced")
        protected List<PTCQuantityPricedType> ptcPriced;
        @XmlAttribute(name = "ApplyToAllInd")
        protected Boolean applyToAllInd;
        @XmlAttribute(name = "RedemptionOnlyInd")
        protected Boolean redemptionOnlyInd;

        /**
         * Gets the value of the totalItemQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalItemQuantity() {
            return totalItemQuantity;
        }

        /**
         * Sets the value of the totalItemQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalItemQuantity(BigInteger value) {
            this.totalItemQuantity = value;
        }

        /**
         * Requested and Priced PTC (passenger type code) and associated Traveler quantity.Gets the value of the ptcPriced property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcPriced property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCPriced().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCQuantityPricedType }
         * 
         * 
         */
        public List<PTCQuantityPricedType> getPTCPriced() {
            if (ptcPriced == null) {
                ptcPriced = new ArrayList<PTCQuantityPricedType>();
            }
            return this.ptcPriced;
        }

        /**
         * Gets the value of the applyToAllInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isApplyToAllInd() {
            return applyToAllInd;
        }

        /**
         * Sets the value of the applyToAllInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setApplyToAllInd(Boolean value) {
            this.applyToAllInd = value;
        }

        /**
         * Gets the value of the redemptionOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRedemptionOnlyInd() {
            return redemptionOnlyInd;
        }

        /**
         * Sets the value of the redemptionOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRedemptionOnlyInd(Boolean value) {
            this.redemptionOnlyInd = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
     *       &lt;/choice&gt;
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
        "awardPricing",
        "combinationPricing",
        "simpleCurrencyPrice",
        "detailCurrencyPrice",
        "encodedCurrencyPrice"
    })
    public static class TotalPrice {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType }
         *     
         */
        public CombinationPriceType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType }
         *     
         */
        public void setCombinationPricing(CombinationPriceType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

        /**
         * Gets the value of the detailCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public DetailCurrencyPriceType getDetailCurrencyPrice() {
            return detailCurrencyPrice;
        }

        /**
         * Sets the value of the detailCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
            this.detailCurrencyPrice = value;
        }

        /**
         * Gets the value of the encodedCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link EncodedPriceType }
         *     
         */
        public EncodedPriceType getEncodedCurrencyPrice() {
            return encodedCurrencyPrice;
        }

        /**
         * Sets the value of the encodedCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link EncodedPriceType }
         *     
         */
        public void setEncodedCurrencyPrice(EncodedPriceType value) {
            this.encodedCurrencyPrice = value;
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
