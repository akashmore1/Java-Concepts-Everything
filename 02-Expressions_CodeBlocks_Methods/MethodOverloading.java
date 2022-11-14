public class MethodOverloading {
    public static void main(String[] args) {
        calcAge(2022);
        calcAge(1998, "Akash");
        calcAge();
    }

    public static int calcAge(int currentYear) {
        return currentYear - 1;
    }

    public static int calcAge(int birthYear, String name) {
        System.out.println("name: " + name);
        return birthYear - 1;
    }

    public static int calcAge() {
        return 2022 - 1998;
    }
}
