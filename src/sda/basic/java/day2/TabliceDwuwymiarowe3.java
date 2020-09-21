package sda.basic.java.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TabliceDwuwymiarowe3 {

    public static void main(String[] args) {

        int[][] array = new int[3][10];
        for (int i = 0; i < 10; i++) {
            array[0][i] = i + 1;
            array[1][i] = (int) Math.pow(array[0][i], 2);
            array[2][i] = (int) Math.pow(array[0][i], 3);
        }
        for (int[] a: array)
            System.out.println(Arrays.toString(a));
    }
}
