
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Non Geographic Specification information
 * 
 * <p>Java class for NonGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonGeographicSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelAgencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AggregatorID" minOccurs="0"/&gt;
 *         &lt;element name="PointOfSaleCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PointOfSaleCodeType"&gt;
 *                 &lt;attribute name="PointOfSaleType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;length value="1"/&gt;
 *                       &lt;enumeration value="T"/&gt;
 *                       &lt;enumeration value="I"/&gt;
 *                       &lt;enumeration value="H"/&gt;
 *                       &lt;enumeration value="U"/&gt;
 *                       &lt;enumeration value="X"/&gt;
 *                       &lt;enumeration value="V"/&gt;
 *                       &lt;enumeration value="L"/&gt;
 *                       &lt;enumeration value="A"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "NonGeographicSpecificationType", propOrder = {
    "travelAgencyInd",
    "aggregatorID",
    "pointOfSaleCode"
})
public class NonGeographicSpecificationType {

    @XmlElement(name = "TravelAgencyInd")
    protected Boolean travelAgencyInd;
    @XmlElement(name = "AggregatorID")
    protected AggregatorIDType aggregatorID;
    @XmlElement(name = "PointOfSaleCode")
    protected List<NonGeographicSpecificationType.PointOfSaleCode> pointOfSaleCode;

    /**
     * Gets the value of the travelAgencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelAgencyInd() {
        return travelAgencyInd;
    }

    /**
     * Sets the value of the travelAgencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelAgencyInd(Boolean value) {
        this.travelAgencyInd = value;
    }

    /**
     * Gets the value of the aggregatorID property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorIDType }
     *     
     */
    public AggregatorIDType getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Sets the value of the aggregatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorIDType }
     *     
     */
    public void setAggregatorID(AggregatorIDType value) {
        this.aggregatorID = value;
    }

    /**
     * Gets the value of the pointOfSaleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSaleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSaleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonGeographicSpecificationType.PointOfSaleCode }
     * 
     * 
     */
    public List<NonGeographicSpecificationType.PointOfSaleCode> getPointOfSaleCode() {
        if (pointOfSaleCode == null) {
            pointOfSaleCode = new ArrayList<NonGeographicSpecificationType.PointOfSaleCode>();
        }
        return this.pointOfSaleCode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;PointOfSaleCodeType"&gt;
     *       &lt;attribute name="PointOfSaleType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;length value="1"/&gt;
     *             &lt;enumeration value="T"/&gt;
     *             &lt;enumeration value="I"/&gt;
     *             &lt;enumeration value="H"/&gt;
     *             &lt;enumeration value="U"/&gt;
     *             &lt;enumeration value="X"/&gt;
     *             &lt;enumeration value="V"/&gt;
     *             &lt;enumeration value="L"/&gt;
     *             &lt;enumeration value="A"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PointOfSaleCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PointOfSaleType", required = true)
        protected String pointOfSaleType;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the pointOfSaleType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPointOfSaleType() {
            return pointOfSaleType;
        }

        /**
         * Sets the value of the pointOfSaleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointOfSaleType(String value) {
            this.pointOfSaleType = value;
        }

    }

}
