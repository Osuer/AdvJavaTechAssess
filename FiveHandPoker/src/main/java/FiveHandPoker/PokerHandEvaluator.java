package FiveHandPoker;

import CardGame.Card;
import CardGame.Hand;
import CardGame.HandEvaluator;
import CardGame.StandardDeckValues;

import java.util.ArrayList;
public class PokerHandEvaluator implements HandEvaluator {
    public String evaluate(Hand hand) {
        ArrayList<Card> handToEvaluate = hand.getHandList();
        short handValue = -1;

        // Initializes an int array of all the card values that are in a standard 52 card deck
        // This values array is used to represent the values of the cards in a players hand
        int[] values = new int[StandardDeckValues.values().length];

        for (int i = 0; i < handToEvaluate.size(); i++) {

            // Gets the value of the card and increases the count of that value in the corresponding index
            values[handToEvaluate.get(i).getValue()]++;
        }

        // Checks for Straight and Flush first as if you have a straight or flush you can not have pairs.
        boolean straight = evaluateStraight(values), flush = evaluateFlush(handToEvaluate);
        if (flush && straight){
            handValue = 1;
        }else if (flush){
            handValue = 4;
        } else if (straight) {
            handValue = 5;
        } else {
            handValue = evaluatePairs(values);
        }

        return switch (handValue) {
            case 1 -> "Straight Flush";
            case 2 -> "Four of a Kind";
            case 3 -> "Full House";
            case 4 -> "Flush";
            case 5 -> "Straight";
            case 6 -> "Three of a Kind";
            case 7 -> "Two Pair";
            case 8 -> "One Pair";
            case 9 -> "High Cards";
            default -> "default";
        };
    }

    private boolean evaluateFlush(ArrayList<Card> handToEvaluate){
        // Gets every card in the hand and compares its suit to the previous card.
        for (int i = 0; i < handToEvaluate.size() - 1 ; i++) {
            if (handToEvaluate.get(i).getSuit() != handToEvaluate.get(i+1).getSuit()){
                return false;
            }
        }
        return true;
    }

    private boolean evaluateStraight(int[] values){
        // Starts at the lowest index in the value array and compares its value to the next four indexes.
        for (int i = 0; i < values.length - 4; i++)
        {
            if (values[i] == 1 && values[i + 1] == 1 && values[i + 2] == 1 && values[i + 3] == 1 && values[i + 4] == 1) {
                return true;
            }
        }
        return false;
    }

    private short evaluatePairs(int[] values){
        int sameCards1 = 1,sameCards2 = 1;
        for (int i = values.length - 1; i >= 0; i--)
        {
            // Checks if there are 4 of any card value
            if (values[i] == 4){
                return 2;
            }

            // Checks if there is more than 1 of any card value
            if (values[i] > sameCards1) {

                // Deals specifically with a full house case
                // If 2 cards of the same value were found, but now 3 card of the same value were also found.
                if (sameCards1 != 1) {
                    sameCards2 = sameCards1;
                }

                // Set the amount of cards with the same value
                sameCards1 = values[i];
            }
            // Deals with a two pair case if 2 cards of the same value were already found and 2 are found again it will move into this else if
            else if (values[i] > sameCards2)
            {
                sameCards2 = values[i];
            }
        }

        // Checks for 3 of a kind and full house cases
        if (sameCards1 == 3) {
            if (sameCards2 == 2) {
                return 3;
            } else {
                return 6;
            }
        }
        // Checks for two pair and one pair case
        else if (sameCards1 == 2) {
            if (sameCards2 == 2) {
                return 7;
            } else {
                return 8;
            }
        }

        // If there are no cards that are the same return high cards case
        return 9;
    }
}

