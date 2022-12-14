public class CalculateCentimeters {
    // Here we are using method overloading with different number of parameters.
    // Method overloading cannot be used only by changing return type
    // In fact we should not use method overloading, if return type is different
    // println() is good example of method overloading. It prints(String, int.. etc)
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2, 7));
        System.out.println(calcFeetAndInchesToCentimeters(4));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double cmValue = (feet * 30d + inches * 2.54d);
        return cmValue;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0 || inches > 12) {
            return -1;
        }
        double cmValue = inches * 2.54d;
        return cmValue;
    }
}
