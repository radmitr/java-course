package homework17;

public class StringBuildersComparator {

    public static boolean equality(StringBuilder s1, StringBuilder s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        System.out.println(equality(s1, s1));
        System.out.println(equality(new StringBuilder(), new StringBuilder()));
        System.out.println(equality(new StringBuilder("Holly Molly!"), new StringBuilder("Holly Molly!")));
        System.out.println(equality(new StringBuilder("Yeah!"), new StringBuilder("Nop!")));
        System.out.println(equality(new StringBuilder("Biba"), new StringBuilder("Boba")));
    }
}
