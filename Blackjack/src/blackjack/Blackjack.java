/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author izzis
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     Player testPlayer = new Player("Sheldon");
//     System.out.println(testPlayer.playerName);

int numPlayers = 0;
Scanner playerInput = new Scanner(System.in);

while (numPlayers == 0 || numPlayers == 1) {
    System.out.println("How many players?");
    
    try {
    numPlayers = playerInput.nextInt() + 1;
    }
    catch(Exception e) {
    System.out.println("Please enter a number.");
}
            
    }

Player[] playerList = new Player[numPlayers];

for (int i = 0; i < numPlayers; i++) {
 if (i == 0) {
     Player user = new Player("Dealer");
     user.chips = 0;
     user.playerID = i;
     playerList[i] = user;
      }   else if (i > 0) {
        System.out.println("What is your name?");
        String input = playerInput.next();
        String output;
        if (input.length() > 1 ) {
            output = input.substring(0, 1).toUpperCase() + input.substring(1);
        } else {
            output = input;
        }
        Player user = new Player(output);
        user.chips = 200;
        user.playerID = i;
        System.out.println("Welcome, " + user.playerName + "! You have " + user.chips + " chips.");
        
        try {Thread.sleep(1000);
        
        }
        catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        playerList[i] = user;
            }    

        }

        Deck dealerDeck = new Deck();
        dealerDeck.deal(playerList, dealerDeck);
        
}
}