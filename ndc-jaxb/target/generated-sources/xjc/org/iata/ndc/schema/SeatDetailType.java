
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * DETAIL SEAT definition.
 * 
 * <p>Java class for SeatDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}SeatCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST}SeatCharacteristicType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailType", propOrder = {
    "details"
})
@XmlSeeAlso({
    SeatOfferType.class,
    SeatOfferCoreType.class
})
public class SeatDetailType
    extends SeatCoreType
{

    @XmlElement(name = "Details")
    protected SeatCharacteristicType details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link SeatCharacteristicType }
     *     
     */
    public SeatCharacteristicType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatCharacteristicType }
     *     
     */
    public void setDetails(SeatCharacteristicType value) {
        this.details = value;
    }

}
