package portfolio.javamasterclass;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int digit = 0;
        int count = 0;
        while (number > 0) {
            digit = number % 10;
            if (count == 0) {
                sum += digit;
            }
            number /= 10;
            count++;
        }
        sum += digit;
        return sum;
    }
}
