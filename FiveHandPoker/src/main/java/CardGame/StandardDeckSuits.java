package CardGame;

// ENUM class for all the suits of cards found in a standard 52 card deck.
public enum StandardDeckSuits {
    // ASCII values are used to ensure proper printing of icon.
    HEARTS(9829) , CLUBS (9827), DIAMONDS(9830) , SPADES(9824);
    final int printSuit;

    StandardDeckSuits(int printSuit) {
        this.printSuit = printSuit;
    }
}

