package homework8;

public class Circle {

    static final double PI = 3.14;

    public double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public void circleInfo(double radius) {
        System.out.println("радиус : " + radius);
        System.out.println("площадь круга : " + circleArea(radius));
        System.out.println("длина окружности : " + circumference(radius));
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Это площадь круга из non-static метода circleArea : "
                + circle.circleArea(10));
        System.out.println("Это длина окружности из static метода circumference : "
                + Circle.circumference(10));
        System.out.println("Это результат работы non-static метода circleInfo: ");
        circle.circleInfo(10);
    }
}