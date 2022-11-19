import java.util.Scanner;

public class Input {
    public static int calcAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int yearOfBirth = scanner.nextInt();

        scanner.close();
        return 2022 - yearOfBirth;
    }

    public static void main(String[] args) {
        calcAge();
    }
}
