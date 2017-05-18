# NDC Java wrapper

This is a Java project which wraps NDC-compliant API.
It's host-agnostic so it can point to any NDC host.

This code depends on the following libraries which can be found at http://hc.apache.org/downloads.cgi under HttpClient 4.5.3:

commons-logging
httpclient
httpclient-cache
httpclient-win
httpcore
httpmime

## Installation

### Using Maven
Add the following dependency to your project's dependencies
```
    <dependency>
      <groupId>org.iata.ndc</groupId>
      <artifactId>ndc-client</artifactId>
      <version>0.1.5</version>
      <scope>compile</scope>
    </dependency>
```

### Using Gradle
Add the following dependency to your `dependencies` section
```
        compile 'org.iata.ndc:ndc-client:0.1.5'
```

### Manual installation
You can install NDC Java wrapper from the [GitHub repository](https://github.com/iata-ndc/ndc-wrapper-162-java) using git.
Run the following command:
```
git clone https://github.com/iata-ndc/ndc-wrapper-162-java.git
cd ndc-wrapper-162-java
mvn install -Dapi.key=<your api key>
```
Then add maven dependency as usual

## Usage

Add ndc-client and schema.jar to project dependencies

Request sample
```java
package org.iata.ndc;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.iata.ndc.NdcClient;
import org.iata.ndc.builder.AirShoppingRQBuilder;
import org.iata.ndc.schema.AirShopReqParamsType;
import org.iata.ndc.schema.AirShoppingRQ;
import org.iata.ndc.schema.AirShoppingRS;
import org.iata.ndc.schema.CurrCode;

public class TestClient
{
	public static void main( String args[] )
	{
		GregorianCalendar gc = new GregorianCalendar();
		gc.set( GregorianCalendar.DAY_OF_MONTH, 25 );
		gc.set( GregorianCalendar.MONTH, GregorianCalendar.DECEMBER );
		gc.set( GregorianCalendar.YEAR, 2017 );
		
		AirShoppingRQBuilder builder = new AirShoppingRQBuilder();
		builder.addTravelAgencySender("Test agency", "98417900", "test agent");
		builder.addOriginDestination("ARN", "LHR", gc.getTime() );
		builder.addAirlinePreference("C9");
		builder.addCabinPreference("M");
		
		AirShoppingRQ request = builder.build();

		NdcClient client = new NdcClient("http://iata.api.mashery.com/kronos/ndc162api", "API-KEY-GOES-HERE");
		AirShoppingRS response = null;
		
		LinkedList<CurrCode> curr = new LinkedList<CurrCode>();
		
		CurrCode ccode = new CurrCode();
		ccode.setId("EUR");
		ccode.setValue("EUR");
		curr.add( ccode );
		
		AirShopReqParamsType t = new AirShopReqParamsType();
		t.setCurrCodes( curr );
		
		request.setParameters( t );

		System.out.println( "Making the call" );

		try
		{
			response = client.airShopping(request);
			
			try
			{
				// If we get a document back, everything was processed correctly by the sandbox
				//
				System.out.println( "Document Name: " + response.getDocument().getName() );
				System.out.println(response.getShoppingResponseID().getResponseID().getValue());
			}
			catch ( Exception e )
			{
				// If we end up here then the server returned an error and we need to change something in the set up of our request
				//
				System.out.println( "Something seems to have gone wrong while processing the request!");
				System.out.println( "Error code returned: " + response.getErrors().get(0).getCode() );
				System.out.println( "Error message returned: " + response.getErrors().get(0).getValue() );
			}

		}
		catch (IOException e)
		{
			// Normally we should never get here
			// If we do end up here then something major went wrong unrelated to the sandboxes like a network outage / failure to load dependencies or some such
			//
			throw new RuntimeException( "A major failure has occurred!", e );
		}
	}
}
```
**NOTE:** At the moment only available builders are:
* AirShoppingRQBuilder
* SeatAvailabilityRQBuilder
* ServiceListRQBuilder 
* FlightPriceRQBuilder

All other requests can be constructed manually, using ObjectFactory in org.iata.ndc.schema package.
New common element builders will be added to org.iata.ndc.builder.element package.

This should return AirShoppingRS object, which contains response data.
