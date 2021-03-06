
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type definition for Day of Week Indicators.
 * 
 * <p>Java class for DayOfWeekIndType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayOfWeekIndType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="MondayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TuesdayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WednesdayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ThursdayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FridayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SaturdayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SundayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayOfWeekIndType")
public class DayOfWeekIndType {

    @XmlAttribute(name = "MondayInd")
    protected Boolean mondayInd;
    @XmlAttribute(name = "TuesdayInd")
    protected Boolean tuesdayInd;
    @XmlAttribute(name = "WednesdayInd")
    protected Boolean wednesdayInd;
    @XmlAttribute(name = "ThursdayInd")
    protected Boolean thursdayInd;
    @XmlAttribute(name = "FridayInd")
    protected Boolean fridayInd;
    @XmlAttribute(name = "SaturdayInd")
    protected Boolean saturdayInd;
    @XmlAttribute(name = "SundayInd")
    protected Boolean sundayInd;

    /**
     * Gets the value of the mondayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMondayInd() {
        return mondayInd;
    }

    /**
     * Sets the value of the mondayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMondayInd(Boolean value) {
        this.mondayInd = value;
    }

    /**
     * Gets the value of the tuesdayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuesdayInd() {
        return tuesdayInd;
    }

    /**
     * Sets the value of the tuesdayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuesdayInd(Boolean value) {
        this.tuesdayInd = value;
    }

    /**
     * Gets the value of the wednesdayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWednesdayInd() {
        return wednesdayInd;
    }

    /**
     * Sets the value of the wednesdayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWednesdayInd(Boolean value) {
        this.wednesdayInd = value;
    }

    /**
     * Gets the value of the thursdayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThursdayInd() {
        return thursdayInd;
    }

    /**
     * Sets the value of the thursdayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThursdayInd(Boolean value) {
        this.thursdayInd = value;
    }

    /**
     * Gets the value of the fridayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFridayInd() {
        return fridayInd;
    }

    /**
     * Sets the value of the fridayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFridayInd(Boolean value) {
        this.fridayInd = value;
    }

    /**
     * Gets the value of the saturdayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayInd() {
        return saturdayInd;
    }

    /**
     * Sets the value of the saturdayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayInd(Boolean value) {
        this.saturdayInd = value;
    }

    /**
     * Gets the value of the sundayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSundayInd() {
        return sundayInd;
    }

    /**
     * Sets the value of the sundayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSundayInd(Boolean value) {
        this.sundayInd = value;
    }

}
