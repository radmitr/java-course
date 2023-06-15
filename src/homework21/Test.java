package homework21;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog("Степа");
        System.out.println("Количество лап : " + dog.paw);
        System.out.println();
        Cat cat = new Cat("Вася");
        cat.sleep();
    }
}
