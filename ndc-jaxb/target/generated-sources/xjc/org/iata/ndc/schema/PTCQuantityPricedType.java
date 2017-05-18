
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Requested and Priced Passenger Type Code(s) and Quantity.
 * 
 * Passenger type code and Traveler quantity.  Example: ADT
 * 
 * Encoding scheme:  IATA (three character) Passenger Type Code
 * 
 * <p>Java class for PTC_QuantityPricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_QuantityPricedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Requested" type="{http://www.iata.org/IATA/EDIST}PTC_QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Priced" type="{http://www.iata.org/IATA/EDIST}PTC_QuantityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_QuantityPricedType", propOrder = {
    "requested",
    "priced"
})
public class PTCQuantityPricedType {

    @XmlElement(name = "Requested")
    protected PTCQuantityType requested;
    @XmlElement(name = "Priced")
    protected PTCQuantityType priced;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the requested property.
     * 
     * @return
     *     possible object is
     *     {@link PTCQuantityType }
     *     
     */
    public PTCQuantityType getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCQuantityType }
     *     
     */
    public void setRequested(PTCQuantityType value) {
        this.requested = value;
    }

    /**
     * Gets the value of the priced property.
     * 
     * @return
     *     possible object is
     *     {@link PTCQuantityType }
     *     
     */
    public PTCQuantityType getPriced() {
        return priced;
    }

    /**
     * Sets the value of the priced property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCQuantityType }
     *     
     */
    public void setPriced(PTCQuantityType value) {
        this.priced = value;
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
