
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER TERMS definition.
 * 
 * <p>Java class for OfferTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AvailablePeriod" type="{http://www.iata.org/IATA/EDIST}OfferValidPeriodType"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST}Descriptions"/&gt;
 *         &lt;element name="GroupSize" type="{http://www.iata.org/IATA/EDIST}OfferGroupSizeType"/&gt;
 *         &lt;element name="OrderingQuantity" type="{http://www.iata.org/IATA/EDIST}OfferOrderQuantityType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTermsType", propOrder = {
    "availablePeriod",
    "descriptions",
    "groupSize",
    "orderingQuantity"
})
public class OfferTermsType {

    @XmlElement(name = "AvailablePeriod")
    protected OfferValidPeriodType availablePeriod;
    @XmlElementWrapper(name = "Descriptions")
    @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Description> descriptions;
    @XmlElementWrapper(name = "GroupSize")
    @XmlElementRefs({
        @XmlElementRef(name = "Minimum", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Maximum", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<BigInteger>> groupSize;
    @XmlElement(name = "OrderingQuantity")
    protected OfferOrderQuantityType orderingQuantity;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the availablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public OfferValidPeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    /**
     * Sets the value of the availablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public void setAvailablePeriod(OfferValidPeriodType value) {
        this.availablePeriod = value;
    }

    /**
     * Gets the value of the orderingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public OfferOrderQuantityType getOrderingQuantity() {
        return orderingQuantity;
    }

    /**
     * Sets the value of the orderingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public void setOrderingQuantity(OfferOrderQuantityType value) {
        this.orderingQuantity = value;
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

    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<JAXBElement<BigInteger>> getGroupSize() {
        if (groupSize == null) {
            groupSize = new ArrayList<JAXBElement<BigInteger>>();
        }
        return groupSize;
    }

    public void setGroupSize(List<JAXBElement<BigInteger>> groupSize) {
        this.groupSize = groupSize;
    }

}
