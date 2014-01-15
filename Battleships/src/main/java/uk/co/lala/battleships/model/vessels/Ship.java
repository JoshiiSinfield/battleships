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
	private VesselType type;
	private int[] shipLocaitonX;
	private int[] shipLocaitonY;

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
	protected void setType(VesselType type) {
		this.type = type;
	}

	public void placeShip(int x, int y, char direction) {

		for (int i = 0; i < type.getSize(); i++)
			if (direction == 'H') {
				shipLocaitonX[i] = x + i;
				shipLocaitonY[i] = y;
			} else if (direction == 'V') {
				shipLocaitonX[i] = x;
				shipLocaitonY[i] = y + i;
			} else {
				throw new IllegalArgumentException("Invalid ship direction");
			}
	}

}
