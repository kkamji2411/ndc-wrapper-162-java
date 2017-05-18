
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific structure for providing flight associations, would typically associate to flights from a Data List.
 * 
 * <p>Java class for SimpleFlightAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleFlightAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightReferences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSegmentReferences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFlightAssocType", propOrder = {
    "originDestinationReference",
    "flightReferences",
    "flightSegmentReferences"
})
@XmlSeeAlso({
    org.iata.ndc.schema.SeatAvailabilityRS.Flights.class
})
public class SimpleFlightAssocType {

    @XmlElement(name = "OriginDestinationReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object originDestinationReference;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;
    @XmlElementWrapper(name = "FlightSegmentReferences")
    @XmlElement(name = "value", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Object> flightSegmentReferences;

    /**
     * Gets the value of the originDestinationReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOriginDestinationReference() {
        return originDestinationReference;
    }

    /**
     * Sets the value of the originDestinationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOriginDestinationReference(Object value) {
        this.originDestinationReference = value;
    }

    /**
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

    public List<Object> getFlightSegmentReferences() {
        if (flightSegmentReferences == null) {
            flightSegmentReferences = new ArrayList<Object>();
        }
        return flightSegmentReferences;
    }

    public void setFlightSegmentReferences(List<Object> flightSegmentReferences) {
        this.flightSegmentReferences = flightSegmentReferences;
    }

}
