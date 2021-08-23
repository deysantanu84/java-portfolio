package portfolio.javamasterclass;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int temp = Math.abs(number);
        int reverse = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reverse *= 10;
            reverse += digit;
            temp /= 10;
        }

        return reverse == Math.abs(number);
    }
}
