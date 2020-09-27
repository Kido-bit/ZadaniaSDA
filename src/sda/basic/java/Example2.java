package sda.basic.java;

public class Example2 {

        static int count = 0;
        int i = 0;

        public void change() {
            while (i<5) {
                i++;
                count++;
            }
        }
        public static void main (String[] args) {
            Example2 check1 = new Example2();
            Example2 check2 = new Example2();
            check1.change();
            check2.change();
            System.out.println(check1.count + " vs " + check2.count);
    }
}
