// Double is said to be default type in float and double

public class FloatDouble {
    public static void main(String[] args) {
        // float have 4 byte of memory
        float floatingNumber = 44.22f;
        // In above case if we don't specify 'f' at the end, we get an error
        System.out.println(floatingNumber);

        // double have 8 byte of memory
        double doubleTypeNumber = 77.432;
        /*
         * In above case, we don't need to specify 'd' at the end, as default value is
         * double
         */
        System.out.println(doubleTypeNumber);
    }
}
