import java.util.ArrayList;
import java.util.Arrays;

// ===== MAKE HAND CLASS AND 2 CHILDREN - POKERHAND - BADUGIHAND
public class Hand {

    private final ArrayList<Card> hand;
    Hand(Deck deck) {
        Dealer dealer = new Dealer();
        hand = dealer.dealHand(deck, 5);
    }

    Hand(ArrayList<Card> hand){
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }




}
