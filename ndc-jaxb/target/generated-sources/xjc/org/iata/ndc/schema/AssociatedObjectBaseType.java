
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base type for an Object with Instance Associations.
 * 
 * <p>Java class for AssociatedObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefundAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DisclosureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BrowserInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedObjectBaseType")
@XmlSeeAlso({
    org.iata.ndc.schema.AirShopReqParamsType.ServiceFilters.class,
    org.iata.ndc.schema.AirShopReqParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.AirShopReqAffinityQueryType.OriginDestination.class,
    AirShopReqAttributeQueryTypeOriginDestination.class,
    org.iata.ndc.schema.FltPriceReqParamsType.ServiceFilters.class,
    org.iata.ndc.schema.FltPriceReqParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.FltPriceResParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.OrderViewRS.Response.Amendment.OfferItem.class,
    org.iata.ndc.schema.SeatAvailReqParamsType.ServiceFilters.class,
    org.iata.ndc.schema.SeatAvailReqParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.SeatAvailResParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.SrvListReqParamsType.ServiceFilters.class,
    org.iata.ndc.schema.SrvListReqParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.SrvListResParamsType.Pricing.FeeExemption.class,
    org.iata.ndc.schema.AirShopResParamsType.Pricing.FeeExemption.class,
    ItinReshopAlertsType.class,
    OrdChangeAlertsType.class,
    OrderListAlertsType.class,
    OrdCreateAlertsType.class,
    OrdRetrieveAlertsType.class
})
public class AssociatedObjectBaseType {

    @XmlAttribute(name = "ApproxInd")
    protected Boolean approxInd;
    @XmlAttribute(name = "RefundAllInd")
    protected Boolean refundAllInd;
    @XmlAttribute(name = "ExemptAllInd")
    protected Boolean exemptAllInd;
    @XmlAttribute(name = "AllGuaranteeInd")
    protected Boolean allGuaranteeInd;
    @XmlAttribute(name = "DisclosureInd")
    protected Boolean disclosureInd;
    @XmlAttribute(name = "BrowserInd")
    protected Boolean browserInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the approxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproxInd() {
        return approxInd;
    }

    /**
     * Sets the value of the approxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproxInd(Boolean value) {
        this.approxInd = value;
    }

    /**
     * Gets the value of the refundAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundAllInd() {
        return refundAllInd;
    }

    /**
     * Sets the value of the refundAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundAllInd(Boolean value) {
        this.refundAllInd = value;
    }

    /**
     * Gets the value of the exemptAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptAllInd() {
        return exemptAllInd;
    }

    /**
     * Sets the value of the exemptAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemptAllInd(Boolean value) {
        this.exemptAllInd = value;
    }

    /**
     * Gets the value of the allGuaranteeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllGuaranteeInd() {
        return allGuaranteeInd;
    }

    /**
     * Sets the value of the allGuaranteeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllGuaranteeInd(Boolean value) {
        this.allGuaranteeInd = value;
    }

    /**
     * Gets the value of the disclosureInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisclosureInd() {
        return disclosureInd;
    }

    /**
     * Sets the value of the disclosureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisclosureInd(Boolean value) {
        this.disclosureInd = value;
    }

    /**
     * Gets the value of the browserInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrowserInd() {
        return browserInd;
    }

    /**
     * Sets the value of the browserInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrowserInd(Boolean value) {
        this.browserInd = value;
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

}
