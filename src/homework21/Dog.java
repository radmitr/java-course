package homework21;

public class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + this.name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
