
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ORIGIN/ DESTINATION definition.
 * 
 * <p>Java class for OriginDestinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="OriginDestinationKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationType", propOrder = {
    "departureCode",
    "arrivalCode"
})
@XmlSeeAlso({
    OriginDestination.class
})
public class OriginDestinationType {

    @XmlElement(name = "DepartureCode", required = true)
    protected DepartureCode departureCode;
    @XmlElement(name = "ArrivalCode", required = true)
    protected ArrivalCode arrivalCode;
    @XmlAttribute(name = "OriginDestinationKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String originDestinationKey;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Departure Airport Location code. Example: TPA
     * 
     * Encoding Scheme: IATA/ A4A (three character) Airport or City Code
     * 
     * @return
     *     possible object is
     *     {@link DepartureCode }
     *     
     */
    public DepartureCode getDepartureCode() {
        return departureCode;
    }

    /**
     * Sets the value of the departureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureCode }
     *     
     */
    public void setDepartureCode(DepartureCode value) {
        this.departureCode = value;
    }

    /**
     * Airport or a city code. Use a three letter  location identifier assigned according to the IATA Resolution 763.  Refer to IATA Airline Coding Directory . Example: TPA
     * 
     * @return
     *     possible object is
     *     {@link ArrivalCode }
     *     
     */
    public ArrivalCode getArrivalCode() {
        return arrivalCode;
    }

    /**
     * Sets the value of the arrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalCode }
     *     
     */
    public void setArrivalCode(ArrivalCode value) {
        this.arrivalCode = value;
    }

    /**
     * Gets the value of the originDestinationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationKey() {
        return originDestinationKey;
    }

    /**
     * Sets the value of the originDestinationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationKey(String value) {
        this.originDestinationKey = value;
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
