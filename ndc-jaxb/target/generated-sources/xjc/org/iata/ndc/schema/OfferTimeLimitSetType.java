
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OFFER TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTimeLimitSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferExpiration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectKeyMetaAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}CoreDateGrpType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherLimit" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketByTimeLimit"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectKeyMetaAttrGroup"/&gt;
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
@XmlType(name = "OfferTimeLimitSetType", propOrder = {
    "offerExpiration",
    "payment",
    "otherLimits"
})
public class OfferTimeLimitSetType {

    @XmlElement(name = "OfferExpiration")
    protected OfferTimeLimitSetType.OfferExpiration offerExpiration;
    @XmlElement(name = "Payment")
    protected CoreDateGrpType payment;
    @XmlElementWrapper(name = "OtherLimits")
    @XmlElement(name = "OtherLimit", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OfferTimeLimitSetType.OtherLimit> otherLimits;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public OfferTimeLimitSetType.OfferExpiration getOfferExpiration() {
        return offerExpiration;
    }

    /**
     * Sets the value of the offerExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public void setOfferExpiration(OfferTimeLimitSetType.OfferExpiration value) {
        this.offerExpiration = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link CoreDateGrpType }
     *     
     */
    public CoreDateGrpType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreDateGrpType }
     *     
     */
    public void setPayment(CoreDateGrpType value) {
        this.payment = value;
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

    public List<OfferTimeLimitSetType.OtherLimit> getOtherLimits() {
        if (otherLimits == null) {
            otherLimits = new ArrayList<OfferTimeLimitSetType.OtherLimit>();
        }
        return otherLimits;
    }

    public void setOtherLimits(List<OfferTimeLimitSetType.OtherLimit> otherLimits) {
        this.otherLimits = otherLimits;
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
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectKeyMetaAttrGroup"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferExpiration
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String objectKey;

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketByTimeLimit"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectKeyMetaAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceGuaranteeTimeLimit",
        "ticketByTimeLimit"
    })
    public static class OtherLimit {

        @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
        protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
        @XmlElement(name = "TicketByTimeLimit", required = true)
        protected TicketByTimeLimitType ticketByTimeLimit;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String objectKey;

        /**
         * Gets the value of the priceGuaranteeTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
            return priceGuaranteeTimeLimit;
        }

        /**
         * Sets the value of the priceGuaranteeTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
            this.priceGuaranteeTimeLimit = value;
        }

        /**
         * Gets the value of the ticketByTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public TicketByTimeLimitType getTicketByTimeLimit() {
            return ticketByTimeLimit;
        }

        /**
         * Sets the value of the ticketByTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public void setTicketByTimeLimit(TicketByTimeLimitType value) {
            this.ticketByTimeLimit = value;
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

    }

}
