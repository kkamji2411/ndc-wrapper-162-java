
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Instructions: Class of Service Upgrade definition.
 * 
 * <p>Java class for InstrClassUpgradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrClassUpgradeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "InstrClassUpgradeType", propOrder = {
    "classes"
})
@XmlSeeAlso({
    OfferClassUpgradeType.class
})
public class InstrClassUpgradeType {

    @XmlElementWrapper(name = "Classes")
    @XmlElement(name = "ClassOfService", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FlightCOSCoreType> classes;

    public List<FlightCOSCoreType> getClasses() {
        if (classes == null) {
            classes = new ArrayList<FlightCOSCoreType>();
        }
        return classes;
    }

    public void setClasses(List<FlightCOSCoreType> classes) {
        this.classes = classes;
    }

}
