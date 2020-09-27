package sda.basic.java.day3.Extras.Zadanie4;

public class Main {

    public static void main(String[] args) {
        Email email = new Email.Builder()
        .reciver("sda")
        .title("new course")
        .bodyMsg("hello")
        .attachment("lesson.pdf")
        .build();
        System.out.println(email.toString());
    }
}
