package homework23;

public class Homework23 {

    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Меченосец Игорь");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        System.out.println();

        Speakable pingvin = new Pingvin("Прингвин Карл");
        pingvin.speak();

        System.out.println();

        Animal leoJonny = new Leo("Лев Женя");
        System.out.println(leoJonny.name);
        leoJonny.eat();
        leoJonny.sleep();

        System.out.println();

        Mammal leoTolik = new Leo("Лев Анатолий");
        System.out.println(leoTolik.name);
        leoTolik.eat();
        leoTolik.sleep();
        leoTolik.run();
        leoTolik.speak();
    }
}
