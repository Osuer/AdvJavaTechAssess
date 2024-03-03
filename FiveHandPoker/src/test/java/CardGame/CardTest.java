package CardGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    Card card = new Card(2,5);

    @Test
    public void TestGetCardSuit(){
        assertEquals(card.getSuit(),2);
    }

    @Test
    public void TestGetCardValue(){
        assertEquals(card.getValue(),5);
    }

}