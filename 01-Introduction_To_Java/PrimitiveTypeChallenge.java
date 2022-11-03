public class PrimitiveTypeChallenge {
    public static void main(String[] args) {
        byte byteNumber = 60;
        short shortNumber = 10000;
        int intNumber = 400000;

        long sum = (long) (50000 + 10 * (byteNumber + shortNumber + intNumber));
        System.out.println(sum);
    }
}
