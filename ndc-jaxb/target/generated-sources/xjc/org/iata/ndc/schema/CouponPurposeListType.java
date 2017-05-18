
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponPurposeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponPurposeListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Additional"/&gt;
 *     &lt;enumeration value="Base"/&gt;
 *     &lt;enumeration value="Net"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Sell"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CouponPurposeListType")
@XmlEnum
public enum CouponPurposeListType {

    @XmlEnumValue("Additional")
    ADDITIONAL("Additional"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Sell")
    SELL("Sell");
    private final String value;

    CouponPurposeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponPurposeListType fromValue(String v) {
        for (CouponPurposeListType c: CouponPurposeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
