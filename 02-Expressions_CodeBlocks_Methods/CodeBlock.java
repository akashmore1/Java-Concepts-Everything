public class CodeBlock {
    public static void main(String[] args) {
        boolean gameOver = true;
        int finalScore = 4;
        if (gameOver) {
            String status = "Win";
            finalScore = 100;
            System.out.println(finalScore); // Prints 100
        }
        System.out.println(finalScore); // Prints 100
        // We cannot use status variable outside if block
    }
}
