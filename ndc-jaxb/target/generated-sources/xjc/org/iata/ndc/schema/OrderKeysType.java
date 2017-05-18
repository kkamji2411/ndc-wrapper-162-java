
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * Shopping CR: This fulfills the requirement to allow previously ordered items to be used as a shopping session qualifiers.
 * 
 * <p>Java class for OrderKeysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderKeysType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
 *         &lt;element name="AssociatedIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AssociatedID" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderKeysType", propOrder = {
    "orderID",
    "associatedIDs"
})
public class OrderKeysType {

    @XmlElement(name = "OrderID", required = true)
    protected OrderIDType orderID;
    @XmlElementWrapper(name = "AssociatedIDs")
    @XmlElement(name = "AssociatedID", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OrderKeysType.AssociatedID> associatedIDs;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIDType }
     *     
     */
    public OrderIDType getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIDType }
     *     
     */
    public void setOrderID(OrderIDType value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

    public List<OrderKeysType.AssociatedID> getAssociatedIDs() {
        if (associatedIDs == null) {
            associatedIDs = new ArrayList<OrderKeysType.AssociatedID>();
        }
        return associatedIDs;
    }

    public void setAssociatedIDs(List<OrderKeysType.AssociatedID> associatedIDs) {
        this.associatedIDs = associatedIDs;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/&gt;
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
        "orderItemID",
        "offerItemID",
        "serviceID"
    })
    public static class AssociatedID {

        @XmlElement(name = "OrderItemID")
        protected ItemIDType orderItemID;
        @XmlElement(name = "OfferItemID")
        protected ItemIDType offerItemID;
        @XmlElement(name = "ServiceID")
        protected ServiceIDType serviceID;

        /**
         * Gets the value of the orderItemID property.
         * 
         * @return
         *     possible object is
         *     {@link ItemIDType }
         *     
         */
        public ItemIDType getOrderItemID() {
            return orderItemID;
        }

        /**
         * Sets the value of the orderItemID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemIDType }
         *     
         */
        public void setOrderItemID(ItemIDType value) {
            this.orderItemID = value;
        }

        /**
         * Gets the value of the offerItemID property.
         * 
         * @return
         *     possible object is
         *     {@link ItemIDType }
         *     
         */
        public ItemIDType getOfferItemID() {
            return offerItemID;
        }

        /**
         * Sets the value of the offerItemID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemIDType }
         *     
         */
        public void setOfferItemID(ItemIDType value) {
            this.offerItemID = value;
        }

        /**
         * Gets the value of the serviceID property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceIDType }
         *     
         */
        public ServiceIDType getServiceID() {
            return serviceID;
        }

        /**
         * Sets the value of the serviceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceIDType }
         *     
         */
        public void setServiceID(ServiceIDType value) {
            this.serviceID = value;
        }

    }

}
