package homework19;

public class ForEachTest {

    static String[] abc(String[]... stringArrays) {
        int arrayLength = 0;
        for (String[] strings : stringArrays) {
            arrayLength += strings.length;
        }
        String[] result = new String[arrayLength];
        int index = 0;
        for (String[] strings : stringArrays) {
            for (String s : strings) {
                result[index] = s;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] result = abc(
                new String[]{"Лена", "Тарас"}
                , new String[]{"Аким", "Коля"}
                , new String[]{"Саша", "Алеша", "Андрей"}
                , new String[]{"Дима", "Вероника"});

        for (int i = 0; i < result.length; i++) {
            for (String arg : args) {
                if (arg.equals(result[i])) {
                    result[i] = null;
                }
            }
        }

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
