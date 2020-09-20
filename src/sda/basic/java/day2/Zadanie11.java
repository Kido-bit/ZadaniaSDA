package sda.basic.java.day2;

public class Zadanie11 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("kajak"));
        System.out.println(isPalindrome("dom"));


    }

    private static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString().equals(input);

    }
}
