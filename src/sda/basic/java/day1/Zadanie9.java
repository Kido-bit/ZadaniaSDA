package sda.basic.java.day1;

public class Zadanie9 {

    public static void main(String[] args) {

        int x = 15;

        for (int i = 1; i <= x; i++) {

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
