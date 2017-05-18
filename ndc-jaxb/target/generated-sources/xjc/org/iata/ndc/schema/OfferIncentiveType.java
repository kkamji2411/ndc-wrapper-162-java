
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * OFFER INCENTIVE information definition.
 * 
 * <p>Java class for OfferIncentiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferIncentiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Incentive" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferCodeID" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                   &lt;element name="ExpirationDate"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OfferSubCode" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CodesetValueSimpleType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AvailableUnits" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="DiscountLevel" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DiscountAmount"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DiscountPercent"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AugmentationPoint" minOccurs="0"/&gt;
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
@XmlType(name = "OfferIncentiveType", propOrder = {
    "incentive"
})
@XmlSeeAlso({
    org.iata.ndc.schema.OfferItemMetadataType.Incentives.class
})
public class OfferIncentiveType {

    @XmlElement(name = "Incentive", required = true)
    protected List<OfferIncentiveType.Incentive> incentive;

    /**
     * Gets the value of the incentive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incentive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferIncentiveType.Incentive }
     * 
     * 
     */
    public List<OfferIncentiveType.Incentive> getIncentive() {
        if (incentive == null) {
            incentive = new ArrayList<OfferIncentiveType.Incentive>();
        }
        return this.incentive;
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
     *         &lt;element name="OfferCodeID" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *         &lt;element name="ExpirationDate"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OfferSubCode" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CodesetValueSimpleType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AvailableUnits" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="DiscountLevel" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DiscountAmount"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DiscountPercent"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AugmentationPoint" minOccurs="0"/&gt;
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
        "offerCodeID",
        "expirationDate",
        "offerSubCode",
        "availableUnits",
        "discountLevel",
        "augmentationPoint"
    })
    public static class Incentive {

        @XmlElement(name = "OfferCodeID", required = true)
        protected String offerCodeID;
        @XmlElement(name = "ExpirationDate", required = true)
        protected OfferIncentiveType.Incentive.ExpirationDate expirationDate;
        @XmlElement(name = "OfferSubCode")
        protected OfferIncentiveType.Incentive.OfferSubCode offerSubCode;
        @XmlElement(name = "AvailableUnits")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger availableUnits;
        @XmlElement(name = "DiscountLevel")
        protected OfferIncentiveType.Incentive.DiscountLevel discountLevel;
        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the offerCodeID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfferCodeID() {
            return offerCodeID;
        }

        /**
         * Sets the value of the offerCodeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfferCodeID(String value) {
            this.offerCodeID = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link OfferIncentiveType.Incentive.ExpirationDate }
         *     
         */
        public OfferIncentiveType.Incentive.ExpirationDate getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferIncentiveType.Incentive.ExpirationDate }
         *     
         */
        public void setExpirationDate(OfferIncentiveType.Incentive.ExpirationDate value) {
            this.expirationDate = value;
        }

        /**
         * Gets the value of the offerSubCode property.
         * 
         * @return
         *     possible object is
         *     {@link OfferIncentiveType.Incentive.OfferSubCode }
         *     
         */
        public OfferIncentiveType.Incentive.OfferSubCode getOfferSubCode() {
            return offerSubCode;
        }

        /**
         * Sets the value of the offerSubCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferIncentiveType.Incentive.OfferSubCode }
         *     
         */
        public void setOfferSubCode(OfferIncentiveType.Incentive.OfferSubCode value) {
            this.offerSubCode = value;
        }

        /**
         * Gets the value of the availableUnits property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAvailableUnits() {
            return availableUnits;
        }

        /**
         * Sets the value of the availableUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAvailableUnits(BigInteger value) {
            this.availableUnits = value;
        }

        /**
         * Gets the value of the discountLevel property.
         * 
         * @return
         *     possible object is
         *     {@link OfferIncentiveType.Incentive.DiscountLevel }
         *     
         */
        public OfferIncentiveType.Incentive.DiscountLevel getDiscountLevel() {
            return discountLevel;
        }

        /**
         * Sets the value of the discountLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferIncentiveType.Incentive.DiscountLevel }
         *     
         */
        public void setDiscountLevel(OfferIncentiveType.Incentive.DiscountLevel value) {
            this.discountLevel = value;
        }

        /**
         * Gets the value of the augmentationPoint property.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DiscountAmount"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DiscountPercent"/&gt;
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
            "discountAmount",
            "discountPercent"
        })
        public static class DiscountLevel {

            @XmlElement(name = "DiscountAmount", required = true)
            protected CurrencyAmountOptType discountAmount;
            @XmlElement(name = "DiscountPercent")
            protected int discountPercent;

            /**
             * Gets the value of the discountAmount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getDiscountAmount() {
                return discountAmount;
            }

            /**
             * Sets the value of the discountAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setDiscountAmount(CurrencyAmountOptType value) {
                this.discountAmount = value;
            }

            /**
             * Gets the value of the discountPercent property.
             * 
             */
            public int getDiscountPercent() {
                return discountPercent;
            }

            /**
             * Sets the value of the discountPercent property.
             * 
             */
            public void setDiscountPercent(int value) {
                this.discountPercent = value;
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExpirationDate
            extends CoreDateGrpType
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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CodesetValueSimpleType"&gt;
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
        public static class OfferSubCode {

            @XmlValue
            protected String value;

            /**
             * Examples: A, ABC, 1
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

    }

}
