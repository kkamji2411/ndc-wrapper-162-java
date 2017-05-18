
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for NDC-ENABLED SYSTEM Message Party Representation.
 * 
 * Notes:
 *  1. Derived from EnabledSystemType.
 * 
 * <p>Java class for EnabledSysMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnabledSysMsgPartyCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}EnabledSystemType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnabledSysMsgPartyCoreType")
@XmlSeeAlso({
    EnabledSysSenderType.class,
    EnabledSysRecipientType.class,
    EnabledSysParticipantType.class
})
public class EnabledSysMsgPartyCoreType
    extends EnabledSystemType
{


}
