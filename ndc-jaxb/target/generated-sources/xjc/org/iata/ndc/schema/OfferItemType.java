
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggageItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailedFlightItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatItem" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baggageItem",
    "detailedFlightItem",
    "otherItem",
    "seatItem"
})
@XmlRootElement(name = "OfferItemType")
public class OfferItemType {

    @XmlElement(name = "BaggageItem")
    protected List<BaggageItemType> baggageItem;
    @XmlElement(name = "DetailedFlightItem")
    protected List<FlightItemType> detailedFlightItem;
    @XmlElement(name = "OtherItem")
    protected List<OtherItemType> otherItem;
    @XmlElement(name = "SeatItem")
    protected List<SeatItem> seatItem;

    /**
     * Gets the value of the baggageItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageItemType }
     * 
     * 
     */
    public List<BaggageItemType> getBaggageItem() {
        if (baggageItem == null) {
            baggageItem = new ArrayList<BaggageItemType>();
        }
        return this.baggageItem;
    }

    /**
     * Flight Offer Item.Gets the value of the detailedFlightItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedFlightItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedFlightItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightItemType }
     * 
     * 
     */
    public List<FlightItemType> getDetailedFlightItem() {
        if (detailedFlightItem == null) {
            detailedFlightItem = new ArrayList<FlightItemType>();
        }
        return this.detailedFlightItem;
    }

    /**
     * Gets the value of the otherItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherItemType }
     * 
     * 
     */
    public List<OtherItemType> getOtherItem() {
        if (otherItem == null) {
            otherItem = new ArrayList<OtherItemType>();
        }
        return this.otherItem;
    }

    /**
     * Gets the value of the seatItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatItem }
     * 
     * 
     */
    public List<SeatItem> getSeatItem() {
        if (seatItem == null) {
            seatItem = new ArrayList<SeatItem>();
        }
        return this.seatItem;
    }

}
