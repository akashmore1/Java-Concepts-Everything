public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
            return false;
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
            return false;
        }
    }
}