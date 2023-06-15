package homework2;

public class Homework2 {

    public static void main(String[] args) {
        byte b1 = 0b1100;
        byte b2 = 0_14;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        short s1 = 0b101_0001_0100;
        short s2 = 0_2424;
        short s3 = 1300;
        short s4 = 0x514;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        int i1 = 0b0;
        int i2 = 0_0;
        int i3 = 0;
        int i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

        long l1 = 0b111_0101_1011_1100_1101_0001_0101L;
        long l2 = 0_726_746_425L;
        long l3 = 123_456_789L;
        long l4 = 0x75B_CD15L;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

        float f1 = 2.2f;
        float f2 = -2.2f;
        System.out.println(f1 + " " + f2);

        double d1 = 1.1;
        double d2 = -1.1;
        System.out.println(d1 + " " + d2);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 + " " + bool2);

        char c1 = 'Ъ';
        char c2 = 54;
        char c3 = '\u0999';
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
