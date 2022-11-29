package greatest_common_divisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int number = first < second ? first : second;
        int result = -1;

        for (int i = 1; i <= number; i++) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
        }

        return result;
    }
}
