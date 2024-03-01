import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandEvaluatorTest {
    Deck unshuffledDeck;
    HandEvaluator handEvaluator = new HandEvaluator();

    @Test
    public void TestHandForStraightFlush(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        // 8 -> Queen of Hearts
        for (int i = 6; i < 11; i++) {
            forcedHand.add(unshuffledDeck.getCard(i));
        }
        Hand myHand = new Hand(forcedHand);
        assertEquals("Straight Flush", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForFourOfAKind(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(2));  // 4 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(15)); // 4 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(28)); // 4 Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(33)); // 9 Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(41)); // 4 Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("Four of a Kind", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForFullHouse(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(2));  // 4 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(15)); // 4 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(28)); // 4 Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(37)); // King Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(50)); // King Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("Full House", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForFlush(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(3));  // 5 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(6)); // 8 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(8)); // 10 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(10)); // Queen Of Hearts
        forcedHand.add(unshuffledDeck.getCard(11)); // King Of Hearts
        Hand myHand = new Hand(forcedHand);
        assertEquals("Flush", handEvaluator.evaluateHand(myHand) );
    }
    @Test
    public void TestHandForStraight(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(3));  // 5 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(30)); // 6 Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(31)); // 7 Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(19)); // 8 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(46)); // 9 Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("Straight", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForThreeOfAKind(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(2));  // 4 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(15)); // 4 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(28)); // 4 Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(38)); // Ace Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(40)); // 3 Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("Three of a Kind", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForTwoPair(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(2));  // 4 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(15)); // 4 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(20)); // 9 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(37)); // King Of Diamonds
        forcedHand.add(unshuffledDeck.getCard(50)); // King Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("Two Pair", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForOnePair(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(2));  // 4 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(15)); // 4 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(19)); // 8 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(25)); // Ace Of Clubs
        forcedHand.add(unshuffledDeck.getCard(50)); // King Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("One Pair", handEvaluator.evaluateHand(myHand) );
    }

    @Test
    public void TestHandForHighCards(){
        unshuffledDeck = new Deck();
        ArrayList<Card> forcedHand = new ArrayList<>();
        forcedHand.add(unshuffledDeck.getCard(2));  // 4 Of Hearts
        forcedHand.add(unshuffledDeck.getCard(16)); // 5 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(19)); // 8 Of Clubs
        forcedHand.add(unshuffledDeck.getCard(25)); // Ace Of Clubs
        forcedHand.add(unshuffledDeck.getCard(50)); // King Of Spades
        Hand myHand = new Hand(forcedHand);
        assertEquals("High Cards", handEvaluator.evaluateHand(myHand) );
    }
}