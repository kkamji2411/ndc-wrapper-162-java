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
public class ServiceListRQUnmarshallingIT extends AbstractUnmarshaller<ServiceListRQ> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/ServiceListRQ.xml", "A12345RB8"},
			{"/Kronos/RoundTrip/ServiceListRQ.xml", "A12345RB8"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String responseID;

	@Test
	public void unmarshal() throws JAXBException {
		ServiceListRQ serviceListRQ = unmarshal(resource);
		assertEquals(responseID, serviceListRQ.getQuery().getOrderID().getValue());

	}
}