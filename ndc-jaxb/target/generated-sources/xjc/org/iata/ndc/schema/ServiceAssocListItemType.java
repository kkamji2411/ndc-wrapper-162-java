
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAssocListItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Airport"/&gt;
 *     &lt;enumeration value="Disclosure"/&gt;
 *     &lt;enumeration value="MediaGroup"/&gt;
 *     &lt;enumeration value="MediaItem"/&gt;
 *     &lt;enumeration value="Offer"/&gt;
 *     &lt;enumeration value="OfferItem"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceAssocListItemType")
@XmlEnum
public enum ServiceAssocListItemType {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Disclosure")
    DISCLOSURE("Disclosure"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("OfferItem")
    OFFER_ITEM("OfferItem"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    ServiceAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAssocListItemType fromValue(String v) {
        for (ServiceAssocListItemType c: ServiceAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
