package calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator c1 = new SimpleCalculator();

        c1.setFirstNumber(44);
        c1.setSecondNumber(44);

        System.out.println(c1.getAdditionResult());
        System.out.println(c1.getDivisionResult());
        System.out.println(c1.getMultiplicationResult());
        System.out.println(c1.getSubtractionResult());
    }
}
