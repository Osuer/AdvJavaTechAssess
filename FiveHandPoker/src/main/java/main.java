public class main {

    public static void main(String[] args){
        Deck deck = new Deck();
        Shuffler shuffler = new Shuffler();
        //Deck shuffleddeck = shuffler.shuffleDeck(deck);
        Hand hand = new Hand(deck);
        HandEvaluator handEvaluator = new HandEvaluator();
        Printer printer = new Printer();
        printer.printHand(hand.getHand(), handEvaluator.evaluateHand(hand), deck.getValueMap(), deck.getSuitmap());
    }


}
