public class CodeBlock {
    public static void main(String[] args) {
        boolean gameOver = true;

        if (gameOver) {
            int finalScore = 100;
            System.out.println(finalScore);
        }

        // We cannot use finalScore variable outside if block
    }
}
