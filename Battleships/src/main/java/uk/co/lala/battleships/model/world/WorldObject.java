package uk.co.lala.battleships.model.world;

/**
 * Base class containing common details of a world object.
 * 
 * @author joshuas
 * 
 */
public abstract class WorldObject {

	private WorldObjectType type = WorldObjectType.LAND;

	/**
	 * @return the type of world object this is.
	 */
	public WorldObjectType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the {@link WorldObjectType} this object is
	 */
	public void setType(WorldObjectType type) {
		this.type = type;
	}

}
