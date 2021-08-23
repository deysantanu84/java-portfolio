package portfolio.javamasterclass;

public class LastDigitChecker {
    public static boolean isValid(int X) {
        return X >= 10 && X <= 1000;
    }

    public static boolean hasSameLastDigit(int A, int B, int C) {
        if (!isValid(A) || !isValid(B) || !isValid(C)) {
            return false;
        }

        int digit1 = A % 10;
        int digit2 = B % 10;
        int digit3 = C % 10;

        return (digit1 == digit2) || (digit2 == digit3) || (digit3 == digit1);
    }
}
