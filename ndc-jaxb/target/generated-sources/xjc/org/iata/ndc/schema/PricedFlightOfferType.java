
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Priced Flight Offer with Association definition.
 * 
 * <p>Java class for PricedFlightOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedFlightOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaOfferBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferPrice" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferType", propOrder = {
    "offerPrice",
    "associations"
})
@XmlSeeAlso({
    PricedOffer.class
})
public class PricedFlightOfferType
    extends KeyWithMetaOfferBaseType
{

    @XmlElement(name = "OfferPrice", required = true)
    protected List<PricedFlightOfferType.OfferPrice> offerPrice;
    @XmlElement(name = "Associations")
    protected List<PricedFlightOfferAssocType> associations;

    /**
     * Gets the value of the offerPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedFlightOfferType.OfferPrice }
     * 
     * 
     */
    public List<PricedFlightOfferType.OfferPrice> getOfferPrice() {
        if (offerPrice == null) {
            offerPrice = new ArrayList<PricedFlightOfferType.OfferPrice>();
        }
        return this.offerPrice;
    }

    /**
     * Gets the value of the associations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedFlightOfferAssocType }
     * 
     * 
     */
    public List<PricedFlightOfferAssocType> getAssociations() {
        if (associations == null) {
            associations = new ArrayList<PricedFlightOfferAssocType>();
        }
        return this.associations;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferPrice
        extends OfferPriceLeadType
    {


    }

}
