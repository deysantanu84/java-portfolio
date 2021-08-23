package portfolio.javamasterclass;

public class NumberToWords {
    public static int reverse(int number) {
        int reverse = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            int digit = temp % 10;
            reverse *= 10;
            reverse += digit;
            temp /= 10;
        }
        if (number < 0){
            return -reverse;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0){
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        } else {
            return 1;
        }
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number > 0) {
            int temp = reverse(number);
            while (temp > 0) {
                int digit = temp % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                }
                temp /= 10;
            }
        } else {
            System.out.println("Zero");
        }
        int count = getDigitCount(number);
        int count1 = getDigitCount(reverse(number));
        while (count > count1) {
            System.out.println("Zero");
            count--;
        }
    }
}
