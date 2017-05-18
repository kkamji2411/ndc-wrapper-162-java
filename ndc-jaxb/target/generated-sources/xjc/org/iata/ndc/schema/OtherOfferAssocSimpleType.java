
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherOfferAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherOfferAssocSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AircraftEquipment"/&gt;
 *     &lt;enumeration value="BaggageDisclosure"/&gt;
 *     &lt;enumeration value="CarryOnAllowance"/&gt;
 *     &lt;enumeration value="CheckedBagAllowance"/&gt;
 *     &lt;enumeration value="MediaGroup"/&gt;
 *     &lt;enumeration value="MediaItem"/&gt;
 *     &lt;enumeration value="OfferDisclosure"/&gt;
 *     &lt;enumeration value="OfferInstructions"/&gt;
 *     &lt;enumeration value="OfferTerms"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherOfferAssocSimpleType")
@XmlEnum
public enum OtherOfferAssocSimpleType {

    @XmlEnumValue("AircraftEquipment")
    AIRCRAFT_EQUIPMENT("AircraftEquipment"),
    @XmlEnumValue("BaggageDisclosure")
    BAGGAGE_DISCLOSURE("BaggageDisclosure"),
    @XmlEnumValue("CarryOnAllowance")
    CARRY_ON_ALLOWANCE("CarryOnAllowance"),
    @XmlEnumValue("CheckedBagAllowance")
    CHECKED_BAG_ALLOWANCE("CheckedBagAllowance"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("OfferDisclosure")
    OFFER_DISCLOSURE("OfferDisclosure"),
    @XmlEnumValue("OfferInstructions")
    OFFER_INSTRUCTIONS("OfferInstructions"),
    @XmlEnumValue("OfferTerms")
    OFFER_TERMS("OfferTerms"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    OtherOfferAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherOfferAssocSimpleType fromValue(String v) {
        for (OtherOfferAssocSimpleType c: OtherOfferAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
