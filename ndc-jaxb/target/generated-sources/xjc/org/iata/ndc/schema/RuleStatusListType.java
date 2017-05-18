
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RuleStatusListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ActionRequired"/&gt;
 *     &lt;enumeration value="RuleExecuted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RuleStatusListType")
@XmlEnum
public enum RuleStatusListType {

    @XmlEnumValue("ActionRequired")
    ACTION_REQUIRED("ActionRequired"),
    @XmlEnumValue("RuleExecuted")
    RULE_EXECUTED("RuleExecuted");
    private final String value;

    RuleStatusListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleStatusListType fromValue(String v) {
        for (RuleStatusListType c: RuleStatusListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
