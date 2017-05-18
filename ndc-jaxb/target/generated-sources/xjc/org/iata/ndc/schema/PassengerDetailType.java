
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for DETAIL PASSENGER representation.
 * 
 * <p>Java class for PassengerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerSummaryType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDetailType")
@XmlSeeAlso({
    org.iata.ndc.schema.ItinReshopRS.Response.Passengers.Passenger.class,
    org.iata.ndc.schema.OrderChangeRQ.Query.Passengers.Passenger.class,
    org.iata.ndc.schema.Passenger.class
})
public class PassengerDetailType
    extends PassengerSummaryType
{


}
