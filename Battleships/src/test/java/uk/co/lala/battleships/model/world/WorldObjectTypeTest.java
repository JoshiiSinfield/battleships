package uk.co.lala.battleships.model.world;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WorldObjectTypeTest {

	@Test
	public void shouldReturnBooleanWhetherWorldObjectTypeIsPlaceableOrNot() {
		WorldObjectType wot = WorldObjectType.OCEAN;

		assertTrue(wot.isPlaceable());

	}

	@Test
	public void shouldContain_LAND_WorldObjectType() {
		assertNotNull(WorldObjectType.valueOf("LAND"));
	}

	@Test
	public void LAND_shouldNotBePlaceable() {
		assertFalse(WorldObjectType.LAND.isPlaceable());
	}

	@Test
	public void shouldContain_OCEAN_WorldObjectType() {
		assertNotNull(WorldObjectType.valueOf("OCEAN"));
	}

	@Test
	public void OCEAN_shouldBePlaceable() {
		assertTrue(WorldObjectType.OCEAN.isPlaceable());
	}

}
