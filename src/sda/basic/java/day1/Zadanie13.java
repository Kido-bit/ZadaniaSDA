package sda.basic.java.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = getUserNumberList(scanner);
        System.out.println("Numbers: " + numberList);
        System.out.println("Total number of digits: " + numberList.stream().count());
        System.out.println("Total number of even digits: " + numberOfEvenDigits(numberList));
        System.out.println("Arithmetic average: " + numberListAverage(numberList));

    }
    private static List<Integer> getUserNumberList(Scanner scanner) {
        List<Integer> numberList = new ArrayList<Integer>();
        int number;
        do {
            System.out.println("Podaj liczbę całkowitą: ");
            number = scanner.nextInt();
            numberList.add(number);
        } while (number != 0);
        Object zero = 0;
        numberList.remove(numberList.lastIndexOf(zero));
        return numberList;
    }
    private static int numberOfEvenDigits(List<Integer> list) {
        int numberOfEven = 0;
        int counter = 0;
        for (int i : list) {
            if (list.indexOf(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    private static double numberListAverage(List<Integer> list) {
        int sum = 0;
        double average = 0;
        int counter = 0;
        for (int i : list) {
            sum = sum + i;
            counter++;
        }
        average = (double)(sum / counter);
        return average;
    }
}
