
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchAppListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATTRIBUTE"/&gt;
 *     &lt;enumeration value="AFFINITY"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatchAppListType")
@XmlEnum
public enum MatchAppListType {

    ATTRIBUTE("ATTRIBUTE"),
    AFFINITY("AFFINITY"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MatchAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchAppListType fromValue(String v) {
        for (MatchAppListType c: MatchAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
