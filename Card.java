public class Card {
    private String suit;
    private String rank;

    // This is the Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // Display card details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    // Compare if two cards have the same suit
    public boolean sameCard(Card other) {
        return this.suit.equals(other.suit);
    }

    // Compare if two cards have the same rank
    public boolean compareCard(Card other) {
        return this.rank.equals(other.rank);
    }
}
