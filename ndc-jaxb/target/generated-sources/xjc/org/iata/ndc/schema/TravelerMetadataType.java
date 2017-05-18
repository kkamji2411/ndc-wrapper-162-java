
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Traveler Metadata definition.
 * 
 * <p>Java class for TravelerMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameDetail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GivenNamePrefix" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" maxOccurs="3" minOccurs="0"/&gt;
 *                   &lt;element name="TitleSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="5" minOccurs="0"/&gt;
 *                   &lt;element name="SurnamePrefix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/&gt;
 *                   &lt;element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="3" minOccurs="0"/&gt;
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
@XmlType(name = "TravelerMetadataType", propOrder = {
    "nameDetail"
})
public class TravelerMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "NameDetail")
    protected TravelerMetadataType.NameDetail nameDetail;

    /**
     * Gets the value of the nameDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerMetadataType.NameDetail }
     *     
     */
    public TravelerMetadataType.NameDetail getNameDetail() {
        return nameDetail;
    }

    /**
     * Sets the value of the nameDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerMetadataType.NameDetail }
     *     
     */
    public void setNameDetail(TravelerMetadataType.NameDetail value) {
        this.nameDetail = value;
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
     *         &lt;element name="GivenNamePrefix" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" maxOccurs="3" minOccurs="0"/&gt;
     *         &lt;element name="TitleSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="5" minOccurs="0"/&gt;
     *         &lt;element name="SurnamePrefix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/&gt;
     *         &lt;element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="3" minOccurs="0"/&gt;
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
        "givenNamePrefix",
        "titleSuffix",
        "surnamePrefix",
        "surnameSuffix"
    })
    public static class NameDetail {

        @XmlElement(name = "GivenNamePrefix")
        protected List<String> givenNamePrefix;
        @XmlElement(name = "TitleSuffix")
        protected List<String> titleSuffix;
        @XmlElement(name = "SurnamePrefix")
        protected String surnamePrefix;
        @XmlElement(name = "SurnameSuffix")
        protected List<String> surnameSuffix;

        /**
         * Gets the value of the givenNamePrefix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the givenNamePrefix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGivenNamePrefix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGivenNamePrefix() {
            if (givenNamePrefix == null) {
                givenNamePrefix = new ArrayList<String>();
            }
            return this.givenNamePrefix;
        }

        /**
         * Gets the value of the titleSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titleSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTitleSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTitleSuffix() {
            if (titleSuffix == null) {
                titleSuffix = new ArrayList<String>();
            }
            return this.titleSuffix;
        }

        /**
         * Gets the value of the surnamePrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnamePrefix() {
            return surnamePrefix;
        }

        /**
         * Sets the value of the surnamePrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnamePrefix(String value) {
            this.surnamePrefix = value;
        }

        /**
         * Gets the value of the surnameSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surnameSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurnameSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSurnameSuffix() {
            if (surnameSuffix == null) {
                surnameSuffix = new ArrayList<String>();
            }
            return this.surnameSuffix;
        }

    }

}
