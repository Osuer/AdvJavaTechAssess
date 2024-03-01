import java.util.ArrayList;
import java.util.HashMap;

public class Deck {

    // ===== LOOK INTO IF INITIALIZATION AT RUNTIME IS BETTER THAN INITIALIZATION WHEN OBJECT IS CREATED.
    // ===== LOOK INTO IF CONFIG FILES EXIST TO LOAD THESE CERTAIN CONFIGS?

    // LOOK INTO ENUMS FOR SUITS & VALUES ARRAY
    private final String[] suits = {"Hearts" , "Clubs" , "Diamonds" , "Spades"};
    private final String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    // private map = hashmap
    private HashMap<Integer, String> suitMap = new HashMap<Integer, String>();
    private HashMap<Integer, String> valueMap = new HashMap<Integer, String>();
    private final short size = 52;
    private boolean shuffled, completeDeck;
    private ArrayList<Card> deck;
    // Think of way to initialize different decks which might not be in this specific structure.
    // Different size / Different amount of Suits & Values


    public Deck() {
        for (int i = 0; i < suits.length ; i++) {
            suitMap.put(i,suits[i]);
        }
        for (int i = 0; i < values.length ; i++) {
            valueMap.put(i,values[i]);
        }

        // Look into stack for data structure for deck
        deck = new ArrayList<>();
        int[] suit = {0,1,2,3};
        int[] value = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 13; j++) {
                this.deck.add(new Card(suit[i], value[j]));
            }
        }
        shuffled = false;
        completeDeck = true;
    }
    public Card getCard(int index){
        return this.deck.get(index);
    }


    public short getSize(){
        return this.size;
    }
    public void removeAt(int index){
        this.deck.remove(index);
    }

    public void setDeck(ArrayList<Card> deck){
        this.deck = deck;
    }

    public void Shuffled(boolean shuffled){
        this.shuffled = shuffled;
    }

    public boolean getIsShuffled(){
        return this.shuffled;
    }

    public void CompleteDeck(boolean isCompleteDeck){
        this.completeDeck = isCompleteDeck;
    }

    public boolean getIsCompleteDeck(){
        return this.completeDeck;
    }

    public HashMap<Integer, String> getSuitmap(){
        return this.suitMap;
    }

    public HashMap<Integer, String> getValueMap(){
        return this.valueMap;
    }
}
