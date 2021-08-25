package portfolio.javamasterclass;

public class Main {
    public static void main(String[] args) {
        // SpeedConverter
        System.out.println("-------------------------------------");
        SpeedConverter.printConversion(1609);
        SpeedConverter.printConversion(1000000);

        // MegaBytesConverter
        System.out.println("-------------------------------------");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        // BarkingDog
        System.out.println("-------------------------------------");
        System.out.println(BarkingDog.shouldWakeUp(true, 1)); // true
        System.out.println(BarkingDog.shouldWakeUp(false, 2)); // false
        System.out.println(BarkingDog.shouldWakeUp(true, 8));  // false
        System.out.println(BarkingDog.shouldWakeUp(true, -1));  // false

        // LeapYear
        System.out.println("-------------------------------------");
        System.out.println(LeapYear.isLeapYear(-1600));  // false
        System.out.println(LeapYear.isLeapYear(1600));  // true
        System.out.println(LeapYear.isLeapYear(2017));  // false
        System.out.println(LeapYear.isLeapYear(2000));  // true
        System.out.println(LeapYear.isLeapYear(1924));  // true
        System.out.println(LeapYear.isLeapYear(1800));  // false

        // DecimalComparator
        System.out.println("-------------------------------------");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));  // true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));  // false
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));  // true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));  // false

        // EqualSumChecker
        System.out.println("-------------------------------------");
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));  // false
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));  // true
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));  // true

        // TeenNumberChecker
        System.out.println("-------------------------------------");
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));  // true
        System.out.println(TeenNumberChecker.hasTeen(25, 15, 42));  // true
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));  // false

        // AreaCalculator
        System.out.println("-------------------------------------");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));

        // MinutesToYearsDaysCalculator
        System.out.println("-------------------------------------");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        MinutesToYearsDaysCalculator.printYearsAndDays(-525600);

        // IntEqualityPrinter
        System.out.println("-------------------------------------");
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);

        // PlayingCat
        System.out.println("-------------------------------------");
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));

        // FlourPackProblem
        System.out.println("***********************************");
        System.out.println(FlourPackProblem.canPack(1, 0, 4));  // false
        System.out.println(FlourPackProblem.canPack(1, 0, 5));  // true
        System.out.println(FlourPackProblem.canPack(0, 5, 4));  // true
        System.out.println(FlourPackProblem.canPack(2, 2, 11));  // true
        System.out.println(FlourPackProblem.canPack(-3, 2, 12));  // false
        System.out.println(FlourPackProblem.canPack(2, 1, 5));  // true
        System.out.println(FlourPackProblem.canPack(2, 10, 18));  // true
        System.out.println(FlourPackProblem.canPack(3, 2, -12));  // false

        // NumberToWords
        System.out.println("***************************************");
        System.out.println(NumberToWords.getDigitCount(0)); // 1
        System.out.println(NumberToWords.getDigitCount(123)); // 3
        System.out.println(NumberToWords.getDigitCount(-12)); // -1
        System.out.println(NumberToWords.getDigitCount(5200)); // 4
        System.out.println("***************************************");
        System.out.println(NumberToWords.reverse(-121)); // -121
        System.out.println(NumberToWords.reverse(1212)); // 2121
        System.out.println(NumberToWords.reverse(1234)); // 4321
        System.out.println(NumberToWords.reverse(100)); // 1
        System.out.println("***************************************");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(0);

        // NumberPalindrome
        System.out.println("***************************************");
        System.out.println(NumberPalindrome.isPalindrome(-1221)); // true
        System.out.println(NumberPalindrome.isPalindrome(707)); // true
        System.out.println(NumberPalindrome.isPalindrome(11212)); // false

        // FirstAndLastDigitSum
        System.out.println("***************************************");
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(252));  // 4
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(257));  // 9
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(0));  // 0
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(5));  // 10
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(-10));  // -1

        // EvenDigitSum
        System.out.println("***************************************");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));  // 20
        System.out.println(EvenDigitSum.getEvenDigitSum(252));  // 4
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));  // -1

        // SharedDigit8
        System.out.println("***************************************");
        System.out.println(SharedDigit.hasSharedDigit(12, 23));  // true
        System.out.println(SharedDigit.hasSharedDigit(9, 99));  // false
        System.out.println(SharedDigit.hasSharedDigit(15, 55));  // true

        // LastDigitChecker
        System.out.println("***************************************");
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));  // true
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));  // true
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));  // false

        // GreatestCommonDivisor
        System.out.println("***************************************");
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));  // 5
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));  // 6
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));  // -1
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));  // 9

        // AllFactors
        System.out.println("***************************************");
        AllFactors.printFactors(6);
        AllFactors.printFactors(32);
        AllFactors.printFactors(10);
        AllFactors.printFactors(-1);

        // PerfectNumber
        System.out.println("***************************************");
        System.out.println(PerfectNumber.isPerfectNumber(6)); // true
        System.out.println(PerfectNumber.isPerfectNumber(28)); // true
        System.out.println(PerfectNumber.isPerfectNumber(5)); // false
        System.out.println(PerfectNumber.isPerfectNumber(-1)); // false

        // SumOdd
        System.out.println("*************************************************");
        System.out.println(SumOdd.sumOdd(1, 100));  // 2500
        System.out.println(SumOdd.sumOdd(-1, 100));  // -1
        System.out.println(SumOdd.sumOdd(100, 100));  // 0
        System.out.println(SumOdd.sumOdd(13, 13));  // 13
        System.out.println(SumOdd.sumOdd(100, -1));  // -1
        System.out.println(SumOdd.sumOdd(100, 1000));  // 247500

        // NumberInWord
        System.out.println("*************************************************");
        NumberInWord.printNumberInWord(-1);
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(2);
        NumberInWord.printNumberInWord(3);
        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(6);
        NumberInWord.printNumberInWord(7);
        NumberInWord.printNumberInWord(8);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(10);

        // NumberOfDaysInMonth
        System.out.println("*************************************************");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        // LargestPrime
        System.out.println("*************************************************");
        System.out.println(LargestPrime.getLargestPrime(21));  // 7
        System.out.println(LargestPrime.getLargestPrime(217));  // 31
        System.out.println(LargestPrime.getLargestPrime(0));  // -1
        System.out.println(LargestPrime.getLargestPrime(45));  // 5
        System.out.println(LargestPrime.getLargestPrime(-1));  // -1

        // DiagonalStar
        System.out.println("*************************************************");
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);

        // InputCalculator
        System.out.println("*************************************************");
        // InputCalculator.inputThenPrintSumAndAverage();

        // PaintJob
        System.out.println("*************************************************");
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));  // 3
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));  // 3
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));  // 5
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));  // -1
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));  // 5
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));  // 14
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));  // -1
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));  // 3
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));  // 3
    }
}
