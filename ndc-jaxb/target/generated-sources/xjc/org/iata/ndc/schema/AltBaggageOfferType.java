
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Alternate Baggage Offer with Order Association definition.
 *       
 * 
 * <p>Java class for AltBaggageOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltBaggageOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}BaggageOfferCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltBaggageOfferType", propOrder = {
    "associations"
})
public class AltBaggageOfferType
    extends BaggageOfferCoreType
{

    @XmlElement(name = "Associations")
    protected MultiAssociationType associations;

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

}
