import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 numbers to get their sum: ");

        for (int i = 0; i < 10; i++) {
            boolean hasNextInt = scanner.hasNextInt();
            scanner.nextLine();
            if (hasNextInt) {
                int userNum = scanner.nextInt();
                sum += userNum;
            } else {
                System.out.println("Invalid number");
            }

        }

        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
