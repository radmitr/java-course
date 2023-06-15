package homework23;

public class Leo extends Mammal {

    public Leo(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Лев, как любой хищник, любит мясо!");
    }

    @Override
    public void sleep() {
        System.out.println("Большую часть дня лев спит!");
    }

    @Override
    public void run() {
        System.out.println("Лев - это не самая быстрая кошка!");
    }
}
