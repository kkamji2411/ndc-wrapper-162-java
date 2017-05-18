
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceClassAssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceClassAssocListItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disclosure"/&gt;
 *     &lt;enumeration value="MediaGroup"/&gt;
 *     &lt;enumeration value="MediaItem"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="ServiceBundle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceClassAssocListItemType")
@XmlEnum
public enum PriceClassAssocListItemType {

    @XmlEnumValue("Disclosure")
    DISCLOSURE("Disclosure"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("ServiceBundle")
    SERVICE_BUNDLE("ServiceBundle");
    private final String value;

    PriceClassAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceClassAssocListItemType fromValue(String v) {
        for (PriceClassAssocListItemType c: PriceClassAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
