package CardGame;

public class StandardDeckPrinter implements Printer {
    StandardDeckSuits[] suits = StandardDeckSuits.values();
    StandardDeckValues[] values = StandardDeckValues.values();
    public String printHand(Hand hand){
        String toPrint = "Your hand: ";
        for (int i = 0; i < hand.getHandList().size(); i++) {
            toPrint += printCard(hand.getHandList().get(i));
        }
        return toPrint;
    }

    public String printHandStrength(String handStrength){

        return "You have: " + handStrength;
    }

    // Gets the corresponding ENUM from the populated array and prints out it's formatted value
    private String printCard(Card card){
        return values[card.getValue()].printValue + (char) suits[card.getSuit()].printSuit + " ";
    }


}
