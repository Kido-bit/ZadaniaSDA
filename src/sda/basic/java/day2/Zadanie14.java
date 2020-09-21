package sda.basic.java.day2;

public class Zadanie14 {

    public static void main(String[] args) {

        int[] array1 = {12, -7, 19, -5};
        int counter = 0;
        int number = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                counter++;
            }
        }

        int[] array2 = new int[counter];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array2[number] = array1[i];
                System.out.print(array2[number]+ " ");
                number++;
            }
        }
    }
}
