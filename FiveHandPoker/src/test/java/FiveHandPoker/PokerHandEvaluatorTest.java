package FiveHandPoker;

import CardGame.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Stack;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class PokerHandEvaluatorTest {

    private StandardShuffler standardShufflerMock;
    private StandardDeck standardDeck;
    @Before
    public void setup(){
        standardShufflerMock = mock(StandardShuffler.class);
        standardDeck = new StandardDeck();
    }
    @Test
    public void TestHandForStraightFlush(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,0)); // 2 Of Hearts
        mockStack.push(new Card(0,1)); // 3 Of Hearts
        mockStack.push(new Card(0,2)); // 4 Of Hearts
        mockStack.push(new Card(0,3)); // 5 Of Hearts
        mockStack.push(new Card(0,4)); // 6 Of Hearts
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Straight Flush", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForFourOfAKind(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,12)); // Ace of Hearts
        mockStack.push(new Card(1,12)); // Ace of Clubs
        mockStack.push(new Card(2,12)); // Ace of Diamonds
        mockStack.push(new Card(3,12)); // Ace of Spades
        mockStack.push(new Card(0,4));  // 6 of Hearts
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Four of a Kind", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForFullHouse(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,2));  // 4 Of Hearts
        mockStack.push(new Card(1,2));  // 4 Of Clubs
        mockStack.push(new Card(2,2));  // 4 Of Diamonds
        mockStack.push(new Card(2,11)); // King Of Diamonds
        mockStack.push(new Card(3,11)); // King Of Spades
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Full House", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForFlush(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,3));  // 5 Of Hearts
        mockStack.push(new Card(0,6));  // 8 Of Hearts
        mockStack.push(new Card(0,8));  // 10 Of Hearts
        mockStack.push(new Card(0,10)); // Queen Of Hearts
        mockStack.push(new Card(0,11)); // King Of Hearts
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Flush", pokerHandEvaluator.evaluate(pokerHand));
    }
    @Test
    public void TestHandForStraight(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,3)); // 5 Of Hearts
        mockStack.push(new Card(0,4)); // 6 Of Hearts
        mockStack.push(new Card(1,5)); // 7 Of Clubs
        mockStack.push(new Card(2,6)); // 8 Of Diamonds
        mockStack.push(new Card(3,7)); // 9 Of Spades
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Straight", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForThreeOfAKind(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,3)); // 5 Of Hearts
        mockStack.push(new Card(3,3)); // 5 Of Spades
        mockStack.push(new Card(1,3)); // 5 Of Clubs
        mockStack.push(new Card(3,8)); // 10 Of Spades
        mockStack.push(new Card(3,1)); // 3 Of Spades
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Three of a Kind", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForTwoPair(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,2));  // 4 Of Hearts
        mockStack.push(new Card(1,2));  // 4 Of Clubs
        mockStack.push(new Card(1,7));  // 9 Of Clubs
        mockStack.push(new Card(2,11)); // King Of Diamonds
        mockStack.push(new Card(3,11)); // King Of Spades
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("Two Pair", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForOnePair(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,2));  // 4 Of Hearts
        mockStack.push(new Card(1,2));  // 4 Of Clubs
        mockStack.push(new Card(1,6));  // 8 Of Clubs
        mockStack.push(new Card(1,12)); // Ace Of Clubs
        mockStack.push(new Card(3,11)); // King Of Spades
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("One Pair", pokerHandEvaluator.evaluate(pokerHand));
    }

    @Test
    public void TestHandForHighCards(){
        Stack<Card> mockStack = new Stack<>();
        mockStack.push(new Card(0,2));  // 4 Of Hearts
        mockStack.push(new Card(1,3));  // 5 Of Clubs
        mockStack.push(new Card(1,6));  // 8 Of Clubs
        mockStack.push(new Card(1,12)); // Ace Of Clubs
        mockStack.push(new Card(3,11)); // King Of Spades
        when(standardDeck.shuffleDeck(standardShufflerMock)).thenReturn(mockStack);
        standardDeck.shuffleDeck(standardShufflerMock);
        HandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
        Hand pokerHand = new PokerHand(standardDeck);
        assertEquals("High Cards", pokerHandEvaluator.evaluate(pokerHand));
    }

}