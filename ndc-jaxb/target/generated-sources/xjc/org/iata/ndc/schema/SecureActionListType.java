
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureActionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureActionListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EnrollmentCheckRequest"/&gt;
 *     &lt;enumeration value="EnrollmentCheckResponse"/&gt;
 *     &lt;enumeration value="CardAuthenticationRequest"/&gt;
 *     &lt;enumeration value="CardAuthenticationResponse"/&gt;
 *     &lt;enumeration value="ValidateCardInfoRequest"/&gt;
 *     &lt;enumeration value="ValidateCardInfoResponse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecureActionListType")
@XmlEnum
public enum SecureActionListType {

    @XmlEnumValue("EnrollmentCheckRequest")
    ENROLLMENT_CHECK_REQUEST("EnrollmentCheckRequest"),
    @XmlEnumValue("EnrollmentCheckResponse")
    ENROLLMENT_CHECK_RESPONSE("EnrollmentCheckResponse"),
    @XmlEnumValue("CardAuthenticationRequest")
    CARD_AUTHENTICATION_REQUEST("CardAuthenticationRequest"),
    @XmlEnumValue("CardAuthenticationResponse")
    CARD_AUTHENTICATION_RESPONSE("CardAuthenticationResponse"),
    @XmlEnumValue("ValidateCardInfoRequest")
    VALIDATE_CARD_INFO_REQUEST("ValidateCardInfoRequest"),
    @XmlEnumValue("ValidateCardInfoResponse")
    VALIDATE_CARD_INFO_RESPONSE("ValidateCardInfoResponse");
    private final String value;

    SecureActionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureActionListType fromValue(String v) {
        for (SecureActionListType c: SecureActionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
