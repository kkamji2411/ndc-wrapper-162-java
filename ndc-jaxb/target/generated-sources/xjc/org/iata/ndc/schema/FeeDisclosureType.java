
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDisclosureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Surcharges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST}FeeSurchargeType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}FeeSurchargeType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Refundvalue" type="{http://www.iata.org/IATA/EDIST}TotalFareTransactionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDisclosureType", propOrder = {
    "surcharges",
    "taxes",
    "fees",
    "refundvalue"
})
public class FeeDisclosureType {

    @XmlElementWrapper(name = "Surcharges")
    @XmlElement(name = "Surcharge", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FeeSurchargeType> surcharges;
    @XmlElement(name = "Taxes")
    protected TaxDetailType taxes;
    @XmlElement(name = "Fees")
    protected FeeDisclosureType.Fees fees;
    @XmlElement(name = "Refundvalue")
    protected TotalFareTransactionType refundvalue;
    @XmlAttribute(name = "RefundInd")
    protected Boolean refundInd;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxes(TaxDetailType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDisclosureType.Fees }
     *     
     */
    public FeeDisclosureType.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDisclosureType.Fees }
     *     
     */
    public void setFees(FeeDisclosureType.Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the refundvalue property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFareTransactionType }
     *     
     */
    public TotalFareTransactionType getRefundvalue() {
        return refundvalue;
    }

    /**
     * Sets the value of the refundvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFareTransactionType }
     *     
     */
    public void setRefundvalue(TotalFareTransactionType value) {
        this.refundvalue = value;
    }

    /**
     * Gets the value of the refundInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

    public List<FeeSurchargeType> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<FeeSurchargeType>();
        }
        return surcharges;
    }

    public void setSurcharges(List<FeeSurchargeType> surcharges) {
        this.surcharges = surcharges;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FeeSurchargeType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Fees
        extends FeeSurchargeType
    {


    }

}
