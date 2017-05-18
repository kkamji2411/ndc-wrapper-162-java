
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * COMMON NOTICES definition.
 * 
 * <p>Java class for NoticeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Localization" type="{http://www.iata.org/IATA/EDIST}LocalizationNoticeType" minOccurs="0"/&gt;
 *         &lt;element name="InfoPolicies" type="{http://www.iata.org/IATA/EDIST}InfoPolicyNoticeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeBaseType", propOrder = {
    "localization",
    "infoPolicies"
})
@XmlSeeAlso({
    org.iata.ndc.schema.ItinReshopParamsType.Notices.class,
    ItinReshopNoticesType.class,
    OrdCancelNoticesType.class,
    OrdChangeNoticesType.class,
    OrderListNoticesType.class,
    OrdCreateNoticesType.class,
    OrdViewNoticesType.class,
    OrdRetrieveNoticesType.class
})
public class NoticeBaseType {

    @XmlElement(name = "Localization")
    protected LocalizationNoticeType localization;
    @XmlElement(name = "InfoPolicies")
    protected InfoPolicyNoticeType infoPolicies;

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public LocalizationNoticeType getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public void setLocalization(LocalizationNoticeType value) {
        this.localization = value;
    }

    /**
     * Gets the value of the infoPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public InfoPolicyNoticeType getInfoPolicies() {
        return infoPolicies;
    }

    /**
     * Sets the value of the infoPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public void setInfoPolicies(InfoPolicyNoticeType value) {
        this.infoPolicies = value;
    }

}
