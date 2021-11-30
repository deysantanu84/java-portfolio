package portfolio.javamasterclass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(values));
        return values;
    }

    public static int readInteger() {
        return scanner.nextInt();
    }

    public static int[] readElements(int count) {
        int[] elements = new int[count];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }

        return elements;
    }

    public static int findMin(int[] inputArray) {
        int min = Integer.MAX_VALUE;

        for (int j : inputArray) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    public static void main1(String[] args) {
	    int[] myIntArray = new int[5]; // {1, 2, 3, 4, 5};
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }

        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i< sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
