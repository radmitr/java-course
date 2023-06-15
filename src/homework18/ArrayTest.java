package homework18;

import java.util.Arrays;

public class ArrayTest {

    static int[] sort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }

    static void showArray(String[][] strings) {
        System.out.print("{ ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print("{");
            for (int j = 0; j < strings[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(strings[i][j]);
            }
            System.out.print("}");
            if (i == strings.length - 1) {
                System.out.print(" }");
            } else {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] unsorted = new int[] {-1, 8, 0, 12, 5, 3, -5};
        System.out.println("До сортировки: " + Arrays.toString(unsorted));
        int[] sorted = sort(unsorted);
        System.out.println("После сортировки: " + Arrays.toString(sorted));

        showArray(new String[][] {{"Тарас", "Лена"}
                                , {"Саша, Алеша, Андрей"}
                                , {"Сережа", "Наташа", "Дима", "Вероника"}});
    }
}
