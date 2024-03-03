package CardGame;

import java.util.ArrayList;
import java.util.Stack;

// Interface to implement different deck shuffling algorithms
public interface Shuffler {

    public Stack<Card> shuffleDeck(ArrayList<Card> deckList);
}

