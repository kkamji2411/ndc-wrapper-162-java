
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COS_AssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="COS_AssocListItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equipment"/&gt;
 *     &lt;enumeration value="FlightGroup"/&gt;
 *     &lt;enumeration value="FlightOriginDestination"/&gt;
 *     &lt;enumeration value="FlightSegment"/&gt;
 *     &lt;enumeration value="MediaGroup"/&gt;
 *     &lt;enumeration value="MediaItem"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "COS_AssocListItemType")
@XmlEnum
public enum COSAssocListItemType {

    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("FlightGroup")
    FLIGHT_GROUP("FlightGroup"),
    @XmlEnumValue("FlightOriginDestination")
    FLIGHT_ORIGIN_DESTINATION("FlightOriginDestination"),
    @XmlEnumValue("FlightSegment")
    FLIGHT_SEGMENT("FlightSegment"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem");
    private final String value;

    COSAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COSAssocListItemType fromValue(String v) {
        for (COSAssocListItemType c: COSAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
