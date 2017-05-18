
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderQualiferType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReferences"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "travelerReferences",
    "bookingReference"
})
@XmlRootElement(name = "ExistingOrderQualifier")
public class ExistingOrderQualifier
    extends OrderQualiferType
{

    @XmlList
    @XmlElement(name = "TravelerReferences", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> travelerReferences;
    @XmlElement(name = "BookingReference")
    protected BookingReference bookingReference;

    /**
     * Gets the value of the travelerReferences property.
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

    /**
     * Existing Booking Reference (e.g. PNR Record Locator). Example: R1A3SK
     * 
     * @return
     *     possible object is
     *     {@link BookingReference }
     *     
     */
    public BookingReference getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReference }
     *     
     */
    public void setBookingReference(BookingReference value) {
        this.bookingReference = value;
    }

}
