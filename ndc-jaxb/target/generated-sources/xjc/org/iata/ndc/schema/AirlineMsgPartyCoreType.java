
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Core Airline Message Party Representation. Derived from AirlineCoreRepType.
 * 
 * <p>Java class for AirlineMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMsgPartyCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AirlineCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentUser" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Disclosures" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMsgPartyCoreType", propOrder = {
    "agentUser",
    "disclosures"
})
@XmlSeeAlso({
    ORAAirlineSenderType.class,
    POAAirlineSenderType.class,
    MarketingCarrierSenderType.class,
    OperatingCarrierSenderType.class,
    MarketingCarrierRecipientType.class,
    OperatingCarrierRecipientType.class,
    ORAAirlineRecipientType.class,
    POAAirlineRecipientType.class,
    MarketingCarrierParticipantType.class,
    OperatingCarrierParticipantType.class,
    ORAAirlineParticipantType.class,
    POAAirlineParticipantType.class
})
public class AirlineMsgPartyCoreType
    extends AirlineCoreRepType
{

    @XmlElement(name = "AgentUser")
    protected AgentUserType agentUser;
    @XmlElement(name = "Disclosures")
    protected Disclosures disclosures;

    /**
     * Gets the value of the agentUser property.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserType }
     *     
     */
    public AgentUserType getAgentUser() {
        return agentUser;
    }

    /**
     * Sets the value of the agentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserType }
     *     
     */
    public void setAgentUser(AgentUserType value) {
        this.agentUser = value;
    }

    /**
     * Gets the value of the disclosures property.
     * 
     * @return
     *     possible object is
     *     {@link Disclosures }
     *     
     */
    public Disclosures getDisclosures() {
        return disclosures;
    }

    /**
     * Sets the value of the disclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disclosures }
     *     
     */
    public void setDisclosures(Disclosures value) {
        this.disclosures = value;
    }

}
