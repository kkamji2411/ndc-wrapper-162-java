
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageAppListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Spoken"/&gt;
 *     &lt;enumeration value="Written"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageAppListType")
@XmlEnum
public enum LanguageAppListType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Spoken")
    SPOKEN("Spoken"),
    @XmlEnumValue("Written")
    WRITTEN("Written"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LanguageAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageAppListType fromValue(String v) {
        for (LanguageAppListType c: LanguageAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
