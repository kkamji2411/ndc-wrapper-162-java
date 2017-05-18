
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE Data List definition.
 * 
 * <p>Java class for ListOfServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID"/&gt;
 *                   &lt;element name="Name"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Encoding" type="{http://www.iata.org/IATA/EDIST}ServiceEncodingType"/&gt;
 *                   &lt;element name="FeeMethod" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SVCDescriptions" type="{http://www.iata.org/IATA/EDIST}ServiceDescriptionType"/&gt;
 *                   &lt;element name="Settlement" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
 *                             &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST}ServicePriceType" minOccurs="0"/&gt;
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}ServiceAssocType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}DataListObjAttrGroup"/&gt;
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
@XmlType(name = "ListOfServiceType", propOrder = {
    "service"
})
public class ListOfServiceType {

    @XmlElement(name = "Service", required = true)
    protected List<ListOfServiceType.Service> service;

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfServiceType.Service }
     * 
     * 
     */
    public List<ListOfServiceType.Service> getService() {
        if (service == null) {
            service = new ArrayList<ListOfServiceType.Service>();
        }
        return this.service;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID"/&gt;
     *         &lt;element name="Name"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Encoding" type="{http://www.iata.org/IATA/EDIST}ServiceEncodingType"/&gt;
     *         &lt;element name="FeeMethod" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SVCDescriptions" type="{http://www.iata.org/IATA/EDIST}ServiceDescriptionType"/&gt;
     *         &lt;element name="Settlement" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
     *                   &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST}ServicePriceType" minOccurs="0"/&gt;
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}ServiceAssocType" minOccurs="0"/&gt;
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
        "serviceID",
        "name",
        "encoding",
        "feeMethod",
        "svcDescriptions",
        "settlement",
        "price",
        "associations"
    })
    public static class Service {

        @XmlElement(name = "ServiceID", required = true)
        protected ServiceIDType serviceID;
        @XmlElement(name = "Name", required = true)
        protected ListOfServiceType.Service.Name name;
        @XmlElement(name = "Encoding", required = true)
        protected ServiceEncodingType encoding;
        @XmlElement(name = "FeeMethod")
        protected ListOfServiceType.Service.FeeMethod feeMethod;
        @XmlElement(name = "SVCDescriptions", required = true)
        protected ServiceDescriptionType svcDescriptions;
        @XmlElement(name = "Settlement")
        protected ListOfServiceType.Service.Settlement settlement;
        @XmlElement(name = "Price")
        protected ServicePriceType price;
        @XmlElement(name = "Associations")
        protected ServiceAssocType associations;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

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

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceType.Service.Name }
         *     
         */
        public ListOfServiceType.Service.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceType.Service.Name }
         *     
         */
        public void setName(ListOfServiceType.Service.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the encoding property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceEncodingType }
         *     
         */
        public ServiceEncodingType getEncoding() {
            return encoding;
        }

        /**
         * Sets the value of the encoding property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceEncodingType }
         *     
         */
        public void setEncoding(ServiceEncodingType value) {
            this.encoding = value;
        }

        /**
         * Gets the value of the feeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceType.Service.FeeMethod }
         *     
         */
        public ListOfServiceType.Service.FeeMethod getFeeMethod() {
            return feeMethod;
        }

        /**
         * Sets the value of the feeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceType.Service.FeeMethod }
         *     
         */
        public void setFeeMethod(ListOfServiceType.Service.FeeMethod value) {
            this.feeMethod = value;
        }

        /**
         * Gets the value of the svcDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceDescriptionType }
         *     
         */
        public ServiceDescriptionType getSVCDescriptions() {
            return svcDescriptions;
        }

        /**
         * Sets the value of the svcDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceDescriptionType }
         *     
         */
        public void setSVCDescriptions(ServiceDescriptionType value) {
            this.svcDescriptions = value;
        }

        /**
         * Gets the value of the settlement property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceType.Service.Settlement }
         *     
         */
        public ListOfServiceType.Service.Settlement getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceType.Service.Settlement }
         *     
         */
        public void setSettlement(ListOfServiceType.Service.Settlement value) {
            this.settlement = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link ServicePriceType }
         *     
         */
        public ServicePriceType getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServicePriceType }
         *     
         */
        public void setPrice(ServicePriceType value) {
            this.price = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceAssocType }
         *     
         */
        public ServiceAssocType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceAssocType }
         *     
         */
        public void setAssociations(ServiceAssocType value) {
            this.associations = value;
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
        public static class FeeMethod {

            @XmlValue
            protected String value;

            /**
             * Gets the value of the value property.
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
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
        public static class Name {

            @XmlValue
            protected String value;

            /**
             * A data type for Proper Name size constraint.
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
         *         &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
         *         &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/&gt;
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
            "method",
            "interlineSettlementValue"
        })
        public static class Settlement {

            @XmlElement(name = "Method", required = true)
            protected CodesetType method;
            @XmlElement(name = "InterlineSettlementValue")
            protected CurrencyAmountOptType interlineSettlementValue;

            /**
             * Gets the value of the method property.
             * 
             * @return
             *     possible object is
             *     {@link CodesetType }
             *     
             */
            public CodesetType getMethod() {
                return method;
            }

            /**
             * Sets the value of the method property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodesetType }
             *     
             */
            public void setMethod(CodesetType value) {
                this.method = value;
            }

            /**
             * Gets the value of the interlineSettlementValue property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getInterlineSettlementValue() {
                return interlineSettlementValue;
            }

            /**
             * Sets the value of the interlineSettlementValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setInterlineSettlementValue(CurrencyAmountOptType value) {
                this.interlineSettlementValue = value;
            }

        }

    }

}
