
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeLimitTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeLimitTypeListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bilateral"/&gt;
 *     &lt;enumeration value="Deposit"/&gt;
 *     &lt;enumeration value="InventoryGuarantee"/&gt;
 *     &lt;enumeration value="Naming"/&gt;
 *     &lt;enumeration value="Offer"/&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="PriceGuarantee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeLimitTypeListType")
@XmlEnum
public enum TimeLimitTypeListType {

    @XmlEnumValue("Bilateral")
    BILATERAL("Bilateral"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("InventoryGuarantee")
    INVENTORY_GUARANTEE("InventoryGuarantee"),
    @XmlEnumValue("Naming")
    NAMING("Naming"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("PriceGuarantee")
    PRICE_GUARANTEE("PriceGuarantee");
    private final String value;

    TimeLimitTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeLimitTypeListType fromValue(String v) {
        for (TimeLimitTypeListType c: TimeLimitTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
