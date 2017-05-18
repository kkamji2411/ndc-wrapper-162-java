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
public class OrderChangeRQUnmarshallingIT extends AbstractUnmarshaller<OrderChangeRQ> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/OrderChangeRQ_OneWay UpdateSegment.xml", "1_1"},
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String orderItemID;

	@Test
	public void unmarshal() throws JAXBException {
		OrderChangeRQ orderChangeRQ = unmarshal(resource);
		assertEquals(orderItemID, orderChangeRQ.getQuery().getOrder().getOrderItems().get(0).getOrderItemID().value);
	}
}