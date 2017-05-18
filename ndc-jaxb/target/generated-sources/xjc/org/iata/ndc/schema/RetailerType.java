
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for MERCHANDISE RETAILER Supplier Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from SupplierCoreRepType.
 * 
 * <p>Java class for RetailerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}SupplierCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RetailerID"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerType", propOrder = {
    "retailerID",
    "contacts"
})
@XmlSeeAlso({
    RetailerMsgPartyCoreType.class
})
public class RetailerType
    extends SupplierCoreRepType
{

    @XmlElement(name = "RetailerID", required = true)
    protected RetailerIDType retailerID;
    @XmlElementWrapper(name = "Contacts")
    @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Contact> contacts;

    /**
     * Gets the value of the retailerID property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerIDType }
     *     
     */
    public RetailerIDType getRetailerID() {
        return retailerID;
    }

    /**
     * Sets the value of the retailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerIDType }
     *     
     */
    public void setRetailerID(RetailerIDType value) {
        this.retailerID = value;
    }

    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
