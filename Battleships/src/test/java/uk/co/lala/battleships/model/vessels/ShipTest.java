package uk.co.lala.battleships.model.vessels;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShipTest {

	class ShipTestSubClass extends Ship {
	}

	@Test
	public void aSubclassOfShip_shouldHaveDefaultVesselTypeOfScout() {
		ShipTestSubClass testSubject = new ShipTestSubClass();
		assertEquals(VesselType.SCOUT, testSubject.getType());
	}

	@Test
	public void shouldBeAbleToSetTypeOfShip() {
		ShipTestSubClass testSubject = new ShipTestSubClass();

		testSubject.setType(VesselType.AIRCRAFT_CARRIER);

		assertEquals(VesselType.AIRCRAFT_CARRIER, testSubject.getType());
	}
}
