
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
import javax.xml.bind.annotation.XmlType;


/**
 * Inventory Discrepency Alert definition.
 * 
 * Note: This processing condition occurs when there is a discrepency between offered inventory and available inventory. It may include references to Alternate Offers.
 * 
 * <p>Java class for InvDiscrepencyAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvDiscrepencyAlertType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType" minOccurs="0"/&gt;
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer"/&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="NoInventoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvDiscrepencyAlertType", propOrder = {
    "code",
    "associations",
    "alternateOffers",
    "remarks"
})
public class InvDiscrepencyAlertType {

    @XmlElement(name = "Code")
    protected InvDiscrepencyAlertType.Code code;
    @XmlElement(name = "Associations")
    protected MultiAssociationType associations;
    @XmlElement(name = "AlternateOffers")
    protected InvDiscrepencyAlertType.AlternateOffers alternateOffers;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;
    @XmlAttribute(name = "NoInventoryInd")
    protected Boolean noInventoryInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link InvDiscrepencyAlertType.Code }
     *     
     */
    public InvDiscrepencyAlertType.Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvDiscrepencyAlertType.Code }
     *     
     */
    public void setCode(InvDiscrepencyAlertType.Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the alternateOffers property.
     * 
     * @return
     *     possible object is
     *     {@link InvDiscrepencyAlertType.AlternateOffers }
     *     
     */
    public InvDiscrepencyAlertType.AlternateOffers getAlternateOffers() {
        return alternateOffers;
    }

    /**
     * Sets the value of the alternateOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvDiscrepencyAlertType.AlternateOffers }
     *     
     */
    public void setAlternateOffers(InvDiscrepencyAlertType.AlternateOffers value) {
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
     *         &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type"/&gt;
     *         &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer"/&gt;
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
        protected List<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer> alternateOffer;

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
         * {@link InvDiscrepencyAlertType.AlternateOffers.AlternateOffer }
         * 
         * 
         */
        public List<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer> getAlternateOffer() {
            if (alternateOffer == null) {
                alternateOffer = new ArrayList<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer>();
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltBaggageOffer"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltOtherOffer"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltPricedFlightOffer"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AltSeatOffer"/&gt;
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
            "altOtherOffer",
            "altPricedFlightOffer",
            "altSeatOffer"
        })
        public static class AlternateOffer
            extends OfferType
        {

            @XmlElement(name = "AltBaggageOffer", required = true)
            protected AltBaggageOfferType altBaggageOffer;
            @XmlElement(name = "AltOtherOffer", required = true)
            protected AltOtherOfferType altOtherOffer;
            @XmlElement(name = "AltPricedFlightOffer", required = true)
            protected AltPricedFlightOfferType altPricedFlightOffer;
            @XmlElement(name = "AltSeatOffer", required = true)
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

}