
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncSchemeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncSchemeSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Airline"/&gt;
 *     &lt;enumeration value="Filed"/&gt;
 *     &lt;enumeration value="ThirdParty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncSchemeSimpleType")
@XmlEnum
public enum EncSchemeSimpleType {

    @XmlEnumValue("Airline")
    AIRLINE("Airline"),
    @XmlEnumValue("Filed")
    FILED("Filed"),
    @XmlEnumValue("ThirdParty")
    THIRD_PARTY("ThirdParty");
    private final String value;

    EncSchemeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncSchemeSimpleType fromValue(String v) {
        for (EncSchemeSimpleType c: EncSchemeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
