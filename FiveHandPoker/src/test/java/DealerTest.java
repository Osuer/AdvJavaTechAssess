import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    Deck deck = new Deck();
    Dealer dealer = new Dealer();
    Shuffler shuffler = new Shuffler();
    Printer printer = new Printer();
    @Test
    public void DealTopCard() {
        Card card = dealer.dealCard(deck);
        assertEquals(1,card.getSuit());
        assertEquals(1,card.getValue());
        card = dealer.dealCard(deck);
        assertEquals(1,card.getSuit());
        assertEquals(2,card.getValue());
    }

    @Test
    public void TestDeck(){
        if (!deck.getIsCompleteDeck()){
            deck = new Deck();
        }
        if (!deck.getIsShuffled()){
            shuffler.shuffleDeck(deck);
        }
        ArrayList<Card> FiveCardHand = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            Card card = dealer.dealCard(deck);
            FiveCardHand.add(card);
        }

        printer.printHand(FiveCardHand);
    }
}