package portfolio.javamasterclass;

public class MinutesToYearsDaysCalculator {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {

            long hours = (int) (minutes / 60);
            long days = (int) (hours / 24);
            long remainingDays = (int) (days % 365);
            long years = (int)(days / 365);

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
