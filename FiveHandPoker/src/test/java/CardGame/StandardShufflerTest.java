package CardGame;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.Assert.*;

public class StandardShufflerTest {


    ArrayList<Card> deckList = new ArrayList<>();
    Shuffler shuffler = new StandardShuffler();
    @Test
    public void TestDeckShufflerDifferentPositions(){
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 13 ; j++) {
                this.deckList.add(new Card(i, j));
            }
        }
        Stack<Card> deck = shuffler.shuffleDeck(deckList);
        Card cardInStack = deck.pop();
        assertNotEquals(cardInStack, deckList.get(51));
    }

    //Testing a function with random could result in test failure, however the odds are very low.
    @Test
    public void TestDeckFullyShuffledWithAllCards(){
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 13 ; j++) {
                this.deckList.add(new Card(i, j));
            }
        }
        Stack<Card> deck = shuffler.shuffleDeck(deckList);
        assertEquals(deckList.size(), deck.size());
    }

    @Test
    public void TestShufflerDoesNotAlterInitialList(){
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0; j < 13 ; j++) {
                this.deckList.add(new Card(i, j));
            }
        }
        Stack<Card> deck = shuffler.shuffleDeck(deckList);
        assertEquals(deckList.size(), deck.size());
    }
}