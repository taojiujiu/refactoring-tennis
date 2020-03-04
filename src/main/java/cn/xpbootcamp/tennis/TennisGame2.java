package cn.xpbootcamp.tennis;

public class TennisGame2 implements TennisGame {
    private String P1res = "";
    private String P2res = "";

    public String getScore(int P1point, int P2point) {
        String score = "";
        if (P1point == P2point) return equalCase(P1point);

        if (Math.max(P1point, P2point) < 4) {
            return transformScore(P1point) + "-" + transformScore(P2point);
        }
        score = advantageCase(P1point, P2point, score);

        score = winCase(P1point, P2point, score);
        return score;
    }

    private String winCase(int P1point, int P2point, String score) {
        if (P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2) {
            score = "Win for player1";
        }
        if (P2point >= 4 && P1point >= 0 && (P2point - P1point) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String advantageCase(int P1point, int P2point, String score) {
        if (P1point > P2point && P2point >= 3) {
            score = "Advantage player1";
        }

        if (P2point > P1point && P1point >= 3) {
            score = "Advantage player2";
        }
        return score;
    }

    private String littleScoreCase(int P1point, int P2point, String score) {
        if (Math.max(P1point, P2point) < 4) {
            score = transformScore(P1point) + "-" + transformScore(P2point);
        }
        return score;
    }

    private String equalCase(int P1point) {
        String score = "";
        if (P1point < 4) {
            if (P1point == 0)
                score = "Love";
            if (P1point == 1)
                score = "Fifteen";
            if (P1point == 2)
                score = "Thirty";
            score += "-All";
        }
        if (P1point >= 3)
            score = "Deuce";
        return score;
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
