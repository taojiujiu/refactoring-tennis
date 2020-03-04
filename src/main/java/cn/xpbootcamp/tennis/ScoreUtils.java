package cn.xpbootcamp.tennis;

class ScoreUtils {

    static String transformScore(int score) {
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
