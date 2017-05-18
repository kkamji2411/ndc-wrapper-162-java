
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemActionSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderItemActionSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Create"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Divide"/&gt;
 *     &lt;enumeration value="Reissue"/&gt;
 *     &lt;enumeration value="Reprice"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderItemActionSimpleType")
@XmlEnum
public enum OrderItemActionSimpleType {

    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Divide")
    DIVIDE("Divide"),
    @XmlEnumValue("Reissue")
    REISSUE("Reissue"),
    @XmlEnumValue("Reprice")
    REPRICE("Reprice"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    OrderItemActionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderItemActionSimpleType fromValue(String v) {
        for (OrderItemActionSimpleType c: OrderItemActionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
