package ss8.BaiTap;

public class TennisGame {

    public static final int WIN_SCORE = 4;

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            score = getEqualCaseScore(m_score1);
        } else {
            score = getWinCaseScore(m_score1, m_score2, score);
        }
        return score;
    }


    private static String getWinCaseScore(int m_score1, int m_score2, String score) {
        int tempScore;
        boolean isScoreGreaterThan4 = m_score1 >= WIN_SCORE || m_score2 >= WIN_SCORE;
        if (isScoreGreaterThan4) {
            score = getScoreGreaterThan4Case(m_score1, m_score2);
        } else {
            score = getScoreLessEqual4Case(m_score1, m_score2, score);
        }
        return score;
    }

    private static String getScoreLessEqual4Case(int m_score1, int m_score2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = m_score1;
            else {
                score += "-";
                tempScore = m_score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScoreGreaterThan4Case(int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getEqualCaseScore(int m_score1) {
        String score;
        score = switch (m_score1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
        return score;
    }
}