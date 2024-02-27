import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    Deck deck = new Deck();
    @Test
    public void getTopCard() {
        assertEquals(1 , deck.getTopCard().getSuit());
        assertEquals(1 , deck.getTopCard().getValue());
    }
    @Test
    public void getBottomCard(){
        assertEquals(4, deck.getBottomCard().getSuit());
        assertEquals(13, deck.getBottomCard().getValue());
    }
    @Test
    public void getCard(){
       assertEquals(13,deck.getCard(51).getValue());
       assertEquals(4,deck.getCard(51).getSuit());
    }
}