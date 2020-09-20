package sda.basic.java.day2;

public class Zadanie5 {

    public static void main(String[] args) {

        int result = countCharInString("Ala ma kota", 'a');
        System.out.println("String: ");
        System.out.println(result);

    }

    private static int countCharInString(String input, char sign) {
        if (input.isEmpty()) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == sign) {
                counter++;
            }
        }
        return counter;
    }
}
