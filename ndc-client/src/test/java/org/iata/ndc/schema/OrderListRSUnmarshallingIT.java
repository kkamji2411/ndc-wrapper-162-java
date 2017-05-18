package org.iata.ndc.schema;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import javax.xml.bind.JAXBException;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class OrderListRSUnmarshallingIT extends AbstractUnmarshaller<OrderListRS> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/RoundTrip/OrderListRS_AirlineFilter.xml", "A12345QH8"},
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String orderID;

	@Test
	public void unmarshal() throws JAXBException {
		OrderListRS orderListRS = unmarshal(resource);
		OrderListRS.Response.Order orderO = orderListRS.getResponse().getOrders().get(0);
 		if(orderO.getOrderID() instanceof ElementNSImpl){
			String inorderID = ((ElementNSImpl)orderO.getOrderID()).getFirstChild().getNodeValue();
		    assertEquals(orderID, inorderID );
		}
		
	}
}