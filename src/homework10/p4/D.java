package homework10.p4;

import homework10.p1.A;
import homework10.p1.p2.p3.C;
import homework10.p4.p5.E;
import static homework10.p1.p2.B.stringInClassB;

public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.stringInClassA);
        C c = new C();
        System.out.println(c.stringInClassC);
        E e = new E();
        System.out.println(e.stringInClassE);

        System.out.println(stringInClassB);
    }
}
