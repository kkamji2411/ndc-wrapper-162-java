
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Billing"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *     &lt;enumeration value="ServiceLocation"/&gt;
 *     &lt;enumeration value="StayLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactListType")
@XmlEnum
public enum ContactListType {

    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation"),
    @XmlEnumValue("StayLocation")
    STAY_LOCATION("StayLocation");
    private final String value;

    ContactListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactListType fromValue(String v) {
        for (ContactListType c: ContactListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
