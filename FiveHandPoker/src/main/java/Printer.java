import java.util.ArrayList;
import java.util.HashMap;

public class Printer {
    // Think of ways to instantiate a printer based on other types of card decks.

    public Printer(){

    }

    public void printHand(ArrayList<Card> FiveHandCard, String handStrength, HashMap<Integer, String> valueMap, HashMap<Integer, String> suitMap){
        for (int i = 0; i < FiveHandCard.size(); i++) {
            printCard(FiveHandCard.get(i), valueMap, suitMap);
        }
        System.out.println("You Have: " + handStrength);
    }

    private void printCard(Card card, HashMap<Integer, String> valueMap, HashMap<Integer, String> suitMap){
        System.out.println(valueMap.get(card.getValue()) + " Of " + suitMap.get(card.getSuit()));
    }

}
