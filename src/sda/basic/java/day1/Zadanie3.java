package sda.basic.java.day1;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj x: ");
        int x = scanner.nextInt();
        System.out.println("Podaj y: ");
        int y = scanner.nextInt();

        boolean result;

        result = x > y ? true : false;
        System.out.println("If x > y: " + result);

        result = x * 3 > y ? true : false;
        System.out.println("If x^3 > y: " + result);

        result = (y++ < ++x) && (--x < y++) ? true : false;
        System.out.println("If y++ < ++x && --x < y++: " + result);

        result = ((x * y) % 2 == 0) ? true : false;
        System.out.println("If x * y % 2 = 0: " + result);

    }
}
