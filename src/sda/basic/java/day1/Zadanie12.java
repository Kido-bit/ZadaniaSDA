package sda.basic.java.day1;

public class Zadanie12 {

    public static void main(String[] args) {

        int random = getRandom();
        int random2 = getRandom();
        System.out.println("1st number: " + random);
        System.out.println("2nd number: " + random2);
        System.out.println(getModulo(random, random2));
        System.out.println(isModuloCorrect(random, random2));
    }

    private static int getRandom() {
        int random = (int) (Math.random() * 101);
        return random;
    }

    private static int getModulo(int x, int y) {
        int modulo = 0;
        for (int i = 0; i * y < x; i++) {
            modulo = x - (i * y);
        }
        return modulo;
    }

    private static boolean isModuloCorrect(int x, int y) {
        int myModulo = getModulo(x, y);
        int modulo = x % y;
        boolean result;
        if (myModulo == modulo) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
