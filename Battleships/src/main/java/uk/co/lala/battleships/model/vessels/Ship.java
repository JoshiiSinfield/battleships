package uk.co.lala.battleships.model.vessels;

/**
 * base class for all ship types. This should contain all logic and properties
 * which are common to every variation of ship.
 * 
 * @author joshuas
 * 
 */
public abstract class Ship {

	/**
	 * the type of ship this is.
	 */
	private VesselType type = VesselType.SCOUT;

	/**
	 * Retrieve the {@link VesselType} of this ship.
	 * 
	 * @return the type
	 */
	public VesselType getType() {
		return type;
	}

	/**
	 * Set the {@link VesselType} of this ship. The default is VesselType.SCOUT
	 * 
	 * @param type
	 *            the {@link VesselType} this ship is.
	 */
	public void setType(VesselType type) {
		this.type = type;
	}

}
