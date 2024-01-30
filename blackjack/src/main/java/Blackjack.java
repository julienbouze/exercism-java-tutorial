public class Blackjack {

    public int parseCard(String card) {
        int value = 0;
        switch(card){
            case "ace":
                value = 11;
                break;
            case "two":
                value = 2;
                break;
            case "three":
                value = 3;
                break;
            case "four":
                value = 4;
                break;
            case "five":
                value = 5;
                break;
            case "six":
                value = 6;
                break;
            case "seven":
                value = 7;
                break;
            case "eight":
                value = 8;
                break;
            case "nine":
                value = 9;
                break;
            case "ten","jack","queen","king":
                value = 10;
                break;
            default:
                value = 0;
                break;
        }
        return value;
        //throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
    }

    public boolean isBlackjack(String card1, String card2) {
        if (parseCard(card1) + parseCard(card2) == 21){
            return true;
        }
        else {
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack == true && dealerScore < 10){
            return "W";
        }
        else if(isBlackjack == true && dealerScore > 9){
            return "S";
        }
        else if(isBlackjack == false && dealerScore == 22){
            return "P";
        }
        return "P";
        //throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17 || (handScore > 11 && handScore < 17 && dealerScore < 7)){
            return "S";
        }
        else if(handScore <= 11 || (handScore > 11 && handScore < 17 && dealerScore >= 7)){
            return "H";
        }
        return "P";
        //throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
