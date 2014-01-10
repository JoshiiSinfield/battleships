package uk.co.lala.battleships.model.vessels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AircraftCarrierTest {

	@Test
	public void shouldBeAbleToInstantiateAnAircraftCarrier() {
		AircraftCarrier testSubject = new AircraftCarrier();
		assertNotNull(testSubject);
	}

	@Test
	public void shouldHaveTypeOfAircraftCarrierWhenInstantiated() {
		AircraftCarrier testSubject = new AircraftCarrier();

		assertEquals(VesselType.AIRCRAFT_CARRIER, testSubject.getType());
	}
}
