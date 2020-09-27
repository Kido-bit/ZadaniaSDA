package sda.basic.java.day3.Zadanie2;

public class Main {

    public static void main(String[] args) {

        Poem[] poems = new Poem[3];
        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Tolstoj", "RUS");
        Author author3 = new Author("Keats", "GB");
        poems[0] = new Poem(author1, 7);
        poems[1] = new Poem(author2, 666);
        poems[2] = new Poem(author3, 13);
        String authorAsString = getSurnameWithMaxStropheNumbers(poems);
        System.out.println(authorAsString);
    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems) {
        int maxStropheNumber = 0;
        Author author = null;
        String authorAsString = null;
        for (Poem poem : poems) {
            int counter = 0;
            if (poem.getStropheNumbers(counter + 1) > maxStropheNumber) {
                counter++;
                maxStropheNumber = poem.getStropheNumbers(counter);
                author = poem.getCreator(counter);
                authorAsString = poem.getCreator(counter).getSurname();
            }
        }
        return authorAsString;
    }
}
