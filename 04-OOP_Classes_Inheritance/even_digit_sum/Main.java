package even_digit_sum;

public class Main {
    public static void main(String[] args) {
        int a = EvenDigitSum.getEvenDigitSum(1234567);
        System.out.println(a);

        EvenDigitSum b = new EvenDigitSum();
        b.test();

        int c = b.getEvenDigitSum(22);
        System.out.println(c);

        EvenDigitSum obj1 = new EvenDigitSum();
        EvenDigitSum obj2 = new EvenDigitSum();

        obj1.a = 5;
        obj1.b = 5;

        System.out.println(obj1.a + " " + obj1.b);

        obj2.a = 10;
        obj2.b = 10;

        System.out.println(obj1.a + " " + obj1.b);
    }

}
