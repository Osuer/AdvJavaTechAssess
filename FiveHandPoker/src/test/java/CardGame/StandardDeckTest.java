package CardGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class StandardDeckTest {

    @Test
    public void TestDeckSizeIsReducedWhenCardsAreDealt() {
        Deck deck = new StandardDeck();
        int initialSize = deck.getSize();
        deck.getDeck().pop();
        assertNotEquals(initialSize, deck.getSize());
    }
}