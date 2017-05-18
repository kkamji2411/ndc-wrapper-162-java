package org.iata.ndc.schema;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import javax.xml.bind.JAXBException;

import org.iata.ndc.schema.ShoppingResponseOrderType.Offer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class OrderCreateRQUnmarshallingIT extends AbstractUnmarshaller<OrderCreateRQ> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/OrderCreateRQ - OneWay with one pax.xml", "1_1"},
			{"/Kronos/RoundTrip/OrderCreateRQ - RoundTrip with one pax.xml", "1_2"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String offerItemID;

	@Test
	public void unmarshal() throws JAXBException {
		OrderCreateRQ orderCreateRQ = unmarshal(resource);
		Offer offer = orderCreateRQ.getQuery().getOrderItems().getShoppingResponse().getOffers().get(0);
		assertEquals(offerItemID, offer.getOfferItems().get(0).getOfferItemID().getValue());
	}
}