/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TheGame {
    
    /**
     * @param args the command line arguments
     */
    
//Need to build Calendar to check birthday vs. date and update player age
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type 'New' to create a new character or type your first and last name to log in.");
        String playerInput = input.nextLine();
        
        if (playerInput.toLowerCase().equals("new")) {
            CreatePlayer.createPlayer();
        } else {
            String[] fullName = playerInput.split(" ");
            for (String name : fullName) {
                System.out.println("Name: " + name);
                //Temp work around til adding in a database
            }
        }
        
    }
}
    
