
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OriginDestinationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TotalJourney" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightReferences" minOccurs="0"/&gt;
 *         &lt;element name="CheckedBag" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
 *                   &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CarryOnBag" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
 *                   &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "totalJourney",
    "flightReferences",
    "checkedBag",
    "carryOnBag"
})
@XmlRootElement(name = "OriginDestination")
public class OriginDestination
    extends OriginDestinationType
{

    @XmlElement(name = "TotalJourney")
    protected TotalJourneyType totalJourney;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;
    @XmlElement(name = "CheckedBag")
    protected OriginDestination.CheckedBag checkedBag;
    @XmlElement(name = "CarryOnBag")
    protected OriginDestination.CarryOnBag carryOnBag;

    /**
     * Gets the value of the totalJourney property.
     * 
     * @return
     *     possible object is
     *     {@link TotalJourneyType }
     *     
     */
    public TotalJourneyType getTotalJourney() {
        return totalJourney;
    }

    /**
     * Sets the value of the totalJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalJourneyType }
     *     
     */
    public void setTotalJourney(TotalJourneyType value) {
        this.totalJourney = value;
    }

    /**
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

    /**
     * Gets the value of the checkedBag property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestination.CheckedBag }
     *     
     */
    public OriginDestination.CheckedBag getCheckedBag() {
        return checkedBag;
    }

    /**
     * Sets the value of the checkedBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestination.CheckedBag }
     *     
     */
    public void setCheckedBag(OriginDestination.CheckedBag value) {
        this.checkedBag = value;
    }

    /**
     * Gets the value of the carryOnBag property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestination.CarryOnBag }
     *     
     */
    public OriginDestination.CarryOnBag getCarryOnBag() {
        return carryOnBag;
    }

    /**
     * Sets the value of the carryOnBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestination.CarryOnBag }
     *     
     */
    public void setCarryOnBag(OriginDestination.CarryOnBag value) {
        this.carryOnBag = value;
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
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
     *         &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
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
        "baggageDeterminingCarrier",
        "bdcAnalysisResult"
    })
    public static class CarryOnBag {

        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlElement(name = "BDC_AnalysisResult")
        protected CodesetType bdcAnalysisResult;

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the bdcAnalysisResult property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getBDCAnalysisResult() {
            return bdcAnalysisResult;
        }

        /**
         * Sets the value of the bdcAnalysisResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setBDCAnalysisResult(CodesetType value) {
            this.bdcAnalysisResult = value;
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
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
     *         &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
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
        "baggageDeterminingCarrier",
        "bdcAnalysisResult"
    })
    public static class CheckedBag {

        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlElement(name = "BDC_AnalysisResult")
        protected CodesetType bdcAnalysisResult;

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the bdcAnalysisResult property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getBDCAnalysisResult() {
            return bdcAnalysisResult;
        }

        /**
         * Sets the value of the bdcAnalysisResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setBDCAnalysisResult(CodesetType value) {
            this.bdcAnalysisResult = value;
        }

    }

}
