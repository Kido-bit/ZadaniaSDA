package sda.basic.java.day2;

public class Zadanie14Metody {

    public static void main(String[] args) {

        int[] array = {12, -7, 19, -5};
        int length = countNegativeDigits(array);
        int[] negativeDigits = createArrayWithNegativeDigits(length, array);
    }


    private static int countNegativeDigits(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createArrayWithNegativeDigits(int length, int[] array) {
        int[] newArray = new int[length];
        for (int i = 0, j = 0; i < length; i++) {
            if (array[i] < 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
