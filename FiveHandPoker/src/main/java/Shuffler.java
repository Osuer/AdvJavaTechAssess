import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shuffler {
    public void shuffleDeck(Deck deck){
        Random rand = new Random();
        ArrayList<Card> tempDeck = new ArrayList<>();
        int tempSize = deck.getSize();
        int randInt;
        for (int i = 0; i < deck.getSize(); i++) {
            randInt = rand.nextInt(tempSize);
            tempDeck.add(deck.getCard(randInt));
            deck.removeAt(randInt);
            tempSize--;
        }
        deck.setDeck(tempDeck);
    }
}
