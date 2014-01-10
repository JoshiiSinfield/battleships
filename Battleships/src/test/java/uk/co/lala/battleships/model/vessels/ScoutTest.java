package uk.co.lala.battleships.model.vessels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ScoutTest {

	@Test
	public void shouldBeAbleToCreateANewInstanceOfScout() {
		Scout testSubject = new Scout();

		assertNotNull(testSubject);
	}

	@Test
	public void shouldHaveCorrectDefaultTypeOfScout() {
		Scout testSubject = new Scout();

		assertEquals(VesselType.SCOUT, testSubject.getType());
	}

}
