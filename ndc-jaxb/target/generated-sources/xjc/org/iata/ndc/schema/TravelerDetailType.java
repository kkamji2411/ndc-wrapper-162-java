
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
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for DETAIL Traveler representation.
 * 
 * Traveler Details, including Age/ Birthdate, Gender, FOID, FQTV information, Contact information, Spoken/ Written Languages and General Remarks.
 * 
 * <p>Java class for TravelerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}TravelerSummaryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TravelerGenderSimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FQTVs" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FOIDs" type="{http://www.iata.org/IATA/EDIST}TravelerFOID_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Languages" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerDetailType", propOrder = {
    "gender",
    "fqtVs",
    "foiDs",
    "contacts",
    "languages",
    "remarks"
})
public class TravelerDetailType
    extends TravelerSummaryType
{

    @XmlElement(name = "Gender")
    protected TravelerDetailType.Gender gender;
    @XmlElement(name = "FQTVs")
    protected List<TravelerFQTVType> fqtVs;
    @XmlElement(name = "FOIDs")
    protected TravelerFOIDType foiDs;
    @XmlElementWrapper(name = "Contacts")
    @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Contact> contacts;
    @XmlElement(name = "Languages")
    protected Languages languages;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerDetailType.Gender }
     *     
     */
    public TravelerDetailType.Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerDetailType.Gender }
     *     
     */
    public void setGender(TravelerDetailType.Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the fqtVs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fqtVs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFQTVs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerFQTVType }
     * 
     * 
     */
    public List<TravelerFQTVType> getFQTVs() {
        if (fqtVs == null) {
            fqtVs = new ArrayList<TravelerFQTVType>();
        }
        return this.fqtVs;
    }

    /**
     * Gets the value of the foiDs property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerFOIDType }
     *     
     */
    public TravelerFOIDType getFOIDs() {
        return foiDs;
    }

    /**
     * Sets the value of the foiDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerFOIDType }
     *     
     */
    public void setFOIDs(TravelerFOIDType value) {
        this.foiDs = value;
    }

    /**
     * Spoken or Written Language(s).
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TravelerGenderSimpleType"&gt;
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
    public static class Gender {

        @XmlValue
        protected TravelerGenderSimpleType value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * A data type for Traveler Gender list constraint.
         * 
         * @return
         *     possible object is
         *     {@link TravelerGenderSimpleType }
         *     
         */
        public TravelerGenderSimpleType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerGenderSimpleType }
         *     
         */
        public void setValue(TravelerGenderSimpleType value) {
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
