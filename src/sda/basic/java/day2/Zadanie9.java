package sda.basic.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = (getNameList(scanner));
        System.out.println(getLongestName(nameList));
    }

    private static String getLongestName(List<String> nameList) {
        String longestNameStr = "";
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).length() > longestNameStr.length()) {
                longestNameStr = nameList.get(i);
            }
        }
        return longestNameStr;
    }

    private static List<String> getNameList(Scanner scanner) {
        List<String> listName = new ArrayList<>();
        String name;
        do {
            System.out.println("Insert name:");
                name = scanner.next();
                listName.add(name);
//            if (name.isEmpty() | name.isEmpty()) {
//                System.out.println("No Input");
//            }
        } while (!name.equals("Enough"));
        listName.remove("Enough");
        return listName;
    }
}
