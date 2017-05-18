
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Message Parameters.
 * 
 * <p>Java class for OrdChangeParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdChangeParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Alerts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Notices" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="References" type="{http://www.iata.org/IATA/EDIST}MultiAssocSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdChangeParamsType", propOrder = {
    "alerts",
    "notices"
})
@XmlSeeAlso({
    OrderChangeParameters.class
})
public class OrdChangeParamsType {

    @XmlElementWrapper(name = "Alerts")
    @XmlElement(name = "Alert", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Alert> alerts;
    @XmlElementWrapper(name = "Notices")
    @XmlElement(name = "Notice", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<Notice> notices;
    @XmlAttribute(name = "References")
    @XmlIDREF
    protected List<Object> references;

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getReferences() {
        if (references == null) {
            references = new ArrayList<Object>();
        }
        return this.references;
    }

    public List<Alert> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<Alert>();
        }
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    public List<Notice> getNotices() {
        if (notices == null) {
            notices = new ArrayList<Notice>();
        }
        return notices;
    }

    public void setNotices(List<Notice> notices) {
        this.notices = notices;
    }

}
