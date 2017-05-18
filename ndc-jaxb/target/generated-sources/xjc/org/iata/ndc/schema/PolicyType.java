
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type definition for Policy.
 * 
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Node" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}NodePathType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Descriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST}LinkDescriptionType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Metadata" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}MetaBaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Remarks" type="{http://www.iata.org/IATA/EDIST}RemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EncodingScheme" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}EncSchemeType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ValidPeriod" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CorePeriodGrpType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PolicyCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PolicyType" use="required" type="{http://www.iata.org/IATA/EDIST}PolicyTypeListType" /&gt;
 *       &lt;attribute name="Version" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "nodes",
    "descriptions",
    "metadata"
})
@XmlSeeAlso({
    org.iata.ndc.schema.Policy.class,
    org.iata.ndc.schema.InfoPolicyNoticeType.Policy.class
})
public class PolicyType
    extends CoreBaseType
{

    @XmlElementWrapper(name = "Nodes", required = true)
    @XmlElement(name = "Node", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<PolicyType.Node> nodes;
    @XmlElementWrapper(name = "Descriptions")
    @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<LinkDescriptionType> descriptions;
    @XmlElement(name = "Metadata")
    protected PolicyType.Metadata metadata;
    @XmlAttribute(name = "PolicyType", required = true)
    protected String policyType;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Metadata }
     *     
     */
    public PolicyType.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Metadata }
     *     
     */
    public void setMetadata(PolicyType.Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyType(String value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public List<PolicyType.Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<PolicyType.Node>();
        }
        return nodes;
    }

    public void setNodes(List<PolicyType.Node> nodes) {
        this.nodes = nodes;
    }

    public List<LinkDescriptionType> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<LinkDescriptionType>();
        }
        return descriptions;
    }

    public void setDescriptions(List<LinkDescriptionType> descriptions) {
        this.descriptions = descriptions;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetaBaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Remarks" type="{http://www.iata.org/IATA/EDIST}RemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EncodingScheme" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}EncSchemeType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ValidPeriod" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CorePeriodGrpType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PolicyCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remarks",
        "encodingScheme",
        "validPeriod"
    })
    public static class Metadata
        extends MetaBaseType
    {

        @XmlElement(name = "Remarks")
        protected List<RemarkType> remarks;
        @XmlElement(name = "EncodingScheme")
        protected PolicyType.Metadata.EncodingScheme encodingScheme;
        @XmlElement(name = "ValidPeriod")
        protected List<PolicyType.Metadata.ValidPeriod> validPeriod;
        @XmlAttribute(name = "PolicyCode")
        protected String policyCode;

        /**
         * Gets the value of the remarks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remarks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemarks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RemarkType }
         * 
         * 
         */
        public List<RemarkType> getRemarks() {
            if (remarks == null) {
                remarks = new ArrayList<RemarkType>();
            }
            return this.remarks;
        }

        /**
         * Gets the value of the encodingScheme property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyType.Metadata.EncodingScheme }
         *     
         */
        public PolicyType.Metadata.EncodingScheme getEncodingScheme() {
            return encodingScheme;
        }

        /**
         * Sets the value of the encodingScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyType.Metadata.EncodingScheme }
         *     
         */
        public void setEncodingScheme(PolicyType.Metadata.EncodingScheme value) {
            this.encodingScheme = value;
        }

        /**
         * Gets the value of the validPeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validPeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PolicyType.Metadata.ValidPeriod }
         * 
         * 
         */
        public List<PolicyType.Metadata.ValidPeriod> getValidPeriod() {
            if (validPeriod == null) {
                validPeriod = new ArrayList<PolicyType.Metadata.ValidPeriod>();
            }
            return this.validPeriod;
        }

        /**
         * Gets the value of the policyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyCode() {
            return policyCode;
        }

        /**
         * Sets the value of the policyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyCode(String value) {
            this.policyCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}EncSchemeType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EncodingScheme
            extends EncSchemeType
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CorePeriodGrpType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ValidPeriod
            extends CorePeriodGrpType
        {


        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}NodePathType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Node
        extends NodePathType
    {


    }

}
