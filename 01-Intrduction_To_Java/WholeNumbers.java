public class WholeNumbers {
    public static void main(String[] args) {
        // int value occupies 4 bytes of memory
        // So max and min value of int is ~ -2 billion to 2 billion
        int integer1 = 44;
        System.out.println(integer1);

        // byte value occupies 1 byte of memory
        // So max and min value of int is ~ -128 to 127
        byte bytenum = 127;
        System.out.println(bytenum);

        // short value occupies 2 byte of memory
        // So max and min value of int is ~ -32,768 to 32,767
        short shortNum = 30000;
        System.out.println(shortNum);

        // long value occupies 4 byte of memory
        /*
         * So max and min value of int is ~ -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807
         */
        long longNum = 372036854775808l;
        System.out.println(longNum);
    }
}
