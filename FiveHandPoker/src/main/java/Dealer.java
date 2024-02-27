public class Dealer {

    public Card dealCard(Deck deck){
            Card card = deck.getCard(0);
            deck.removeAt(0);
            deck.CompleteDeck(false);
            return card;
        }
    }

