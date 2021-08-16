package portfolio.javamasterclass;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double A, double B) {
        int a = (int)(A * 1000);
        int b = (int)(B * 1000);

        return a == b;
    }
}
