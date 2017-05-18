
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MarketingCarrierAirline" minOccurs="0"/&gt;
 *         &lt;element name="CalendarDates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OriginDestinationKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "departure",
    "arrival",
    "segMaxTimePreferences",
    "shoppingResponseID",
    "marketingCarrierAirline",
    "calendarDates"
})
public class AirShopReqAttributeQueryTypeOriginDestination
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "Departure", required = true)
    protected Departure departure;
    @XmlElement(name = "Arrival", required = true)
    protected FlightArrivalType arrival;
    @XmlElement(name = "SegMaxTimePreferences")
    protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;
    @XmlElement(name = "ShoppingResponseID")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "MarketingCarrierAirline")
    protected MarketingCarrierType marketingCarrierAirline;
    @XmlElement(name = "CalendarDates")
    protected AirShopReqAttributeQueryTypeOriginDestination.CalendarDates calendarDates;
    @XmlAttribute(name = "OriginDestinationKey")
    @XmlSchemaType(name = "anySimpleType")
    protected String originDestinationKey;

    /**
     * FLIGHT DEPARTURE (ORIGIN).
     * 
     * @return
     *     possible object is
     *     {@link Departure }
     *     
     */
    public Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departure }
     *     
     */
    public void setDeparture(Departure value) {
        this.departure = value;
    }

    /**
     * FLIGHT ARRIVAL (DESTINATION).
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType }
     *     
     */
    public FlightArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType }
     *     
     */
    public void setArrival(FlightArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the segMaxTimePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link FltSegmentMaxTimePreferencesType }
     *     
     */
    public FltSegmentMaxTimePreferencesType getSegMaxTimePreferences() {
        return segMaxTimePreferences;
    }

    /**
     * Sets the value of the segMaxTimePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltSegmentMaxTimePreferencesType }
     *     
     */
    public void setSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
        this.segMaxTimePreferences = value;
    }

    /**
     * Flight-related shopping response IDs, including the unique (master) Shopping Session ID, Offer IDs, Offer Item IDs and Service IDs.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public ShoppingResponseIDType getShoppingResponseID() {
        return shoppingResponseID;
    }

    /**
     * Sets the value of the shoppingResponseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public void setShoppingResponseID(ShoppingResponseIDType value) {
        this.shoppingResponseID = value;
    }

    /**
     * Gets the value of the marketingCarrierAirline property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCarrierType }
     *     
     */
    public MarketingCarrierType getMarketingCarrierAirline() {
        return marketingCarrierAirline;
    }

    /**
     * Sets the value of the marketingCarrierAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCarrierType }
     *     
     */
    public void setMarketingCarrierAirline(MarketingCarrierType value) {
        this.marketingCarrierAirline = value;
    }

    /**
     * Gets the value of the calendarDates property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopReqAttributeQueryTypeOriginDestination.CalendarDates }
     *     
     */
    public AirShopReqAttributeQueryTypeOriginDestination.CalendarDates getCalendarDates() {
        return calendarDates;
    }

    /**
     * Sets the value of the calendarDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopReqAttributeQueryTypeOriginDestination.CalendarDates }
     *     
     */
    public void setCalendarDates(AirShopReqAttributeQueryTypeOriginDestination.CalendarDates value) {
        this.calendarDates = value;
    }

    /**
     * Gets the value of the originDestinationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationKey() {
        return originDestinationKey;
    }

    /**
     * Sets the value of the originDestinationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationKey(String value) {
        this.originDestinationKey = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CalendarDates {

        @XmlAttribute(name = "DaysBefore")
        protected Integer daysBefore;
        @XmlAttribute(name = "DaysAfter")
        protected Integer daysAfter;

        /**
         * Gets the value of the daysBefore property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDaysBefore() {
            return daysBefore;
        }

        /**
         * Sets the value of the daysBefore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDaysBefore(Integer value) {
            this.daysBefore = value;
        }

        /**
         * Gets the value of the daysAfter property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDaysAfter() {
            return daysAfter;
        }

        /**
         * Sets the value of the daysAfter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDaysAfter(Integer value) {
            this.daysAfter = value;
        }

    }

}
