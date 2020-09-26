package sda.basic.java.day1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = (getPrice(scanner));
        int installment = (getInstallment(scanner));
        double singleInstallment = singleInstallment(price, installment);
        System.out.println("Single installment: " + singleInstallment);
    }

    private static double singleInstallment(double price, int installment) {
        double singleInstallment;
        if (installment >= 6 && installment <= 12) {
            singleInstallment = (price * 1.025) / installment;
        } else if (installment > 12 && installment <= 24) {
            singleInstallment = (price * 1.05) / installment;
        } else {
            singleInstallment = (price * 1.1) / installment;
        }
        return singleInstallment;
    }

    private static int getInstallment(Scanner scanner) {
        System.out.println("Enter installment number:");
        int installment = scanner.nextInt();
        if (installment < 6 || installment > 48) {
            installment = 36;
            System.out.println("Installment is not in range, was set to default of 36");
        }
            return installment;
    }

    private static double getPrice(Scanner scanner) {
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        if (price < 100.0 || price > 10000.0) {
            price = 5000.0;
            System.out.println("Price is not in range, was set to default of 5000");
        }
        return price;
    }
}
