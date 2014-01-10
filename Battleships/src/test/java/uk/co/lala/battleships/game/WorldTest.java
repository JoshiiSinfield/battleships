package uk.co.lala.battleships.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorldTest {

	@Test
	public void testAbleToInstantiateAWorldClass() {
		World testSubject = new World(0, 0);

		assertNotNull(testSubject);
	}

}
