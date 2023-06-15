package homework13;

public class Month {

    static void printDays(int monthNumber) {
        switch (monthNumber) {
            case 2:
                System.out.println("В " + monthNumber + "-ом месяце 28 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В " + monthNumber + "-ом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В " + monthNumber + "-ом месяце 30 дней");
                break;
            default:
                System.out.println("Месяц задан неверно");
        }
    }

    public static void main(String[] args) {
        printDays(1);
        printDays(2);
        printDays(6);
        printDays(12);
        printDays(0);
    }
}
