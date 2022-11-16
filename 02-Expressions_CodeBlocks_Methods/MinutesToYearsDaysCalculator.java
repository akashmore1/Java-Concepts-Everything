public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long totalDays = minutes / (24 * 60);

            long years = totalDays / 365;
            long remainingDays = totalDays % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}