
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FactorAuthListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FactorAuthListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneTimeCode"/&gt;
 *     &lt;enumeration value="PinPhrase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FactorAuthListType")
@XmlEnum
public enum FactorAuthListType {


    /**
     * 
     *             OATH-compliant One Time Code generation for sending a one-time code to a Traveler's mobile phone as a Text/SMS/Email.
     *           
     * 
     */
    @XmlEnumValue("OneTimeCode")
    ONE_TIME_CODE("OneTimeCode"),

    /**
     * 
     *             Random Character Pin Phrase Authentication prompts a user to enter the random characters from their specified password.
     *           
     * 
     */
    @XmlEnumValue("PinPhrase")
    PIN_PHRASE("PinPhrase");
    private final String value;

    FactorAuthListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FactorAuthListType fromValue(String v) {
        for (FactorAuthListType c: FactorAuthListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
