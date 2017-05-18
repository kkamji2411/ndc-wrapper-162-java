
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Payment Form Issue Alert definition.
 * Supported Use Cases:
 * - Incomplete: Payment Failure (pre-authorized hold and payment)
 * - Incomplete: Payment System Timeout, etc. (with RetryInd)
 * 
 * <p>Java class for PaymentIssueAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentIssueAlertType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}TrxProcessObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TrxProcessStatus" minOccurs="0"/&gt;
 *                   &lt;element name="InfoURL" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DataType" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *                   &lt;element name="Status" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusSimpleType"&gt;
 *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Failed" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Code"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="FailedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Incomplete" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Code"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}DataListObjAttrGroup"/&gt;
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
@XmlType(name = "PaymentIssueAlertType", propOrder = {
    "payment"
})
public class PaymentIssueAlertType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Payment")
    protected List<PaymentIssueAlertType.Payment> payment;

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIssueAlertType.Payment }
     * 
     * 
     */
    public List<PaymentIssueAlertType.Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentIssueAlertType.Payment>();
        }
        return this.payment;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TrxProcessStatus" minOccurs="0"/&gt;
     *         &lt;element name="InfoURL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DataType" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
     *         &lt;element name="Status" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusSimpleType"&gt;
     *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Failed" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Code"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="FailedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Incomplete" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Code"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}DataListObjAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trxProcessStatus",
        "infoURL",
        "dataType",
        "status",
        "failed",
        "incomplete"
    })
    public static class Payment {

        @XmlElement(name = "TrxProcessStatus")
        @XmlSchemaType(name = "anySimpleType")
        protected String trxProcessStatus;
        @XmlElement(name = "InfoURL")
        protected PaymentIssueAlertType.Payment.InfoURL infoURL;
        @XmlElement(name = "DataType")
        protected CodesetType dataType;
        @XmlElement(name = "Status")
        protected PaymentIssueAlertType.Payment.Status status;
        @XmlElement(name = "Failed")
        protected PaymentIssueAlertType.Payment.Failed failed;
        @XmlElement(name = "Incomplete")
        protected PaymentIssueAlertType.Payment.Incomplete incomplete;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the trxProcessStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrxProcessStatus() {
            return trxProcessStatus;
        }

        /**
         * Sets the value of the trxProcessStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrxProcessStatus(String value) {
            this.trxProcessStatus = value;
        }

        /**
         * Gets the value of the infoURL property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentIssueAlertType.Payment.InfoURL }
         *     
         */
        public PaymentIssueAlertType.Payment.InfoURL getInfoURL() {
            return infoURL;
        }

        /**
         * Sets the value of the infoURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentIssueAlertType.Payment.InfoURL }
         *     
         */
        public void setInfoURL(PaymentIssueAlertType.Payment.InfoURL value) {
            this.infoURL = value;
        }

        /**
         * Gets the value of the dataType property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getDataType() {
            return dataType;
        }

        /**
         * Sets the value of the dataType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setDataType(CodesetType value) {
            this.dataType = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentIssueAlertType.Payment.Status }
         *     
         */
        public PaymentIssueAlertType.Payment.Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentIssueAlertType.Payment.Status }
         *     
         */
        public void setStatus(PaymentIssueAlertType.Payment.Status value) {
            this.status = value;
        }

        /**
         * Gets the value of the failed property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentIssueAlertType.Payment.Failed }
         *     
         */
        public PaymentIssueAlertType.Payment.Failed getFailed() {
            return failed;
        }

        /**
         * Sets the value of the failed property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentIssueAlertType.Payment.Failed }
         *     
         */
        public void setFailed(PaymentIssueAlertType.Payment.Failed value) {
            this.failed = value;
        }

        /**
         * Gets the value of the incomplete property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentIssueAlertType.Payment.Incomplete }
         *     
         */
        public PaymentIssueAlertType.Payment.Incomplete getIncomplete() {
            return incomplete;
        }

        /**
         * Sets the value of the incomplete property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentIssueAlertType.Payment.Incomplete }
         *     
         */
        public void setIncomplete(PaymentIssueAlertType.Payment.Incomplete value) {
            this.incomplete = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
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
         *         &lt;element name="Code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="FailedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "associations",
            "remarks"
        })
        public static class Failed {

            @XmlElement(name = "Code", required = true)
            protected PaymentIssueAlertType.Payment.Failed.Code code;
            @XmlElement(name = "Associations")
            protected OrderItemAssociationType associations;
            @XmlElement(name = "Remarks")
            protected RemarkType remarks;
            @XmlAttribute(name = "FailedInd")
            protected Boolean failedInd;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentIssueAlertType.Payment.Failed.Code }
             *     
             */
            public PaymentIssueAlertType.Payment.Failed.Code getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentIssueAlertType.Payment.Failed.Code }
             *     
             */
            public void setCode(PaymentIssueAlertType.Payment.Failed.Code value) {
                this.code = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
            }

            /**
             * Payment Remark(s).
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
             * Gets the value of the failedInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFailedInd() {
                return failedInd;
            }

            /**
             * Sets the value of the failedInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFailedInd(Boolean value) {
                this.failedInd = value;
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
         *         &lt;element name="Code"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "associations",
            "remarks"
        })
        public static class Incomplete {

            @XmlElement(name = "Code", required = true)
            protected PaymentIssueAlertType.Payment.Incomplete.Code code;
            @XmlElement(name = "Associations")
            protected OrderItemAssociationType associations;
            @XmlElement(name = "Remarks")
            protected RemarkType remarks;
            @XmlAttribute(name = "PriceVarianceInd")
            protected Boolean priceVarianceInd;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentIssueAlertType.Payment.Incomplete.Code }
             *     
             */
            public PaymentIssueAlertType.Payment.Incomplete.Code getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentIssueAlertType.Payment.Incomplete.Code }
             *     
             */
            public void setCode(PaymentIssueAlertType.Payment.Incomplete.Code value) {
                this.code = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
            }

            /**
             * Payment Remark(s).
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
             * Gets the value of the priceVarianceInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPriceVarianceInd() {
                return priceVarianceInd;
            }

            /**
             * Sets the value of the priceVarianceInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPriceVarianceInd(Boolean value) {
                this.priceVarianceInd = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
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
        public static class InfoURL {

            @XmlValue
            @XmlSchemaType(name = "anyURI")
            protected String value;

            /**
             * Gets the value of the value property.
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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PaymentStatusSimpleType"&gt;
         *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
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
        public static class Status {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Context")
            protected String context;

            /**
             * 
             *         A data type for Payment Status. Examples: Canceled, Complete, Failed, MoreInformation, Partial
             *       
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

        }

    }

}
