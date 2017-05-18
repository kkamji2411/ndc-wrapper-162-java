
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketByTimeLimit"/&gt;
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
@XmlType(name = "", propOrder = {
    "priceGuaranteeTimeLimit",
    "ticketByTimeLimit"
})
public class TimeLimit {

    @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
    protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
    @XmlElement(name = "TicketByTimeLimit", required = true)
    protected TicketByTimeLimitType ticketByTimeLimit;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the priceGuaranteeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimit }
     *     
     */
    public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
        return priceGuaranteeTimeLimit;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimit }
     *     
     */
    public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
        this.priceGuaranteeTimeLimit = value;
    }

    /**
     * Gets the value of the ticketByTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link TicketByTimeLimitType }
     *     
     */
    public TicketByTimeLimitType getTicketByTimeLimit() {
        return ticketByTimeLimit;
    }

    /**
     * Sets the value of the ticketByTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketByTimeLimitType }
     *     
     */
    public void setTicketByTimeLimit(TicketByTimeLimitType value) {
        this.ticketByTimeLimit = value;
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
