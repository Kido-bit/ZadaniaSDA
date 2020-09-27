package sda.basic.java.day2;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = getNumberOfWords(scanner);
        String[] wordsArray = (getWords(scanner, numberOfWords));
        System.out.println(getLastLetterWord(wordsArray));
    }

    private static int getNumberOfWords(Scanner scanner) {
        System.out.println("How many words would You like to insert?");
        int numberOfWords = scanner.nextInt();
        return numberOfWords;
    }

    private static String[] getWords(Scanner scanner, int number) {
        String[] wordsArray = new String[number];
        int counter = 0;
        do {
        String word = scanner.next();
        wordsArray[counter] = word;
        counter++;
        } while (counter < number);
        return wordsArray;
    }

    private static char getLastLetterWord(String[] wordsArray) {
        char lastLetter = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            lastLetter = wordsArray[i].charAt(wordsArray[i].length() - 1);
        }
        return lastLetter;
    }
}
