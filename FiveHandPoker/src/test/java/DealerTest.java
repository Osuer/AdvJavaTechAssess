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
    public void TestDeck(){
        if (!deck.getIsCompleteDeck()){
            deck = new Deck();
        }
        if (!deck.getIsShuffled()){
            shuffler.shuffleDeck(deck);
        }
        ArrayList<Card> FiveCardHand = new ArrayList<>();
        FiveCardHand = dealer.dealHand(deck,5);

        printer.printHand(FiveCardHand);
    }
}