package portfolio.javamasterclass;

public class SumOdd {
    public static boolean isOdd(int n) {
        if (n <= 0) {
            return false;
        } else return n % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
