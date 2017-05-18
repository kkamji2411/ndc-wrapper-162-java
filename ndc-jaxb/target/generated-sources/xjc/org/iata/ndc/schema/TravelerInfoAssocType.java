
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated Traveler(s) definition.
 * 
 * <p>Java class for TravelerInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AllTravelerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReferences"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoAssocType", propOrder = {
    "allTravelerInd",
    "travelerReferences"
})
public class TravelerInfoAssocType {

    @XmlElement(name = "AllTravelerInd")
    protected Boolean allTravelerInd;
    @XmlList
    @XmlElement(name = "TravelerReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> travelerReferences;

    /**
     * Gets the value of the allTravelerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllTravelerInd() {
        return allTravelerInd;
    }

    /**
     * Sets the value of the allTravelerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllTravelerInd(Boolean value) {
        this.allTravelerInd = value;
    }

    /**
     * Association to multiple Traveler instance(s). Example: Traveler1 Traveler2
     * 
     * Note: May be Recognized or Anonymous Traveler (by PTC) instance(s).Gets the value of the travelerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTravelerReferences() {
        if (travelerReferences == null) {
            travelerReferences = new ArrayList<Object>();
        }
        return this.travelerReferences;
    }

}
