package even_digit_sum;

public class EvenDigitSum {

    static int a = 2;
    int b = 3;

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int tempNum = 0;

        while (number != 0) {
            tempNum = number % 10;
            if (tempNum % 2 == 0) {
                sum += tempNum;
            }
            number /= 10;
        }
        return sum;
    }

    public int test() {
        getEvenDigitSum(4);
        return 1;
    }
}
