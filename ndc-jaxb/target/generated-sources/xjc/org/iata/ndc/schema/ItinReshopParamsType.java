
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
 * Request Message Parameters.
 * 
 * <p>Java class for ItinReshopParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinReshopParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alerts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PIN_AuthAlertResponse" type="{http://www.iata.org/IATA/EDIST}PinPhraseAnswerType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}NoticeBaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PricingParameters" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="AutoExchRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="IncludeAwardRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="AwardOnlyRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="SimpleRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinReshopParamsType", propOrder = {
    "alerts",
    "notices",
    "currCodes"
})
public class ItinReshopParamsType {

    @XmlElement(name = "Alerts")
    protected ItinReshopParamsType.Alerts alerts;
    @XmlElement(name = "Notices")
    protected ItinReshopParamsType.Notices notices;
    @XmlElementWrapper(name = "CurrCodes")
    @XmlElement(name = "CurrCode", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<CurrCode> currCodes;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopParamsType.Alerts }
     *     
     */
    public ItinReshopParamsType.Alerts getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopParamsType.Alerts }
     *     
     */
    public void setAlerts(ItinReshopParamsType.Alerts value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopParamsType.Notices }
     *     
     */
    public ItinReshopParamsType.Notices getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopParamsType.Notices }
     *     
     */
    public void setNotices(ItinReshopParamsType.Notices value) {
        this.notices = value;
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

    public List<CurrCode> getCurrCodes() {
        if (currCodes == null) {
            currCodes = new ArrayList<CurrCode>();
        }
        return currCodes;
    }

    public void setCurrCodes(List<CurrCode> currCodes) {
        this.currCodes = currCodes;
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
     *         &lt;element name="PIN_AuthAlertResponse" type="{http://www.iata.org/IATA/EDIST}PinPhraseAnswerType" minOccurs="0"/&gt;
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
        "pinAuthAlertResponse"
    })
    public static class Alerts {

        @XmlElement(name = "PIN_AuthAlertResponse")
        protected PinPhraseAnswerType pinAuthAlertResponse;

        /**
         * Gets the value of the pinAuthAlertResponse property.
         * 
         * @return
         *     possible object is
         *     {@link PinPhraseAnswerType }
         *     
         */
        public PinPhraseAnswerType getPINAuthAlertResponse() {
            return pinAuthAlertResponse;
        }

        /**
         * Sets the value of the pinAuthAlertResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link PinPhraseAnswerType }
         *     
         */
        public void setPINAuthAlertResponse(PinPhraseAnswerType value) {
            this.pinAuthAlertResponse = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}NoticeBaseType"&gt;
     *       &lt;sequence&gt;
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
        "pricingParameters"
    })
    public static class Notices
        extends NoticeBaseType
    {

        @XmlElement(name = "PricingParameters")
        protected ItinReshopParamsType.Notices.PricingParameters pricingParameters;

        /**
         * Gets the value of the pricingParameters property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopParamsType.Notices.PricingParameters }
         *     
         */
        public ItinReshopParamsType.Notices.PricingParameters getPricingParameters() {
            return pricingParameters;
        }

        /**
         * Sets the value of the pricingParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopParamsType.Notices.PricingParameters }
         *     
         */
        public void setPricingParameters(ItinReshopParamsType.Notices.PricingParameters value) {
            this.pricingParameters = value;
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

    }

}
