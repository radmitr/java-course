package homework23;

public abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }

    public abstract void fly();
}
