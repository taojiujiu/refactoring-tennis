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
        if (player1Score == player2Score) {
            if (player1Score >= 3) return "Deuce";
            else return transformScore(player2Score) + "-All";
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) return "Advantage player1";
            else if (minusResult == -1) return "Advantage player2";
            else if (minusResult >= 2) return "Win for player1";
            return "Win for player2";
        } else {
            return transformScore(player1Score) + "-" + transformScore(player2Score);
        }
    }

    private String transformScore(int tempScore) {
        switch (tempScore) {
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
