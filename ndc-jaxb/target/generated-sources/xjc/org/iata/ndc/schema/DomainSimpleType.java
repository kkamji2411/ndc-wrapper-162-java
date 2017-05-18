
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomainSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirlineProfile"/&gt;
 *     &lt;enumeration value="OrderManagement"/&gt;
 *     &lt;enumeration value="PaymentTicketing"/&gt;
 *     &lt;enumeration value="Shopping"/&gt;
 *     &lt;enumeration value="Utility"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DomainSimpleType")
@XmlEnum
public enum DomainSimpleType {

    @XmlEnumValue("AirlineProfile")
    AIRLINE_PROFILE("AirlineProfile"),
    @XmlEnumValue("OrderManagement")
    ORDER_MANAGEMENT("OrderManagement"),
    @XmlEnumValue("PaymentTicketing")
    PAYMENT_TICKETING("PaymentTicketing"),
    @XmlEnumValue("Shopping")
    SHOPPING("Shopping"),
    @XmlEnumValue("Utility")
    UTILITY("Utility");
    private final String value;

    DomainSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomainSimpleType fromValue(String v) {
        for (DomainSimpleType c: DomainSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
