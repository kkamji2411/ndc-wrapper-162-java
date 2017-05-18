
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponMediaListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponMediaListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Electronic"/&gt;
 *     &lt;enumeration value="Paper"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CouponMediaListType")
@XmlEnum
public enum CouponMediaListType {

    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CouponMediaListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponMediaListType fromValue(String v) {
        for (CouponMediaListType c: CouponMediaListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
