package portfolio.javamasterclass;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("***************************************");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("***************************************");
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
        System.out.println("***************************************");
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
        System.out.println("***************************************");
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in number 4 is " + sumDigits(4));
        System.out.println("Sum of digits in number 32123 is " + sumDigits(32123));
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
