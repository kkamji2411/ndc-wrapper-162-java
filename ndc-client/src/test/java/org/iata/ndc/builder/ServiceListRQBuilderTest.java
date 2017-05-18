package org.iata.ndc.builder;

import static org.junit.Assert.assertEquals;

import org.iata.ndc.schema.ObjectFactory;
import org.iata.ndc.schema.ServiceListRQ;
import org.junit.Before;
import org.junit.Test;

public class ServiceListRQBuilderTest {
	private static final ObjectFactory factory = new ObjectFactory();
	private ServiceListRQBuilder testedClass;


	@Before
	public void setUp() {
		testedClass = new ServiceListRQBuilder();
	}

	@Test
	public void documentNode() {
		ServiceListRQ request = testedClass.build();
		assertEquals("1.0", request.getDocument().getReferenceVersion());
		assertEquals("NDC ServiceListRQ Message", request.getDocument().getName());
	}

	@Test
	public void setOrderID() {
		ServiceListRQ request = testedClass.setOrderID("orderID","airline").build();
		assertEquals("orderID", request.getQuery().getOrderID().getValue());
	}
}
