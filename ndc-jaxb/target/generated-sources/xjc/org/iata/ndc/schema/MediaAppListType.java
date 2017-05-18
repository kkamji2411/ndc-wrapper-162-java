
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaAppListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Audio"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Link"/&gt;
 *     &lt;enumeration value="Markup"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediaAppListType")
@XmlEnum
public enum MediaAppListType {

    @XmlEnumValue("Audio")
    AUDIO("Audio"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Link")
    LINK("Link"),
    @XmlEnumValue("Markup")
    MARKUP("Markup"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MediaAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaAppListType fromValue(String v) {
        for (MediaAppListType c: MediaAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
