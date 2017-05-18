
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAuthStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerAuthStatusListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerAuthStatusListType")
@XmlEnum
public enum CustomerAuthStatusListType {


    /**
     * 
     *             A- An authentication attempt occurred but could not be completed
     *           
     * 
     */
    A,

    /**
     * N- Customer not authenticated
     * 
     */
    N,

    /**
     * U- Unable to perform authentication
     * 
     */
    U,

    /**
     * Y- Customer authenticated
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static CustomerAuthStatusListType fromValue(String v) {
        return valueOf(v);
    }

}
