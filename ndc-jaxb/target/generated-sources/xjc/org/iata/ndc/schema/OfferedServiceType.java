
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferedServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfferedServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Transportation"/&gt;
 *     &lt;enumeration value="Baggage"/&gt;
 *     &lt;enumeration value="Seats"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfferedServiceType")
@XmlEnum
public enum OfferedServiceType {

    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("Baggage")
    BAGGAGE("Baggage"),
    @XmlEnumValue("Seats")
    SEATS("Seats"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OfferedServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferedServiceType fromValue(String v) {
        for (OfferedServiceType c: OfferedServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
