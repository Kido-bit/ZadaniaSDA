package sda.basic.java;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1900, 01, 01);
        System.out.println(date1);
        System.out.println(date2);
    }
}
