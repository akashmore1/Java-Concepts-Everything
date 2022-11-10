public class Methods {
    public static void main(String[] args) {
        int finalScore1 = calculateScore(true, 100, 44);
        int finalScore2 = calculateScore(true, 10, 470);
        System.out.println(finalScore1 + " " + finalScore2);
    }

    public static int calculateScore(boolean gameOver, int score, int level) {
        if (gameOver) {
            int finalScore = score * level;
            return finalScore;
        }
        return -1;
    }
}