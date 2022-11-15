public class CountingHours {
    public static void main(String[] args) {
        String result = getDurationString(43, 43);
        System.out.println(result);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }

        int totalHours = minutes / 60;
        int totalMinutes = minutes % 60;

        String resultString = totalHours + "h " + totalMinutes + "m " + seconds + "s";
        return resultString;
    }
}