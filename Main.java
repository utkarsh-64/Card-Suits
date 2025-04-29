//Main.java
//Name: Utkarsh Lakhani
//PRN:23070126064
//Batch: 2023-27

class Main{
    public static void main(String[] args){
        
        Deck deck = new Deck();
        System.out.println("\n******* Creating Deck *******");
        deck.createDeck();

        System.out.println("\n******* Deck Shuffleing *******");
        deck.shuffleDeck();
        
        System.out.println("\n******* Print Deck *******");
        deck.displayDeck();
        deck.sizeOfdeck();
      
    }  
}
