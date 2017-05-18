
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PriceVarianceRule" type="{http://www.iata.org/IATA/EDIST}PriceVarianceRuleType" maxOccurs="unbounded"/&gt;
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
    "priceVarianceRule"
})
@XmlRootElement(name = "PriceVarianceRules")
public class PriceVarianceRules {

    @XmlElement(name = "PriceVarianceRule", required = true)
    protected List<PriceVarianceRuleType> priceVarianceRule;

    /**
     * Gets the value of the priceVarianceRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceVarianceRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceVarianceRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceVarianceRuleType }
     * 
     * 
     */
    public List<PriceVarianceRuleType> getPriceVarianceRule() {
        if (priceVarianceRule == null) {
            priceVarianceRule = new ArrayList<PriceVarianceRuleType>();
        }
        return this.priceVarianceRule;
    }

}
