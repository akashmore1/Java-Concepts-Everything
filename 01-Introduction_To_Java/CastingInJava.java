public class CastingInJava {
    public static void main(String[] args) {

        byte num = 44;

        // here in java expression by default returns an integer.
        // If we want to store value in byte or something other than int, we need to
        // cast it
        byte half = (byte) (num / 2);
        System.out.println(half);

        int halfInt = num / 2;
        System.out.println(halfInt);

        float halfDoubleType = (float) (num / 2);
    }
}