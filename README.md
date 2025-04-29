# Card Deck Project

## 📖 Project Description

This Java project implements a **Card Deck System** using **ArrayList/Vector**. The system allows users to:

1. **Create a Deck** - Initializes a standard deck of 52 playing cards.
2. **Print the Deck** - Displays all cards in the deck.
3. **Print a Specific Card** - Displays a particular card based on user input.
4. **Find Same Suit Cards** - Finds all cards that belong to the same suit.
5. **Compare Cards** - Checks if two cards have the same rank.
6. **Find a Specific Card** - Searches for a card in the deck.
7. **Deal Cards** - Draws 5 random cards from the deck.
8. **Shuffle the Deck** - Randomizes the order of cards in the deck.

This project follows proper **coding guidelines**, includes **detailed comments**, and ensures **modular implementation**.

## 📂 Project Structure

CardDeck/:
- │── Main.java            # Entry point of the program
- │── Card.java            # Represents a playing card
- │── Deck.java            # Manages the deck operations
- │── README.md            # Project documentation and instructions

## ⚡ Functions & Methods

| File     | Function         | Description |
|----------|----------------|-------------|
| Card.java | Constructor & Getters/Setters | Defines a card with suit and rank |
| Deck.java | createDeck()   | Initializes the deck with 52 cards |
|          | printDeck()    | Displays all cards in the deck |
|          | printCard()    | Prints a specific card |
|          | sameCard()     | Finds cards with the same suit |
|          | compareCard()  | Compares two cards by rank |
|          | findCard()     | Searches for a specific card |
|          | dealCard()     | Draws 5 random cards |
|          | shuffleDeck()  | Shuffles the deck |

## 🛠️ **How to Run**:

1. Open Command Prompt and navigate to your project folder using:
   ```sh
   cd path_to_your_folder
   ```
2. Compile the Main.java file using:
   ```sh
   javac Main.java
   ```
3. After compilation, run the program using:
   ```sh
   java Main
   ```
4. Follow the on-screen menu to manage the card deck!

## 📌 Example Output

```
===== Card Deck System =====
1. Create Deck
2. Print Deck
3. Print a Card
4. Find Same Suit Cards
5. Compare Two Cards
6. Find a Specific Card
7. Deal 5 Random Cards
8. Shuffle Deck
9. Exit
Enter your choice: 7

Dealing 5 random cards:
1. Ace of Hearts
2. 7 of Spades
3. Queen of Diamonds
4. 2 of Clubs
5. 10 of Hearts
```

## 📄 License

This project is open-source and free to use.

---
