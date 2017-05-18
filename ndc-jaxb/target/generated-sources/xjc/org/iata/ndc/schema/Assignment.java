
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}SeatCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatAssociation" minOccurs="0"/&gt;
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
    "seatAssociation"
})
public class Assignment
    extends SeatCoreType
{

    @XmlElement(name = "SeatAssociation")
    protected SeatAssociation seatAssociation;

    /**
     * Gets the value of the seatAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAssociation }
     *     
     */
    public SeatAssociation getSeatAssociation() {
        return seatAssociation;
    }

    /**
     * Sets the value of the seatAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAssociation }
     *     
     */
    public void setSeatAssociation(SeatAssociation value) {
        this.seatAssociation = value;
    }

}
