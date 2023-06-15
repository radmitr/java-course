package homework15;

public class NestedWhileLoops {

    static void mysteriousTimer() {
        int hour = 0;
        HOUR:
        while (hour <= 6) {
            int minute = -1;

            MINUTE:
            do {
                minute++;
                if (minute == 60) break;
                int second = 0;
                if (hour > 1 && minute != 0 && minute % 10 == 0) {
                    break HOUR;
                }

                SECOND:
                while (second <= 59) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                    if ((second * hour) > minute) {
                        continue MINUTE;
                    }
                }
            } while (minute <= 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        mysteriousTimer();
    }
}
