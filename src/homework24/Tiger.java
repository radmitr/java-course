package homework24;

public class Tiger {

    public void eat(String food) {
        if (!"мясо".equals(food)) {
            throw new NeMyasoException("Тигр не ест " + food);
        } else {
            System.out.println("Тигр ест мясо");
        }
    }

    public void drink(String drink) throws NeVodaException {
        if (!"вода".equals(drink)) {
            throw new NeVodaException("Тигр не пьет " + drink);
        } else {
            System.out.println("Тигр пьет воду");
        }
    }
}
