package sda.basic.java.day1;

public class Zadanie6b {

    public static void main(String[] args) {
        printMultiplicationTable(6, 0, 5);

    }

    private static void printMultiplicationTable(int multi, int multiMin, int multiMax) {
        for ( ; multiMin <= multiMax; multiMin++) {
            int result = multi * multiMin;
            System.out.println(multi + " x " + multiMin + " = " + result);
        }
    }
}
