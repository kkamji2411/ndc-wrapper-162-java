
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;GeoSpecCodeType"&gt;
 *       &lt;attribute name="GeoSpecCodeType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *             &lt;enumeration value="A"/&gt;
 *             &lt;enumeration value="S"/&gt;
 *             &lt;enumeration value="Z"/&gt;
 *             &lt;enumeration value="C"/&gt;
 *             &lt;enumeration value="P"/&gt;
 *             &lt;enumeration value="N"/&gt;
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
@XmlRootElement(name = "GeoSpecCode")
public class GeoSpecCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "GeoSpecCodeType", required = true)
    protected String geoSpecCodeType;

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
     * Gets the value of the geoSpecCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoSpecCodeType() {
        return geoSpecCodeType;
    }

    /**
     * Sets the value of the geoSpecCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoSpecCodeType(String value) {
        this.geoSpecCodeType = value;
    }

}
