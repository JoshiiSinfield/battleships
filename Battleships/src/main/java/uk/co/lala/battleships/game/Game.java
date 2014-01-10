package uk.co.lala.battleships.game;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static void main(String[] args) {
		//Ocean oc = new Ocean();
		//ShipFactory shipFactory = new ShipFactory(); 
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter user name : ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
	     Console console = System.console();
	     username = console.readLine("Please enter user name : ");   
	     System.out.println("You entered : " + username);
	     
	     
		
		
	}

}
