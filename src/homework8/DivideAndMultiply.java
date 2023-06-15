package homework8;

public class DivideAndMultiply {

    public static int multiplyThreeNumb(int a, int b, int c) {
        return a * b * c;
    }

    public static void divideTwoNumb(int a, int b) {
        System.out.println("делимое : " + a);
        System.out.println("делитель : " + b);
        System.out.println("целое частное : " + a / b);
        System.out.println("остаток : " + a % b);
    }
}

class DivideAndMultiplyTest {
    public static void main(String[] args) {
        int result = DivideAndMultiply.multiplyThreeNumb(2, 5, 10);
        System.out.println(result);

        DivideAndMultiply.divideTwoNumb(9, 2);
    }
}
