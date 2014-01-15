package uk.co.lala.battleships.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uk.co.lala.battleships.model.vessels.CatCarrier;
import uk.co.lala.battleships.model.vessels.Ship;

public class Game {

	// Generate these numbers randomly?Dynamically?

	static World world = new World(10, 10);
	static FiringSolution fs = new FiringSolution();

	public static void main(String[] args) {
		// Ocean oc = new Ocean();
		// ShipFactory shipFactory = new ShipFactory();

		String username = null;
		int x;
		int y;

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Please enter user name : ");
		try {
			username = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (username.equals("")) {
			username = "Jimbo";
		}
		System.out.println("You entered : " + username);

		try {
			System.out.println("Enter x coordinate");
			x = reader.read();
			System.out.println("Enter y coordinate");
			y = reader.read();

		} catch (IOException e) {
			e.printStackTrace();
		}

		fs.fire();

		Ship catCarrier = new CatCarrier();
		catCarrier.placeShip(x, y, direction);

	}

}