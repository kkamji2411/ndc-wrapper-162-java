
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat Offer Association definition.
 * 
 * <p>Java class for SeatOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatOfferAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedTraveler"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ApplicableFlight"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedService"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferDetailAssociation" minOccurs="0"/&gt;
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
@XmlType(name = "SeatOfferAssocType", propOrder = {
    "associatedTraveler",
    "applicableFlight",
    "associatedService",
    "offerDetailAssociation",
    "otherAssociation"
})
public class SeatOfferAssocType {

    @XmlElement(name = "AssociatedTraveler", required = true)
    protected TravelerInfoAssocType associatedTraveler;
    @XmlElement(name = "ApplicableFlight", required = true)
    protected ApplicableFlight applicableFlight;
    @XmlElement(name = "AssociatedService", required = true)
    protected ServiceInfoAssocType associatedService;
    @XmlElement(name = "OfferDetailAssociation")
    protected OfferDetailInfoAssocType offerDetailAssociation;
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

    public List<OtherAssociation> getOtherAssociation() {
        if (otherAssociation == null) {
            otherAssociation = new ArrayList<OtherAssociation>();
        }
        return otherAssociation;
    }

    public void setOtherAssociation(List<OtherAssociation> otherAssociation) {
        this.otherAssociation = otherAssociation;
    }

}
