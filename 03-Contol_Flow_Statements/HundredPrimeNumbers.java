public class HundredPrimeNumbers {
    public static void main(String[] args) {
        printNPrimeNumbers(100);
    }

    public static void printNPrimeNumbers(int count) {
        int num = 2;
        int counter = 0;
        // This a while loop
        // May require modifications in code.
        while (counter < count) {
            if (isPrimeNumber(num)) {
                System.out.println(num);
                num++;
                counter++;
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        int half = (int) ((num / 2) + 2);

        for (int i = 2; i <= half; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
