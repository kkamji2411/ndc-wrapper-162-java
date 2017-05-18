
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaSrchLinkAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaSrchLinkAppListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirlineSite"/&gt;
 *     &lt;enumeration value="IntraService"/&gt;
 *     &lt;enumeration value="MetaSearchSite"/&gt;
 *     &lt;enumeration value="SellerAgencySite"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetaSrchLinkAppListType")
@XmlEnum
public enum MetaSrchLinkAppListType {

    @XmlEnumValue("AirlineSite")
    AIRLINE_SITE("AirlineSite"),
    @XmlEnumValue("IntraService")
    INTRA_SERVICE("IntraService"),
    @XmlEnumValue("MetaSearchSite")
    META_SEARCH_SITE("MetaSearchSite"),
    @XmlEnumValue("SellerAgencySite")
    SELLER_AGENCY_SITE("SellerAgencySite"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MetaSrchLinkAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetaSrchLinkAppListType fromValue(String v) {
        for (MetaSrchLinkAppListType c: MetaSrchLinkAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
