package org.iata.ndc.schema;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class OrderCancelRSUnmarshallingIT extends AbstractUnmarshaller<OrderCancelRS> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/OrderCancelRS.xml", "IDTOREMOVE"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String orderID;

	@Test
	public void unmarshal() throws JAXBException {
		OrderCancelRS orderCancelRS = unmarshal(resource);
		assertNotNull(orderCancelRS.getResponse().get(0).getOrderCancelProcessing());
		assertEquals(orderID, orderCancelRS.getResponse().get(0).getOrderReference());
	}
}