/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author izzis
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game beginGame = new Game();
        beginGame.start();
    }
}