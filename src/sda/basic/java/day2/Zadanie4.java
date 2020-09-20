package sda.basic.java.day2;

public class Zadanie4 {

    public static void main(String[] args) {

        replaceAndPrintString("Ala.ma.kota");
    }

    private static void replaceAndPrintString(String input) {
        String result = input
                .replace(",", "-STOP-")
                .replace(".", "-STOP-");
        System.out.println("New text: " + result);
    }
}
