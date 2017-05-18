
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base type for a Transaction Processing Object.
 * 
 * <p>Java class for TrxProcessObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxProcessObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}TrxProcessObjAttrGroup"/&gt;
 *       &lt;attribute name="AuthResponseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumTryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NotProcessedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RetryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AuthRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxProcessObjectBaseType")
@XmlSeeAlso({
    CampaignReferralType.class,
    PINAuthTravelerType.class,
    SecurePaymentAlertType.class,
    PaymentRulesNoticeType.class,
    PricingParametersNoticeType.class,
    ServiceFilterNoticeType.class,
    TaxExemptionNoticeType.class,
    PaymentIssueAlertType.class,
    LocalizationNoticeType.class,
    PriceVarianceRuleNoticeType.class
})
public class TrxProcessObjectBaseType {

    @XmlAttribute(name = "AuthResponseInd")
    protected Boolean authResponseInd;
    @XmlAttribute(name = "MaximumTryInd")
    protected Boolean maximumTryInd;
    @XmlAttribute(name = "NotProcessedInd")
    protected Boolean notProcessedInd;
    @XmlAttribute(name = "RetryInd")
    protected Boolean retryInd;
    @XmlAttribute(name = "AuthRequestInd")
    protected Boolean authRequestInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "trxItemKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String trxItemKey;

    /**
     * Gets the value of the authResponseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthResponseInd() {
        return authResponseInd;
    }

    /**
     * Sets the value of the authResponseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthResponseInd(Boolean value) {
        this.authResponseInd = value;
    }

    /**
     * Gets the value of the maximumTryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTryInd() {
        return maximumTryInd;
    }

    /**
     * Sets the value of the maximumTryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTryInd(Boolean value) {
        this.maximumTryInd = value;
    }

    /**
     * Gets the value of the notProcessedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotProcessedInd() {
        return notProcessedInd;
    }

    /**
     * Sets the value of the notProcessedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotProcessedInd(Boolean value) {
        this.notProcessedInd = value;
    }

    /**
     * Gets the value of the retryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetryInd() {
        return retryInd;
    }

    /**
     * Sets the value of the retryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetryInd(Boolean value) {
        this.retryInd = value;
    }

    /**
     * Gets the value of the authRequestInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthRequestInd() {
        return authRequestInd;
    }

    /**
     * Sets the value of the authRequestInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthRequestInd(Boolean value) {
        this.authRequestInd = value;
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
     * Gets the value of the trxItemKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxItemKey() {
        return trxItemKey;
    }

    /**
     * Sets the value of the trxItemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxItemKey(String value) {
        this.trxItemKey = value;
    }

}
