package sda.basic.java.day1;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {

        int randomNumber = randomNumber();
        int playerNumber = 0;
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 0 - 100");
        while (playerNumber != randomNumber){
            playerNumber = getPlayerNumber(scanner);
                if (playerNumber < randomNumber ) {
                    System.out.println("Liczba mniejsza");
                } else if (playerNumber > randomNumber) {
                    System.out.println("Liczba większa");
            }
        }
        System.out.println("To jest ta liczba");
    }
    private static int getPlayerNumber(Scanner scanner) {
        int number = scanner.nextInt();
        return number;
    }

    private static int randomNumber() {
        double random = Math.random() * 101;
        return (int) random;
    }
}
