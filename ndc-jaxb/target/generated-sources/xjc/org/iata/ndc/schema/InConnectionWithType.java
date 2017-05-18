
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COUPON-RELATED IN CONNECTION DOCUMENT/ COUPON definition.
 * 
 * <p>Java class for InConnectionWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InConnectionWithType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InConnectionDocNbr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9a-zA-Z]{1,14}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InConnectonCpnNbr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
 *               &lt;pattern value="[0-9a-zA-Z]{1,14}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InConnectionWithType", propOrder = {
    "inConnectionDocNbr",
    "inConnectonCpnNbr"
})
public class InConnectionWithType {

    @XmlElement(name = "InConnectionDocNbr")
    protected String inConnectionDocNbr;
    @XmlElement(name = "InConnectonCpnNbr")
    protected Integer inConnectonCpnNbr;
    @XmlAttribute(name = "AssociateInd")
    protected Boolean associateInd;

    /**
     * Gets the value of the inConnectionDocNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConnectionDocNbr() {
        return inConnectionDocNbr;
    }

    /**
     * Sets the value of the inConnectionDocNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConnectionDocNbr(String value) {
        this.inConnectionDocNbr = value;
    }

    /**
     * Gets the value of the inConnectonCpnNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInConnectonCpnNbr() {
        return inConnectonCpnNbr;
    }

    /**
     * Sets the value of the inConnectonCpnNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInConnectonCpnNbr(Integer value) {
        this.inConnectonCpnNbr = value;
    }

    /**
     * Gets the value of the associateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssociateInd() {
        return associateInd;
    }

    /**
     * Sets the value of the associateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssociateInd(Boolean value) {
        this.associateInd = value;
    }

}
