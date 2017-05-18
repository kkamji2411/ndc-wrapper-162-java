
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * Payload Content Localization Notice definition.
 * 
 * <p>Java class for LocalizationNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalizationNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}TrxProcessObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Languages" minOccurs="0"/&gt;
 *         &lt;element name="Currencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrCode" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "LocalizationNoticeType", propOrder = {
    "languages",
    "currencies"
})
public class LocalizationNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Languages")
    protected Languages languages;
    @XmlElementWrapper(name = "Currencies")
    @XmlElement(name = "CurrCode", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<CurrCode> currencies;

    /**
     * 
     *                 Payload Content Language Representation Code(s). Notes: 1. Payload content localized language representation in support of I18N aware systems. 2. Language Code context is specified in the @Application attribute, e.g. Requested, Display.
     *               
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

    public List<CurrCode> getCurrencies() {
        if (currencies == null) {
            currencies = new ArrayList<CurrCode>();
        }
        return currencies;
    }

    public void setCurrencies(List<CurrCode> currencies) {
        this.currencies = currencies;
    }

}
