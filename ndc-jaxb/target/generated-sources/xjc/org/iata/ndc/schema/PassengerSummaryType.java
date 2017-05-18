
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type for SUMMARY PASSENGER representation.
 * 
 * <p>Java class for PassengerSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}TravelerSummaryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/&gt;
 *         &lt;element name="FQTVs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_Alliance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_ProgramCore" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_ProgramDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_ProgramSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;TravelerGenderSimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *         &lt;element name="PassengerIDInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FOID" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                             &lt;element name="ID"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
 *                                     &lt;attribute name="VendorCode" type="{http://www.iata.org/IATA/EDIST}AlphaNumericStringLength1to2" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PassengerDocument" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                             &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
 *                             &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConsentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerSummaryType", propOrder = {
    "contacts",
    "fqtVs",
    "gender",
    "remarks",
    "passengerIDInfo"
})
@XmlSeeAlso({
    PassengerDetailType.class
})
public class PassengerSummaryType
    extends TravelerSummaryType
{

    @XmlElementWrapper(name = "Contacts")
    @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Contact> contacts;
    @XmlElement(name = "FQTVs")
    protected PassengerSummaryType.FQTVs fqtVs;
    @XmlElement(name = "Gender")
    protected PassengerSummaryType.Gender gender;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;
    @XmlElement(name = "PassengerIDInfo")
    protected PassengerSummaryType.PassengerIDInfo passengerIDInfo;
    @XmlAttribute(name = "ConsentInd")
    protected Boolean consentInd;

    /**
     * Gets the value of the fqtVs property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSummaryType.FQTVs }
     *     
     */
    public PassengerSummaryType.FQTVs getFQTVs() {
        return fqtVs;
    }

    /**
     * Sets the value of the fqtVs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSummaryType.FQTVs }
     *     
     */
    public void setFQTVs(PassengerSummaryType.FQTVs value) {
        this.fqtVs = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSummaryType.Gender }
     *     
     */
    public PassengerSummaryType.Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSummaryType.Gender }
     *     
     */
    public void setGender(PassengerSummaryType.Gender value) {
        this.gender = value;
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

    /**
     * Gets the value of the passengerIDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSummaryType.PassengerIDInfo }
     *     
     */
    public PassengerSummaryType.PassengerIDInfo getPassengerIDInfo() {
        return passengerIDInfo;
    }

    /**
     * Sets the value of the passengerIDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSummaryType.PassengerIDInfo }
     *     
     */
    public void setPassengerIDInfo(PassengerSummaryType.PassengerIDInfo value) {
        this.passengerIDInfo = value;
    }

    /**
     * Gets the value of the consentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsentInd() {
        return consentInd;
    }

    /**
     * Sets the value of the consentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsentInd(Boolean value) {
        this.consentInd = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_Alliance" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_ProgramCore" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_ProgramDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FQTV_ProgramSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Information" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "fqtvAlliance",
        "fqtvProgramCore",
        "fqtvProgramDetail",
        "fqtvProgramSummary",
        "travelerFQTVInformation"
    })
    public static class FQTVs {

        @XmlElement(name = "FQTV_Alliance")
        protected List<FQTVAllianceType> fqtvAlliance;
        @XmlElement(name = "FQTV_ProgramCore")
        protected List<FQTVProgramCoreType> fqtvProgramCore;
        @XmlElement(name = "FQTV_ProgramDetail")
        protected List<FQTVProgramDetailType> fqtvProgramDetail;
        @XmlElement(name = "FQTV_ProgramSummary")
        protected List<FQTVProgramSummaryType> fqtvProgramSummary;
        @XmlElement(name = "TravelerFQTV_Information")
        protected List<TravelerFQTVType> travelerFQTVInformation;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the fqtvAlliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fqtvAlliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFQTVAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FQTVAllianceType }
         * 
         * 
         */
        public List<FQTVAllianceType> getFQTVAlliance() {
            if (fqtvAlliance == null) {
                fqtvAlliance = new ArrayList<FQTVAllianceType>();
            }
            return this.fqtvAlliance;
        }

        /**
         * FQTV Program main information.Gets the value of the fqtvProgramCore property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fqtvProgramCore property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFQTVProgramCore().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FQTVProgramCoreType }
         * 
         * 
         */
        public List<FQTVProgramCoreType> getFQTVProgramCore() {
            if (fqtvProgramCore == null) {
                fqtvProgramCore = new ArrayList<FQTVProgramCoreType>();
            }
            return this.fqtvProgramCore;
        }

        /**
         * FQTV Program information, details.Gets the value of the fqtvProgramDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fqtvProgramDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFQTVProgramDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FQTVProgramDetailType }
         * 
         * 
         */
        public List<FQTVProgramDetailType> getFQTVProgramDetail() {
            if (fqtvProgramDetail == null) {
                fqtvProgramDetail = new ArrayList<FQTVProgramDetailType>();
            }
            return this.fqtvProgramDetail;
        }

        /**
         * FQTV Program information summary.Gets the value of the fqtvProgramSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fqtvProgramSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFQTVProgramSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FQTVProgramSummaryType }
         * 
         * 
         */
        public List<FQTVProgramSummaryType> getFQTVProgramSummary() {
            if (fqtvProgramSummary == null) {
                fqtvProgramSummary = new ArrayList<FQTVProgramSummaryType>();
            }
            return this.fqtvProgramSummary;
        }

        /**
         * Traveler Frequent Flyer (FQTV) Account Information.
         * Gets the value of the travelerFQTVInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerFQTVInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerFQTVInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerFQTVType }
         * 
         * 
         */
        public List<TravelerFQTVType> getTravelerFQTVInformation() {
            if (travelerFQTVInformation == null) {
                travelerFQTVInformation = new ArrayList<TravelerFQTVType>();
            }
            return this.travelerFQTVInformation;
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
     *         &lt;element name="FOID" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                   &lt;element name="ID"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
     *                           &lt;attribute name="VendorCode" type="{http://www.iata.org/IATA/EDIST}AlphaNumericStringLength1to2" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PassengerDocument" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                   &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
     *                   &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AllowDocumentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "foid",
        "passengerDocument"
    })
    public static class PassengerIDInfo {

        @XmlElement(name = "FOID")
        protected PassengerSummaryType.PassengerIDInfo.FOID foid;
        @XmlElement(name = "PassengerDocument")
        protected List<PassengerSummaryType.PassengerIDInfo.PassengerDocument> passengerDocument;
        @XmlAttribute(name = "AllowDocumentInd")
        protected Boolean allowDocumentInd;

        /**
         * Gets the value of the foid property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerSummaryType.PassengerIDInfo.FOID }
         *     
         */
        public PassengerSummaryType.PassengerIDInfo.FOID getFOID() {
            return foid;
        }

        /**
         * Sets the value of the foid property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerSummaryType.PassengerIDInfo.FOID }
         *     
         */
        public void setFOID(PassengerSummaryType.PassengerIDInfo.FOID value) {
            this.foid = value;
        }

        /**
         * Gets the value of the passengerDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerSummaryType.PassengerIDInfo.PassengerDocument }
         * 
         * 
         */
        public List<PassengerSummaryType.PassengerIDInfo.PassengerDocument> getPassengerDocument() {
            if (passengerDocument == null) {
                passengerDocument = new ArrayList<PassengerSummaryType.PassengerIDInfo.PassengerDocument>();
            }
            return this.passengerDocument;
        }

        /**
         * Gets the value of the allowDocumentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowDocumentInd() {
            return allowDocumentInd;
        }

        /**
         * Sets the value of the allowDocumentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowDocumentInd(Boolean value) {
            this.allowDocumentInd = value;
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
         *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *         &lt;element name="ID"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;UniqueStringID_SimpleType"&gt;
         *                 &lt;attribute name="VendorCode" type="{http://www.iata.org/IATA/EDIST}AlphaNumericStringLength1to2" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
            "type",
            "id"
        })
        public static class FOID {

            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "ID", required = true)
            protected PassengerSummaryType.PassengerIDInfo.FOID.ID id;

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
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link PassengerSummaryType.PassengerIDInfo.FOID.ID }
             *     
             */
            public PassengerSummaryType.PassengerIDInfo.FOID.ID getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link PassengerSummaryType.PassengerIDInfo.FOID.ID }
             *     
             */
            public void setID(PassengerSummaryType.PassengerIDInfo.FOID.ID value) {
                this.id = value;
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
             *       &lt;attribute name="VendorCode" type="{http://www.iata.org/IATA/EDIST}AlphaNumericStringLength1to2" /&gt;
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
            public static class ID {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "VendorCode")
                protected String vendorCode;

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
                 * Gets the value of the vendorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVendorCode() {
                    return vendorCode;
                }

                /**
                 * Sets the value of the vendorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVendorCode(String value) {
                    this.vendorCode = value;
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
         *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *         &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/&gt;
         *         &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="DateOfExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="CountryOfIssuance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ApplicabilityLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "type",
            "id",
            "birthCountry",
            "dateOfIssue",
            "dateOfExpiration",
            "countryOfIssuance",
            "applicabilityLocation",
            "countryOfResidence"
        })
        public static class PassengerDocument {

            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "ID", required = true)
            protected String id;
            @XmlElement(name = "BirthCountry")
            protected String birthCountry;
            @XmlElement(name = "DateOfIssue")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateOfIssue;
            @XmlElement(name = "DateOfExpiration")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateOfExpiration;
            @XmlElement(name = "CountryOfIssuance")
            protected String countryOfIssuance;
            @XmlElement(name = "ApplicabilityLocation")
            protected String applicabilityLocation;
            @XmlElement(name = "CountryOfResidence")
            protected String countryOfResidence;

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
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the birthCountry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirthCountry() {
                return birthCountry;
            }

            /**
             * Sets the value of the birthCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirthCountry(String value) {
                this.birthCountry = value;
            }

            /**
             * Gets the value of the dateOfIssue property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateOfIssue() {
                return dateOfIssue;
            }

            /**
             * Sets the value of the dateOfIssue property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateOfIssue(XMLGregorianCalendar value) {
                this.dateOfIssue = value;
            }

            /**
             * Gets the value of the dateOfExpiration property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateOfExpiration() {
                return dateOfExpiration;
            }

            /**
             * Sets the value of the dateOfExpiration property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateOfExpiration(XMLGregorianCalendar value) {
                this.dateOfExpiration = value;
            }

            /**
             * Gets the value of the countryOfIssuance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryOfIssuance() {
                return countryOfIssuance;
            }

            /**
             * Sets the value of the countryOfIssuance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryOfIssuance(String value) {
                this.countryOfIssuance = value;
            }

            /**
             * Gets the value of the applicabilityLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicabilityLocation() {
                return applicabilityLocation;
            }

            /**
             * Sets the value of the applicabilityLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicabilityLocation(String value) {
                this.applicabilityLocation = value;
            }

            /**
             * Gets the value of the countryOfResidence property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryOfResidence() {
                return countryOfResidence;
            }

            /**
             * Sets the value of the countryOfResidence property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryOfResidence(String value) {
                this.countryOfResidence = value;
            }

        }

    }

}
