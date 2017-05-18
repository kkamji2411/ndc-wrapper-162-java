
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpnCancelFunctionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CpnCancelFunctionListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OriginalIssue"/&gt;
 *     &lt;enumeration value="Exchange"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CpnCancelFunctionListType")
@XmlEnum
public enum CpnCancelFunctionListType {

    @XmlEnumValue("OriginalIssue")
    ORIGINAL_ISSUE("OriginalIssue"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    CpnCancelFunctionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CpnCancelFunctionListType fromValue(String v) {
        for (CpnCancelFunctionListType c: CpnCancelFunctionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
