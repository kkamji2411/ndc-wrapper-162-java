
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transaction Processing Notice(s).
 * 
 * Note:
 *  1. These notices contain information for requested functionality (utilized during transaction processing) that may not be supported by all implementers.
 *  2. Specified notice(s) will be ignored by receiving systems that do not support this capability.
 * 
 * 
 * <p>Java class for ItinShopAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinShopAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRUD_Rule" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Associations" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinShopAction", propOrder = {
    "crudRule",
    "associations"
})
public class ItinShopAction {

    @XmlElement(name = "CRUD_Rule", required = true)
    protected Object crudRule;
    @XmlElement(name = "Associations", required = true)
    protected Object associations;

    /**
     * Gets the value of the crudRule property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCRUDRule() {
        return crudRule;
    }

    /**
     * Sets the value of the crudRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCRUDRule(Object value) {
        this.crudRule = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssociations(Object value) {
        this.associations = value;
    }

}
