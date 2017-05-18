
package org.iata.ndc.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Associations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceReference" maxOccurs="unbounded"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Selection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="2"&gt;
 *                   &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BundleID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectKeyAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST}ServicePriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BundleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}DataListObjAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemCount",
    "associations",
    "selection",
    "bundleID",
    "price",
    "bundleName"
})
public class ServiceBundle {

    @XmlElement(name = "ItemCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemCount;
    @XmlElement(name = "Associations", required = true)
    protected ServiceBundle.Associations associations;
    @XmlElement(name = "Selection")
    protected ServiceBundle.Selection selection;
    @XmlElement(name = "BundleID")
    protected ServiceBundle.BundleID bundleID;
    @XmlElement(name = "Price")
    protected List<ServicePriceType> price;
    @XmlElement(name = "BundleName")
    protected String bundleName;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ListKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String listKey;

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemCount(BigInteger value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundle.Associations }
     *     
     */
    public ServiceBundle.Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundle.Associations }
     *     
     */
    public void setAssociations(ServiceBundle.Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundle.Selection }
     *     
     */
    public ServiceBundle.Selection getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundle.Selection }
     *     
     */
    public void setSelection(ServiceBundle.Selection value) {
        this.selection = value;
    }

    /**
     * Gets the value of the bundleID property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundle.BundleID }
     *     
     */
    public ServiceBundle.BundleID getBundleID() {
        return bundleID;
    }

    /**
     * Sets the value of the bundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundle.BundleID }
     *     
     */
    public void setBundleID(ServiceBundle.BundleID value) {
        this.bundleID = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePriceType }
     * 
     * 
     */
    public List<ServicePriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<ServicePriceType>();
        }
        return this.price;
    }

    /**
     * Gets the value of the bundleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleName() {
        return bundleName;
    }

    /**
     * Sets the value of the bundleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleName(String value) {
        this.bundleName = value;
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
     * Gets the value of the listKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListKey() {
        return listKey;
    }

    /**
     * Sets the value of the listKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListKey(String value) {
        this.listKey = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceReference" maxOccurs="unbounded"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/&gt;
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
        "serviceReference",
        "serviceID"
    })
    public static class Associations {

        @XmlElementRef(name = "ServiceReference", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
        protected List<JAXBElement<Object>> serviceReference;
        @XmlElement(name = "ServiceID")
        protected List<ServiceIDType> serviceID;

        /**
         * Gets the value of the serviceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         */
        public List<JAXBElement<Object>> getServiceReference() {
            if (serviceReference == null) {
                serviceReference = new ArrayList<JAXBElement<Object>>();
            }
            return this.serviceReference;
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
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjectKeyAttrGroup"/&gt;
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
    public static class BundleID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String objectKey;

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

        /**
         * Gets the value of the objectKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectKey() {
            return objectKey;
        }

        /**
         * Sets the value of the objectKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectKey(String value) {
            this.objectKey = value;
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
     *       &lt;choice maxOccurs="2"&gt;
     *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
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
        "minimumQuantityOrMaximumQuantity"
    })
    public static class Selection {

        @XmlElementRefs({
            @XmlElementRef(name = "MinimumQuantity", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MaximumQuantity", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<BigInteger>> minimumQuantityOrMaximumQuantity;

        /**
         * Gets the value of the minimumQuantityOrMaximumQuantity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the minimumQuantityOrMaximumQuantity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMinimumQuantityOrMaximumQuantity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * 
         * 
         */
        public List<JAXBElement<BigInteger>> getMinimumQuantityOrMaximumQuantity() {
            if (minimumQuantityOrMaximumQuantity == null) {
                minimumQuantityOrMaximumQuantity = new ArrayList<JAXBElement<BigInteger>>();
            }
            return this.minimumQuantityOrMaximumQuantity;
        }

    }

}
