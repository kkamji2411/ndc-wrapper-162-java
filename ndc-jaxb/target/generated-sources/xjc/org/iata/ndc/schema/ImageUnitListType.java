
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageUnitListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageUnitListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inch"/&gt;
 *     &lt;enumeration value="Millimeter"/&gt;
 *     &lt;enumeration value="Pixel"/&gt;
 *     &lt;enumeration value="Point"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageUnitListType")
@XmlEnum
public enum ImageUnitListType {

    @XmlEnumValue("Inch")
    INCH("Inch"),
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),
    @XmlEnumValue("Pixel")
    PIXEL("Pixel"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ImageUnitListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageUnitListType fromValue(String v) {
        for (ImageUnitListType c: ImageUnitListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
