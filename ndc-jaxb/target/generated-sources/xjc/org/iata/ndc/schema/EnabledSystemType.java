
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for SYSTEM Intermediary Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from IntermediaryCoreRepType.
 * 
 * <p>Java class for EnabledSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnabledSystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}IntermediaryCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SystemID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnabledSystemType", propOrder = {
    "systemID"
})
@XmlSeeAlso({
    EnabledSysMsgPartyCoreType.class
})
public class EnabledSystemType
    extends IntermediaryCoreRepType
{

    @XmlElement(name = "SystemID", required = true)
    protected SystemIDType systemID;

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIDType }
     *     
     */
    public SystemIDType getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIDType }
     *     
     */
    public void setSystemID(SystemIDType value) {
        this.systemID = value;
    }

}
