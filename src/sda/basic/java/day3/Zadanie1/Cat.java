package sda.basic.java.day3.Zadanie1;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Moew");
    }

    public void eatMouses(int mouses) {
        System.out.println("I ate " + mouses + " mouses.");
    }

    public void print() {
        System.out.println("Cat: ");
        System.out.println("name: " + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name +
                '}';
    }
}
