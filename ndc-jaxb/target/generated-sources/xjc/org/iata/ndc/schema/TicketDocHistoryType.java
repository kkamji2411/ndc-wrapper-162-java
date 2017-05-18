
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COUPON TICKET DOCUMENT definition.
 * 
 * <p>Java class for TicketDocHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDocHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketDocNbr"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *         &lt;element name="CouponInfo" type="{http://www.iata.org/IATA/EDIST}HistoryCouponInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDocHistoryType", propOrder = {
    "ticketDocNbr",
    "type",
    "couponInfo"
})
public class TicketDocHistoryType {

    @XmlElement(name = "TicketDocNbr", required = true)
    protected String ticketDocNbr;
    @XmlElement(name = "Type")
    protected CodesetType type;
    @XmlElement(name = "CouponInfo", required = true)
    protected List<HistoryCouponInfoType> couponInfo;

    /**
     * Gets the value of the ticketDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocNbr() {
        return ticketDocNbr;
    }

    /**
     * Sets the value of the ticketDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocNbr(String value) {
        this.ticketDocNbr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setType(CodesetType value) {
        this.type = value;
    }

    /**
     * Gets the value of the couponInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryCouponInfoType }
     * 
     * 
     */
    public List<HistoryCouponInfoType> getCouponInfo() {
        if (couponInfo == null) {
            couponInfo = new ArrayList<HistoryCouponInfoType>();
        }
        return this.couponInfo;
    }

}
