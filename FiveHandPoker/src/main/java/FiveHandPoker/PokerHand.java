package FiveHandPoker;

import CardGame.Card;
import CardGame.Dealer;
import CardGame.Deck;
import CardGame.Hand;

import java.util.ArrayList;

public class PokerHand implements Hand {
    private final ArrayList<Card> handList;
    private final static short handSize = 5;
    public PokerHand(Deck deck){
        Dealer dealer = new Dealer();
        handList = dealer.dealHand(deck, handSize);
    }

    @Override
    public ArrayList<Card> getHandList() {
        return this.handList;
    }

}
