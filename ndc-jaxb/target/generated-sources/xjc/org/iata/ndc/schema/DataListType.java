
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Common NDC Data List choices.
 * 
 * <p>Java class for DataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AnonymousTravelerList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RecognizedTravelerList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDisclosureList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnAllowanceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBagAllowanceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfServiceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentSourceList" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Description"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DisclosureList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareList" minOccurs="0"/&gt;
 *         &lt;element name="FlightSegmentList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/EDIST}ListOfFlightSegmentType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FlightList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Flight" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/&gt;
 *                             &lt;element name="Settlement" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
 *                                       &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                           &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginDestinationList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestination" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InstructionsList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PenaltyList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceClassList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceBundleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TermsList" minOccurs="0"/&gt;
 *         &lt;element name="SeatList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Seats" type="{http://www.iata.org/IATA/EDIST}ListOfSeatType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "DataListType", propOrder = {
    "anonymousTravelerList",
    "recognizedTravelerList",
    "bagDisclosureList",
    "carryOnAllowanceList",
    "checkedBagAllowanceList",
    "classOfServiceList",
    "contentSourceList",
    "descriptionList",
    "disclosureList",
    "fareList",
    "flightSegmentList",
    "flightList",
    "originDestinationList",
    "instructionsList",
    "mediaList",
    "penaltyList",
    "priceClassList",
    "serviceBundleList",
    "serviceList",
    "termsList",
    "seatList"
})
@XmlSeeAlso({
    org.iata.ndc.schema.AirShoppingRS.DataLists.class,
    org.iata.ndc.schema.FlightPriceRQ.DataLists.class
})
public class DataListType {

    @XmlElementWrapper(name = "AnonymousTravelerList")
    @XmlElement(name = "AnonymousTraveler", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<AnonymousTravelerType> anonymousTravelerList;
    @XmlElementWrapper(name = "RecognizedTravelerList")
    @XmlElement(name = "RecognizedTraveler", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<TravelerDetailType> recognizedTravelerList;
    @XmlElementWrapper(name = "BagDisclosureList")
    @XmlElement(name = "BagDisclosure", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<BagDisclosure> bagDisclosureList;
    @XmlElementWrapper(name = "CarryOnAllowanceList")
    @XmlElement(name = "CarryOnAllowance", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<CarryOnAllowance> carryOnAllowanceList;
    @XmlElementWrapper(name = "CheckedBagAllowanceList")
    @XmlElement(name = "CheckedBagAllowance", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<CheckedBagAllowance> checkedBagAllowanceList;
    @XmlElementWrapper(name = "ClassOfServiceList")
    @XmlElement(name = "ServiceClass", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ServiceClass> classOfServiceList;
    @XmlElementWrapper(name = "ContentSourceList")
    @XmlElement(name = "ContentSource", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ContentSource> contentSourceList;
    @XmlElement(name = "DescriptionList")
    protected DataListType.DescriptionList descriptionList;
    @XmlElementWrapper(name = "DisclosureList")
    @XmlElement(name = "Disclosures", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ListOfDisclosureTypeDisclosures> disclosureList;
    @XmlElementWrapper(name = "FareList")
    @XmlElement(name = "FareGroup", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FareGroup> fareList;
    @XmlElementWrapper(name = "FlightSegmentList")
    @XmlElement(name = "FlightSegment", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ListOfFlightSegmentType> flightSegmentList;
    @XmlElementWrapper(name = "FlightList")
    @XmlElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<DataListType.Flight> flightList;
    @XmlElementWrapper(name = "OriginDestinationList")
    @XmlElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OriginDestination> originDestinationList;
    @XmlElementWrapper(name = "InstructionsList")
    @XmlElement(name = "Instruction", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Instruction> instructionsList;
    @XmlElementWrapper(name = "MediaList")
    @XmlElement(name = "Media", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Media> mediaList;
    @XmlElementWrapper(name = "PenaltyList")
    @XmlElement(name = "Penalty", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Penalty> penaltyList;
    @XmlElementWrapper(name = "PriceClassList")
    @XmlElement(name = "PriceClass", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<PriceClassType> priceClassList;
    @XmlElementWrapper(name = "ServiceBundleList")
    @XmlElement(name = "ServiceBundle", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ServiceBundle> serviceBundleList;
    @XmlElementWrapper(name = "ServiceList")
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ServiceDetailType> serviceList;
    @XmlElement(name = "TermsList")
    protected ListOfOfferTermsType termsList;
    @XmlElementWrapper(name = "SeatList")
    @XmlElement(name = "Seats", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<ListOfSeatType> seatList;

    /**
     * Gets the value of the descriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.DescriptionList }
     *     
     */
    public DataListType.DescriptionList getDescriptionList() {
        return descriptionList;
    }

    /**
     * Sets the value of the descriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.DescriptionList }
     *     
     */
    public void setDescriptionList(DataListType.DescriptionList value) {
        this.descriptionList = value;
    }

    /**
     * Gets the value of the termsList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferTermsType }
     *     
     */
    public ListOfOfferTermsType getTermsList() {
        return termsList;
    }

    /**
     * Sets the value of the termsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferTermsType }
     *     
     */
    public void setTermsList(ListOfOfferTermsType value) {
        this.termsList = value;
    }

    public List<AnonymousTravelerType> getAnonymousTravelerList() {
        if (anonymousTravelerList == null) {
            anonymousTravelerList = new ArrayList<AnonymousTravelerType>();
        }
        return anonymousTravelerList;
    }

    public void setAnonymousTravelerList(List<AnonymousTravelerType> anonymousTravelerList) {
        this.anonymousTravelerList = anonymousTravelerList;
    }

    public List<TravelerDetailType> getRecognizedTravelerList() {
        if (recognizedTravelerList == null) {
            recognizedTravelerList = new ArrayList<TravelerDetailType>();
        }
        return recognizedTravelerList;
    }

    public void setRecognizedTravelerList(List<TravelerDetailType> recognizedTravelerList) {
        this.recognizedTravelerList = recognizedTravelerList;
    }

    public List<BagDisclosure> getBagDisclosureList() {
        if (bagDisclosureList == null) {
            bagDisclosureList = new ArrayList<BagDisclosure>();
        }
        return bagDisclosureList;
    }

    public void setBagDisclosureList(List<BagDisclosure> bagDisclosureList) {
        this.bagDisclosureList = bagDisclosureList;
    }

    public List<CarryOnAllowance> getCarryOnAllowanceList() {
        if (carryOnAllowanceList == null) {
            carryOnAllowanceList = new ArrayList<CarryOnAllowance>();
        }
        return carryOnAllowanceList;
    }

    public void setCarryOnAllowanceList(List<CarryOnAllowance> carryOnAllowanceList) {
        this.carryOnAllowanceList = carryOnAllowanceList;
    }

    public List<CheckedBagAllowance> getCheckedBagAllowanceList() {
        if (checkedBagAllowanceList == null) {
            checkedBagAllowanceList = new ArrayList<CheckedBagAllowance>();
        }
        return checkedBagAllowanceList;
    }

    public void setCheckedBagAllowanceList(List<CheckedBagAllowance> checkedBagAllowanceList) {
        this.checkedBagAllowanceList = checkedBagAllowanceList;
    }

    public List<ServiceClass> getClassOfServiceList() {
        if (classOfServiceList == null) {
            classOfServiceList = new ArrayList<ServiceClass>();
        }
        return classOfServiceList;
    }

    public void setClassOfServiceList(List<ServiceClass> classOfServiceList) {
        this.classOfServiceList = classOfServiceList;
    }

    public List<ContentSource> getContentSourceList() {
        if (contentSourceList == null) {
            contentSourceList = new ArrayList<ContentSource>();
        }
        return contentSourceList;
    }

    public void setContentSourceList(List<ContentSource> contentSourceList) {
        this.contentSourceList = contentSourceList;
    }

    public List<ListOfDisclosureTypeDisclosures> getDisclosureList() {
        if (disclosureList == null) {
            disclosureList = new ArrayList<ListOfDisclosureTypeDisclosures>();
        }
        return disclosureList;
    }

    public void setDisclosureList(List<ListOfDisclosureTypeDisclosures> disclosureList) {
        this.disclosureList = disclosureList;
    }

    public List<FareGroup> getFareList() {
        if (fareList == null) {
            fareList = new ArrayList<FareGroup>();
        }
        return fareList;
    }

    public void setFareList(List<FareGroup> fareList) {
        this.fareList = fareList;
    }

    public List<ListOfFlightSegmentType> getFlightSegmentList() {
        if (flightSegmentList == null) {
            flightSegmentList = new ArrayList<ListOfFlightSegmentType>();
        }
        return flightSegmentList;
    }

    public void setFlightSegmentList(List<ListOfFlightSegmentType> flightSegmentList) {
        this.flightSegmentList = flightSegmentList;
    }

    public List<DataListType.Flight> getFlightList() {
        if (flightList == null) {
            flightList = new ArrayList<DataListType.Flight>();
        }
        return flightList;
    }

    public void setFlightList(List<DataListType.Flight> flightList) {
        this.flightList = flightList;
    }

    public List<OriginDestination> getOriginDestinationList() {
        if (originDestinationList == null) {
            originDestinationList = new ArrayList<OriginDestination>();
        }
        return originDestinationList;
    }

    public void setOriginDestinationList(List<OriginDestination> originDestinationList) {
        this.originDestinationList = originDestinationList;
    }

    public List<Instruction> getInstructionsList() {
        if (instructionsList == null) {
            instructionsList = new ArrayList<Instruction>();
        }
        return instructionsList;
    }

    public void setInstructionsList(List<Instruction> instructionsList) {
        this.instructionsList = instructionsList;
    }

    public List<Media> getMediaList() {
        if (mediaList == null) {
            mediaList = new ArrayList<Media>();
        }
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public List<Penalty> getPenaltyList() {
        if (penaltyList == null) {
            penaltyList = new ArrayList<Penalty>();
        }
        return penaltyList;
    }

    public void setPenaltyList(List<Penalty> penaltyList) {
        this.penaltyList = penaltyList;
    }

    public List<PriceClassType> getPriceClassList() {
        if (priceClassList == null) {
            priceClassList = new ArrayList<PriceClassType>();
        }
        return priceClassList;
    }

    public void setPriceClassList(List<PriceClassType> priceClassList) {
        this.priceClassList = priceClassList;
    }

    public List<ServiceBundle> getServiceBundleList() {
        if (serviceBundleList == null) {
            serviceBundleList = new ArrayList<ServiceBundle>();
        }
        return serviceBundleList;
    }

    public void setServiceBundleList(List<ServiceBundle> serviceBundleList) {
        this.serviceBundleList = serviceBundleList;
    }

    public List<ServiceDetailType> getServiceList() {
        if (serviceList == null) {
            serviceList = new ArrayList<ServiceDetailType>();
        }
        return serviceList;
    }

    public void setServiceList(List<ServiceDetailType> serviceList) {
        this.serviceList = serviceList;
    }

    public List<ListOfSeatType> getSeatList() {
        if (seatList == null) {
            seatList = new ArrayList<ListOfSeatType>();
        }
        return seatList;
    }

    public void setSeatList(List<ListOfSeatType> seatList) {
        this.seatList = seatList;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Description"/&gt;
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
        "description"
    })
    public static class DescriptionList {

        @XmlElement(name = "Description", required = true)
        protected Description description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Description }
         *     
         */
        public Description getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Description }
         *     
         */
        public void setDescription(Description value) {
            this.description = value;
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
     *         &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/&gt;
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
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *       &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journey",
        "segmentReferences",
        "settlement"
    })
    public static class Flight {

        @XmlElement(name = "Journey")
        protected TotalJourneyType journey;
        @XmlElement(name = "SegmentReferences", required = true)
        protected SegmentReferences segmentReferences;
        @XmlElement(name = "Settlement")
        protected DataListType.Flight.Settlement settlement;
        @XmlAttribute(name = "FlightKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String flightKey;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the journey property.
         * 
         * @return
         *     possible object is
         *     {@link TotalJourneyType }
         *     
         */
        public TotalJourneyType getJourney() {
            return journey;
        }

        /**
         * Sets the value of the journey property.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalJourneyType }
         *     
         */
        public void setJourney(TotalJourneyType value) {
            this.journey = value;
        }

        /**
         * Gets the value of the segmentReferences property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentReferences }
         *     
         */
        public SegmentReferences getSegmentReferences() {
            return segmentReferences;
        }

        /**
         * Sets the value of the segmentReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentReferences }
         *     
         */
        public void setSegmentReferences(SegmentReferences value) {
            this.segmentReferences = value;
        }

        /**
         * Gets the value of the settlement property.
         * 
         * @return
         *     possible object is
         *     {@link DataListType.Flight.Settlement }
         *     
         */
        public DataListType.Flight.Settlement getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataListType.Flight.Settlement }
         *     
         */
        public void setSettlement(DataListType.Flight.Settlement value) {
            this.settlement = value;
        }

        /**
         * Gets the value of the flightKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightKey() {
            return flightKey;
        }

        /**
         * Sets the value of the flightKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightKey(String value) {
            this.flightKey = value;
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
