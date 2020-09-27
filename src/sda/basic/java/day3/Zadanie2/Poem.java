package sda.basic.java.day3.Zadanie2;

import sda.basic.java.day3.Zadanie2.Author;

public class Poem {

    private Author creator;
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator(int counter) {
        return creator;
    }

    public int getStropheNumbers(int counter) {
        return stropheNumber;
    }

    @Override
    public String toString() {
        return "Poem " +
                "creator = " + creator +
                ", stropheNumber = " + stropheNumber;
    }

    public void print() {
        System.out.println(toString());
    }
}
