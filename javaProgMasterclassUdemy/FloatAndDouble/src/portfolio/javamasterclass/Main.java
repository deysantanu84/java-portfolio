package portfolio.javamasterclass;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        float myFloatValue2 = (float) 5.25;
        double myDoubleValue = 5.25d;
        double myDoubleValue2 = 5.25;

        int myIntValue2 = 5 / 3;
        float myFloatValue3 = 5f / 3f;
        // double myDoubleValue3 = 5d / 3d;
        double myDoubleValue3 = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue2);
        System.out.println("MyFloatValue = " + myFloatValue3);
        System.out.println("MyDoubleValue = " + myDoubleValue3);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
