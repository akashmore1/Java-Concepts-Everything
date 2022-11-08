public class LogicalAndOr {
    public static void main(String[] args) {
        // Logical And
        // Students get grade A when score is in between 90 and 100
        int score1 = 70;
        int score2 = 94;

        if (score1 > 90 && score1 <= 100) {
            System.out.println("Grade A");
        }

        if (score2 > 90 && score2 <= 100) {
            System.out.println("Grade A");
        }
    }
}