public class PrimitiveDatatypesRecap {
    public static void main(String[] args) {
        // string is a datatype in java which is not primitive type
        // It's actually a class
        String myString = "This is a a string";
        System.out.println(myString);

        myString = myString + " and this is more";
        System.out.println(myString);

        // Just like js, when we add stringNumber to a number, we get concatenation
        int num = 42;
        String numStr = "77";
        numStr = num + numStr;
        System.out.println(numStr); // gives 4277

        // We can delete characters from string but
        // that's not completely true
        // Strings in java are immutable
        // When we make changes in a string, we are actually creating a new string
    }
}