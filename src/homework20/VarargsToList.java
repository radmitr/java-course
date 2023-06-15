package homework20;

import java.util.ArrayList;
import java.util.Collections;

public class VarargsToList {

    public static void main(String[] args) {
        abc("Саша", "Дима", "Алеша", "Саша", "Андрей");
    }

    public static ArrayList<String> abc(String... strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
}
