package CardGame;

public class Card {

    private final int value;
    private final int suit;

    //Card contains 2 int values to represent suit and value of the card
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
