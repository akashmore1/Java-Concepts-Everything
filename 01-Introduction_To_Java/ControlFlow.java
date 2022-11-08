public class ControlFlow {
    public static void main(String[] args) {
        int number = 4321;
        if (number == 4322) {
            System.out.println("Condition true");
        } else {
            System.out.println("Condition false");
        }

        // 👇This is possible as well, just like JS (not recommended)
        if (number > 4000)
            System.out.println("Condition true");
    }
}