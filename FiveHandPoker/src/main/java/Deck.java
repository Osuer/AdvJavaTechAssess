import java.util.ArrayList;

public class Deck {

    // Way of setting final after instantiating object?
    private final short size = 52;
    private boolean shuffled, completeDeck;
    private ArrayList<Card> deck;
    // Think of way to initialize different decks which might not be in this specific structure.
    // Different size / Different amount of Suits & Values

    // Setup map to define 1 = Clubs, 2 = Spades for suits & values for printing purposes
    // Make map setup dynamic with constructor
    public Deck() {
        deck = new ArrayList<>();
        int[] suit = {1,2,3,4};
        int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
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
}
