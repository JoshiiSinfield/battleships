package uk.co.lala.battleships.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static void main(String[] args) {
		//Ocean oc = new Ocean();
		//ShipFactory shipFactory = new ShipFactory(); 
		
		String username = null;
		int x;
		int y;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter user name : ");
        try {
            username = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        if(username.equals("")){
        	username = "Jimbo";
        }
	    System.out.println("You entered : " + username);
	     
	    try {
		    System.out.println("Enter x coordinate");
            x = Integer.parseInt(reader.readLine());
            System.out.println("Enter y coordinate");
            y = Integer.parseInt(reader.readLine());
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
	    
	    
	     
	     
		
		
	}

}
