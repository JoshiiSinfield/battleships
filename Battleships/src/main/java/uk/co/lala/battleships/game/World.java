package uk.co.lala.battleships.game;

public class World {

	private int[][] worldMap;

	public World(int x, int y) {
		this.setWorldMap(new int[x][y]);
	}

	public int[][] getWorldMap() {
		return worldMap;
	}

	public void setWorldMap(int[][] worldMap) {
		this.worldMap = worldMap;
	}

}
