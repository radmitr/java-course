package homework11;

public class Car {

    String color;
    String engine;
    int doorsNumber;

    public Car(String color, String engine, int doorsNumber) {
        this.color = color;
        this.engine = engine;
        this.doorsNumber = doorsNumber;
    }
}

class CarTest {

    static void changeDoorsNumber(Car car, int doorsNumber) {
        car.doorsNumber = doorsNumber;
    }

    static void swapColors(Car car1, Car car2) {
        String tempColor = car1.color;
        car1.color = car2.color;
        car2.color = tempColor;
    }

    public static void main(String[] args) {
        Car car1 = new Car("белый", "V6", 4);
        Car car2 = new Car("черный", "V8", 2);

        changeDoorsNumber(car1, 5);
        swapColors(car1, car2);

        System.out.println("car1 :"
                + " цвет - " + car1.color
                + ", мотор - " + car1.engine
                + ", дверей - " + car1.doorsNumber);
        System.out.println("car2 :"
                + " цвет - " + car2.color
                + ", мотор - " + car2.engine
                + ", дверей - " + car2.doorsNumber);
    }
}