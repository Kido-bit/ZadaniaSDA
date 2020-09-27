package sda.basic.java.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie6 {

    public static void main(String[] args) {

        System.out.println(isContainAaa("psik"));
        System.out.println(isContainAaa(" psik"));
        System.out.println(isContainAaa("a psik"));
        System.out.println(isContainAaa("a Psik"));
        System.out.println(isContainAaa("aaaa psik"));
        System.out.println(isContainAaa("aaaapsik"));
    }

    private static boolean isContainAaa(String input) {
        String regex = "a+ (p|P)sik";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matches(regex, input);
//        Matcher matcher = pattern.matcher(input);
//        return matcher.matches();
    }
}
