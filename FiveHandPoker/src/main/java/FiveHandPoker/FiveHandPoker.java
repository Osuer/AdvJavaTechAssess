package FiveHandPoker;

import CardGame.*;

public class FiveHandPoker {
    public static void main(String[] args){
        Shuffler shuffler = new StandardShuffler();
        Deck standardDeck = new StandardDeck();
        Printer standardDeckPrinter = new StandardDeckPrinter();
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        standardDeck.shuffleDeck(shuffler);
        Hand playerOnePokerHand = new PokerHand(standardDeck);
        System.out.println("Shuffling... Shuffling... Shuffling...");
        System.out.println(standardDeckPrinter.printHand(playerOnePokerHand));
        System.out.println(standardDeckPrinter.printHandStrength(pokerHandEvaluator.evaluate(playerOnePokerHand)));
    }
}
