
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
 * Flight Price Request Metadata definition.
 * 
 * <p>Java class for FltPriceReqMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FltPriceReqMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Shopping" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShopMetadataGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Traveler" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerMetadata"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Other" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherMetadata" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ZoneMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}RuleMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentFormMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivalentID_Metadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DescriptionMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "FltPriceReqMetadataType", propOrder = {
    "shopping",
    "traveler",
    "other"
})
@XmlSeeAlso({
    org.iata.ndc.schema.FlightPriceRQ.Metadata.class
})
public class FltPriceReqMetadataType {

    @XmlElement(name = "Shopping")
    protected FltPriceReqMetadataType.Shopping shopping;
    @XmlElement(name = "Traveler")
    protected FltPriceReqMetadataType.Traveler traveler;
    @XmlElementWrapper(name = "Other")
    @XmlElement(name = "OtherMetadata", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FltPriceReqMetadataType.OtherMetadata> other;

    /**
     * Gets the value of the shopping property.
     * 
     * @return
     *     possible object is
     *     {@link FltPriceReqMetadataType.Shopping }
     *     
     */
    public FltPriceReqMetadataType.Shopping getShopping() {
        return shopping;
    }

    /**
     * Sets the value of the shopping property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceReqMetadataType.Shopping }
     *     
     */
    public void setShopping(FltPriceReqMetadataType.Shopping value) {
        this.shopping = value;
    }

    /**
     * Gets the value of the traveler property.
     * 
     * @return
     *     possible object is
     *     {@link FltPriceReqMetadataType.Traveler }
     *     
     */
    public FltPriceReqMetadataType.Traveler getTraveler() {
        return traveler;
    }

    /**
     * Sets the value of the traveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceReqMetadataType.Traveler }
     *     
     */
    public void setTraveler(FltPriceReqMetadataType.Traveler value) {
        this.traveler = value;
    }

    public List<FltPriceReqMetadataType.OtherMetadata> getOther() {
        if (other == null) {
            other = new ArrayList<FltPriceReqMetadataType.OtherMetadata>();
        }
        return other;
    }

    public void setOther(List<FltPriceReqMetadataType.OtherMetadata> other) {
        this.other = other;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ZoneMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RuleMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentFormMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivalentID_Metadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DescriptionMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/&gt;
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
        "zoneMetadatas",
        "stateProvMetadatas",
        "ruleMetadatas",
        "priceMetadatas",
        "paymentFormMetadatas",
        "paymentCardMetadatas",
        "languageMetadatas",
        "equivalentIDMetadatas",
        "descriptionMetadatas",
        "currencyMetadatas",
        "countryMetadatas",
        "contentMetadatas",
        "codesetMetadatas",
        "cityMetadatas",
        "airportMetadatas",
        "aircraftMetadatas",
        "addressMetadatas"
    })
    public static class OtherMetadata {

        @XmlElementWrapper(name = "ZoneMetadatas")
        @XmlElement(name = "ZoneMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ZoneMetadataType> zoneMetadatas;
        @XmlElementWrapper(name = "StateProvMetadatas")
        @XmlElement(name = "StateProvMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<StateProvMetadataType> stateProvMetadatas;
        @XmlElementWrapper(name = "RuleMetadatas")
        @XmlElement(name = "RuleMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<RuleMetadataType> ruleMetadatas;
        @XmlElementWrapper(name = "PriceMetadatas")
        @XmlElement(name = "PriceMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<PriceMetadataType> priceMetadatas;
        @XmlElementWrapper(name = "PaymentFormMetadatas")
        @XmlElement(name = "PaymentFormMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<PaymentFormMetadataType> paymentFormMetadatas;
        @XmlElementWrapper(name = "PaymentCardMetadatas")
        @XmlElement(name = "PaymentCardMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<PaymentCardMetadataType> paymentCardMetadatas;
        @XmlElementWrapper(name = "LanguageMetadatas")
        @XmlElement(name = "LanguageMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<LanguageMetadataType> languageMetadatas;
        @XmlElementWrapper(name = "EquivalentID_Metadatas")
        @XmlElement(name = "EquivalentID_Metadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<EquivalentIDMetadataType> equivalentIDMetadatas;
        @XmlElementWrapper(name = "DescriptionMetadatas")
        @XmlElement(name = "DescriptionMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<DescriptionMetadataType> descriptionMetadatas;
        @XmlElementWrapper(name = "CurrencyMetadatas")
        @XmlElement(name = "CurrencyMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<CurrencyMetadata> currencyMetadatas;
        @XmlElementWrapper(name = "CountryMetadatas")
        @XmlElement(name = "CountryMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<CountryMetadataType> countryMetadatas;
        @XmlElementWrapper(name = "ContentMetadatas")
        @XmlElement(name = "ContentMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ContentMetadataType> contentMetadatas;
        @XmlElementWrapper(name = "CodesetMetadatas")
        @XmlElement(name = "CodesetMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<CodesetMetadataType> codesetMetadatas;
        @XmlElementWrapper(name = "CityMetadatas")
        @XmlElement(name = "CityMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<CityMetadataType> cityMetadatas;
        @XmlElementWrapper(name = "AirportMetadatas")
        @XmlElement(name = "AirportMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<AirportMetadataType> airportMetadatas;
        @XmlElementWrapper(name = "AircraftMetadatas")
        @XmlElement(name = "AircraftMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<AircraftMetadataType> aircraftMetadatas;
        @XmlElementWrapper(name = "AddressMetadatas")
        @XmlElement(name = "AddressMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<AddressMetadataType> addressMetadatas;

        public List<ZoneMetadataType> getZoneMetadatas() {
            if (zoneMetadatas == null) {
                zoneMetadatas = new ArrayList<ZoneMetadataType>();
            }
            return zoneMetadatas;
        }

        public void setZoneMetadatas(List<ZoneMetadataType> zoneMetadatas) {
            this.zoneMetadatas = zoneMetadatas;
        }

        public List<StateProvMetadataType> getStateProvMetadatas() {
            if (stateProvMetadatas == null) {
                stateProvMetadatas = new ArrayList<StateProvMetadataType>();
            }
            return stateProvMetadatas;
        }

        public void setStateProvMetadatas(List<StateProvMetadataType> stateProvMetadatas) {
            this.stateProvMetadatas = stateProvMetadatas;
        }

        public List<RuleMetadataType> getRuleMetadatas() {
            if (ruleMetadatas == null) {
                ruleMetadatas = new ArrayList<RuleMetadataType>();
            }
            return ruleMetadatas;
        }

        public void setRuleMetadatas(List<RuleMetadataType> ruleMetadatas) {
            this.ruleMetadatas = ruleMetadatas;
        }

        public List<PriceMetadataType> getPriceMetadatas() {
            if (priceMetadatas == null) {
                priceMetadatas = new ArrayList<PriceMetadataType>();
            }
            return priceMetadatas;
        }

        public void setPriceMetadatas(List<PriceMetadataType> priceMetadatas) {
            this.priceMetadatas = priceMetadatas;
        }

        public List<PaymentFormMetadataType> getPaymentFormMetadatas() {
            if (paymentFormMetadatas == null) {
                paymentFormMetadatas = new ArrayList<PaymentFormMetadataType>();
            }
            return paymentFormMetadatas;
        }

        public void setPaymentFormMetadatas(List<PaymentFormMetadataType> paymentFormMetadatas) {
            this.paymentFormMetadatas = paymentFormMetadatas;
        }

        public List<PaymentCardMetadataType> getPaymentCardMetadatas() {
            if (paymentCardMetadatas == null) {
                paymentCardMetadatas = new ArrayList<PaymentCardMetadataType>();
            }
            return paymentCardMetadatas;
        }

        public void setPaymentCardMetadatas(List<PaymentCardMetadataType> paymentCardMetadatas) {
            this.paymentCardMetadatas = paymentCardMetadatas;
        }

        public List<LanguageMetadataType> getLanguageMetadatas() {
            if (languageMetadatas == null) {
                languageMetadatas = new ArrayList<LanguageMetadataType>();
            }
            return languageMetadatas;
        }

        public void setLanguageMetadatas(List<LanguageMetadataType> languageMetadatas) {
            this.languageMetadatas = languageMetadatas;
        }

        public List<EquivalentIDMetadataType> getEquivalentIDMetadatas() {
            if (equivalentIDMetadatas == null) {
                equivalentIDMetadatas = new ArrayList<EquivalentIDMetadataType>();
            }
            return equivalentIDMetadatas;
        }

        public void setEquivalentIDMetadatas(List<EquivalentIDMetadataType> equivalentIDMetadatas) {
            this.equivalentIDMetadatas = equivalentIDMetadatas;
        }

        public List<DescriptionMetadataType> getDescriptionMetadatas() {
            if (descriptionMetadatas == null) {
                descriptionMetadatas = new ArrayList<DescriptionMetadataType>();
            }
            return descriptionMetadatas;
        }

        public void setDescriptionMetadatas(List<DescriptionMetadataType> descriptionMetadatas) {
            this.descriptionMetadatas = descriptionMetadatas;
        }

        public List<CurrencyMetadata> getCurrencyMetadatas() {
            if (currencyMetadatas == null) {
                currencyMetadatas = new ArrayList<CurrencyMetadata>();
            }
            return currencyMetadatas;
        }

        public void setCurrencyMetadatas(List<CurrencyMetadata> currencyMetadatas) {
            this.currencyMetadatas = currencyMetadatas;
        }

        public List<CountryMetadataType> getCountryMetadatas() {
            if (countryMetadatas == null) {
                countryMetadatas = new ArrayList<CountryMetadataType>();
            }
            return countryMetadatas;
        }

        public void setCountryMetadatas(List<CountryMetadataType> countryMetadatas) {
            this.countryMetadatas = countryMetadatas;
        }

        public List<ContentMetadataType> getContentMetadatas() {
            if (contentMetadatas == null) {
                contentMetadatas = new ArrayList<ContentMetadataType>();
            }
            return contentMetadatas;
        }

        public void setContentMetadatas(List<ContentMetadataType> contentMetadatas) {
            this.contentMetadatas = contentMetadatas;
        }

        public List<CodesetMetadataType> getCodesetMetadatas() {
            if (codesetMetadatas == null) {
                codesetMetadatas = new ArrayList<CodesetMetadataType>();
            }
            return codesetMetadatas;
        }

        public void setCodesetMetadatas(List<CodesetMetadataType> codesetMetadatas) {
            this.codesetMetadatas = codesetMetadatas;
        }

        public List<CityMetadataType> getCityMetadatas() {
            if (cityMetadatas == null) {
                cityMetadatas = new ArrayList<CityMetadataType>();
            }
            return cityMetadatas;
        }

        public void setCityMetadatas(List<CityMetadataType> cityMetadatas) {
            this.cityMetadatas = cityMetadatas;
        }

        public List<AirportMetadataType> getAirportMetadatas() {
            if (airportMetadatas == null) {
                airportMetadatas = new ArrayList<AirportMetadataType>();
            }
            return airportMetadatas;
        }

        public void setAirportMetadatas(List<AirportMetadataType> airportMetadatas) {
            this.airportMetadatas = airportMetadatas;
        }

        public List<AircraftMetadataType> getAircraftMetadatas() {
            if (aircraftMetadatas == null) {
                aircraftMetadatas = new ArrayList<AircraftMetadataType>();
            }
            return aircraftMetadatas;
        }

        public void setAircraftMetadatas(List<AircraftMetadataType> aircraftMetadatas) {
            this.aircraftMetadatas = aircraftMetadatas;
        }

        public List<AddressMetadataType> getAddressMetadatas() {
            if (addressMetadatas == null) {
                addressMetadatas = new ArrayList<AddressMetadataType>();
            }
            return addressMetadatas;
        }

        public void setAddressMetadatas(List<AddressMetadataType> addressMetadatas) {
            this.addressMetadatas = addressMetadatas;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShopMetadataGroup"/&gt;
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
        "shopMetadataGroup"
    })
    public static class Shopping {

        @XmlElement(name = "ShopMetadataGroup", required = true)
        protected ShopMetadataGroup shopMetadataGroup;

        /**
         * Gets the value of the shopMetadataGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ShopMetadataGroup }
         *     
         */
        public ShopMetadataGroup getShopMetadataGroup() {
            return shopMetadataGroup;
        }

        /**
         * Sets the value of the shopMetadataGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShopMetadataGroup }
         *     
         */
        public void setShopMetadataGroup(ShopMetadataGroup value) {
            this.shopMetadataGroup = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerMetadata"/&gt;
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
        "travelerMetadata"
    })
    public static class Traveler {

        @XmlElement(name = "TravelerMetadata", required = true)
        protected TravelerMetadataType travelerMetadata;

        /**
         * Gets the value of the travelerMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerMetadataType }
         *     
         */
        public TravelerMetadataType getTravelerMetadata() {
            return travelerMetadata;
        }

        /**
         * Sets the value of the travelerMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerMetadataType }
         *     
         */
        public void setTravelerMetadata(TravelerMetadataType value) {
            this.travelerMetadata = value;
        }

    }

}
