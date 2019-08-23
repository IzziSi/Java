/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;


import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class CreatePlayer {
    protected static void createPlayer() {
        Scanner input = new Scanner(System.in);
        String playerInput;
        Player player = new Player();
        System.out.println("Choose a first name.");
        int whileLoopIteration = 0;
        do {
            
            if (whileLoopIteration > 0) {
                System.out.println("Please only enter alphabetic letters.");
            }
            
            playerInput = input.next();
            whileLoopIteration++;
        } while (CommonMethods.chkAsString(playerInput) == false );
        
        player.setFirstName(playerInput);
        
        System.out.println("Welcome, " + player.getFirstName() + ". What is your last name?");
        
        whileLoopIteration = 0;
        do {
            if (whileLoopIteration > 0) {
                System.out.println("Please only enter alphabetic letters.");
            }
            playerInput = input.next();
            whileLoopIteration++;
        } while (CommonMethods.chkAsString(playerInput) == false );
        
        player.setLastName(playerInput);
        
        System.out.println(player.getFirstName() + " " + player.getLastName() + ", how old are you?");
        System.out.println("(Please enter a number from 1-50)");
        String chkAge = input.next();
        int playerAge = 0;
        while (!CommonMethods.chkAsInteger(chkAge)) {
            try {
                playerAge = Integer.parseInt(chkAge);
            } catch (Exception e) {
                playerAge = 0;
            }
            
            if (playerAge > 50 || playerAge < 1) {
                System.out.println("Please enter a number from 1-50");
                chkAge = input.next();
            }
        }
        
            
        player.setAge(playerAge);
        
        System.out.println("Select a race: Human, Dwarf, Elf, Catpeople, Crabpeople, Gelatinous Cube.");
        playerInput = input.next();
        player.checkRace(playerInput);
        player.setLevel(1);
        player.setExperience(0);
        player.setHometown(player.getRace());
        player.setBirthday(playerAge);
        player.getStats();
        
        System.out.println("Character created!");
        player.setRoomNum(1);
        Room currentRoom = Area.entranceRoom();
        Room.look(currentRoom);
    }
}
