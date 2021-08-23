package portfolio.javamasterclass;

public class SharedDigit {
    public static boolean hasSharedDigit(int A, int B) {
        if ((A < 10 || A > 99) || (B < 10 || B > 99)) {
            return false;
        }

        while (A > 0) {
            int temp = B;
            int digit = A % 10;
            while (temp > 0) {
                int digit1 = temp % 10;
                if (digit == digit1) {
                    return true;
                }
                temp /= 10;
            }
            A /= 10;
        }
        return false;
    }
}
