package uk.co.lala.battleships.model.vessels;

/**
 * Enum describing what various types of vessels are available for {@link Ship}s
 * 
 * @author joshuas
 * 
 */
public enum VesselType {
	SCOUT(1), AIRCRAFT_CARRIER(5), FRIGATE(3), DESTROYER(2), DREADNOUGHT(4), CAT_CARRIER(
			2);

	private final int size;

	private VesselType(int size) {
		this.size = size;
	};

	public int getSize() {
		return size;
	}

}
