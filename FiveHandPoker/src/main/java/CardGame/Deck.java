package CardGame;

import java.util.Stack;
// Interface to implement different card deck types from
public interface Deck {

    int getSize();
    Stack<Card> shuffleDeck(Shuffler shuffler);
    Stack<Card> getDeck();
}
