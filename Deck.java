import java.util.*;
class Deck{
    ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public void createDeck(){
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (String rank : ranks){
            for(String suit : suits){
                deck.add(new Card(rank, suit));
            }
        }
    }
}
