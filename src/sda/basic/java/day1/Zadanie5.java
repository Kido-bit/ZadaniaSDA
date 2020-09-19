package sda.basic.java.day1;

public class Zadanie5 {

    public static void main(String[] args) {

        int x = 4;
        int y = 11;
        int sum = 0;

//        for (int i = x; i <= y; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        while (x <= y) {
//            sum = sum + x++;
//        }
//        System.out.println(sum);

        do {
            sum = sum + x++;
        } while (x <= y);
        System.out.println(sum);
    }
}
