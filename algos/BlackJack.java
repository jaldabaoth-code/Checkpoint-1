public class BlackJack {
    // TODO
    public static String score(String[] bankHand, String[] playerHand) {
        int playerScore = getScore(playerHand);
        int bankScore = getScore(bankHand);
        if (bankScore > 21) {
            return "Player wins!";
        } else if (playerScore > 21 && bankScore <= 21) {
            return "Bank wins!";
        }
        if (bankScore == -1 || playerScore == -1) {
            return "BLACKJACK!";
        }
        if (playerScore >= bankScore) {
            return "Player wins!";
        } else {
            return "Bank wins!";
        }
    }

    private static int getScore(String[] cardsInHand) {
        int score = 0;
        boolean ace = false;
        for (String card : cardsInHand) {
            if (isNumber(card)) {
                score += Integer.parseInt(card);
                if (Integer.parseInt(card) == 1) {
                    ace = true;
                }
            } else {
                score += 10;
            }
        }
        if (score == 11 && ace == true && cardsInHand.length == 2) {
            return -1;
        }
        return score;
    }

    private static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
