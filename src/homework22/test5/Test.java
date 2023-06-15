package homework22.test5;

public class Test {
    public static void main(String[] args) {
        X x = new Y ();
        System.out.println(x.s1 + " " /*+ x.bool*/); //ошибка компиляции: в классе X нет переменной bool
    }
}

class X{
    String s1 = "privet";
}

class Y extends X {
    boolean bool = false;
}