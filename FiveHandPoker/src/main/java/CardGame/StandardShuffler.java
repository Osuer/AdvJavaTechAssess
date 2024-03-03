package CardGame;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class StandardShuffler implements Shuffler {
    @Override
    public Stack<Card> shuffleDeck(ArrayList<Card> cardList) {
        Stack<Card> shuffledDeck = new Stack<>();

        // Create a new temporary list to remove card objects from, this ensures the card list passed state is not altered.
        ArrayList<Card> tempList = new ArrayList<>(cardList);

        // Gets the initial size of the card list to ensure all card objects from it are shuffled in.
        int initialDeckSize = cardList.size();
        Random rand = new SecureRandom();
        int randInt;

        // Loop through full card list
        for (int i = 0; i < initialDeckSize; i++) {

            // Generates a random int from the current size of the card list
            // Card list size reduces as cards are removed
            randInt = rand.nextInt(tempList.size());

            // Pushes card object at the random index to a stack
            shuffledDeck.push(tempList.get(randInt));

            // Removes card from list
            tempList.remove(randInt);
        }
        return shuffledDeck;
    }
}
