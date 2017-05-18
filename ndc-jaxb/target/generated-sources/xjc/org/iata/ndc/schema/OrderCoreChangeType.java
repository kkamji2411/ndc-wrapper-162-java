
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * CORE ORDER CHANGE definition.
 * 
 * <p>Java class for OrderCoreChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCoreChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/&gt;
 *         &lt;element name="TotalOrderItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalOrderPrice" type="{http://www.iata.org/IATA/EDIST}DetailCurrencyPriceType" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderTimeLimitsType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Associations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Passengers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginalOrderID" type="{http://www.iata.org/IATA/EDIST}OrderID_Type" minOccurs="0"/&gt;
 *                   &lt;element name="ShoppingResponse" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType"/&gt;
 *                             &lt;element name="ResponseID"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST}ItemID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="OfferItems" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="OfferItem" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Amendments" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amendment" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ActionType"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
 *                                               &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TicketDocInfo" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AgentIDs" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
 *                                                 &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;choice&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                         &lt;/choice&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="OrderItem" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
 *                                                 &lt;element name="OfferItem" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
 *                                                           &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;choice&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                                   &lt;/choice&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="Services" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
 *                                                                     &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;complexContent&gt;
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                             &lt;choice&gt;
 *                                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                                             &lt;/choice&gt;
 *                                                                           &lt;/restriction&gt;
 *                                                                         &lt;/complexContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                                   &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Passengers" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;choice&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
 *                                                         &lt;/choice&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
 *                                                         &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
@XmlType(name = "OrderCoreChangeType", propOrder = {
    "orderID",
    "totalOrderItemQuantity",
    "totalOrderPrice",
    "timeLimits",
    "associations",
    "details",
    "actionType"
})
@XmlSeeAlso({
    org.iata.ndc.schema.OrderChangeRQ.Query.Order.class
})
public class OrderCoreChangeType {

    @XmlElement(name = "OrderID", required = true)
    protected OrderIDType orderID;
    @XmlElement(name = "TotalOrderItemQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalOrderItemQuantity;
    @XmlElement(name = "TotalOrderPrice")
    protected DetailCurrencyPriceType totalOrderPrice;
    @XmlElement(name = "TimeLimits")
    protected OrderCoreChangeType.TimeLimits timeLimits;
    @XmlElement(name = "Associations")
    protected OrderCoreChangeType.Associations associations;
    @XmlElement(name = "Details")
    protected OrderCoreChangeType.Details details;
    @XmlElement(name = "ActionType")
    protected OrderCoreChangeType.ActionType actionType;
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
     * Gets the value of the totalOrderItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalOrderItemQuantity() {
        return totalOrderItemQuantity;
    }

    /**
     * Sets the value of the totalOrderItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOrderItemQuantity(BigInteger value) {
        this.totalOrderItemQuantity = value;
    }

    /**
     * Gets the value of the totalOrderPrice property.
     * 
     * @return
     *     possible object is
     *     {@link DetailCurrencyPriceType }
     *     
     */
    public DetailCurrencyPriceType getTotalOrderPrice() {
        return totalOrderPrice;
    }

    /**
     * Sets the value of the totalOrderPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailCurrencyPriceType }
     *     
     */
    public void setTotalOrderPrice(DetailCurrencyPriceType value) {
        this.totalOrderPrice = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreChangeType.TimeLimits }
     *     
     */
    public OrderCoreChangeType.TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreChangeType.TimeLimits }
     *     
     */
    public void setTimeLimits(OrderCoreChangeType.TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreChangeType.Associations }
     *     
     */
    public OrderCoreChangeType.Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreChangeType.Associations }
     *     
     */
    public void setAssociations(OrderCoreChangeType.Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreChangeType.Details }
     *     
     */
    public OrderCoreChangeType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreChangeType.Details }
     *     
     */
    public void setDetails(OrderCoreChangeType.Details value) {
        this.details = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreChangeType.ActionType }
     *     
     */
    public OrderCoreChangeType.ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreChangeType.ActionType }
     *     
     */
    public void setActionType(OrderCoreChangeType.ActionType value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Passengers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
     *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
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
    @XmlType(name = "", propOrder = {
        "orderItemID",
        "passengers",
        "otherAssociation"
    })
    public static class Associations {

        @XmlElement(name = "OrderItemID")
        protected List<ItemIDType> orderItemID;
        @XmlElement(name = "Passengers")
        protected OrderCoreChangeType.Associations.Passengers passengers;
        @XmlElement(name = "OtherAssociation")
        protected List<OrderCoreChangeType.Associations.OtherAssociation> otherAssociation;

        /**
         * Associated Order Item ID(s). Example: ORD7333-001 Gets the value of the orderItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         */
        public List<ItemIDType> getOrderItemID() {
            if (orderItemID == null) {
                orderItemID = new ArrayList<ItemIDType>();
            }
            return this.orderItemID;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCoreChangeType.Associations.Passengers }
         *     
         */
        public OrderCoreChangeType.Associations.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCoreChangeType.Associations.Passengers }
         *     
         */
        public void setPassengers(OrderCoreChangeType.Associations.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the otherAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderCoreChangeType.Associations.OtherAssociation }
         * 
         * 
         */
        public List<OrderCoreChangeType.Associations.OtherAssociation> getOtherAssociation() {
            if (otherAssociation == null) {
                otherAssociation = new ArrayList<OrderCoreChangeType.Associations.OtherAssociation>();
            }
            return this.otherAssociation;
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
         *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
         *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OtherAssociation {

            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "ReferenceValue", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object referenceValue;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the referenceValue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getReferenceValue() {
                return referenceValue;
            }

            /**
             * Sets the value of the referenceValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setReferenceValue(Object value) {
                this.referenceValue = value;
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
         *       &lt;choice&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "passengerReferences",
            "groupReference"
        })
        public static class Passengers {

            @XmlList
            @XmlElement(name = "PassengerReferences")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> passengerReferences;
            @XmlElement(name = "GroupReference")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object groupReference;

            /**
             * 
             *                             Association to multiple Passenger instance(s). Example: pax1 pax2
             *                           Gets the value of the passengerReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getPassengerReferences() {
                if (passengerReferences == null) {
                    passengerReferences = new ArrayList<Object>();
                }
                return this.passengerReferences;
            }

            /**
             * Gets the value of the groupReference property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getGroupReference() {
                return groupReference;
            }

            /**
             * Sets the value of the groupReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setGroupReference(Object value) {
                this.groupReference = value;
            }

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
     *         &lt;element name="OriginalOrderID" type="{http://www.iata.org/IATA/EDIST}OrderID_Type" minOccurs="0"/&gt;
     *         &lt;element name="ShoppingResponse" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType"/&gt;
     *                   &lt;element name="ResponseID"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST}ItemID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="OfferItems" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="OfferItem" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Amendments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amendment" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ActionType"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TicketDocInfo" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AgentIDs" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
     *                                       &lt;element name="Passengers" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;choice&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                               &lt;/choice&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OrderItem" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
     *                                       &lt;element name="OfferItem" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
     *                                                 &lt;element name="Passengers" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;choice&gt;
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                                         &lt;/choice&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="Services" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
     *                                                           &lt;element name="Passengers" minOccurs="0"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;complexContent&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                   &lt;choice&gt;
     *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                                                   &lt;/choice&gt;
     *                                                                 &lt;/restriction&gt;
     *                                                               &lt;/complexContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
     *                                                         &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Passengers" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;choice&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
     *                                               &lt;/choice&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
     *                                               &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originalOrderID",
        "shoppingResponse",
        "amendments"
    })
    public static class Details {

        @XmlElement(name = "OriginalOrderID")
        protected OrderIDType originalOrderID;
        @XmlElement(name = "ShoppingResponse")
        protected OrderCoreChangeType.Details.ShoppingResponse shoppingResponse;
        @XmlElementWrapper(name = "Amendments")
        @XmlElement(name = "Amendment", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<OrderCoreChangeType.Details.Amendment> amendments;

        /**
         * Gets the value of the originalOrderID property.
         * 
         * @return
         *     possible object is
         *     {@link OrderIDType }
         *     
         */
        public OrderIDType getOriginalOrderID() {
            return originalOrderID;
        }

        /**
         * Sets the value of the originalOrderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderIDType }
         *     
         */
        public void setOriginalOrderID(OrderIDType value) {
            this.originalOrderID = value;
        }

        /**
         * Gets the value of the shoppingResponse property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCoreChangeType.Details.ShoppingResponse }
         *     
         */
        public OrderCoreChangeType.Details.ShoppingResponse getShoppingResponse() {
            return shoppingResponse;
        }

        /**
         * Sets the value of the shoppingResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCoreChangeType.Details.ShoppingResponse }
         *     
         */
        public void setShoppingResponse(OrderCoreChangeType.Details.ShoppingResponse value) {
            this.shoppingResponse = value;
        }

        public List<OrderCoreChangeType.Details.Amendment> getAmendments() {
            if (amendments == null) {
                amendments = new ArrayList<OrderCoreChangeType.Details.Amendment>();
            }
            return amendments;
        }

        public void setAmendments(List<OrderCoreChangeType.Details.Amendment> amendments) {
            this.amendments = amendments;
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
         *         &lt;element name="ActionType"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;OrderItemActionListType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TicketDocInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AgentIDs" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
         *                   &lt;element name="Passengers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                           &lt;/choice&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrderItem" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
         *                   &lt;element name="OfferItem" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
         *                             &lt;element name="Passengers" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;choice&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                                     &lt;/choice&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Services" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
         *                                       &lt;element name="Passengers" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;choice&gt;
         *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                                               &lt;/choice&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
         *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Passengers" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
         *                           &lt;/choice&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
         *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
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
        @XmlType(name = "", propOrder = {
            "actionType",
            "ticketDocInfo",
            "orderItem"
        })
        public static class Amendment {

            @XmlElement(name = "ActionType", required = true)
            protected OrderCoreChangeType.Details.Amendment.ActionType actionType;
            @XmlElement(name = "TicketDocInfo")
            protected OrderCoreChangeType.Details.Amendment.TicketDocInfo ticketDocInfo;
            @XmlElement(name = "OrderItem")
            protected OrderCoreChangeType.Details.Amendment.OrderItem orderItem;

            /**
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCoreChangeType.Details.Amendment.ActionType }
             *     
             */
            public OrderCoreChangeType.Details.Amendment.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCoreChangeType.Details.Amendment.ActionType }
             *     
             */
            public void setActionType(OrderCoreChangeType.Details.Amendment.ActionType value) {
                this.actionType = value;
            }

            /**
             * Gets the value of the ticketDocInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCoreChangeType.Details.Amendment.TicketDocInfo }
             *     
             */
            public OrderCoreChangeType.Details.Amendment.TicketDocInfo getTicketDocInfo() {
                return ticketDocInfo;
            }

            /**
             * Sets the value of the ticketDocInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCoreChangeType.Details.Amendment.TicketDocInfo }
             *     
             */
            public void setTicketDocInfo(OrderCoreChangeType.Details.Amendment.TicketDocInfo value) {
                this.ticketDocInfo = value;
            }

            /**
             * Gets the value of the orderItem property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCoreChangeType.Details.Amendment.OrderItem }
             *     
             */
            public OrderCoreChangeType.Details.Amendment.OrderItem getOrderItem() {
                return orderItem;
            }

            /**
             * Sets the value of the orderItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCoreChangeType.Details.Amendment.OrderItem }
             *     
             */
            public void setOrderItem(OrderCoreChangeType.Details.Amendment.OrderItem value) {
                this.orderItem = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID"/&gt;
             *         &lt;element name="OfferItem" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
             *                   &lt;element name="Passengers" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;choice&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                           &lt;/choice&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Services" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
             *                             &lt;element name="Passengers" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;choice&gt;
             *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                                     &lt;/choice&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
             *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Passengers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                 &lt;/choice&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
             *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
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
            @XmlType(name = "", propOrder = {
                "orderItemID",
                "offerItem",
                "passengers",
                "otherAssociation"
            })
            public static class OrderItem {

                @XmlElement(name = "OrderItemID", required = true)
                protected ItemIDType orderItemID;
                @XmlElement(name = "OfferItem")
                protected OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem offerItem;
                @XmlElement(name = "Passengers")
                protected OrderCoreChangeType.Details.Amendment.OrderItem.Passengers passengers;
                @XmlElement(name = "OtherAssociation")
                protected List<OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation> otherAssociation;
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
                 * Gets the value of the offerItem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem }
                 *     
                 */
                public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem getOfferItem() {
                    return offerItem;
                }

                /**
                 * Sets the value of the offerItem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem }
                 *     
                 */
                public void setOfferItem(OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem value) {
                    this.offerItem = value;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.Passengers }
                 *     
                 */
                public OrderCoreChangeType.Details.Amendment.OrderItem.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.Passengers }
                 *     
                 */
                public void setPassengers(OrderCoreChangeType.Details.Amendment.OrderItem.Passengers value) {
                    this.passengers = value;
                }

                /**
                 * Gets the value of the otherAssociation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherAssociation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation }
                 * 
                 * 
                 */
                public List<OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation>();
                    }
                    return this.otherAssociation;
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
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
                 *         &lt;element name="Passengers" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;choice&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *                 &lt;/choice&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Services" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
                 *                   &lt;element name="Passengers" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;choice&gt;
                 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *                           &lt;/choice&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
                 *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
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
                @XmlType(name = "", propOrder = {
                    "offerItemID",
                    "passengers",
                    "services",
                    "otherAssociation"
                })
                public static class OfferItem {

                    @XmlElement(name = "OfferItemID", required = true)
                    protected ItemIDType offerItemID;
                    @XmlElement(name = "Passengers")
                    protected OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers passengers;
                    @XmlElement(name = "Services")
                    protected OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services services;
                    @XmlElement(name = "OtherAssociation")
                    protected List<OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation> otherAssociation;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

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
                     * Gets the value of the passengers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers }
                     *     
                     */
                    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers getPassengers() {
                        return passengers;
                    }

                    /**
                     * Sets the value of the passengers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers }
                     *     
                     */
                    public void setPassengers(OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers value) {
                        this.passengers = value;
                    }

                    /**
                     * Gets the value of the services property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services }
                     *     
                     */
                    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services getServices() {
                        return services;
                    }

                    /**
                     * Sets the value of the services property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services }
                     *     
                     */
                    public void setServices(OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services value) {
                        this.services = value;
                    }

                    /**
                     * Gets the value of the otherAssociation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOtherAssociation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation }
                     * 
                     * 
                     */
                    public List<OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation> getOtherAssociation() {
                        if (otherAssociation == null) {
                            otherAssociation = new ArrayList<OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation>();
                        }
                        return this.otherAssociation;
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
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
                     *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class OtherAssociation {

                        @XmlAttribute(name = "Type", required = true)
                        protected String type;
                        @XmlAttribute(name = "ReferenceValue", required = true)
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREF")
                        protected Object referenceValue;

                        /**
                         * Gets the value of the type property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getType() {
                            return type;
                        }

                        /**
                         * Sets the value of the type property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setType(String value) {
                            this.type = value;
                        }

                        /**
                         * Gets the value of the referenceValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getReferenceValue() {
                            return referenceValue;
                        }

                        /**
                         * Sets the value of the referenceValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setReferenceValue(Object value) {
                            this.referenceValue = value;
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
                     *       &lt;choice&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                     *       &lt;/choice&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "passengerReferences",
                        "groupReference"
                    })
                    public static class Passengers {

                        @XmlList
                        @XmlElement(name = "PassengerReferences")
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREFS")
                        protected List<Object> passengerReferences;
                        @XmlElement(name = "GroupReference")
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREF")
                        protected Object groupReference;

                        /**
                         * 
                         *                                                             Association to multiple Passenger instance(s). Example: pax1 pax2
                         *                                                           Gets the value of the passengerReferences property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPassengerReferences().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getPassengerReferences() {
                            if (passengerReferences == null) {
                                passengerReferences = new ArrayList<Object>();
                            }
                            return this.passengerReferences;
                        }

                        /**
                         * Gets the value of the groupReference property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getGroupReference() {
                            return groupReference;
                        }

                        /**
                         * Sets the value of the groupReference property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setGroupReference(Object value) {
                            this.groupReference = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
                     *         &lt;element name="Passengers" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;choice&gt;
                     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                     *                 &lt;/choice&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
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
                    @XmlType(name = "", propOrder = {
                        "serviceID",
                        "passengers"
                    })
                    public static class Services {

                        @XmlElement(name = "ServiceID", required = true)
                        protected List<ServiceIDType> serviceID;
                        @XmlElement(name = "Passengers")
                        protected OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers passengers;

                        /**
                         * Gets the value of the serviceID property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the serviceID property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getServiceID().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ServiceIDType }
                         * 
                         * 
                         */
                        public List<ServiceIDType> getServiceID() {
                            if (serviceID == null) {
                                serviceID = new ArrayList<ServiceIDType>();
                            }
                            return this.serviceID;
                        }

                        /**
                         * Gets the value of the passengers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers }
                         *     
                         */
                        public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers getPassengers() {
                            return passengers;
                        }

                        /**
                         * Sets the value of the passengers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers }
                         *     
                         */
                        public void setPassengers(OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers value) {
                            this.passengers = value;
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
                         *       &lt;choice&gt;
                         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                         *       &lt;/choice&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "passengerReferences",
                            "groupReference"
                        })
                        public static class Passengers {

                            @XmlList
                            @XmlElement(name = "PassengerReferences")
                            @XmlIDREF
                            @XmlSchemaType(name = "IDREFS")
                            protected List<Object> passengerReferences;
                            @XmlElement(name = "GroupReference")
                            @XmlIDREF
                            @XmlSchemaType(name = "IDREF")
                            protected Object groupReference;

                            /**
                             * 
                             *                                                                   Association to multiple Passenger instance(s). Example: pax1 pax2
                             *                                                                 Gets the value of the passengerReferences property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getPassengerReferences().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Object }
                             * 
                             * 
                             */
                            public List<Object> getPassengerReferences() {
                                if (passengerReferences == null) {
                                    passengerReferences = new ArrayList<Object>();
                                }
                                return this.passengerReferences;
                            }

                            /**
                             * Gets the value of the groupReference property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Object }
                             *     
                             */
                            public Object getGroupReference() {
                                return groupReference;
                            }

                            /**
                             * Sets the value of the groupReference property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Object }
                             *     
                             */
                            public void setGroupReference(Object value) {
                                this.groupReference = value;
                            }

                        }

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
                 *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" /&gt;
                 *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OtherAssociation {

                    @XmlAttribute(name = "Type", required = true)
                    protected String type;
                    @XmlAttribute(name = "ReferenceValue", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object referenceValue;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the referenceValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getReferenceValue() {
                        return referenceValue;
                    }

                    /**
                     * Sets the value of the referenceValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setReferenceValue(Object value) {
                        this.referenceValue = value;
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
                 *       &lt;choice&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *       &lt;/choice&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object groupReference;

                    /**
                     * 
                     *                                                   Association to multiple Passenger instance(s). Example: pax1 pax2
                     *                                                 Gets the value of the passengerReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPassengerReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getPassengerReferences() {
                        if (passengerReferences == null) {
                            passengerReferences = new ArrayList<Object>();
                        }
                        return this.passengerReferences;
                    }

                    /**
                     * Gets the value of the groupReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getGroupReference() {
                        return groupReference;
                    }

                    /**
                     * Sets the value of the groupReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setGroupReference(Object value) {
                        this.groupReference = value;
                    }

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
             *         &lt;element name="AgentIDs" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/&gt;
             *         &lt;element name="Passengers" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
             *                 &lt;/choice&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
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
            @XmlType(name = "", propOrder = {
                "agentIDs",
                "issuingAirlineInfo",
                "ticketDocument",
                "carrierFeeInfo",
                "originalIssueInfo",
                "passengers"
            })
            public static class TicketDocInfo {

                @XmlElementWrapper(name = "AgentIDs")
                @XmlElement(name = "AgentID", namespace = "http://www.iata.org/IATA/EDIST")
                protected List<AgentID> agentIDs;
                @XmlElement(name = "IssuingAirlineInfo")
                protected IssuingAirlineInfo issuingAirlineInfo;
                @XmlElement(name = "TicketDocument", required = true)
                protected List<TicketDocument> ticketDocument;
                @XmlElement(name = "CarrierFeeInfo")
                protected CarrierFeeInfoType carrierFeeInfo;
                @XmlElement(name = "OriginalIssueInfo")
                protected OriginalIssueInfo originalIssueInfo;
                @XmlElement(name = "Passengers")
                protected OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers passengers;

                /**
                 * Place of Issue of the agency or airline issuing the document followed by the name of the agency or airline issuing the document.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IssuingAirlineInfo }
                 *     
                 */
                public IssuingAirlineInfo getIssuingAirlineInfo() {
                    return issuingAirlineInfo;
                }

                /**
                 * Sets the value of the issuingAirlineInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IssuingAirlineInfo }
                 *     
                 */
                public void setIssuingAirlineInfo(IssuingAirlineInfo value) {
                    this.issuingAirlineInfo = value;
                }

                /**
                 * Gets the value of the ticketDocument property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTicketDocument().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TicketDocument }
                 * 
                 * 
                 */
                public List<TicketDocument> getTicketDocument() {
                    if (ticketDocument == null) {
                        ticketDocument = new ArrayList<TicketDocument>();
                    }
                    return this.ticketDocument;
                }

                /**
                 * Gets the value of the carrierFeeInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CarrierFeeInfoType }
                 *     
                 */
                public CarrierFeeInfoType getCarrierFeeInfo() {
                    return carrierFeeInfo;
                }

                /**
                 * Sets the value of the carrierFeeInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CarrierFeeInfoType }
                 *     
                 */
                public void setCarrierFeeInfo(CarrierFeeInfoType value) {
                    this.carrierFeeInfo = value;
                }

                /**
                 * Gets the value of the originalIssueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginalIssueInfo }
                 *     
                 */
                public OriginalIssueInfo getOriginalIssueInfo() {
                    return originalIssueInfo;
                }

                /**
                 * Sets the value of the originalIssueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginalIssueInfo }
                 *     
                 */
                public void setOriginalIssueInfo(OriginalIssueInfo value) {
                    this.originalIssueInfo = value;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers }
                 *     
                 */
                public OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers }
                 *     
                 */
                public void setPassengers(OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers value) {
                    this.passengers = value;
                }

                public List<AgentID> getAgentIDs() {
                    if (agentIDs == null) {
                        agentIDs = new ArrayList<AgentID>();
                    }
                    return agentIDs;
                }

                public void setAgentIDs(List<AgentID> agentIDs) {
                    this.agentIDs = agentIDs;
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
                 *       &lt;choice&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/&gt;
                 *       &lt;/choice&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object groupReference;

                    /**
                     * 
                     *                                               Association to multiple Passenger instance(s). Example: pax1 pax2
                     *                                             Gets the value of the passengerReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPassengerReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getPassengerReferences() {
                        if (passengerReferences == null) {
                            passengerReferences = new ArrayList<Object>();
                        }
                        return this.passengerReferences;
                    }

                    /**
                     * Gets the value of the groupReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getGroupReference() {
                        return groupReference;
                    }

                    /**
                     * Sets the value of the groupReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setGroupReference(Object value) {
                        this.groupReference = value;
                    }

                }

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
         *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType"/&gt;
         *         &lt;element name="ResponseID"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST}ItemID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="OfferItems" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="OfferItem" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
        @XmlType(name = "", propOrder = {
            "owner",
            "responseID",
            "offerID",
            "offerItems"
        })
        public static class ShoppingResponse {

            @XmlElement(name = "Owner", required = true)
            protected String owner;
            @XmlElement(name = "ResponseID", required = true)
            protected OrderCoreChangeType.Details.ShoppingResponse.ResponseID responseID;
            @XmlElement(name = "OfferID")
            protected List<ItemIDType> offerID;
            @XmlElementWrapper(name = "OfferItems")
            @XmlElement(name = "OfferItem", namespace = "http://www.iata.org/IATA/EDIST")
            protected List<OrderCoreChangeType.Details.ShoppingResponse.OfferItem> offerItems;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

            /**
             * Gets the value of the owner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Sets the value of the owner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Gets the value of the responseID property.
             * 
             * @return
             *     possible object is
             *     {@link OrderCoreChangeType.Details.ShoppingResponse.ResponseID }
             *     
             */
            public OrderCoreChangeType.Details.ShoppingResponse.ResponseID getResponseID() {
                return responseID;
            }

            /**
             * Sets the value of the responseID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderCoreChangeType.Details.ShoppingResponse.ResponseID }
             *     
             */
            public void setResponseID(OrderCoreChangeType.Details.ShoppingResponse.ResponseID value) {
                this.responseID = value;
            }

            /**
             * Gets the value of the offerID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offerID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOfferID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemIDType }
             * 
             * 
             */
            public List<ItemIDType> getOfferID() {
                if (offerID == null) {
                    offerID = new ArrayList<ItemIDType>();
                }
                return this.offerID;
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

            public List<OrderCoreChangeType.Details.ShoppingResponse.OfferItem> getOfferItems() {
                if (offerItems == null) {
                    offerItems = new ArrayList<OrderCoreChangeType.Details.ShoppingResponse.OfferItem>();
                }
                return offerItems;
            }

            public void setOfferItems(List<OrderCoreChangeType.Details.ShoppingResponse.OfferItem> offerItems) {
                this.offerItems = offerItems;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "offerItemID",
                "serviceID"
            })
            public static class OfferItem {

                @XmlElement(name = "OfferItemID", required = true)
                protected ItemIDType offerItemID;
                @XmlElement(name = "ServiceID")
                protected List<ServiceIDType> serviceID;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

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
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serviceID property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getServiceID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ServiceIDType }
                 * 
                 * 
                 */
                public List<ServiceIDType> getServiceID() {
                    if (serviceID == null) {
                        serviceID = new ArrayList<ServiceIDType>();
                    }
                    return this.serviceID;
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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
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
            public static class ResponseID {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for a Unique String Identifier constraint.
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

            }

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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderTimeLimitsType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeLimits
        extends OrderTimeLimitsType
    {


    }

}
