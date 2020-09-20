package sda.basic.java.day2;

public class Zadanie1 {

    public static void main(String[] args) {

        System.out.println("Last char: " + getLastCharacterV1("domek"));
        System.out.println("Last char: " + getLastCharacterV2("domek"));

    }

    private static char getLastCharacterV1(String input) {
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }
    private static String getLastCharacterV2(String input) {
        int lastPosition = input.length() - 1;
        return input.substring(lastPosition);
    }
}
