package sda.basic.java.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        countDays();

    }

    private static int countDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date (in format) [yyyy-MM-dd HH:mm:ss]");
        String nextClassDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextClass = LocalDateTime.parse(nextClassDate, formatter);
        LocalDateTime now = LocalDateTime.now();
        int days = (int) Duration.between(now, nextClass).toDays();

        System.out.println(String.format("You have %01d days to next class.", days));
        return days;

        // TimeUnit <- druga czesc zadania
    }
}
