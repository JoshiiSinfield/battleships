package uk.co.lala.battleships.model.world;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class WorldObjectTest {

	class WorldObjectTestSubClass extends WorldObject {

	}

	@Test
	public void testAbleToInstantiateAWorldObjectSubclass() {
		WorldObjectTestSubClass testSubject = new WorldObjectTestSubClass();

		assertNotNull(testSubject);
	}

	@Test
	public void shouldBeAbleToSetTheTypeOfWorldObject() {
		WorldObjectTestSubClass testSubject = new WorldObjectTestSubClass();

		testSubject.setType(WorldObjectType.OCEAN);

		assertEquals(WorldObjectType.OCEAN, testSubject.getType());
	}

	@Test
	public void ShouldHaveTypeOfLandByDefault() {
		WorldObjectTestSubClass testSubject = new WorldObjectTestSubClass();

		assertEquals(WorldObjectType.LAND, testSubject.getType());
	}

}
