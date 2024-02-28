import java.util.ArrayList;

public class Dealer {

    public ArrayList<Card> dealHand(Deck deck, int handSize){
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < handSize; i++) {
            hand.add(dealCard(deck));
        }
        return hand;
    }
    private Card dealCard(Deck deck){
        Card card = deck.getCard(0);
        deck.removeAt(0);
        deck.CompleteDeck(false);
        return card;
    }
}

