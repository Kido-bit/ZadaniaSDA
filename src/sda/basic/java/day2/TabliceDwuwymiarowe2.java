package sda.basic.java.day2;

public class TabliceDwuwymiarowe2 {

    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int sum = array[0][0] + array[1][1] + array[2][2] + array[0][2] + array[1][1] + array[2][0];
        int sum2 = array[0][0] + array[0][1] + array[0][2] + array[1][0] + array[1][2] + array[2][0] + array[2][1] + array[2][2];
    }
}
