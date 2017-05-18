
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrxProcessingListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrxProcessingListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="InComplete"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrxProcessingListType")
@XmlEnum
public enum TrxProcessingListType {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("InComplete")
    IN_COMPLETE("InComplete"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TrxProcessingListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrxProcessingListType fromValue(String v) {
        for (TrxProcessingListType c: TrxProcessingListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
