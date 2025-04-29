//Deck.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck; // Stores the deck of cards
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "Jack", "Queen", "King", "Ace"
    };

    // Constructor to initialize the deck
    public Deck() {
        createDeck();
    }

    // Create a deck of 52 cards
    public void createDeck() {
        deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    // Print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            card.printCard();
        }
    }

    // Find a specific card in the deck
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }

    // Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    // Deal 5 random cards
    public void dealCard() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            deck.get(rand.nextInt(deck.size())).printCard();
        }
    }
}
