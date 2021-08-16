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
    }
}
