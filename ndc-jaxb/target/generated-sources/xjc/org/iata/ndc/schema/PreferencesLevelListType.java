
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferencesLevelListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferencesLevelListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Preferred"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="Exclude"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferencesLevelListType")
@XmlEnum
public enum PreferencesLevelListType {

    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude");
    private final String value;

    PreferencesLevelListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferencesLevelListType fromValue(String v) {
        for (PreferencesLevelListType c: PreferencesLevelListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
