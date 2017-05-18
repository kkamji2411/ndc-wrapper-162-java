
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated Shopper(s) definition.
 * 
 * <p>Java class for ShopperInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopperInfoAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AllShopperInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopperInfoAssocType", propOrder = {
    "travelerReference"
})
public class ShopperInfoAssocType {

    @XmlElement(name = "TravelerReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object travelerReference;
    @XmlAttribute(name = "AllShopperInd")
    protected Boolean allShopperInd;

    /**
     * Gets the value of the travelerReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTravelerReference() {
        return travelerReference;
    }

    /**
     * Sets the value of the travelerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTravelerReference(Object value) {
        this.travelerReference = value;
    }

    /**
     * Gets the value of the allShopperInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllShopperInd() {
        return allShopperInd;
    }

    /**
     * Sets the value of the allShopperInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllShopperInd(Boolean value) {
        this.allShopperInd = value;
    }

}
