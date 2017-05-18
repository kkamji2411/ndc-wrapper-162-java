
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PolicyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DefaultPolicy"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PolicyAugmentation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "defaultPolicy",
    "policyAugmentation"
})
public class Policy
    extends PolicyType
{

    @XmlElementWrapper(name = "DefaultPolicy", required = true)
    @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<PolicyDefaultTypePolicy> defaultPolicy;
    @XmlElementWrapper(name = "PolicyAugmentation", required = true)
    @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<PolicyAugmentationTypePolicy> policyAugmentation;

    public List<PolicyDefaultTypePolicy> getDefaultPolicy() {
        if (defaultPolicy == null) {
            defaultPolicy = new ArrayList<PolicyDefaultTypePolicy>();
        }
        return defaultPolicy;
    }

    public void setDefaultPolicy(List<PolicyDefaultTypePolicy> defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    public List<PolicyAugmentationTypePolicy> getPolicyAugmentation() {
        if (policyAugmentation == null) {
            policyAugmentation = new ArrayList<PolicyAugmentationTypePolicy>();
        }
        return policyAugmentation;
    }

    public void setPolicyAugmentation(List<PolicyAugmentationTypePolicy> policyAugmentation) {
        this.policyAugmentation = policyAugmentation;
    }

}
