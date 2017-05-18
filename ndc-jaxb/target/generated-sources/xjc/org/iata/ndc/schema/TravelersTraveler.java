
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AnonymousTraveler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RecognizedTraveler" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "anonymousTraveler",
    "recognizedTraveler"
})
public class TravelersTraveler {

    @XmlElement(name = "AnonymousTraveler")
    protected List<AnonymousTravelerType> anonymousTraveler;
    @XmlElement(name = "RecognizedTraveler")
    protected List<TravelerDetailType> recognizedTraveler;

    /**
     * Gets the value of the anonymousTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anonymousTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnonymousTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnonymousTravelerType }
     * 
     * 
     */
    public List<AnonymousTravelerType> getAnonymousTraveler() {
        if (anonymousTraveler == null) {
            anonymousTraveler = new ArrayList<AnonymousTravelerType>();
        }
        return this.anonymousTraveler;
    }

    /**
     * Gets the value of the recognizedTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recognizedTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecognizedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerDetailType }
     * 
     * 
     */
    public List<TravelerDetailType> getRecognizedTraveler() {
        if (recognizedTraveler == null) {
            recognizedTraveler = new ArrayList<TravelerDetailType>();
        }
        return this.recognizedTraveler;
    }

}
