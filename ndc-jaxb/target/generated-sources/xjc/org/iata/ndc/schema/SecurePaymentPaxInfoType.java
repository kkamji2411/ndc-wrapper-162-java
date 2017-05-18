
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
 * SECURE PAYMENT AIRLINE RESERVATION definition.
 * 
 * 
 * <p>Java class for SecurePaymentPaxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentPaxInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Carriers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Carrier" maxOccurs="4"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirlineID_Type"&gt;
 *                           &lt;attribute name="Application" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateTimes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DateTime" maxOccurs="4"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                           &lt;attribute name="Time" type="{http://www.iata.org/IATA/EDIST}TimeSimpleType" /&gt;
 *                           &lt;attribute name="Application" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClassesOfService" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" maxOccurs="4"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StopLocations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StopLocation" maxOccurs="4"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCode"/&gt;
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
 *         &lt;element name="FareBasisCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" maxOccurs="4"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FilghtNumbers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber" maxOccurs="4"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassengerName" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CountrySimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassengerTktNbr" type="{http://www.iata.org/IATA/EDIST}TicketNumberSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="AgencyInfo" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
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
@XmlType(name = "SecurePaymentPaxInfoType", propOrder = {
    "carriers",
    "dateTimes",
    "classesOfService",
    "stopLocations",
    "fareBasisCodes",
    "filghtNumbers",
    "passengerName",
    "residenceCode",
    "passengerTktNbr",
    "agencyInfo"
})
@XmlSeeAlso({
    ReservationInfo.class
})
public class SecurePaymentPaxInfoType {

    @XmlElementWrapper(name = "Carriers")
    @XmlElement(name = "Carrier", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<SecurePaymentPaxInfoType.Carrier> carriers;
    @XmlElementWrapper(name = "DateTimes")
    @XmlElement(name = "DateTime", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<SecurePaymentPaxInfoType.DateTime> dateTimes;
    @XmlElementWrapper(name = "ClassesOfService")
    @XmlElement(name = "ClassOfService", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FlightCOSCoreType> classesOfService;
    @XmlElementWrapper(name = "StopLocations")
    @XmlElement(name = "StopLocation", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<SecurePaymentPaxInfoType.StopLocation> stopLocations;
    @XmlElementWrapper(name = "FareBasisCodes")
    @XmlElement(name = "FareBasisCode", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FareBasisCodeType> fareBasisCodes;
    @XmlElementWrapper(name = "FilghtNumbers")
    @XmlElement(name = "FlightNumber", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FlightNumber> filghtNumbers;
    @XmlElement(name = "PassengerName")
    protected String passengerName;
    @XmlElement(name = "ResidenceCode")
    protected SecurePaymentPaxInfoType.ResidenceCode residenceCode;
    @XmlElement(name = "PassengerTktNbr")
    protected String passengerTktNbr;
    @XmlElement(name = "AgencyInfo")
    protected String agencyInfo;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the residenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentPaxInfoType.ResidenceCode }
     *     
     */
    public SecurePaymentPaxInfoType.ResidenceCode getResidenceCode() {
        return residenceCode;
    }

    /**
     * Sets the value of the residenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentPaxInfoType.ResidenceCode }
     *     
     */
    public void setResidenceCode(SecurePaymentPaxInfoType.ResidenceCode value) {
        this.residenceCode = value;
    }

    /**
     * Gets the value of the passengerTktNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTktNbr() {
        return passengerTktNbr;
    }

    /**
     * Sets the value of the passengerTktNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTktNbr(String value) {
        this.passengerTktNbr = value;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyInfo(String value) {
        this.agencyInfo = value;
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

    public List<SecurePaymentPaxInfoType.Carrier> getCarriers() {
        if (carriers == null) {
            carriers = new ArrayList<SecurePaymentPaxInfoType.Carrier>();
        }
        return carriers;
    }

    public void setCarriers(List<SecurePaymentPaxInfoType.Carrier> carriers) {
        this.carriers = carriers;
    }

    public List<SecurePaymentPaxInfoType.DateTime> getDateTimes() {
        if (dateTimes == null) {
            dateTimes = new ArrayList<SecurePaymentPaxInfoType.DateTime>();
        }
        return dateTimes;
    }

    public void setDateTimes(List<SecurePaymentPaxInfoType.DateTime> dateTimes) {
        this.dateTimes = dateTimes;
    }

    public List<FlightCOSCoreType> getClassesOfService() {
        if (classesOfService == null) {
            classesOfService = new ArrayList<FlightCOSCoreType>();
        }
        return classesOfService;
    }

    public void setClassesOfService(List<FlightCOSCoreType> classesOfService) {
        this.classesOfService = classesOfService;
    }

    public List<SecurePaymentPaxInfoType.StopLocation> getStopLocations() {
        if (stopLocations == null) {
            stopLocations = new ArrayList<SecurePaymentPaxInfoType.StopLocation>();
        }
        return stopLocations;
    }

    public void setStopLocations(List<SecurePaymentPaxInfoType.StopLocation> stopLocations) {
        this.stopLocations = stopLocations;
    }

    public List<FareBasisCodeType> getFareBasisCodes() {
        if (fareBasisCodes == null) {
            fareBasisCodes = new ArrayList<FareBasisCodeType>();
        }
        return fareBasisCodes;
    }

    public void setFareBasisCodes(List<FareBasisCodeType> fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }

    public List<FlightNumber> getFilghtNumbers() {
        if (filghtNumbers == null) {
            filghtNumbers = new ArrayList<FlightNumber>();
        }
        return filghtNumbers;
    }

    public void setFilghtNumbers(List<FlightNumber> filghtNumbers) {
        this.filghtNumbers = filghtNumbers;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;AirlineID_Type"&gt;
     *       &lt;attribute name="Application" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Carrier
        extends AirlineIDType
    {

        @XmlAttribute(name = "Application")
        protected String application;

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
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
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="Time" type="{http://www.iata.org/IATA/EDIST}TimeSimpleType" /&gt;
     *       &lt;attribute name="Application" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateTime {

        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Time")
        protected String time;
        @XmlAttribute(name = "Application")
        protected String application;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CountrySimpleType"&gt;
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
    public static class ResidenceCode {

        @XmlValue
        protected String value;

        /**
         * A data type for Country Code encoding constraint: ISO 3166-1 (two character) Country Code
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCode"/&gt;
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
        "airportCode"
    })
    public static class StopLocation {

        @XmlElement(name = "AirportCode", required = true)
        protected AirportCode airportCode;

        /**
         * Gets the value of the airportCode property.
         * 
         * @return
         *     possible object is
         *     {@link AirportCode }
         *     
         */
        public AirportCode getAirportCode() {
            return airportCode;
        }

        /**
         * Sets the value of the airportCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirportCode }
         *     
         */
        public void setAirportCode(AirportCode value) {
            this.airportCode = value;
        }

    }

}
