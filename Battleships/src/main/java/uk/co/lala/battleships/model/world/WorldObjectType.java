package uk.co.lala.battleships.model.world;

public enum WorldObjectType {
	LAND(false), OCEAN(true);

	private boolean placeable = false;

	/**
	 * @return whether the WorldObject this is associated with can have a ship
	 *         placed on it.
	 */
	public boolean isPlaceable() {
		return placeable;
	}

	WorldObjectType(boolean placeable) {
		this.placeable = placeable;
	}
}
