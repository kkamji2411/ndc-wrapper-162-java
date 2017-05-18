package org.iata.ndc.schema;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AirShoppingRSUnmarshallingIT extends AbstractUnmarshaller<AirShoppingRS> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/AirShoppingRS-ARNRIX - OneWay with one pax.xml", "1_1"},
			{"/Kronos/RoundTrip/AirShoppingRS- RoundTrip with one pax.xml", "1_1"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String offerItemID;

	@Test
	public void unmarshal() throws JAXBException {
		AirShoppingRS object = unmarshal(resource);
		String result = object.getOffersGroup().getAirlineOffers().get(0).getAirlineOffer().get(0).getPricedOffer().getOfferPrice().get(0).getOfferItemID();
		assertEquals(offerItemID, result);
	}
}