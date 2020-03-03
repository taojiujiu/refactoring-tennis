package cn.xpbootcamp.tennis;

public class TennisGame {

    public String getScore(int score1, int score2) {
        if (score1 == score2) {
            if (score1 >= 3) return "Deuce";
            else return transformScore(score2) + "-All";
        }

        if (Math.max(score1, score2) >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) return "Advantage player1";
            else if (minusResult == -1) return "Advantage player2";
            else if (minusResult >= 2) return "Win for player1";
            return "Win for player2";
        }

        return transformScore(score1) + "-" + transformScore(score2);

    }

    private String transformScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                throw new RuntimeException("");
        }
    }
}
