package uk.co.lala.battleships.model.world;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LandTest {

	@Test
	public void testAbleToInstantiateALandObject() {
		Land testSubject = new Land();

		assertNotNull(testSubject);
	}

	@Test
	public void shouldHaveTypeOfLand() {
		Land testSubject = new Land();
		assertEquals(WorldObjectType.LAND, testSubject.getType());
	}
}
