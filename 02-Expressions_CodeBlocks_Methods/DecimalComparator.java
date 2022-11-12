public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double roundedNum1 = (double) ((int) (num1 * 1000.0) / 1000.0);
        double roundedNum2 = (double) ((int) (num2 * 1000.0) / 1000.0);

        if (roundedNum1 == roundedNum2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, 3.175);
    }
}