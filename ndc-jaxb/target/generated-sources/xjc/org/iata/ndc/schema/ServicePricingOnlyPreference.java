
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ServicePricingOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "servicePricingOnlyInd"
})
@XmlRootElement(name = "ServicePricingOnlyPreference")
public class ServicePricingOnlyPreference {

    @XmlElement(name = "ServicePricingOnlyInd")
    protected boolean servicePricingOnlyInd;

    /**
     * Gets the value of the servicePricingOnlyInd property.
     * 
     */
    public boolean isServicePricingOnlyInd() {
        return servicePricingOnlyInd;
    }

    /**
     * Sets the value of the servicePricingOnlyInd property.
     * 
     */
    public void setServicePricingOnlyInd(boolean value) {
        this.servicePricingOnlyInd = value;
    }

}
