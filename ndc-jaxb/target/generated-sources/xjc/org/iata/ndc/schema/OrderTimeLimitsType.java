
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
 * Order Time Limits definition.
 * 
 * <p>Java class for OrderTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderTimeLimitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentTimeLimit" minOccurs="0"/&gt;
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
@XmlType(name = "OrderTimeLimitsType", propOrder = {
    "paymentTimeLimit",
    "depositTimeLimit",
    "namingTimeLimit",
    "bilateralTimeLimits"
})
@XmlSeeAlso({
    org.iata.ndc.schema.OrderCoreChangeType.TimeLimits.class,
    OrderItemTimeLimitsType.class,
    OrderTimeLimits.class
})
public class OrderTimeLimitsType {

    @XmlElement(name = "PaymentTimeLimit")
    protected PaymentTimeLimitType paymentTimeLimit;
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
     *     {@link PaymentTimeLimitType }
     *     
     */
    public PaymentTimeLimitType getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * Sets the value of the paymentTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimeLimitType }
     *     
     */
    public void setPaymentTimeLimit(PaymentTimeLimitType value) {
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

}
