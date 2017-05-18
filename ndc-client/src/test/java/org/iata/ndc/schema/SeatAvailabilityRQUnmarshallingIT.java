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
public class SeatAvailabilityRQUnmarshallingIT extends AbstractUnmarshaller<SeatAvailabilityRQ> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Kronos/OneWay/SeatAvailabilityRQ- OneWay.xml", "ARN"},
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String departure;

	@Test
	public void unmarshal() throws JAXBException {
		SeatAvailabilityRQ seatAvailabilityRQ = unmarshal(resource);
		assertEquals(departure, seatAvailabilityRQ.getDataLists().getFlightSegmentList().get(0).getDeparture().getAirportCode().getValue());
	}
}