
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Geographic Specification information
 * 
 * <p>Java class for OfferGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGeographicSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="DirectionalIndicator" minOccurs="0"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;enumeration value="From LOC1 to LOC2"/&gt;
 *                 &lt;enumeration value="To LOC1 from LOC2"/&gt;
 *                 &lt;enumeration value="Both"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="OfferOriginPoint" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/&gt;
 *           &lt;element name="OfferDestinationPoint" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="TravelWithin" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGeographicSpecificationType", propOrder = {
    "directionalIndicator",
    "offerOriginPoint",
    "offerDestinationPoint",
    "travelWithin"
})
public class OfferGeographicSpecificationType {

    @XmlElement(name = "DirectionalIndicator")
    protected String directionalIndicator;
    @XmlElement(name = "OfferOriginPoint")
    protected GeographicSpecificationType offerOriginPoint;
    @XmlElement(name = "OfferDestinationPoint")
    protected GeographicSpecificationType offerDestinationPoint;
    @XmlElement(name = "TravelWithin")
    protected GeographicSpecificationType travelWithin;

    /**
     * Gets the value of the directionalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalIndicator() {
        return directionalIndicator;
    }

    /**
     * Sets the value of the directionalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalIndicator(String value) {
        this.directionalIndicator = value;
    }

    /**
     * Gets the value of the offerOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferOriginPoint() {
        return offerOriginPoint;
    }

    /**
     * Sets the value of the offerOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferOriginPoint(GeographicSpecificationType value) {
        this.offerOriginPoint = value;
    }

    /**
     * Gets the value of the offerDestinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferDestinationPoint() {
        return offerDestinationPoint;
    }

    /**
     * Sets the value of the offerDestinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferDestinationPoint(GeographicSpecificationType value) {
        this.offerDestinationPoint = value;
    }

    /**
     * Gets the value of the travelWithin property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getTravelWithin() {
        return travelWithin;
    }

    /**
     * Sets the value of the travelWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setTravelWithin(GeographicSpecificationType value) {
        this.travelWithin = value;
    }

}
