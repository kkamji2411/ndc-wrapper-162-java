
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="DataPolicyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PolicyID" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}PolicyLink"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}NodePath" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST}InstanceClassRefSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataPolicyInd",
    "policyID",
    "type",
    "description",
    "policyLink",
    "nodePath"
})
public class PolicyDefaultTypePolicy {

    @XmlElement(name = "DataPolicyInd")
    protected Boolean dataPolicyInd;
    @XmlElement(name = "PolicyID")
    protected String policyID;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PolicyLink")
    @XmlSchemaType(name = "anyURI")
    protected String policyLink;
    @XmlElement(name = "NodePath")
    protected NodePathType nodePath;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the dataPolicyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataPolicyInd() {
        return dataPolicyInd;
    }

    /**
     * Sets the value of the dataPolicyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataPolicyInd(Boolean value) {
        this.dataPolicyInd = value;
    }

    /**
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyID(String value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setType(Object value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the policyLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyLink() {
        return policyLink;
    }

    /**
     * Sets the value of the policyLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyLink(String value) {
        this.policyLink = value;
    }

    /**
     * Message Property Path information for this policy-associated element.
     * 
     * @return
     *     possible object is
     *     {@link NodePathType }
     *     
     */
    public NodePathType getNodePath() {
        return nodePath;
    }

    /**
     * Sets the value of the nodePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodePathType }
     *     
     */
    public void setNodePath(NodePathType value) {
        this.nodePath = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

}
