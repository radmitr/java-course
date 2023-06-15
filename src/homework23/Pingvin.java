package homework23;

public class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }

    @Override
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }

    @Override
    public void fly() {
        System.out.println("Пингвины не умеют летать!");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи!");
    }
}
