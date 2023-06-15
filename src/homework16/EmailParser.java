package homework16;

public class EmailParser {

    public static void email(String emails) {
        while (!emails.isEmpty()) {
            int indexOfAt = emails.indexOf('@');
            if (indexOfAt == -1) {
                break;
            }
            int indexOfDot = emails.indexOf('.', indexOfAt);
            if (indexOfDot == -1) {
                break;
            }
            System.out.println(emails.substring(indexOfAt + 1, indexOfDot));
            int indexOfSemicolon = emails.indexOf(';');
            if (indexOfSemicolon == -1) {
                break;
            }
            emails = emails.substring(indexOfSemicolon + 1);
        }
    }

    public static void main(String[] args) {
        email("y.a@yahoo.com; on@mail.ru; on.a@gmail.uk;");
    }
}
