
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer definition.
 * 
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferItemDetailType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType")
@XmlSeeAlso({
    org.iata.ndc.schema.InvDiscrepencyAlertType.AlternateOffers.AlternateOffer.class,
    org.iata.ndc.schema.AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer.class,
    org.iata.ndc.schema.FlightPriceRS.AirlineOffer.class,
    org.iata.ndc.schema.ItinReshopRS.Response.ReShopOffer.class,
    org.iata.ndc.schema.ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer.class,
    org.iata.ndc.schema.ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer.class,
    org.iata.ndc.schema.ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer.class
})
public class OfferType
    extends OfferItemDetailType
{


}
