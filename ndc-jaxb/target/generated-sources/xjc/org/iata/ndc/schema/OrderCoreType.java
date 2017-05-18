
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * CORE ORDER definition.
 * 
 * <p>Java class for OrderCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/&gt;
 *         &lt;element name="OriginalOrder" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginalOrderID" type="{http://www.iata.org/IATA/EDIST}OrderID_Type"/&gt;
 *                   &lt;element name="PriceQuotes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmount"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Source"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                               &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Commission"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
 *         &lt;element name="TotalOrderPrice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Payments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}PaymentProcessType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TimeLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaymentTimeLimit" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DepositTimeLimit" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}NamingTimeLimit" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BilateralTimeLimits" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderKeys" minOccurs="0"/&gt;
 *         &lt;element name="TotalOrderItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
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
@XmlType(name = "OrderCoreType", propOrder = {
    "orderID",
    "bookingReferences",
    "originalOrder",
    "totalOrderPrice",
    "status",
    "payments",
    "timeLimits",
    "orderKeys",
    "totalOrderItemQuantity"
})
@XmlSeeAlso({
    org.iata.ndc.schema.ItinReshopRS.Response.Order.class,
    org.iata.ndc.schema.OrderViewRS.Response.Order.class
})
public class OrderCoreType {

    @XmlElement(name = "OrderID", required = true)
    protected OrderIDType orderID;
    @XmlElementWrapper(name = "BookingReferences")
    @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<BookingReferenceType> bookingReferences;
    @XmlElement(name = "OriginalOrder")
    protected OrderCoreType.OriginalOrder originalOrder;
    @XmlElement(name = "TotalOrderPrice")
    protected OrderCoreType.TotalOrderPrice totalOrderPrice;
    @XmlElement(name = "Status")
    protected OrderCoreType.Status status;
    @XmlElementWrapper(name = "Payments")
    @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<PaymentProcessType> payments;
    @XmlElement(name = "TimeLimits")
    protected OrderCoreType.TimeLimits timeLimits;
    @XmlElement(name = "OrderKeys")
    protected OrderKeysType orderKeys;
    @XmlElement(name = "TotalOrderItemQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalOrderItemQuantity;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIDType }
     *     
     */
    public OrderIDType getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIDType }
     *     
     */
    public void setOrderID(OrderIDType value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the originalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.OriginalOrder }
     *     
     */
    public OrderCoreType.OriginalOrder getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.OriginalOrder }
     *     
     */
    public void setOriginalOrder(OrderCoreType.OriginalOrder value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the totalOrderPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.TotalOrderPrice }
     *     
     */
    public OrderCoreType.TotalOrderPrice getTotalOrderPrice() {
        return totalOrderPrice;
    }

    /**
     * Sets the value of the totalOrderPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.TotalOrderPrice }
     *     
     */
    public void setTotalOrderPrice(OrderCoreType.TotalOrderPrice value) {
        this.totalOrderPrice = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.Status }
     *     
     */
    public OrderCoreType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.Status }
     *     
     */
    public void setStatus(OrderCoreType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.TimeLimits }
     *     
     */
    public OrderCoreType.TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.TimeLimits }
     *     
     */
    public void setTimeLimits(OrderCoreType.TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the orderKeys property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType }
     *     
     */
    public OrderKeysType getOrderKeys() {
        return orderKeys;
    }

    /**
     * Sets the value of the orderKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType }
     *     
     */
    public void setOrderKeys(OrderKeysType value) {
        this.orderKeys = value;
    }

    /**
     * Gets the value of the totalOrderItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalOrderItemQuantity() {
        return totalOrderItemQuantity;
    }

    /**
     * Sets the value of the totalOrderItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOrderItemQuantity(BigInteger value) {
        this.totalOrderItemQuantity = value;
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

    public List<BookingReferenceType> getBookingReferences() {
        if (bookingReferences == null) {
            bookingReferences = new ArrayList<BookingReferenceType>();
        }
        return bookingReferences;
    }

    public void setBookingReferences(List<BookingReferenceType> bookingReferences) {
        this.bookingReferences = bookingReferences;
    }

    public List<PaymentProcessType> getPayments() {
        if (payments == null) {
            payments = new ArrayList<PaymentProcessType>();
        }
        return payments;
    }

    public void setPayments(List<PaymentProcessType> payments) {
        this.payments = payments;
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
     *         &lt;element name="OriginalOrderID" type="{http://www.iata.org/IATA/EDIST}OrderID_Type"/&gt;
     *         &lt;element name="PriceQuotes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Amount"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmount"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Source"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Commission"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
        "originalOrderID",
        "priceQuotes"
    })
    public static class OriginalOrder {

        @XmlElement(name = "OriginalOrderID", required = true)
        protected OrderIDType originalOrderID;
        @XmlElementWrapper(name = "PriceQuotes")
        @XmlElement(name = "PriceQuote", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderCoreType.OriginalOrder.PriceQuote> priceQuotes;

        /**
         * Gets the value of the originalOrderID property.
         * 
         * @return
         *     possible object is
         *     {@link OrderIDType }
         *     
         */
        public OrderIDType getOriginalOrderID() {
            return originalOrderID;
        }

        /**
         * Sets the value of the originalOrderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderIDType }
         *     
         */
        public void setOriginalOrderID(OrderIDType value) {
            this.originalOrderID = value;
        }

        public List<OrderCoreType.OriginalOrder.PriceQuote> getPriceQuotes() {
            if (priceQuotes == null) {
                priceQuotes = new ArrayList<OrderCoreType.OriginalOrder.PriceQuote>();
            }
            return priceQuotes;
        }

        public void setPriceQuotes(List<OrderCoreType.OriginalOrder.PriceQuote> priceQuotes) {
            this.priceQuotes = priceQuotes;
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
         *         &lt;element name="Amount"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmount"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Source"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Commission"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
            "source",
            "commission",
            "priceGuaranteeTimeLimit"
        })
        public static class PriceQuote {

            @XmlElement(name = "Amount", required = true)
            protected OrderCoreType.OriginalOrder.PriceQuote.Amount amount;
            @XmlElement(name = "Source", required = true)
            protected OrderCoreType.OriginalOrder.PriceQuote.Source source;
            @XmlElement(name = "Commission", required = true)
            protected CommissionType commission;
            @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
            protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
            @XmlAttribute(name = "CreatedDate")
            @XmlSchemaType(name = "anySimpleType")
            protected String createdDate;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCoreType.OriginalOrder.PriceQuote.Amount }
             *     
             */
            public OrderCoreType.OriginalOrder.PriceQuote.Amount getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCoreType.OriginalOrder.PriceQuote.Amount }
             *     
             */
            public void setAmount(OrderCoreType.OriginalOrder.PriceQuote.Amount value) {
                this.amount = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCoreType.OriginalOrder.PriceQuote.Source }
             *     
             */
            public OrderCoreType.OriginalOrder.PriceQuote.Source getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCoreType.OriginalOrder.PriceQuote.Source }
             *     
             */
            public void setSource(OrderCoreType.OriginalOrder.PriceQuote.Source value) {
                this.source = value;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link CommissionType }
             *     
             */
            public CommissionType getCommission() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommissionType }
             *     
             */
            public void setCommission(CommissionType value) {
                this.commission = value;
            }

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
             * Gets the value of the createdDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedDate() {
                return createdDate;
            }

            /**
             * Sets the value of the createdDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedDate(String value) {
                this.createdDate = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmount"/&gt;
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
                "currencyAmount"
            })
            public static class Amount {

                @XmlElement(name = "CurrencyAmount", required = true)
                protected CurrencyAmountOptType currencyAmount;

                /**
                 * Gets the value of the currencyAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public CurrencyAmountOptType getCurrencyAmount() {
                    return currencyAmount;
                }

                /**
                 * Sets the value of the currencyAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public void setCurrencyAmount(CurrencyAmountOptType value) {
                    this.currencyAmount = value;
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
             *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Source {

                @XmlAttribute(name = "Owner")
                @XmlSchemaType(name = "anySimpleType")
                protected String owner;
                @XmlAttribute(name = "Reference")
                @XmlSchemaType(name = "anySimpleType")
                protected String reference;

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
                 * Gets the value of the reference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReference() {
                    return reference;
                }

                /**
                 * Sets the value of the reference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReference(String value) {
                    this.reference = value;
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
     *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusCode"
    })
    public static class Status {

        @XmlElement(name = "StatusCode", required = true)
        protected CodesetType statusCode;
        @XmlAttribute(name = "ChangeOfGaugeInd")
        protected Boolean changeOfGaugeInd;
        @XmlAttribute(name = "ScheduleChangeInd")
        protected Boolean scheduleChangeInd;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setStatusCode(CodesetType value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the changeOfGaugeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChangeOfGaugeInd() {
            return changeOfGaugeInd;
        }

        /**
         * Sets the value of the changeOfGaugeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeOfGaugeInd(Boolean value) {
            this.changeOfGaugeInd = value;
        }

        /**
         * Gets the value of the scheduleChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isScheduleChangeInd() {
            return scheduleChangeInd;
        }

        /**
         * Sets the value of the scheduleChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setScheduleChangeInd(Boolean value) {
            this.scheduleChangeInd = value;
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
     *         &lt;element name="PaymentTimeLimit" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DepositTimeLimit" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}NamingTimeLimit" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BilateralTimeLimits" minOccurs="0"/&gt;
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
        "paymentTimeLimit",
        "depositTimeLimit",
        "namingTimeLimit",
        "bilateralTimeLimits"
    })
    public static class TimeLimits {

        @XmlElement(name = "PaymentTimeLimit")
        protected OrderCoreType.TimeLimits.PaymentTimeLimit paymentTimeLimit;
        @XmlElement(name = "DepositTimeLimit")
        protected DepositTimeLimit depositTimeLimit;
        @XmlElement(name = "NamingTimeLimit")
        protected NamingTimeLimit namingTimeLimit;
        @XmlElementWrapper(name = "BilateralTimeLimits")
        @XmlElement(name = "BilateralTimeLimit", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<BilateralTimeLimit> bilateralTimeLimits;

        /**
         * Gets the value of the paymentTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCoreType.TimeLimits.PaymentTimeLimit }
         *     
         */
        public OrderCoreType.TimeLimits.PaymentTimeLimit getPaymentTimeLimit() {
            return paymentTimeLimit;
        }

        /**
         * Sets the value of the paymentTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCoreType.TimeLimits.PaymentTimeLimit }
         *     
         */
        public void setPaymentTimeLimit(OrderCoreType.TimeLimits.PaymentTimeLimit value) {
            this.paymentTimeLimit = value;
        }

        /**
         * Gets the value of the depositTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link DepositTimeLimit }
         *     
         */
        public DepositTimeLimit getDepositTimeLimit() {
            return depositTimeLimit;
        }

        /**
         * Sets the value of the depositTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepositTimeLimit }
         *     
         */
        public void setDepositTimeLimit(DepositTimeLimit value) {
            this.depositTimeLimit = value;
        }

        /**
         * Gets the value of the namingTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link NamingTimeLimit }
         *     
         */
        public NamingTimeLimit getNamingTimeLimit() {
            return namingTimeLimit;
        }

        /**
         * Sets the value of the namingTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link NamingTimeLimit }
         *     
         */
        public void setNamingTimeLimit(NamingTimeLimit value) {
            this.namingTimeLimit = value;
        }

        public List<BilateralTimeLimit> getBilateralTimeLimits() {
            if (bilateralTimeLimits == null) {
                bilateralTimeLimits = new ArrayList<BilateralTimeLimit>();
            }
            return bilateralTimeLimits;
        }

        public void setBilateralTimeLimits(List<BilateralTimeLimit> bilateralTimeLimits) {
            this.bilateralTimeLimits = bilateralTimeLimits;
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
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentTimeLimit
            extends CoreDateGrpType
        {

            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/&gt;
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
    public static class TotalOrderPrice {

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
