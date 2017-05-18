
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnrollStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnrollStatusListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disable"/&gt;
 *     &lt;enumeration value="Enable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnrollStatusListType")
@XmlEnum
public enum EnrollStatusListType {

    @XmlEnumValue("Disable")
    DISABLE("Disable"),
    @XmlEnumValue("Enable")
    ENABLE("Enable");
    private final String value;

    EnrollStatusListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnrollStatusListType fromValue(String v) {
        for (EnrollStatusListType c: EnrollStatusListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
