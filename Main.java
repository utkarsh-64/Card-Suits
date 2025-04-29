//Main.java
//Name: Utkarsh Lakhani
//PRN:23070126064
//Batch: 2023-27

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {
            System.out.println("\n----- Card Deck Menu -----");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Find a Card");
            System.out.println("4. Deal 5 Random Cards");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 3:
                    System.out.print("Enter rank (e.g., Ace, 2, 3, Jack): ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter suit (e.g., Hearts, Diamonds): ");
                    String suit = scanner.nextLine();
                    if (deck.findCard(rank, suit)) {
                        System.out.println("Card found in the deck.");
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 4:
                    System.out.println("Dealing 5 random cards:");
                    deck.dealCard();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
