package homework21;

public class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + this.name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
