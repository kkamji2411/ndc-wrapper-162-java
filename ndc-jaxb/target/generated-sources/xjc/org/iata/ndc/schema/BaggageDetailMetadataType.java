
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * BAGGAGE DETAIL Metadata definition.
 * 
 * <p>Java class for BaggageDetailMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Attributes" minOccurs="0"/&gt;
 *         &lt;element name="FareTariff" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailMetadataType", propOrder = {
    "attributes",
    "fareTariff",
    "fareRule",
    "fareCat"
})
public class BaggageDetailMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Attributes")
    protected AttributesType attributes;
    @XmlElement(name = "FareTariff")
    protected BaggageDetailMetadataType.FareTariff fareTariff;
    @XmlElement(name = "FareRule")
    protected String fareRule;
    @XmlElement(name = "FareCat")
    protected String fareCat;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the fareTariff property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailMetadataType.FareTariff }
     *     
     */
    public BaggageDetailMetadataType.FareTariff getFareTariff() {
        return fareTariff;
    }

    /**
     * Sets the value of the fareTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailMetadataType.FareTariff }
     *     
     */
    public void setFareTariff(BaggageDetailMetadataType.FareTariff value) {
        this.fareTariff = value;
    }

    /**
     * Gets the value of the fareRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRule() {
        return fareRule;
    }

    /**
     * Sets the value of the fareRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRule(String value) {
        this.fareRule = value;
    }

    /**
     * Gets the value of the fareCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCat() {
        return fareCat;
    }

    /**
     * Sets the value of the fareCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCat(String value) {
        this.fareCat = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class FareTariff {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FareType")
        protected String fareType;

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
         * Gets the value of the fareType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareType() {
            return fareType;
        }

        /**
         * Sets the value of the fareType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareType(String value) {
            this.fareType = value;
        }

    }

}
