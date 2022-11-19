
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double min = Double.NEGATIVE_INFINITY;
        double max = Double.POSITIVE_INFINITY;

        int count = 1;

        while (count <= 10) {
            System.out.println("Enter number " + count + ":");
            int num = scanner.nextInt();
            if (num > min) {
                min = num;
            }

            if (num < max) {
                max = num;
            }

            count++;
        }

        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);

        scanner.close();
    }
}
