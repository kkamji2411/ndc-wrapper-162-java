
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * OtherClass of Service Associations.
 * 
 * <p>Java class for COS_OtherAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COS_OtherAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherAssociation" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}COS_AssocListType"/&gt;
 *                   &lt;element name="ReferenceValue" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
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
@XmlType(name = "COS_OtherAssocType", propOrder = {
    "otherAssociation"
})
@XmlSeeAlso({
    COSAssocType.class
})
public class COSOtherAssocType {

    @XmlElement(name = "OtherAssociation", required = true)
    protected List<COSOtherAssocType.OtherAssociation> otherAssociation;

    /**
     * Gets the value of the otherAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COSOtherAssocType.OtherAssociation }
     * 
     * 
     */
    public List<COSOtherAssocType.OtherAssociation> getOtherAssociation() {
        if (otherAssociation == null) {
            otherAssociation = new ArrayList<COSOtherAssocType.OtherAssociation>();
        }
        return this.otherAssociation;
    }


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
     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}COS_AssocListType"/&gt;
     *         &lt;element name="ReferenceValue" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
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
        "type",
        "referenceValue"
    })
    public static class OtherAssociation {

        @XmlElement(name = "Type", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlElement(name = "ReferenceValue", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object referenceValue;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the referenceValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getReferenceValue() {
            return referenceValue;
        }

        /**
         * Sets the value of the referenceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setReferenceValue(Object value) {
            this.referenceValue = value;
        }

    }

}
