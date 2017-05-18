
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE DETAIL definition.
 * 
 * <p>Java class for ServiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}ServiceCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceCombinations" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceCoupon" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceFulfillment" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceItemQuantityRules" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ServiceDetailType", propOrder = {
    "detail"
})
@XmlSeeAlso({
    org.iata.ndc.schema.SeatAvailabilityRS.Service.class,
    org.iata.ndc.schema.ServiceListRS.Service.class
})
public class ServiceDetailType
    extends ServiceCoreType
{

    @XmlElement(name = "Detail")
    protected ServiceDetailType.Detail detail;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetailType.Detail }
     *     
     */
    public ServiceDetailType.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetailType.Detail }
     *     
     */
    public void setDetail(ServiceDetailType.Detail value) {
        this.detail = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceCombinations" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceCoupon" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceFulfillment" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceItemQuantityRules" minOccurs="0"/&gt;
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
        "serviceCombinations",
        "serviceCoupon",
        "serviceFulfillment",
        "serviceItemQuantityRules"
    })
    public static class Detail {

        @XmlElement(name = "ServiceCombinations")
        protected ServiceCombinations serviceCombinations;
        @XmlElement(name = "ServiceCoupon")
        protected ServiceCouponType serviceCoupon;
        @XmlElement(name = "ServiceFulfillment")
        protected ServiceFulfillmentType serviceFulfillment;
        @XmlElement(name = "ServiceItemQuantityRules")
        protected ServiceItemQuantityType serviceItemQuantityRules;

        /**
         * Gets the value of the serviceCombinations property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCombinations }
         *     
         */
        public ServiceCombinations getServiceCombinations() {
            return serviceCombinations;
        }

        /**
         * Sets the value of the serviceCombinations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCombinations }
         *     
         */
        public void setServiceCombinations(ServiceCombinations value) {
            this.serviceCombinations = value;
        }

        /**
         * Gets the value of the serviceCoupon property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCouponType }
         *     
         */
        public ServiceCouponType getServiceCoupon() {
            return serviceCoupon;
        }

        /**
         * Sets the value of the serviceCoupon property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCouponType }
         *     
         */
        public void setServiceCoupon(ServiceCouponType value) {
            this.serviceCoupon = value;
        }

        /**
         * Gets the value of the serviceFulfillment property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType }
         *     
         */
        public ServiceFulfillmentType getServiceFulfillment() {
            return serviceFulfillment;
        }

        /**
         * Sets the value of the serviceFulfillment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType }
         *     
         */
        public void setServiceFulfillment(ServiceFulfillmentType value) {
            this.serviceFulfillment = value;
        }

        /**
         * Gets the value of the serviceItemQuantityRules property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceItemQuantityType }
         *     
         */
        public ServiceItemQuantityType getServiceItemQuantityRules() {
            return serviceItemQuantityRules;
        }

        /**
         * Sets the value of the serviceItemQuantityRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceItemQuantityType }
         *     
         */
        public void setServiceItemQuantityRules(ServiceItemQuantityType value) {
            this.serviceItemQuantityRules = value;
        }

    }

}
