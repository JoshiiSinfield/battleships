package uk.co.lala.battleships.model.vessels;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VesselTypeTest {

	@Test
	public void testAbleToAccessEnum() {
		assertNotNull(VesselType.values());
	}

	@Test
	public void shouldContain_SCOUT_EnumType() {
		assertNotNull(VesselType.valueOf("SCOUT"));
	}

	@Test
	public void shouldContain_AIRCRAFT_CARRIEREnumType() {
		assertNotNull(VesselType.valueOf("AIRCRAFT_CARRIER"));
	}

	@Test
	public void shouldContain_FRIGATE_EnumType() {
		assertNotNull(VesselType.valueOf("FRIGATE"));
	}

	@Test
	public void shouldContain_DESTROYER_EnumType() {
		assertNotNull(VesselType.valueOf("DESTROYER"));
	}

	@Test
	public void shouldContain_DREADNOUGHT_EnumType() {
		assertNotNull(VesselType.valueOf("DREADNOUGHT"));
	}

}
