
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureTransactionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureTransactionListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authorize"/&gt;
 *     &lt;enumeration value="CheckEnrollment"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Validate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecureTransactionListType")
@XmlEnum
public enum SecureTransactionListType {


    /**
     * Amount is authorized. No funds are transferred.
     * 
     */
    @XmlEnumValue("Authorize")
    AUTHORIZE("Authorize"),
    @XmlEnumValue("CheckEnrollment")
    CHECK_ENROLLMENT("CheckEnrollment"),

    /**
     * 
     *             Complete a previous authorization. Funds are transferred.
     *           
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * Purchase. Funds are transferred immediately.
     * 
     */
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),

    /**
     * Refund. Funds transferred immediately.
     * 
     */
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * 
     *             Validation Transaction. Effects a $1.00 Authorization to validate card details including expiry date, address.
     *           
     * 
     */
    @XmlEnumValue("Validate")
    VALIDATE("Validate");
    private final String value;

    SecureTransactionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureTransactionListType fromValue(String v) {
        for (SecureTransactionListType c: SecureTransactionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
