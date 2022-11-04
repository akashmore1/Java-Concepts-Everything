public class FloatingPrecision {
    public static void main(String[] args) {
        int intNum = 7 / 2;
        System.out.println(intNum); // return 3

        float floatNum = 7f / 2f;
        System.out.println(floatNum); // retun 3.5

        double doubleTypeNumber = (7d / 2d); // Need to specify d here as nums will be considered int
        System.out.println(doubleTypeNumber);

        // Let's see precision in float and double value
    }
}