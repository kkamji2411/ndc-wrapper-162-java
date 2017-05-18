
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayFormListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayFormListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BankAccount"/&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="CreditCard"/&gt;
 *     &lt;enumeration value="DebitCard"/&gt;
 *     &lt;enumeration value="DirectBill"/&gt;
 *     &lt;enumeration value="LoyaltyRedemption"/&gt;
 *     &lt;enumeration value="MiscChargeOrder"/&gt;
 *     &lt;enumeration value="PaymentCard"/&gt;
 *     &lt;enumeration value="Voucher"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayFormListType")
@XmlEnum
public enum PayFormListType {

    @XmlEnumValue("BankAccount")
    BANK_ACCOUNT("BankAccount"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("DirectBill")
    DIRECT_BILL("DirectBill"),
    @XmlEnumValue("LoyaltyRedemption")
    LOYALTY_REDEMPTION("LoyaltyRedemption"),
    @XmlEnumValue("MiscChargeOrder")
    MISC_CHARGE_ORDER("MiscChargeOrder"),
    @XmlEnumValue("PaymentCard")
    PAYMENT_CARD("PaymentCard"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PayFormListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayFormListType fromValue(String v) {
        for (PayFormListType c: PayFormListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
