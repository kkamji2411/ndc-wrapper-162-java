
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Shopping Offer Association(s) definition.
 * 
 * <p>Java class for OfferAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAssociationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Shopper" type="{http://www.iata.org/IATA/EDIST}ShopperInfoAssocType" minOccurs="0"/&gt;
 *         &lt;element name="Flight" type="{http://www.iata.org/IATA/EDIST}FlightInfoAssocType" minOccurs="0"/&gt;
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
 *         &lt;element name="BagDetails" type="{http://www.iata.org/IATA/EDIST}BagDetailAssocType" minOccurs="0"/&gt;
 *         &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/EDIST}OfferDetailInfoAssocType" minOccurs="0"/&gt;
 *         &lt;element name="Services" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Service" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BundleReference" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceReferences"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Media" type="{http://www.iata.org/IATA/EDIST}MediaAssocType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://www.iata.org/IATA/EDIST}OtherOfferAssocType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssociationsType", propOrder = {
    "shopper",
    "flight",
    "priceClass",
    "bagDetails",
    "offerDetails",
    "services",
    "media",
    "other"
})
@XmlSeeAlso({
    OfferAssociations.class
})
public class OfferAssociationsType {

    @XmlElement(name = "Shopper")
    protected ShopperInfoAssocType shopper;
    @XmlElement(name = "Flight")
    protected FlightInfoAssocType flight;
    @XmlElement(name = "PriceClass")
    protected OfferAssociationsType.PriceClass priceClass;
    @XmlElement(name = "BagDetails")
    protected BagDetailAssocType bagDetails;
    @XmlElement(name = "OfferDetails")
    protected OfferDetailInfoAssocType offerDetails;
    @XmlElementWrapper(name = "Services")
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OfferAssociationsType.Service> services;
    @XmlElement(name = "Media")
    protected MediaAssocType media;
    @XmlElementWrapper(name = "Other")
    @XmlElement(name = "OtherAssociation", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OtherAssociation> other;

    /**
     * Gets the value of the shopper property.
     * 
     * @return
     *     possible object is
     *     {@link ShopperInfoAssocType }
     *     
     */
    public ShopperInfoAssocType getShopper() {
        return shopper;
    }

    /**
     * Sets the value of the shopper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopperInfoAssocType }
     *     
     */
    public void setShopper(ShopperInfoAssocType value) {
        this.shopper = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoAssocType }
     *     
     */
    public FlightInfoAssocType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoAssocType }
     *     
     */
    public void setFlight(FlightInfoAssocType value) {
        this.flight = value;
    }

    /**
     * Gets the value of the priceClass property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociationsType.PriceClass }
     *     
     */
    public OfferAssociationsType.PriceClass getPriceClass() {
        return priceClass;
    }

    /**
     * Sets the value of the priceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociationsType.PriceClass }
     *     
     */
    public void setPriceClass(OfferAssociationsType.PriceClass value) {
        this.priceClass = value;
    }

    /**
     * Gets the value of the bagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssocType }
     *     
     */
    public BagDetailAssocType getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssocType }
     *     
     */
    public void setBagDetails(BagDetailAssocType value) {
        this.bagDetails = value;
    }

    /**
     * Gets the value of the offerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetails() {
        return offerDetails;
    }

    /**
     * Sets the value of the offerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetails(OfferDetailInfoAssocType value) {
        this.offerDetails = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAssocType }
     *     
     */
    public MediaAssocType getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAssocType }
     *     
     */
    public void setMedia(MediaAssocType value) {
        this.media = value;
    }

    public List<OfferAssociationsType.Service> getServices() {
        if (services == null) {
            services = new ArrayList<OfferAssociationsType.Service>();
        }
        return services;
    }

    public void setServices(List<OfferAssociationsType.Service> services) {
        this.services = services;
    }

    public List<OtherAssociation> getOther() {
        if (other == null) {
            other = new ArrayList<OtherAssociation>();
        }
        return other;
    }

    public void setOther(List<OtherAssociation> other) {
        this.other = other;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BundleReference" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceReferences"/&gt;
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
        "bundleReference",
        "serviceReferences"
    })
    public static class Service {

        @XmlElement(name = "BundleReference")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object bundleReference;
        @XmlList
        @XmlElement(name = "ServiceReferences", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> serviceReferences;

        /**
         * Gets the value of the bundleReference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBundleReference() {
            return bundleReference;
        }

        /**
         * Sets the value of the bundleReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBundleReference(Object value) {
            this.bundleReference = value;
        }

        /**
         * Gets the value of the serviceReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getServiceReferences() {
            if (serviceReferences == null) {
                serviceReferences = new ArrayList<Object>();
            }
            return this.serviceReferences;
        }

    }

}
