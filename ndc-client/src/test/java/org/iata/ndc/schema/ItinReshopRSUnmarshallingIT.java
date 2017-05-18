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
public class ItinReshopRSUnmarshallingIT extends AbstractUnmarshaller<ItinReshopRS> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/ItineraryReshopRS - OneWay.xml", "1_1"},
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String OrderItemID;

	@Test
	public void unmarshal() throws JAXBException {
		ItinReshopRS itinReshopRS = unmarshal(resource);
		assertEquals(OrderItemID, itinReshopRS.getResponse().getOrder().getOrderItems().get(0).getOrderItemID().value);
	}
}