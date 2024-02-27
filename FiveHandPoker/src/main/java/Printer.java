import java.util.HashMap;

public class Printer {

    private HashMap<Integer, String> suitMap = new HashMap<Integer, String>();
    private HashMap<Integer, String> valueMap = new HashMap<Integer, String>();

    public Printer(){
        String[] suits = {"Hearts" , "Clubs" , "Diamonds" , "Spades"};
        String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        for (int i = 0; i < suits.length ; i++) {
            suitMap.put(i,suits[i]);
        }
        for (int i = 0; i < values.length ; i++) {
            valueMap.put(i,values[i]);
        }
    }
    public void printDeck(Deck deck){
        for (int i = 0; i < deck.getSize() - 1; i++) {
            System.out.print(valueMap.get(deck.getCard(i).getValue() - 1 ) + " Of " + suitMap.get(deck.getCard(i).getSuit() - 1));
            System.out.println();
        }
    }

    public void printMaps(){
        System.out.println(suitMap);
        System.out.println(valueMap);
    }

}
