package portfolio.javamasterclass;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        System.out.println("*************************************************");
        for (int i=0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("*************************************************");
        for (int i=2; i<9; i++) {
            System.out.println("10000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("*************************************************");
        for (int i=8; i>=2; i--) {
            System.out.println("10000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("*************************************************");
        int count = 0;
        for (int i=10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }

            }
        }
        System.out.println("*************************************************");
        count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("*************************************************");
        System.out.println(sumOdd(1, 100));  // 2500
        System.out.println(sumOdd(-1, 100));  // -1
        System.out.println(sumOdd(100, 100));  // 0
        System.out.println(sumOdd(13, 13));  // 13
        System.out.println(sumOdd(100, -1));  // -1
        System.out.println(sumOdd(100, 1000));  // 247500
    }

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

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
