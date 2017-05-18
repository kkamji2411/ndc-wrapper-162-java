
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalRoles" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PrimaryContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PaymentContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "additionalRoles"
})
@XmlRootElement(name = "Passenger")
public class Passenger
    extends PassengerDetailType
{

    @XmlElement(name = "AdditionalRoles")
    protected Passenger.AdditionalRoles additionalRoles;

    /**
     * Gets the value of the additionalRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Passenger.AdditionalRoles }
     *     
     */
    public Passenger.AdditionalRoles getAdditionalRoles() {
        return additionalRoles;
    }

    /**
     * Sets the value of the additionalRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger.AdditionalRoles }
     *     
     */
    public void setAdditionalRoles(Passenger.AdditionalRoles value) {
        this.additionalRoles = value;
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
     *       &lt;attribute name="PrimaryContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PaymentContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalRoles {

        @XmlAttribute(name = "PrimaryContactInd")
        protected Boolean primaryContactInd;
        @XmlAttribute(name = "PaymentContactInd")
        protected Boolean paymentContactInd;

        /**
         * Gets the value of the primaryContactInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryContactInd() {
            return primaryContactInd;
        }

        /**
         * Sets the value of the primaryContactInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryContactInd(Boolean value) {
            this.primaryContactInd = value;
        }

        /**
         * Gets the value of the paymentContactInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPaymentContactInd() {
            return paymentContactInd;
        }

        /**
         * Sets the value of the paymentContactInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPaymentContactInd(Boolean value) {
            this.paymentContactInd = value;
        }

    }

}
