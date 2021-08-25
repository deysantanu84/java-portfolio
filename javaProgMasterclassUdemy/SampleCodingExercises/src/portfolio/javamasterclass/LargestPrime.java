package portfolio.javamasterclass;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;
        boolean isPrime = true;
        for (int i = 2; i <= number; i++){
            // is a factor?
            if (number % i == 0) {
                // is prime ?
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime && i > largestPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}
