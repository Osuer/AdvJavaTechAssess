package CardGame;

import java.util.ArrayList;
import java.util.Stack;

public class Dealer {

    // Returns a list of Card objects to represent a players hand
    // Creates this list from a Deck object passed in
    public ArrayList<Card> dealHand(Deck deck, int handSize){
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < handSize; i++) {
            hand.add(dealCard(deck.getDeck()));
        }
        return hand;
    }
    //Helper function to pop off the top Card object from the deck stack
    private Card dealCard(Stack<Card> deck){
        return deck.pop();
    }
}

