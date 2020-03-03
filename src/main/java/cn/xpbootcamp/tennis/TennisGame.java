package cn.xpbootcamp.tennis;

public class TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    public void setPlayerScore(String playerName) {
        if (playerName.equals("player1"))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {

            score = transformScore(player1Score).append("-").append(transformScore(player2Score));
        }
        return score.toString();
    }

    private StringBuilder transformScore(int tempScore) {
        switch (tempScore) {
            case 0:
                return new StringBuilder("Love");
            case 1:
                return new StringBuilder("Fifteen");
            case 2:
                return new StringBuilder("Thirty");
            case 3:
                return new StringBuilder("Forty");
            default:
                throw new RuntimeException("");
        }
    }
}
