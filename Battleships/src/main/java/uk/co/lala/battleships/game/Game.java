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
		String sX;
		String sY;
                String result;
		int x = 0;
		int y = 0;

                Ship catCarrier = new CatCarrier();
		catCarrier.placeShip(1, 1,"H");

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
                if(username.toLowerCase().equals("harvy")){
		System.out.println("welcome " + username + ", destroyer of mighty the octopus monster cheese!");
                }
                else if(username.toLowerCase().equals("joshii"))
                {
                System.out.println("yaaaarr " + username + ", shiver me timbers lets sink us some ships!");
                }
                else if(username.toLowerCase().equals("steve"))
                {
                System.out.println("oi " + username + " don't you have some shares to check!");
                }
                else System.out.println("who the hell is "  + username + "...");

                while (catCarrier.isSunk() != true){

		try {
			System.out.println("Enter x coordinate");
			sX = reader.readLine();
			x = Integer.parseInt(sX);

		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Enter y coordinate");
			sY = reader.readLine();
			y = Integer.parseInt(sY);

		} catch (IOException e) {
			e.printStackTrace();
		}
                    result = catCarrier.checkYourself(x, y);
                    System.out.println(result);
                }
		

		
	}

}
