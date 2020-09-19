package sda.basic.java.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {

    private final static float PI = 3.14f;

    public static void main(String[] args) {

        float diameter = getDiameter();
        float circumference = calcCircumference(diameter);
        System.out.println("Circumference = " + circumference);
        float area = calcArea(diameter);
        System.out.println("Area = " + area);

    }
    private static float getDiameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter:");
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input");
            System.exit(1);
        } finally {
            System.out.println("Finally step");
        }
        return 0;
    }
    private static float calcCircumference(float diameter) {
        return PI * diameter;

    }
    private static float calcArea(float diameter) {
        float radius = diameter / 2;
        return (float) (PI * Math.pow(radius, 2));
    }
}
