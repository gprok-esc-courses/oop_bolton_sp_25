package week04.animals;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getSound() {
        return "...";
    }

    public String toString() {
        return name + " says " + getSound();
    }
}
