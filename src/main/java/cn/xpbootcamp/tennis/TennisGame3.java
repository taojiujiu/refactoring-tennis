package cn.xpbootcamp.tennis;

public class TennisGame3 implements TennisGame {

    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(int score1, int score2) {
        if (isLittleDifferentScore(score1, score2)
                && hasNotWinner(score1, score2)) {
            String[] scoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            return (score1 == score2) ? scoreNames[score1] + "-All" : scoreNames[score1] + "-" + scoreNames[score2];
        } else {
            if (score1 == score2)
                return "Deuce";
            String playerName = score1 > score2 ? player1Name : player2Name;
            return ((score1 - score2) * (score1 - score2) == 1) ? "Advantage " + playerName : "Win for " + playerName;
        }
    }

    private boolean hasNotWinner(int score1, int score2) {
        return score1 + score2 < 6;
    }

    private boolean isLittleDifferentScore(int score1, int score2) {
        return Math.max(score1, score2) < 4;
    }
}
