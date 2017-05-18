
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggageItem" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightItem" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherItem" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatItem" minOccurs="0"/&gt;
 *         &lt;element name="InventoryGuarantee" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}InventoryGuaranteeTimeLimits"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Disclosures" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST}OrderItemTimeLimitsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ItemStatus" minOccurs="0"/&gt;
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemDetails" minOccurs="0"/&gt;
 *         &lt;element name="ActionType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "", propOrder = {
    "orderItemID",
    "associations",
    "baggageItem",
    "flightItem",
    "otherItem",
    "seatItem",
    "inventoryGuarantee",
    "disclosures",
    "timeLimits",
    "itemStatus",
    "penalty",
    "orderItemDetails",
    "actionType"
})
public class OrderItem {

    @XmlElement(name = "OrderItemID", required = true)
    protected ItemIDType orderItemID;
    @XmlElement(name = "Associations")
    protected OrderItemAssociationType associations;
    @XmlElement(name = "BaggageItem")
    protected BaggageItemType baggageItem;
    @XmlElement(name = "FlightItem")
    protected FlightItemType flightItem;
    @XmlElement(name = "OtherItem")
    protected OtherItemType otherItem;
    @XmlElement(name = "SeatItem")
    protected SeatItem seatItem;
    @XmlElement(name = "InventoryGuarantee")
    protected OrderItem.InventoryGuarantee inventoryGuarantee;
    @XmlElement(name = "Disclosures")
    protected Disclosures disclosures;
    @XmlElement(name = "TimeLimits")
    protected OrderItemTimeLimitsType timeLimits;
    @XmlElement(name = "ItemStatus")
    protected CodesetType itemStatus;
    @XmlElement(name = "Penalty")
    protected OrderPenaltyType penalty;
    @XmlElement(name = "OrderItemDetails")
    protected OrderItemDetails orderItemDetails;
    @XmlElement(name = "ActionType")
    protected OrderItem.ActionType actionType;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setAssociations(OrderItemAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the baggageItem property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageItemType }
     *     
     */
    public BaggageItemType getBaggageItem() {
        return baggageItem;
    }

    /**
     * Sets the value of the baggageItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType }
     *     
     */
    public void setBaggageItem(BaggageItemType value) {
        this.baggageItem = value;
    }

    /**
     * Gets the value of the flightItem property.
     * 
     * @return
     *     possible object is
     *     {@link FlightItemType }
     *     
     */
    public FlightItemType getFlightItem() {
        return flightItem;
    }

    /**
     * Sets the value of the flightItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightItemType }
     *     
     */
    public void setFlightItem(FlightItemType value) {
        this.flightItem = value;
    }

    /**
     * Gets the value of the otherItem property.
     * 
     * @return
     *     possible object is
     *     {@link OtherItemType }
     *     
     */
    public OtherItemType getOtherItem() {
        return otherItem;
    }

    /**
     * Sets the value of the otherItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherItemType }
     *     
     */
    public void setOtherItem(OtherItemType value) {
        this.otherItem = value;
    }

    /**
     * Gets the value of the seatItem property.
     * 
     * @return
     *     possible object is
     *     {@link SeatItem }
     *     
     */
    public SeatItem getSeatItem() {
        return seatItem;
    }

    /**
     * Sets the value of the seatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItem }
     *     
     */
    public void setSeatItem(SeatItem value) {
        this.seatItem = value;
    }

    /**
     * Gets the value of the inventoryGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItem.InventoryGuarantee }
     *     
     */
    public OrderItem.InventoryGuarantee getInventoryGuarantee() {
        return inventoryGuarantee;
    }

    /**
     * Sets the value of the inventoryGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItem.InventoryGuarantee }
     *     
     */
    public void setInventoryGuarantee(OrderItem.InventoryGuarantee value) {
        this.inventoryGuarantee = value;
    }

    /**
     * Gets the value of the disclosures property.
     * 
     * @return
     *     possible object is
     *     {@link Disclosures }
     *     
     */
    public Disclosures getDisclosures() {
        return disclosures;
    }

    /**
     * Sets the value of the disclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disclosures }
     *     
     */
    public void setDisclosures(Disclosures value) {
        this.disclosures = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemTimeLimitsType }
     *     
     */
    public OrderItemTimeLimitsType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemTimeLimitsType }
     *     
     */
    public void setTimeLimits(OrderItemTimeLimitsType value) {
        this.timeLimits = value;
    }

    /**
     * 
     *                       Current Order Item status. Example: OK (Confirmed) Encoding Scheme: IATA Padis Codeset - List for data element 4405 (Status, coded)
     *                     
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setItemStatus(CodesetType value) {
        this.itemStatus = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPenaltyType }
     *     
     */
    public OrderPenaltyType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPenaltyType }
     *     
     */
    public void setPenalty(OrderPenaltyType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the orderItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDetails }
     *     
     */
    public OrderItemDetails getOrderItemDetails() {
        return orderItemDetails;
    }

    /**
     * Sets the value of the orderItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDetails }
     *     
     */
    public void setOrderItemDetails(OrderItemDetails value) {
        this.orderItemDetails = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItem.ActionType }
     *     
     */
    public OrderItem.ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItem.ActionType }
     *     
     */
    public void setActionType(OrderItem.ActionType value) {
        this.actionType = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
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
    public static class ActionType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * 
         *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
         *       
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

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

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
     *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InventoryGuaranteeTimeLimits"/&gt;
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
        "invGuaranteeID",
        "inventoryGuaranteeTimeLimits"
    })
    public static class InventoryGuarantee {

        @XmlElement(name = "InvGuaranteeID", required = true)
        protected String invGuaranteeID;
        @XmlElement(name = "InventoryGuaranteeTimeLimits", required = true)
        protected InventoryGuaranteeTimeLimits inventoryGuaranteeTimeLimits;

        /**
         * Gets the value of the invGuaranteeID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvGuaranteeID() {
            return invGuaranteeID;
        }

        /**
         * Sets the value of the invGuaranteeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvGuaranteeID(String value) {
            this.invGuaranteeID = value;
        }

        /**
         * Gets the value of the inventoryGuaranteeTimeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link InventoryGuaranteeTimeLimits }
         *     
         */
        public InventoryGuaranteeTimeLimits getInventoryGuaranteeTimeLimits() {
            return inventoryGuaranteeTimeLimits;
        }

        /**
         * Sets the value of the inventoryGuaranteeTimeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link InventoryGuaranteeTimeLimits }
         *     
         */
        public void setInventoryGuaranteeTimeLimits(InventoryGuaranteeTimeLimits value) {
            this.inventoryGuaranteeTimeLimits = value;
        }

    }

}
