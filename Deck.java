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

    public void displayDeck(){
        for (Card card : deck){
            System.out.println(card);
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public void randomCards(){
        for(int i=0; i<5; i++){
            System.out.println("Card "+i+": "+deck.get(0));
            deck.remove(deck.get(0));
        }
    }

    public void sizeOfdeck(){
        System.out.println("Current size of deck: "+deck.size());
    }
}
