package portfolio.javamasterclass;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer && (25 <= temperature && temperature <= 35)) {
            return true;
        }
        else return summer && (25 <= temperature && temperature <= 45);
    }
}
