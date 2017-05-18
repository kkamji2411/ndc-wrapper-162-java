
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="LeadDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="2"&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReference"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TotalAmount"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/&gt;
 *             &lt;element ref="{http://www.iata.org/IATA/EDIST}FareFiledIn" minOccurs="0"/&gt;
 *             &lt;element name="Surcharges" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST}FeeSurchargeType" maxOccurs="unbounded"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.iata.org/IATA/EDIST}TaxExemption" minOccurs="0"/&gt;
 *             &lt;choice&gt;
 *               &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType" minOccurs="0"/&gt;
 *               &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
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
    "leadDate",
    "requestedDate",
    "originDestinationReferenceOrSegmentReference",
    "totalAmount",
    "baseAmount",
    "fareFiledIn",
    "surcharges",
    "taxes",
    "taxExemption",
    "awardPricing",
    "combinationPricing"
})
@XmlRootElement(name = "LeadPrice")
public class LeadPrice {

    @XmlElement(name = "LeadDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leadDate;
    @XmlElement(name = "RequestedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDate;
    @XmlElementRefs({
        @XmlElementRef(name = "OriginDestinationReference", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SegmentReference", namespace = "http://www.iata.org/IATA/EDIST", type = SegmentReference.class, required = false)
    })
    protected List<Object> originDestinationReferenceOrSegmentReference;
    @XmlElement(name = "TotalAmount")
    protected LeadPrice.TotalAmount totalAmount;
    @XmlElement(name = "BaseAmount")
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "FareFiledIn")
    protected FareFilingType fareFiledIn;
    @XmlElementWrapper(name = "Surcharges")
    @XmlElement(name = "Surcharge", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FeeSurchargeType> surcharges;
    @XmlElement(name = "Taxes")
    protected TaxDetailType taxes;
    @XmlElement(name = "TaxExemption")
    protected TaxExemptionType taxExemption;
    @XmlElement(name = "AwardPricing")
    protected AwardPriceUnitType awardPricing;
    @XmlElement(name = "CombinationPricing")
    protected CombinationPriceType combinationPricing;

    /**
     * Gets the value of the leadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeadDate() {
        return leadDate;
    }

    /**
     * Sets the value of the leadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeadDate(XMLGregorianCalendar value) {
        this.leadDate = value;
    }

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDate(XMLGregorianCalendar value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the originDestinationReferenceOrSegmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationReferenceOrSegmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationReferenceOrSegmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link SegmentReference }
     * 
     * 
     */
    public List<Object> getOriginDestinationReferenceOrSegmentReference() {
        if (originDestinationReferenceOrSegmentReference == null) {
            originDestinationReferenceOrSegmentReference = new ArrayList<Object>();
        }
        return this.originDestinationReferenceOrSegmentReference;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LeadPrice.TotalAmount }
     *     
     */
    public LeadPrice.TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadPrice.TotalAmount }
     *     
     */
    public void setTotalAmount(LeadPrice.TotalAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setBaseAmount(CurrencyAmountOptType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the fareFiledIn property.
     * 
     * @return
     *     possible object is
     *     {@link FareFilingType }
     *     
     */
    public FareFilingType getFareFiledIn() {
        return fareFiledIn;
    }

    /**
     * Sets the value of the fareFiledIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFilingType }
     *     
     */
    public void setFareFiledIn(FareFilingType value) {
        this.fareFiledIn = value;
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
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType }
     *     
     */
    public TaxExemptionType getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType }
     *     
     */
    public void setTaxExemption(TaxExemptionType value) {
        this.taxExemption = value;
    }

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

    public List<FeeSurchargeType> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<FeeSurchargeType>();
        }
        return surcharges;
    }

    public void setSurcharges(List<FeeSurchargeType> surcharges) {
        this.surcharges = surcharges;
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
    public static class TotalAmount {

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

    }

}
