public class PoundToKilogram {
    public static void main(String[] args) {
        double weightInPound = 77d;
        double weightInKg = weightInPound * 0.45359237;
        System.out.println(weightInKg);

        /*
         * For general calculations like aboove example float and double are useful
         * But for high precision we use BigDecimal class which overcomes problem of
         * precision
         */
    }
}
