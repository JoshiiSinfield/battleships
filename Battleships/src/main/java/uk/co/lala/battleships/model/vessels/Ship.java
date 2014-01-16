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
	private int[] shipLocationX;
	private int[] shipLocationY;
        private int size;

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
                size = type.getSize();
	}

	public void placeShip(int x, int y, String direction) {

		
		shipLocationX = new int[size];
		shipLocationY = new int[size];

		for (int i = 0; i < size; i++)
			if (direction.equals("H")) {
				shipLocationX[i] = x + i;
				shipLocationY[i] = y;
			} else if (direction.equals("V")) {
				shipLocationX[i] = x;
				shipLocationY[i] = y + i;
			} else {
				throw new IllegalArgumentException("Invalid ship direction");
			}
	}

        public String checkYourself(int x, int y){

        for (int i = 0; i < size; i++)
            if (shipLocationX[i] == x
                && shipLocationY[i] == y ){
                shipLocationX[i] = 0;
                shipLocationY[i] = 0;
                if (this.isSunk() ==  true)
                {return "Sunk!"; }
                else return "Hit!";
            }
        return "Miss!";
        }

        public boolean isSunk(){
            int f = 0;
            for (int i = 0; i < size; i++){
                f = f + shipLocationX[i];
            }
            
            if (f == 0) return true;
            else return false;
        }

}
