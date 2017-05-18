
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AirShopReq Business Object: FLIGHT SPECIFIC definition.
 * 
 * <p>Java class for AirShopFlightSpecificType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirShopFlightSpecificType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FlightSegment" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/&gt;
 *                   &lt;element name="MarketingAirline" type="{http://www.iata.org/IATA/EDIST}MarketingCarrierFlightType"/&gt;
 *                   &lt;element name="OperatingAirline" type="{http://www.iata.org/IATA/EDIST}OperatingCarrierFlightType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SegmentKey" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Flight" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                 &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestination" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirShopFlightSpecificType", propOrder = {
    "flightSegment",
    "flight",
    "originDestination"
})
public class AirShopFlightSpecificType {

    @XmlElement(name = "FlightSegment")
    protected List<AirShopFlightSpecificType.FlightSegment> flightSegment;
    @XmlElement(name = "Flight")
    protected List<AirShopFlightSpecificType.Flight> flight;
    @XmlElement(name = "OriginDestination")
    protected List<OriginDestination> originDestination;

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirShopFlightSpecificType.FlightSegment }
     * 
     * 
     */
    public List<AirShopFlightSpecificType.FlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<AirShopFlightSpecificType.FlightSegment>();
        }
        return this.flightSegment;
    }

    /**
     * Gets the value of the flight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirShopFlightSpecificType.Flight }
     * 
     * 
     */
    public List<AirShopFlightSpecificType.Flight> getFlight() {
        if (flight == null) {
            flight = new ArrayList<AirShopFlightSpecificType.Flight>();
        }
        return this.flight;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestination }
     * 
     * 
     */
    public List<OriginDestination> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<OriginDestination>();
        }
        return this.originDestination;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *       &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journey",
        "segmentReferences"
    })
    public static class Flight {

        @XmlElement(name = "Journey")
        protected TotalJourneyType journey;
        @XmlElement(name = "SegmentReferences", required = true)
        protected SegmentReferences segmentReferences;
        @XmlAttribute(name = "FlightKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String flightKey;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the journey property.
         * 
         * @return
         *     possible object is
         *     {@link TotalJourneyType }
         *     
         */
        public TotalJourneyType getJourney() {
            return journey;
        }

        /**
         * Sets the value of the journey property.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalJourneyType }
         *     
         */
        public void setJourney(TotalJourneyType value) {
            this.journey = value;
        }

        /**
         * Gets the value of the segmentReferences property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentReferences }
         *     
         */
        public SegmentReferences getSegmentReferences() {
            return segmentReferences;
        }

        /**
         * Sets the value of the segmentReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentReferences }
         *     
         */
        public void setSegmentReferences(SegmentReferences value) {
            this.segmentReferences = value;
        }

        /**
         * Gets the value of the flightKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightKey() {
            return flightKey;
        }

        /**
         * Sets the value of the flightKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightKey(String value) {
            this.flightKey = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/&gt;
     *         &lt;element name="MarketingAirline" type="{http://www.iata.org/IATA/EDIST}MarketingCarrierFlightType"/&gt;
     *         &lt;element name="OperatingAirline" type="{http://www.iata.org/IATA/EDIST}OperatingCarrierFlightType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SegmentKey" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
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
        "marketingAirline",
        "operatingAirline"
    })
    public static class FlightSegment {

        @XmlElement(name = "Departure", required = true)
        protected Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected FlightArrivalType arrival;
        @XmlElement(name = "MarketingAirline", required = true)
        protected MarketingCarrierFlightType marketingAirline;
        @XmlElement(name = "OperatingAirline")
        protected OperatingCarrierFlightType operatingAirline;
        @XmlAttribute(name = "SegmentKey", required = true)
        protected int segmentKey;

        /**
         * Gets the value of the departure property.
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
         * Gets the value of the arrival property.
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
         * Gets the value of the marketingAirline property.
         * 
         * @return
         *     possible object is
         *     {@link MarketingCarrierFlightType }
         *     
         */
        public MarketingCarrierFlightType getMarketingAirline() {
            return marketingAirline;
        }

        /**
         * Sets the value of the marketingAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketingCarrierFlightType }
         *     
         */
        public void setMarketingAirline(MarketingCarrierFlightType value) {
            this.marketingAirline = value;
        }

        /**
         * Gets the value of the operatingAirline property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingCarrierFlightType }
         *     
         */
        public OperatingCarrierFlightType getOperatingAirline() {
            return operatingAirline;
        }

        /**
         * Sets the value of the operatingAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingCarrierFlightType }
         *     
         */
        public void setOperatingAirline(OperatingCarrierFlightType value) {
            this.operatingAirline = value;
        }

        /**
         * Gets the value of the segmentKey property.
         * 
         */
        public int getSegmentKey() {
            return segmentKey;
        }

        /**
         * Sets the value of the segmentKey property.
         * 
         */
        public void setSegmentKey(int value) {
            this.segmentKey = value;
        }

    }

}
