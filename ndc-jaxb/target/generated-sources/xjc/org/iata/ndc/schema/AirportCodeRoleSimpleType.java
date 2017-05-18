
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportCodeRoleSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirportCodeRoleSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arrival_Destination"/&gt;
 *     &lt;enumeration value="Connection"/&gt;
 *     &lt;enumeration value="Departure_Origin"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AirportCodeRoleSimpleType")
@XmlEnum
public enum AirportCodeRoleSimpleType {

    @XmlEnumValue("Arrival_Destination")
    ARRIVAL_DESTINATION("Arrival_Destination"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("Departure_Origin")
    DEPARTURE_ORIGIN("Departure_Origin"),
    @XmlEnumValue("Stop")
    STOP("Stop");
    private final String value;

    AirportCodeRoleSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirportCodeRoleSimpleType fromValue(String v) {
        for (AirportCodeRoleSimpleType c: AirportCodeRoleSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
