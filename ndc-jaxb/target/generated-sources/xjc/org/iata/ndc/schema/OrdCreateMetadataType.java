
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * Metadata definition.
 * 
 * <p>Java class for OrdCreateMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdCreateMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/&gt;
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
@XmlType(name = "OrdCreateMetadataType", propOrder = {
    "passengerMetadata",
    "other"
})
public class OrdCreateMetadataType {

    @XmlElement(name = "PassengerMetadata")
    protected List<PassengerMetadataType> passengerMetadata;
    @XmlElementWrapper(name = "Other")
    @XmlElement(name = "OtherMetadata", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<OrdCreateMetadataType.OtherMetadata> other;

    /**
     * Gets the value of the passengerMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerMetadataType }
     * 
     * 
     */
    public List<PassengerMetadataType> getPassengerMetadata() {
        if (passengerMetadata == null) {
            passengerMetadata = new ArrayList<PassengerMetadataType>();
        }
        return this.passengerMetadata;
    }

    public List<OrdCreateMetadataType.OtherMetadata> getOther() {
        if (other == null) {
            other = new ArrayList<OrdCreateMetadataType.OtherMetadata>();
        }
        return other;
    }

    public void setOther(List<OrdCreateMetadataType.OtherMetadata> other) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/&gt;
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
        "contactMetadatas",
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
        @XmlElementWrapper(name = "ContactMetadatas")
        @XmlElement(name = "ContactMetadata", namespace = "http://www.iata.org/IATA/EDIST")
        protected List<ContactMetadataType> contactMetadatas;
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

        public List<ContactMetadataType> getContactMetadatas() {
            if (contactMetadatas == null) {
                contactMetadatas = new ArrayList<ContactMetadataType>();
            }
            return contactMetadatas;
        }

        public void setContactMetadatas(List<ContactMetadataType> contactMetadatas) {
            this.contactMetadatas = contactMetadatas;
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

}
