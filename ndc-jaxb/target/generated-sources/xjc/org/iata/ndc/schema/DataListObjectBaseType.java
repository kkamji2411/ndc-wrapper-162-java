
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base type for a Data List object.
 * 
 * <p>Java class for DataListObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataListObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}DataListObjAttrGroup"/&gt;
 *       &lt;attribute name="DisplayAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NetFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReissueOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BundleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumTryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NotProcessedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RetryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataListObjectBaseType")
public class DataListObjectBaseType {

    @XmlAttribute(name = "DisplayAllInd")
    protected Boolean displayAllInd;
    @XmlAttribute(name = "NetFareInd")
    protected Boolean netFareInd;
    @XmlAttribute(name = "ReissueOnlyInd")
    protected Boolean reissueOnlyInd;
    @XmlAttribute(name = "AutoExchangeInd")
    protected Boolean autoExchangeInd;
    @XmlAttribute(name = "BundleInd")
    protected Boolean bundleInd;
    @XmlAttribute(name = "MaximumTryInd")
    protected Boolean maximumTryInd;
    @XmlAttribute(name = "NotProcessedInd")
    protected Boolean notProcessedInd;
    @XmlAttribute(name = "RetryInd")
    protected Boolean retryInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ListKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String listKey;

    /**
     * Gets the value of the displayAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayAllInd() {
        return displayAllInd;
    }

    /**
     * Sets the value of the displayAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayAllInd(Boolean value) {
        this.displayAllInd = value;
    }

    /**
     * Gets the value of the netFareInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetFareInd() {
        return netFareInd;
    }

    /**
     * Sets the value of the netFareInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetFareInd(Boolean value) {
        this.netFareInd = value;
    }

    /**
     * Gets the value of the reissueOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReissueOnlyInd() {
        return reissueOnlyInd;
    }

    /**
     * Sets the value of the reissueOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueOnlyInd(Boolean value) {
        this.reissueOnlyInd = value;
    }

    /**
     * Gets the value of the autoExchangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExchangeInd() {
        return autoExchangeInd;
    }

    /**
     * Sets the value of the autoExchangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExchangeInd(Boolean value) {
        this.autoExchangeInd = value;
    }

    /**
     * Gets the value of the bundleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundleInd() {
        return bundleInd;
    }

    /**
     * Sets the value of the bundleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundleInd(Boolean value) {
        this.bundleInd = value;
    }

    /**
     * Gets the value of the maximumTryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTryInd() {
        return maximumTryInd;
    }

    /**
     * Sets the value of the maximumTryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTryInd(Boolean value) {
        this.maximumTryInd = value;
    }

    /**
     * Gets the value of the notProcessedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotProcessedInd() {
        return notProcessedInd;
    }

    /**
     * Sets the value of the notProcessedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotProcessedInd(Boolean value) {
        this.notProcessedInd = value;
    }

    /**
     * Gets the value of the retryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetryInd() {
        return retryInd;
    }

    /**
     * Sets the value of the retryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetryInd(Boolean value) {
        this.retryInd = value;
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

    /**
     * Gets the value of the listKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListKey() {
        return listKey;
    }

    /**
     * Sets the value of the listKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListKey(String value) {
        this.listKey = value;
    }

}
