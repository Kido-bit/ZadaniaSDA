package sda.basic.java.day1;

public class Zadanie1 {

    public static void main(String[] args) {
        displayWordInHexFormat();
        displayWordInDeciFormat();
        displayWordInBinFormat();
    }

    private static void displayWordInHexFormat() {
        char S = 0x53;
        char D = 0x44;
        char A = 0x41;

        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

        System.out.println();
    }


    private static void displayWordInDeciFormat() {
        char S = 83;
        char D = 68;
        char A = 65;

        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

        System.out.println();
    }

    private static void displayWordInBinFormat() {
        char S = 0b1010011;
        char D = 0b1000100;
        char A = 0b1000001;

        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

        System.out.println();
    }

}
