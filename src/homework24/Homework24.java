package homework24;

public class Homework24 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("мясо");
        try {
            tiger.drink("вода");
            try {
                tiger.drink("пиво");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это inner finally блок");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
