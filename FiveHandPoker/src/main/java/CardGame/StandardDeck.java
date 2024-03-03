package CardGame;

import java.util.*;
// Implementation of a standard 52 card deck
public class StandardDeck implements Deck {
    private final ArrayList<Card> standardDeckList;
    private Stack<Card> deck = new Stack<>();
    public StandardDeck() {
        standardDeckList = new ArrayList<>();
        // Uses standard 52 card deck SUIT and VALUE enum classes to instantiate a list of 52 cards
        for (int i = 0; i < StandardDeckSuits.values().length ; i++){
            for (int j = 0; j < StandardDeckValues.values().length ; j++) {
                Card card = new Card(i,j);
                this.standardDeckList.add(new Card(i,j));
                this.deck.push(card);
            }
        }
    }
    @Override
    public int getSize(){
        return deck.size();
    }

    // Shuffles the deck from it's normal standard shuffled state
    // Assumes deck is always shuffled from standard state
    // Stack class is used as we only want to be able to access the top card of the deck
    @Override
    public Stack<Card> shuffleDeck(Shuffler shuffler){
        this.deck = shuffler.shuffleDeck(standardDeckList);
        return getDeck();
    }

    @Override
    public Stack<Card> getDeck(){
        return this.deck;
    }

}
