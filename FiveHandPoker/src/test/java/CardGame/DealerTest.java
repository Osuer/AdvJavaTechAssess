package CardGame;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void TestDealerDealsCorrectHandSize() {
        Dealer dealer = new Dealer();
        Deck deck = new StandardDeck();
        ArrayList<Card> hand = dealer.dealHand(deck, 5);
        assertEquals(hand.size(),5);
    }
}