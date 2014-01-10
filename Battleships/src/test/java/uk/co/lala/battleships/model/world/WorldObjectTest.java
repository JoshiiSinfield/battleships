package uk.co.lala.battleships.model.world;

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

}
