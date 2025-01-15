package ss8.BaiTap;

public class TennisGame {

    public static final int THRESHOLD = 4;

    public static String getScore(String player1Name, String player2Name, int p_score1, int p_score2) {
        String score = "";
        if (p_score1 == p_score2) {
            score = getEqualCaseScore(p_score1);
        } else {
            score = getWinCaseScore(p_score1, p_score2, score);
        }
        return score;
    }

    private static String getWinCaseScore(int p_score1, int p_score2, String score) {
        boolean isScoreGreaterThan4 = p_score1 >= THRESHOLD || p_score2 >= THRESHOLD;
        if (isScoreGreaterThan4) {
            score = getScoreGreaterThan4Case(p_score1, p_score2);
        } else {
            score = getScoreLessEqual4Case(p_score1, p_score2, score);
        }

        return score;
    }

    private static String getScoreLessEqual4Case(int p_score1, int p_score2, String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = p_score1;
            else {
                scoreBuilder.append("-");
                tempScore = p_score2;
            }
            switch (tempScore) {
                case 0:
                    scoreBuilder.append("Love");
                    break;
                case 1:
                    scoreBuilder.append("Fifteen");
                    break;
                case 2:
                    scoreBuilder.append("Thirty");
                    break;
                case 3:
                    scoreBuilder.append("Forty");
                    break;
            }
        }
        score = scoreBuilder.toString();
        return score;
    }

    private static String getScoreGreaterThan4Case(int p_score1, int p_score2) {
        String score;
        int scoreDiff = p_score1 - p_score2;
        if (scoreDiff == 1) score = "Advantage player1";
        else if (scoreDiff == -1) score = "Advantage player2";
        else if (scoreDiff >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getEqualCaseScore(int p_score1) {
        String score;
        score = switch (p_score1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
        return score;
    }
}