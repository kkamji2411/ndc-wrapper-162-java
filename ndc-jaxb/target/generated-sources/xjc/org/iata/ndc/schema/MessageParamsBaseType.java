
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Business Object Parameters.
 * 
 * <p>Java class for MessageParamsBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageParamsBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Languages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrCodes" minOccurs="0"&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageParamsBaseType", propOrder = {
    "languages",
    "currCodes"
})
@XmlSeeAlso({
    AirShopReqParamsType.class,
    FltPriceReqParamsType.class,
    FltPriceResParamsType.class,
    SeatAvailReqParamsType.class,
    SeatAvailResParamsType.class,
    SrvListReqParamsType.class,
    SrvListResParamsType.class,
    AirShopResParamsType.class
})
public class MessageParamsBaseType {

    @XmlElementWrapper(name = "Languages")
    @XmlElement(name = "LanguageCode", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<LanguageCodeType> languages;
    @XmlElementWrapper(name = "CurrCodes")
    @XmlElement(name = "CurrCode", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<CurrCode> currCodes;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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

    public List<LanguageCodeType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<LanguageCodeType>();
        }
        return languages;
    }

    public void setLanguages(List<LanguageCodeType> languages) {
        this.languages = languages;
    }

    public List<CurrCode> getCurrCodes() {
        if (currCodes == null) {
            currCodes = new ArrayList<CurrCode>();
        }
        return currCodes;
    }

    public void setCurrCodes(List<CurrCode> currCodes) {
        this.currCodes = currCodes;
    }

}
