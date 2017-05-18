
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Priced Flight Offer Association definition.
 * 
 * <p>Java class for PricedFlightOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedFlightOfferAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedTraveler" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ApplicableFlight" minOccurs="0"/&gt;
 *         &lt;element name="PriceClass" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceClassReference"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferDetailAssociation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}IncludedService" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedService" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherAssociation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferAssocType", propOrder = {
    "associatedTraveler",
    "applicableFlight",
    "priceClass",
    "offerDetailAssociation",
    "includedService",
    "associatedService",
    "otherAssociation"
})
public class PricedFlightOfferAssocType {

    @XmlElement(name = "AssociatedTraveler")
    protected TravelerInfoAssocType associatedTraveler;
    @XmlElement(name = "ApplicableFlight")
    protected ApplicableFlight applicableFlight;
    @XmlElement(name = "PriceClass")
    protected PricedFlightOfferAssocType.PriceClass priceClass;
    @XmlElement(name = "OfferDetailAssociation")
    protected OfferDetailInfoAssocType offerDetailAssociation;
    @XmlElement(name = "IncludedService")
    protected ServiceInfoAssocType includedService;
    @XmlElement(name = "AssociatedService")
    protected ServiceInfoAssocType associatedService;
    @XmlElementWrapper(name = "OtherAssociation")
    @XmlElement(name = "OtherAssociation", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OtherAssociation> otherAssociation;

    /**
     * Gets the value of the associatedTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoAssocType }
     *     
     */
    public TravelerInfoAssocType getAssociatedTraveler() {
        return associatedTraveler;
    }

    /**
     * Sets the value of the associatedTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoAssocType }
     *     
     */
    public void setAssociatedTraveler(TravelerInfoAssocType value) {
        this.associatedTraveler = value;
    }

    /**
     * Gets the value of the applicableFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableFlight }
     *     
     */
    public ApplicableFlight getApplicableFlight() {
        return applicableFlight;
    }

    /**
     * Sets the value of the applicableFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableFlight }
     *     
     */
    public void setApplicableFlight(ApplicableFlight value) {
        this.applicableFlight = value;
    }

    /**
     * Gets the value of the priceClass property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOfferAssocType.PriceClass }
     *     
     */
    public PricedFlightOfferAssocType.PriceClass getPriceClass() {
        return priceClass;
    }

    /**
     * Sets the value of the priceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOfferAssocType.PriceClass }
     *     
     */
    public void setPriceClass(PricedFlightOfferAssocType.PriceClass value) {
        this.priceClass = value;
    }

    /**
     * Gets the value of the offerDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetailAssociation() {
        return offerDetailAssociation;
    }

    /**
     * Sets the value of the offerDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetailAssociation(OfferDetailInfoAssocType value) {
        this.offerDetailAssociation = value;
    }

    /**
     * Included Optional Service(s).
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getIncludedService() {
        return includedService;
    }

    /**
     * Sets the value of the includedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setIncludedService(ServiceInfoAssocType value) {
        this.includedService = value;
    }

    /**
     * Gets the value of the associatedService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getAssociatedService() {
        return associatedService;
    }

    /**
     * Sets the value of the associatedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setAssociatedService(ServiceInfoAssocType value) {
        this.associatedService = value;
    }

    public List<OtherAssociation> getOtherAssociation() {
        if (otherAssociation == null) {
            otherAssociation = new ArrayList<OtherAssociation>();
        }
        return otherAssociation;
    }

    public void setOtherAssociation(List<OtherAssociation> otherAssociation) {
        this.otherAssociation = otherAssociation;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceClassReference"/&gt;
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
        "priceClassReference"
    })
    public static class PriceClass {

        @XmlElement(name = "PriceClassReference", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object priceClassReference;

        /**
         * Gets the value of the priceClassReference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPriceClassReference() {
            return priceClassReference;
        }

        /**
         * Sets the value of the priceClassReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPriceClassReference(Object value) {
            this.priceClassReference = value;
        }

    }

}
