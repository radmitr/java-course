package homework23;

public abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }

    public abstract void swim();
}
