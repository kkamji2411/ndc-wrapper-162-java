
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Urchin Tracking Monitor(UTM) Parameter definition.
 * 
 * <p>Java class for CampaignUTM_ParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignUTM_ParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Other_UTM" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Name" use="required" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" /&gt;
 *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Definition" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" /&gt;
 *                 &lt;attribute name="Method" type="{http://www.iata.org/IATA/EDIST}UTM_AppListType" /&gt;
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
@XmlType(name = "CampaignUTM_ParameterType", propOrder = {
    "otherUTM"
})
@XmlSeeAlso({
    org.iata.ndc.schema.CampaignReferralType.UTM.OtherUTMs.class
})
public class CampaignUTMParameterType {

    @XmlElement(name = "Other_UTM", required = true)
    protected List<CampaignUTMParameterType.OtherUTM> otherUTM;

    /**
     * Gets the value of the otherUTM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherUTM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherUTM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignUTMParameterType.OtherUTM }
     * 
     * 
     */
    public List<CampaignUTMParameterType.OtherUTM> getOtherUTM() {
        if (otherUTM == null) {
            otherUTM = new ArrayList<CampaignUTMParameterType.OtherUTM>();
        }
        return this.otherUTM;
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
     *       &lt;attribute name="Name" use="required" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" /&gt;
     *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Definition" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" /&gt;
     *       &lt;attribute name="Method" type="{http://www.iata.org/IATA/EDIST}UTM_AppListType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OtherUTM {

        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Value", required = true)
        protected String value;
        @XmlAttribute(name = "Definition")
        protected String definition;
        @XmlAttribute(name = "Method")
        protected UTMAppListType method;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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
         * Gets the value of the definition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefinition() {
            return definition;
        }

        /**
         * Sets the value of the definition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefinition(String value) {
            this.definition = value;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link UTMAppListType }
         *     
         */
        public UTMAppListType getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link UTMAppListType }
         *     
         */
        public void setMethod(UTMAppListType value) {
            this.method = value;
        }

    }

}
