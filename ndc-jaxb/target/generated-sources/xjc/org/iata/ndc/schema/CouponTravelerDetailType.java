
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * COUPON-RELATED Traveler DETAIL definitiion.
 * 
 * <p>Java class for CouponTravelerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponTravelerDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CouponTravelerCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EmailContact" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PhoneContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponTravelerDetailType", propOrder = {
    "emailContact",
    "phoneContact"
})
@XmlSeeAlso({
    TravelerInfo.class
})
public class CouponTravelerDetailType
    extends CouponTravelerCoreType
{

    @XmlElement(name = "EmailContact")
    protected List<EmailType> emailContact;
    @XmlElement(name = "PhoneContact")
    protected List<PhoneContactType> phoneContact;

    /**
     * Traveler Email Contact.Gets the value of the emailContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmailContact() {
        if (emailContact == null) {
            emailContact = new ArrayList<EmailType>();
        }
        return this.emailContact;
    }

    /**
     * Gets the value of the phoneContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneContactType }
     * 
     * 
     */
    public List<PhoneContactType> getPhoneContact() {
        if (phoneContact == null) {
            phoneContact = new ArrayList<PhoneContactType>();
        }
        return this.phoneContact;
    }

}
