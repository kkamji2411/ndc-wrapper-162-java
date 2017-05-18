
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVC_SubmissionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVC_SubmissionListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Illegible"/&gt;
 *     &lt;enumeration value="Included"/&gt;
 *     &lt;enumeration value="NotPresent"/&gt;
 *     &lt;enumeration value="NotSubmitted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVC_SubmissionListType")
@XmlEnum
public enum CVCSubmissionListType {


    /**
     * Card holder has stated CVC is illegible.
     * 
     */
    @XmlEnumValue("Illegible")
    ILLEGIBLE("Illegible"),

    /**
     * Airline has included CVC in the Auth / Purchase.
     * 
     */
    @XmlEnumValue("Included")
    INCLUDED("Included"),

    /**
     * Card holder has stated CVC is not present.
     * 
     */
    @XmlEnumValue("NotPresent")
    NOT_PRESENT("NotPresent"),

    /**
     * Airline has not submitted CVC.
     * 
     */
    @XmlEnumValue("NotSubmitted")
    NOT_SUBMITTED("NotSubmitted");
    private final String value;

    CVCSubmissionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVCSubmissionListType fromValue(String v) {
        for (CVCSubmissionListType c: CVCSubmissionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
