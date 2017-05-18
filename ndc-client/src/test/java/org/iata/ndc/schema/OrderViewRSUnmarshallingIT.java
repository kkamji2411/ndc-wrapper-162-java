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
public class OrderViewRSUnmarshallingIT extends AbstractUnmarshaller<OrderViewRS> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/OrderViewRS - OrderCreate.xml", "1_1"},
			{"/Kronos/RoundTrip/OrderViewRS - OrderCreateRQ.xml", "112_2"},

			{"/Kronos/OneWay/OrderViewRS - OrderRetrieveRQ.xml", "1_1"},
			{"/Kronos/RoundTrip/OrderViewRS - OrderRetrieveRQ.xml", "112_2"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String offerItemID;

	@Test
	public void unmarshal() throws JAXBException {
		OrderViewRS orderViewRS = unmarshal(resource);
		assertEquals(offerItemID, orderViewRS.getResponse().getOrder().get(0).getOrderItems().getOrderItem().get(0).getOrderItemID().getValue());
	}
}