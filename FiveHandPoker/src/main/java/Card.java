public class Card {

    private final int value;
    private final int suit;

    public Card(int suit, int value){
        this.value = value;
        this.suit = suit;
    }

    public int getValue(){
        return this.value;
    }

    public int getSuit(){
        return this.suit;
    }
}
