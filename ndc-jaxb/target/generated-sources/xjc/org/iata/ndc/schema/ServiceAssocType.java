
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Associations.
 * 
 * <p>Java class for ServiceAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Traveler" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="AllTravelerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReferences"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Flight" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;choice maxOccurs="2"&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReferences"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Offer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferReferences"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherAssociations" type="{http://www.iata.org/IATA/EDIST}ServiceOtherAssocType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssocType", propOrder = {
    "traveler",
    "flight",
    "offer",
    "otherAssociations",
    "seatReference"
})
@XmlSeeAlso({
    org.iata.ndc.schema.ServiceCoreType.Associations.class
})
public class ServiceAssocType {

    @XmlElement(name = "Traveler")
    protected ServiceAssocType.Traveler traveler;
    @XmlElement(name = "Flight")
    protected ServiceAssocType.Flight flight;
    @XmlElementWrapper(name = "Offer")
    @XmlElement(name = "OfferReferences", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Object> offer;
    @XmlElementWrapper(name = "OtherAssociations")
    @XmlElement(name = "OtherAssociation", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ServiceOtherAssocTypeOtherAssociation> otherAssociations;
    @XmlElement(name = "SeatReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object seatReference;

    /**
     * Gets the value of the traveler property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Traveler }
     *     
     */
    public ServiceAssocType.Traveler getTraveler() {
        return traveler;
    }

    /**
     * Sets the value of the traveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Traveler }
     *     
     */
    public void setTraveler(ServiceAssocType.Traveler value) {
        this.traveler = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Flight }
     *     
     */
    public ServiceAssocType.Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Flight }
     *     
     */
    public void setFlight(ServiceAssocType.Flight value) {
        this.flight = value;
    }

    /**
     * Gets the value of the seatReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSeatReference() {
        return seatReference;
    }

    /**
     * Sets the value of the seatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSeatReference(Object value) {
        this.seatReference = value;
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

    public List<ServiceOtherAssocTypeOtherAssociation> getOtherAssociations() {
        if (otherAssociations == null) {
            otherAssociations = new ArrayList<ServiceOtherAssocTypeOtherAssociation>();
        }
        return otherAssociations;
    }

    public void setOtherAssociations(List<ServiceOtherAssocTypeOtherAssociation> otherAssociations) {
        this.otherAssociations = otherAssociations;
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
     *       &lt;choice&gt;
     *         &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;choice maxOccurs="2"&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReferences"/&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/&gt;
     *         &lt;/choice&gt;
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
        "allFlightInd",
        "allOriginDestinationInd",
        "allSegmentInd",
        "originDestinationReferencesOrSegmentReferences"
    })
    public static class Flight {

        @XmlElement(name = "AllFlightInd")
        protected Boolean allFlightInd;
        @XmlElement(name = "AllOriginDestinationInd")
        protected Boolean allOriginDestinationInd;
        @XmlElement(name = "AllSegmentInd")
        protected Boolean allSegmentInd;
        @XmlElementRefs({
            @XmlElementRef(name = "OriginDestinationReferences", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST", type = SegmentReferences.class, required = false)
        })
        protected List<Object> originDestinationReferencesOrSegmentReferences;

        /**
         * Gets the value of the allFlightInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllFlightInd() {
            return allFlightInd;
        }

        /**
         * Sets the value of the allFlightInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllFlightInd(Boolean value) {
            this.allFlightInd = value;
        }

        /**
         * Gets the value of the allOriginDestinationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllOriginDestinationInd() {
            return allOriginDestinationInd;
        }

        /**
         * Sets the value of the allOriginDestinationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllOriginDestinationInd(Boolean value) {
            this.allOriginDestinationInd = value;
        }

        /**
         * Gets the value of the allSegmentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllSegmentInd() {
            return allSegmentInd;
        }

        /**
         * Sets the value of the allSegmentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllSegmentInd(Boolean value) {
            this.allSegmentInd = value;
        }

        /**
         * Gets the value of the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationReferencesOrSegmentReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentReferences }
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
         * 
         * 
         */
        public List<Object> getOriginDestinationReferencesOrSegmentReferences() {
            if (originDestinationReferencesOrSegmentReferences == null) {
                originDestinationReferencesOrSegmentReferences = new ArrayList<Object>();
            }
            return this.originDestinationReferencesOrSegmentReferences;
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
     *       &lt;choice&gt;
     *         &lt;element name="AllTravelerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReferences"/&gt;
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
        "allTravelerInd",
        "travelerReferences"
    })
    public static class Traveler {

        @XmlElement(name = "AllTravelerInd")
        protected Boolean allTravelerInd;
        @XmlList
        @XmlElement(name = "TravelerReferences")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> travelerReferences;

        /**
         * Gets the value of the allTravelerInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllTravelerInd() {
            return allTravelerInd;
        }

        /**
         * Sets the value of the allTravelerInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllTravelerInd(Boolean value) {
            this.allTravelerInd = value;
        }

        /**
         * Association to multiple Traveler instance(s). Example: Traveler1 Traveler2
         * 
         * Note: May be Recognized or Anonymous Traveler (by PTC) instance(s).Gets the value of the travelerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getTravelerReferences() {
            if (travelerReferences == null) {
                travelerReferences = new ArrayList<Object>();
            }
            return this.travelerReferences;
        }

    }

}
