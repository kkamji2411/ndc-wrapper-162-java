
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TaxExemptionNotice"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceFilterNotice"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingParametersNotice"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceVarianceNotice"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentRulesNotice"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InventoryGuaranteeNotif"/&gt;
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
    "taxExemptionNotice",
    "serviceFilterNotice",
    "pricingParametersNotice",
    "priceVarianceNotice",
    "paymentRulesNotice",
    "inventoryGuaranteeNotif"
})
public class Notice {

    @XmlElement(name = "TaxExemptionNotice")
    protected TaxExemptionNoticeType taxExemptionNotice;
    @XmlElement(name = "ServiceFilterNotice")
    protected ServiceFilterNoticeType serviceFilterNotice;
    @XmlElement(name = "PricingParametersNotice")
    protected PricingParametersNoticeType pricingParametersNotice;
    @XmlElement(name = "PriceVarianceNotice")
    protected PriceVarianceNotice priceVarianceNotice;
    @XmlElement(name = "PaymentRulesNotice")
    protected PaymentRulesNoticeType paymentRulesNotice;
    @XmlElement(name = "InventoryGuaranteeNotif")
    protected InvGuaranteeNoticeType inventoryGuaranteeNotif;

    /**
     * Gets the value of the taxExemptionNotice property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionNoticeType }
     *     
     */
    public TaxExemptionNoticeType getTaxExemptionNotice() {
        return taxExemptionNotice;
    }

    /**
     * Sets the value of the taxExemptionNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionNoticeType }
     *     
     */
    public void setTaxExemptionNotice(TaxExemptionNoticeType value) {
        this.taxExemptionNotice = value;
    }

    /**
     * Gets the value of the serviceFilterNotice property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFilterNoticeType }
     *     
     */
    public ServiceFilterNoticeType getServiceFilterNotice() {
        return serviceFilterNotice;
    }

    /**
     * Sets the value of the serviceFilterNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFilterNoticeType }
     *     
     */
    public void setServiceFilterNotice(ServiceFilterNoticeType value) {
        this.serviceFilterNotice = value;
    }

    /**
     * Gets the value of the pricingParametersNotice property.
     * 
     * @return
     *     possible object is
     *     {@link PricingParametersNoticeType }
     *     
     */
    public PricingParametersNoticeType getPricingParametersNotice() {
        return pricingParametersNotice;
    }

    /**
     * Sets the value of the pricingParametersNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParametersNoticeType }
     *     
     */
    public void setPricingParametersNotice(PricingParametersNoticeType value) {
        this.pricingParametersNotice = value;
    }

    /**
     * Price Variance Rule(s) Notice. Note: Supports specifying Payment Processing Rules, including payment failure. Request messages may include defined payment processing rules and an indicator requesting that the rules be applied during payment processing where relevant. Response messages may additionally include notice about if and how payment rule(s) were applied during transaction processing.
     *       
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceNotice }
     *     
     */
    public PriceVarianceNotice getPriceVarianceNotice() {
        return priceVarianceNotice;
    }

    /**
     * Sets the value of the priceVarianceNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceNotice }
     *     
     */
    public void setPriceVarianceNotice(PriceVarianceNotice value) {
        this.priceVarianceNotice = value;
    }

    /**
     * Gets the value of the paymentRulesNotice property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRulesNoticeType }
     *     
     */
    public PaymentRulesNoticeType getPaymentRulesNotice() {
        return paymentRulesNotice;
    }

    /**
     * Sets the value of the paymentRulesNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRulesNoticeType }
     *     
     */
    public void setPaymentRulesNotice(PaymentRulesNoticeType value) {
        this.paymentRulesNotice = value;
    }

    /**
     * Gets the value of the inventoryGuaranteeNotif property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeNoticeType }
     *     
     */
    public InvGuaranteeNoticeType getInventoryGuaranteeNotif() {
        return inventoryGuaranteeNotif;
    }

    /**
     * Sets the value of the inventoryGuaranteeNotif property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeNoticeType }
     *     
     */
    public void setInventoryGuaranteeNotif(InvGuaranteeNoticeType value) {
        this.inventoryGuaranteeNotif = value;
    }

}
