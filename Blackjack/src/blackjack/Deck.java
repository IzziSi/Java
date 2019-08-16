/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Random;
/**
 *
 * @author izzis
 */
public class Deck {
        public Card[] cards;
        
        public Deck() {
           cards = new Card[52];
           String[] Suits = {"Hearts", "Clubs", "Spades","Diamonds"};
           
           String[] Faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
               "10","Jack", "Queen", "King"};

           int[] Values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
           int counter = 0;
           for (int x = 0; x <= 3; x++) {
                for (int i = 0; i < 13; i++) {
                    Card card = new Card();
                    card.Face = Faces[i];
                    card.Value = Values[i];
                    card.Suit = Suits[x];
                    cards[counter] = card;
                    counter++;
                }
           }
          
          shuffleDeck();
          printDeck();
       
        }
        
        public void shuffleDeck() {
           Card placeholderCard = new Card();
           Random rand = new Random();
           int placeholderNum;
           for (int i =cards.length-1; i >= 0;i--) {
               placeholderNum = rand.nextInt(52);
               placeholderCard = cards[i];
               cards[i] = cards[placeholderNum];
               cards[placeholderNum] = placeholderCard;         
           }
           
        }
        

        public void printDeck() {
            for (int p=0; p < 52; p++) {
                System.out.println(
                cards[p].Face + " ( " + 
                cards[p].Value + ") of " +
                cards[p].Suit 
                );
            }
        }
                
}

