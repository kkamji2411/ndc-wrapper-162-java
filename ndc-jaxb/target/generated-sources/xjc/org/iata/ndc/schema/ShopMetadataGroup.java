
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Baggage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Fare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Flight" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Location" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Offer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Pricing" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Qualifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Seat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baggage",
    "fare",
    "flight",
    "location",
    "offer",
    "pricing",
    "qualifier",
    "seat"
})
@XmlRootElement(name = "ShopMetadataGroup")
public class ShopMetadataGroup {

    @XmlElementWrapper(name = "Baggage")
    @XmlElements({
        @XmlElement(name = "CheckedBagMetadatas", type = CheckedBagMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "CarryOnBagMetadatas", type = CarryOnBagMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "BaggageDisclosureMetadatas", type = BaggageDisclosureMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "BaggageDetailMetadata", type = BaggageDetailMetadataType.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "BaggageQueryMetadata", type = BaggageQueryMetadataType.class, namespace = "http://www.iata.org/IATA/EDIST")
    })
    protected List<Object> baggage;
    @XmlElement(name = "Fare")
    protected FareType fare;
    @XmlElementWrapper(name = "Flight")
    @XmlElements({
        @XmlElement(name = "FlightMetadatas", type = FlightMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "ItineraryMetadata", type = ItineraryMetadataType.class, namespace = "http://www.iata.org/IATA/EDIST")
    })
    protected List<Object> flight;
    @XmlElementWrapper(name = "Location")
    @XmlElement(name = "DirectionMetadatas", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<DirectionMetadatas> location;
    @XmlElementWrapper(name = "Offer")
    @XmlElements({
        @XmlElement(name = "DisclosureMetadatas", type = DisclosureMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "OfferMetadatas", type = OfferMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "OfferInstructionMetadatas", type = OfferInstructionMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "OfferPenaltyMetadatas", type = OfferPenaltyMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "OfferTermsMetadatas", type = OfferTermsMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST")
    })
    protected List<Object> offer;
    @XmlElementWrapper(name = "Pricing")
    @XmlElement(name = "DiscountMetadatas", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<DiscountMetadatas> pricing;
    @XmlElement(name = "Qualifier")
    protected Qualifier qualifier;
    @XmlElementWrapper(name = "Seat")
    @XmlElements({
        @XmlElement(name = "SeatMetadatas", type = SeatMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST"),
        @XmlElement(name = "SeatMapMetadatas", type = SeatMapMetadatas.class, namespace = "http://www.iata.org/IATA/EDIST")
    })
    protected List<Object> seat;

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setFare(FareType value) {
        this.fare = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link Qualifier }
     *     
     */
    public Qualifier getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualifier }
     *     
     */
    public void setQualifier(Qualifier value) {
        this.qualifier = value;
    }

    public List<Object> getBaggage() {
        if (baggage == null) {
            baggage = new ArrayList<Object>();
        }
        return baggage;
    }

    public void setBaggage(List<Object> baggage) {
        this.baggage = baggage;
    }

    public List<Object> getFlight() {
        if (flight == null) {
            flight = new ArrayList<Object>();
        }
        return flight;
    }

    public void setFlight(List<Object> flight) {
        this.flight = flight;
    }

    public List<DirectionMetadatas> getLocation() {
        if (location == null) {
            location = new ArrayList<DirectionMetadatas>();
        }
        return location;
    }

    public void setLocation(List<DirectionMetadatas> location) {
        this.location = location;
    }

    public List<Object> getOffer() {
        if (offer == null) {
            offer = new ArrayList<Object>();
        }
        return offer;
    }

    public void setOffer(List<Object> offer) {
        this.offer = offer;
    }

    public List<DiscountMetadatas> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<DiscountMetadatas>();
        }
        return pricing;
    }

    public void setPricing(List<DiscountMetadatas> pricing) {
        this.pricing = pricing;
    }

    public List<Object> getSeat() {
        if (seat == null) {
            seat = new ArrayList<Object>();
        }
        return seat;
    }

    public void setSeat(List<Object> seat) {
        this.seat = seat;
    }

}
