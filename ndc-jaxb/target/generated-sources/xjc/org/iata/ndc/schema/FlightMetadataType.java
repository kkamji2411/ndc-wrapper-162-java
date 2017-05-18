
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
 * FLIGHT Metadata definition.
 * 
 * <p>Java class for FlightMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="BindingKey" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Frequency" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InstantPurchase" minOccurs="0"/&gt;
 *         &lt;element name="Meals" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Meal" type="{http://www.iata.org/IATA/EDIST}FlightMealsType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OnTimePerformance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightMetadataType", propOrder = {
    "actionCode",
    "bindingKey",
    "flightStatus",
    "frequency",
    "instantPurchase",
    "meals",
    "onTimePerformance",
    "remarks"
})
@XmlSeeAlso({
    FlightMetadata.class
})
public class FlightMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "BindingKey")
    protected String bindingKey;
    @XmlElement(name = "FlightStatus")
    protected FlightStatusType flightStatus;
    @XmlElement(name = "Frequency")
    protected FlightFrequencyType frequency;
    @XmlElement(name = "InstantPurchase")
    protected InstantPurchaseType instantPurchase;
    @XmlElementWrapper(name = "Meals")
    @XmlElement(name = "Meal", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FlightMealsType> meals;
    @XmlElement(name = "OnTimePerformance")
    protected OnTimePerformance onTimePerformance;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the bindingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingKey() {
        return bindingKey;
    }

    /**
     * Sets the value of the bindingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingKey(String value) {
        this.bindingKey = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setFlightStatus(FlightStatusType value) {
        this.flightStatus = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FlightFrequencyType }
     *     
     */
    public FlightFrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightFrequencyType }
     *     
     */
    public void setFrequency(FlightFrequencyType value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link InstantPurchaseType }
     *     
     */
    public InstantPurchaseType getInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantPurchaseType }
     *     
     */
    public void setInstantPurchase(InstantPurchaseType value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the onTimePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link OnTimePerformance }
     *     
     */
    public OnTimePerformance getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnTimePerformance }
     *     
     */
    public void setOnTimePerformance(OnTimePerformance value) {
        this.onTimePerformance = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
    }

    public List<FlightMealsType> getMeals() {
        if (meals == null) {
            meals = new ArrayList<FlightMealsType>();
        }
        return meals;
    }

    public void setMeals(List<FlightMealsType> meals) {
        this.meals = meals;
    }

}
