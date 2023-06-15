package homework23;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    public abstract void sleep();
}
