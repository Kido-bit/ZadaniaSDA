package sda.basic.java.day1;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countDigitSum(number));

    }

    private static int countDigitSum(int number) {
        int i = 0;
        int sum = 0;
        while (number > 0) {
            i = number % 10;
            sum = sum + i;
            number = number / 10;
        }
        return sum;
    }
}
