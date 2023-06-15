package homework22.test1.p2;
import homework22.test1.p1.*;

public class Y extends X {

    Y() { // конструктор суперкласса недоступен из-за модификатора доступа default
    }

    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
