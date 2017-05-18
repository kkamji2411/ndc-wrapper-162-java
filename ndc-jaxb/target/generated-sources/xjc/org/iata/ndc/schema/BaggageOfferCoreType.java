
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Core Baggage Offer definition.
 * 
 * <p>Java class for BaggageOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageOfferCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPrice"&gt;
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
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="BagDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BagDetail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType"/&gt;
 *                             &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}BagOfferAssocType" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/&gt;
 *                             &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST}BagDisclosureType" minOccurs="0"/&gt;
 *                             &lt;element name="Price" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType"/&gt;
 *                                       &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType"/&gt;
 *                                       &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}DetailCurrencyPriceType"/&gt;
 *                                       &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/&gt;
 *                                       &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType"/&gt;
 *                                     &lt;/choice&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageOfferCoreType", propOrder = {
    "totalPrice",
    "validatingCarrier",
    "bagDetails"
})
@XmlSeeAlso({
    AltBaggageOfferType.class
})
public class BaggageOfferCoreType {

    @XmlElement(name = "TotalPrice", required = true)
    protected BaggageOfferCoreType.TotalPrice totalPrice;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElementWrapper(name = "BagDetails")
    @XmlElement(name = "BagDetail", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<BaggageOfferCoreType.BagDetail> bagDetails;

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferCoreType.TotalPrice }
     *     
     */
    public BaggageOfferCoreType.TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferCoreType.TotalPrice }
     *     
     */
    public void setTotalPrice(BaggageOfferCoreType.TotalPrice value) {
        this.totalPrice = value;
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

    public List<BaggageOfferCoreType.BagDetail> getBagDetails() {
        if (bagDetails == null) {
            bagDetails = new ArrayList<BaggageOfferCoreType.BagDetail>();
        }
        return bagDetails;
    }

    public void setBagDetails(List<BaggageOfferCoreType.BagDetail> bagDetails) {
        this.bagDetails = bagDetails;
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
     *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType"/&gt;
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}BagOfferAssocType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/&gt;
     *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST}BagDisclosureType" minOccurs="0"/&gt;
     *         &lt;element name="Price" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType"/&gt;
     *                   &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType"/&gt;
     *                   &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}DetailCurrencyPriceType"/&gt;
     *                   &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/&gt;
     *                   &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType"/&gt;
     *                 &lt;/choice&gt;
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
        "validatingCarrier",
        "associations",
        "checkedBags",
        "carryOnBags",
        "disclosure",
        "price"
    })
    public static class BagDetail {

        @XmlElement(name = "ValidatingCarrier", required = true)
        protected String validatingCarrier;
        @XmlElement(name = "Associations")
        protected BagOfferAssocType associations;
        @XmlElement(name = "CheckedBags")
        protected CheckedBags checkedBags;
        @XmlElement(name = "CarryOnBags")
        protected CarryOnBags carryOnBags;
        @XmlElement(name = "Disclosure")
        protected BagDisclosureType disclosure;
        @XmlElement(name = "Price")
        protected BaggageOfferCoreType.BagDetail.Price price;

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
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link BagOfferAssocType }
         *     
         */
        public BagOfferAssocType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagOfferAssocType }
         *     
         */
        public void setAssociations(BagOfferAssocType value) {
            this.associations = value;
        }

        /**
         * Gets the value of the checkedBags property.
         * 
         * @return
         *     possible object is
         *     {@link CheckedBags }
         *     
         */
        public CheckedBags getCheckedBags() {
            return checkedBags;
        }

        /**
         * Sets the value of the checkedBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckedBags }
         *     
         */
        public void setCheckedBags(CheckedBags value) {
            this.checkedBags = value;
        }

        /**
         * Gets the value of the carryOnBags property.
         * 
         * @return
         *     possible object is
         *     {@link CarryOnBags }
         *     
         */
        public CarryOnBags getCarryOnBags() {
            return carryOnBags;
        }

        /**
         * Sets the value of the carryOnBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link CarryOnBags }
         *     
         */
        public void setCarryOnBags(CarryOnBags value) {
            this.carryOnBags = value;
        }

        /**
         * Gets the value of the disclosure property.
         * 
         * @return
         *     possible object is
         *     {@link BagDisclosureType }
         *     
         */
        public BagDisclosureType getDisclosure() {
            return disclosure;
        }

        /**
         * Sets the value of the disclosure property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagDisclosureType }
         *     
         */
        public void setDisclosure(BagDisclosureType value) {
            this.disclosure = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageOfferCoreType.BagDetail.Price }
         *     
         */
        public BaggageOfferCoreType.BagDetail.Price getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageOfferCoreType.BagDetail.Price }
         *     
         */
        public void setPrice(BaggageOfferCoreType.BagDetail.Price value) {
            this.price = value;
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
         *         &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType"/&gt;
         *         &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType"/&gt;
         *         &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}DetailCurrencyPriceType"/&gt;
         *         &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/&gt;
         *         &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPriceType"/&gt;
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
            "detailCurrencyPrice",
            "encodedCurrencyPrice",
            "simpleCurrencyPrice"
        })
        public static class Price {

            @XmlElement(name = "AwardPricing")
            protected AwardPriceUnitType awardPricing;
            @XmlElement(name = "CombinationPricing")
            protected CombinationPriceType combinationPricing;
            @XmlElement(name = "DetailCurrencyPrice")
            protected DetailCurrencyPriceType detailCurrencyPrice;
            @XmlElement(name = "EncodedCurrencyPrice")
            protected EncodedPriceType encodedCurrencyPrice;
            @XmlElement(name = "SimpleCurrencyPrice")
            protected SimpleCurrencyPriceType simpleCurrencyPrice;

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
