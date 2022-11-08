public class OperatorChallenge {
    public static void main(String[] args) {
        double number1 = 20.0;
        double number2 = 80.0;

        double result1 = (number1 + number2) * 100;

        int remainder = (int) (result1 % 40);

        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println("isRemainderZero: " + isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}