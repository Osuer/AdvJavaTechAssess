import java.util.ArrayList;

// ====== CONSIDER WRITING EVALUATOR CLASS THEN RE-WRITE THIS LOGIC INTO A POKE EVALUATOR CLASS THAT INHERITS FROM EVALUATOR CLASS
public class HandEvaluator {

    HandEvaluator(){

    }

    public String evaluateHand(Hand hand) {
        ArrayList<Card> handToEvaluate = hand.getHand();
        int handValue = -1;
        int[] values = new int[13];
        for (int i = 0; i < handToEvaluate.size(); i++) {
            values[handToEvaluate.get(i).getValue()]++;
        }

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
        for (int i = 0; i < handToEvaluate.size() - 1 ; i++) {
            if (handToEvaluate.get(i).getSuit() != handToEvaluate.get(i+1).getSuit()){
                return false;
            }
        }
        return true;
    }

    private boolean evaluateStraight(int[] values){
        for (int i = 0; i < values.length - 4; i++)
        {
            if (values[i] == 1 && values[i + 1] == 1 && values[i + 2] == 1 && values[i + 3] == 1 && values[i + 4] == 1) {
                return true;
            }
        }
        return false;
    }

    private int evaluatePairs(int[] values){
        int sameCards1 = 1,sameCards2 = 1;
        for (int i = 12; i >= 0; i--)
        {
            if (values[i] == 4){
                return 2;
            }
            if (values[i] > sameCards1) {
                // Deals specifically with a full house case.
                if (sameCards1 != 1) {
                    sameCards2 = sameCards1;
                }
                sameCards1 = values[i];
            } else if (values[i] > sameCards2) // Deals with 2 pair case & full house case.
            {
                sameCards2 = values[i];
            }
        }

        if (sameCards1 == 3) {
            if (sameCards2 == 2) {
                return 3;
            } else {
                return 6;
            }
        } else if (sameCards1 == 2) {
            if (sameCards2 == 2) {
                return 7;
            } else {
                return 8;
            }
        }
        return 9;
    }
}
