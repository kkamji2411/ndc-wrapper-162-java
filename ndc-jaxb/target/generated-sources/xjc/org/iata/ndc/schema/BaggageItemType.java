
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * A BAGGAGE OFFER with additional Significant Carrier, Baggage Characteristics (e.g. dimensions/ weight) and Disclosures.
 * 
 * <p>Java class for BaggageItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
 *                 &lt;/sequence&gt;
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/&gt;
 *                             &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST}BagDisclosureType" minOccurs="0"/&gt;
 *                             &lt;element name="Price" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDetailAssociation" minOccurs="0"/&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageItemType", propOrder = {
    "price",
    "validatingCarrier",
    "bagDetails"
})
public class BaggageItemType {

    @XmlElement(name = "Price")
    protected BaggageItemType.Price price;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElementWrapper(name = "BagDetails")
    @XmlElement(name = "BagDetail", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<BaggageItemType.BagDetail> bagDetails;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageItemType.Price }
     *     
     */
    public BaggageItemType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType.Price }
     *     
     */
    public void setPrice(BaggageItemType.Price value) {
        this.price = value;
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

    public List<BaggageItemType.BagDetail> getBagDetails() {
        if (bagDetails == null) {
            bagDetails = new ArrayList<BaggageItemType.BagDetail>();
        }
        return bagDetails;
    }

    public void setBagDetails(List<BaggageItemType.BagDetail> bagDetails) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/&gt;
     *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST}BagDisclosureType" minOccurs="0"/&gt;
     *         &lt;element name="Price" minOccurs="0"&gt;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDetailAssociation" minOccurs="0"/&gt;
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
        "checkedBags",
        "carryOnBags",
        "disclosure",
        "price",
        "bagDetailAssociation"
    })
    public static class BagDetail {

        @XmlElement(name = "ValidatingCarrier", required = true)
        protected String validatingCarrier;
        @XmlElement(name = "CheckedBags")
        protected CheckedBags checkedBags;
        @XmlElement(name = "CarryOnBags")
        protected CarryOnBags carryOnBags;
        @XmlElement(name = "Disclosure")
        protected BagDisclosureType disclosure;
        @XmlElement(name = "Price")
        protected BaggageItemType.BagDetail.Price price;
        @XmlElement(name = "BagDetailAssociation")
        protected BagDetailAssociation bagDetailAssociation;

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
         *     {@link BaggageItemType.BagDetail.Price }
         *     
         */
        public BaggageItemType.BagDetail.Price getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageItemType.BagDetail.Price }
         *     
         */
        public void setPrice(BaggageItemType.BagDetail.Price value) {
            this.price = value;
        }

        /**
         * Gets the value of the bagDetailAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link BagDetailAssociation }
         *     
         */
        public BagDetailAssociation getBagDetailAssociation() {
            return bagDetailAssociation;
        }

        /**
         * Sets the value of the bagDetailAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagDetailAssociation }
         *     
         */
        public void setBagDetailAssociation(BagDetailAssociation value) {
            this.bagDetailAssociation = value;
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
        public static class Price {

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
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
        "simpleCurrencyPrice",
        "encodedCurrencyPrice",
        "detailCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class Price {

        @XmlElement(name = "SimpleCurrencyPrice", required = true)
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice", required = true)
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice", required = true)
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "CombinationPricing", required = true)
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "AwardPricing", required = true)
        protected AwardPriceUnitType awardPricing;

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

    }

}
