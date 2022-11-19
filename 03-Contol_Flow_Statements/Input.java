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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        int age = calcAge();

        System.out.println(userName + " your age is " + age);
        scanner.close();
    }
}
