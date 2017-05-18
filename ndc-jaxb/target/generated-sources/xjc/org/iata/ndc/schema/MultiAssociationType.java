
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Shopping and Order Multiple Association definition.
 * 
 * <p>Java class for MultiAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferAssociations"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderAssociations"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiAssociationType", propOrder = {
    "offerAssociations",
    "orderAssociations"
})
public class MultiAssociationType {

    @XmlElement(name = "OfferAssociations")
    protected OfferAssociations offerAssociations;
    @XmlElement(name = "OrderAssociations")
    protected OrderItemAssociationType orderAssociations;

    /**
     * Gets the value of the offerAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociations }
     *     
     */
    public OfferAssociations getOfferAssociations() {
        return offerAssociations;
    }

    /**
     * Sets the value of the offerAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociations }
     *     
     */
    public void setOfferAssociations(OfferAssociations value) {
        this.offerAssociations = value;
    }

    /**
     * Gets the value of the orderAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getOrderAssociations() {
        return orderAssociations;
    }

    /**
     * Sets the value of the orderAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setOrderAssociations(OrderItemAssociationType value) {
        this.orderAssociations = value;
    }

}
