import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void print() {
        Deck deck = new Deck();
        Printer printer = new Printer();
        Shuffler shuffler = new Shuffler();
        shuffler.shuffleDeck(deck);
        printer.printDeck(deck);
    }
}