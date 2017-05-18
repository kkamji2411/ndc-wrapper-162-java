
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSystemListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetSystemListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Production"/&gt;
 *     &lt;enumeration value="Staging"/&gt;
 *     &lt;enumeration value="Test"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TargetSystemListType")
@XmlEnum
public enum TargetSystemListType {


    /**
     * K = KILOMETERS
     * 
     */
    @XmlEnumValue("Production")
    PRODUCTION("Production"),

    /**
     * M = MILES
     * 
     */
    @XmlEnumValue("Staging")
    STAGING("Staging"),
    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TargetSystemListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetSystemListType fromValue(String v) {
        for (TargetSystemListType c: TargetSystemListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
