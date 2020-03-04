package cn.xpbootcamp.tennis;

import static cn.xpbootcamp.tennis.ScoreUtils.transformScore;

public class TennisGame2 implements TennisGame {

    public String getScore(int P1point, int P2point) {
        if (P1point == P2point) return equalCase(P1point);
        if (Math.max(P1point, P2point) < 4) return transformScore(P1point) + "-" + transformScore(P2point);
        if (Math.abs(P1point - P2point) == 1) return advantageCase(P1point, P2point);
        if (Math.abs(P1point - P2point) >= 2) return winCase(P1point, P2point);
        throw new RuntimeException("");
    }

    private String winCase(int P1point, int P2point) {
        if (P1point>P2point) {
            return  "Win for player1";
        }else  {
            return  "Win for player2";
        }
    }

    private String advantageCase(int P1point, int P2point) {
        if (P1point > P2point) {
            return "Advantage player1";
        }

        if (P2point > P1point) {
            return "Advantage player2";
        }
        throw new RuntimeException("");
    }

    private String equalCase(int P1point) {
        if (P1point < 3) {
            return transformScore(P1point) + "-All";
        } else return "Deuce";
    }
}


