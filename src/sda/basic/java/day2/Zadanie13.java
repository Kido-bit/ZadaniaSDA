package sda.basic.java.day2;

import java.util.Arrays;

public class Zadanie13 {

    public static void main(String[] args) {

        int[] intArray = {12, 7, 19, -13};

        int minValue = getMinValue(intArray);
        int maxValue = getMaxValue(intArray);
        int sum = getSum(intArray);

        System.out.println("Min Value: " + minValue);
        System.out.println("Max Value: " + maxValue);
        System.out.println("Sum: " + sum);

        System.out.println(Arrays.stream(intArray).min().getAsInt());
        System.out.println(Arrays.stream(intArray).max().getAsInt());
        System.out.println(Arrays.stream(intArray).sum());

    }

    private static int getMaxValue(int[] intArray) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (maxValue < intArray[i]) {
                maxValue = intArray[i];
            }
        }
        return maxValue;
    }

    private static int getMinValue(int[] intArray) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (minValue > intArray[i]) {
                minValue = intArray[i];
            }
        }
        return minValue;
    }

    private static int getSum(int[] intArray) {
        int sum  = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }
}
