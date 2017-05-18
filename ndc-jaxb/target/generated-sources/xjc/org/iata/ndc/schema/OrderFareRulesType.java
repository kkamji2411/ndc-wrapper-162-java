
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order FARE RULES definition.
 * 
 * <p>Java class for OrderFareRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFareRulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Penalty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CorporateFare" minOccurs="0"/&gt;
 *         &lt;element name="AdvanceStay" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AdvancePurchase" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AdvanceTicketing" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MinimumStay" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MaximumStay" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderFareRulesType", propOrder = {
    "penalty",
    "corporateFare",
    "advanceStay",
    "remarks"
})
public class OrderFareRulesType {

    @XmlElement(name = "Penalty")
    protected PenaltyDetailType penalty;
    @XmlElement(name = "CorporateFare")
    protected CorporateFare corporateFare;
    @XmlElement(name = "AdvanceStay")
    protected OrderFareRulesType.AdvanceStay advanceStay;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyDetailType }
     *     
     */
    public PenaltyDetailType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyDetailType }
     *     
     */
    public void setPenalty(PenaltyDetailType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the corporateFare property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFare }
     *     
     */
    public CorporateFare getCorporateFare() {
        return corporateFare;
    }

    /**
     * Sets the value of the corporateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFare }
     *     
     */
    public void setCorporateFare(CorporateFare value) {
        this.corporateFare = value;
    }

    /**
     * Gets the value of the advanceStay property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFareRulesType.AdvanceStay }
     *     
     */
    public OrderFareRulesType.AdvanceStay getAdvanceStay() {
        return advanceStay;
    }

    /**
     * Sets the value of the advanceStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFareRulesType.AdvanceStay }
     *     
     */
    public void setAdvanceStay(OrderFareRulesType.AdvanceStay value) {
        this.advanceStay = value;
    }

    /**
     * Fare Remark(s).
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AdvancePurchase" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AdvanceTicketing" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MinimumStay" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MaximumStay" minOccurs="0"/&gt;
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
        "advancePurchase",
        "advanceTicketing",
        "minimumStay",
        "maximumStay"
    })
    public static class AdvanceStay {

        @XmlElement(name = "AdvancePurchase")
        protected AdvancePurchase advancePurchase;
        @XmlElement(name = "AdvanceTicketing")
        protected AdvanceTicketing advanceTicketing;
        @XmlElement(name = "MinimumStay")
        protected MinimumStay minimumStay;
        @XmlElement(name = "MaximumStay")
        protected MaximumStay maximumStay;

        /**
         * Gets the value of the advancePurchase property.
         * 
         * @return
         *     possible object is
         *     {@link AdvancePurchase }
         *     
         */
        public AdvancePurchase getAdvancePurchase() {
            return advancePurchase;
        }

        /**
         * Sets the value of the advancePurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvancePurchase }
         *     
         */
        public void setAdvancePurchase(AdvancePurchase value) {
            this.advancePurchase = value;
        }

        /**
         * Gets the value of the advanceTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvanceTicketing }
         *     
         */
        public AdvanceTicketing getAdvanceTicketing() {
            return advanceTicketing;
        }

        /**
         * Sets the value of the advanceTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvanceTicketing }
         *     
         */
        public void setAdvanceTicketing(AdvanceTicketing value) {
            this.advanceTicketing = value;
        }

        /**
         * Gets the value of the minimumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MinimumStay }
         *     
         */
        public MinimumStay getMinimumStay() {
            return minimumStay;
        }

        /**
         * Sets the value of the minimumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinimumStay }
         *     
         */
        public void setMinimumStay(MinimumStay value) {
            this.minimumStay = value;
        }

        /**
         * Gets the value of the maximumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MaximumStay }
         *     
         */
        public MaximumStay getMaximumStay() {
            return maximumStay;
        }

        /**
         * Sets the value of the maximumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaximumStay }
         *     
         */
        public void setMaximumStay(MaximumStay value) {
            this.maximumStay = value;
        }

    }

}
