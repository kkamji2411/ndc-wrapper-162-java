package org.iata.ndc.builder;

import org.iata.ndc.schema.FlightPriceRQ;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class FlightPriceRQBuilderTest {
    
    private FlightPriceRQBuilder testedClass;
    
    @Before
    public void setUp() {
        testedClass = new FlightPriceRQBuilder();
    }
    
    /**
     * Test of build method, of class FlightPriceRQBuilder.
     */
    @Test
    public void testBuild_Travelers() {
        FlightPriceRQ result = testedClass.build();
        assertEquals(1, result.getTravelers().size());
    }
    
     /**
     * Test of build method, of class FlightPriceRQBuilder.
     */
    @Test
    public void testBuild_Sender() {
        FlightPriceRQ result = testedClass.build();
        assertNotNull(result.getParty().getSender());
    }
}
