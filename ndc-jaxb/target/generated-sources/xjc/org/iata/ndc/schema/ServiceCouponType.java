
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for Optional Service Coupon.
 * 
 * <p>Java class for ServiceCouponType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCouponType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstantPurchase" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *         &lt;element name="FeeBasis" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *         &lt;element name="CouponType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;SrvceCouponSimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCouponType", propOrder = {
    "instantPurchase",
    "feeBasis",
    "couponType"
})
public class ServiceCouponType {

    @XmlElement(name = "InstantPurchase")
    protected CodesetType instantPurchase;
    @XmlElement(name = "FeeBasis")
    protected CodesetType feeBasis;
    @XmlElement(name = "CouponType")
    protected ServiceCouponType.CouponType couponType;

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setInstantPurchase(CodesetType value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the feeBasis property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getFeeBasis() {
        return feeBasis;
    }

    /**
     * Sets the value of the feeBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setFeeBasis(CodesetType value) {
        this.feeBasis = value;
    }

    /**
     * Gets the value of the couponType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCouponType.CouponType }
     *     
     */
    public ServiceCouponType.CouponType getCouponType() {
        return couponType;
    }

    /**
     * Sets the value of the couponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCouponType.CouponType }
     *     
     */
    public void setCouponType(ServiceCouponType.CouponType value) {
        this.couponType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;SrvceCouponSimpleType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CouponType {

        @XmlValue
        protected String value;

        /**
         * A data type for Service Coupon Type.
         * 
         * Examples: E-Ticket, Flight, No_EMD, Standalone, Ticket, Other
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
