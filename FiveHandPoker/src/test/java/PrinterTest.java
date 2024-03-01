import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrinterTest {

    Printer printer = new Printer();
    Deck unshuffledDeck = new Deck();
    HandEvaluator handEvaluator = new HandEvaluator();

    // ===== NOT SURE HOW TO UNIT TEST Text Output to console
    /*@Test
    public void TestPrintOutPutFormat(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        // 8 -> Queen of Hearts
        for (int i = 6; i < 11; i++) {
            forcedHand.add(unshuffledDeck.getCard(i));
        }
        Hand myHand = new Hand(forcedHand);
        printer.printHand(forcedHand, handEvaluator.evaluateHand(myHand), unshuffledDeck.getValueMap(), unshuffledDeck.getSuitmap());

        assertEquals();
    }*/
}