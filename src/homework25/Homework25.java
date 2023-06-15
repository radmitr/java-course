package homework25;
import java.time.*;
import java.time.format.*;

public class Homework25 {

    static final DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static final DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public static void smena(LocalDateTime beginning, LocalDateTime end, Period p, Duration d) {
        LocalDateTime dateTime = beginning;
        while (dateTime.isBefore(end)) {
            System.out.print("Работаем с: " + dateTime.format(format1));
            dateTime = dateTime.plus(p);
            System.out.println(" До: " + dateTime.format(format1));
            System.out.print("Отдыхаем с: " + dateTime.format(format2));
            dateTime = dateTime.plus(d);
            System.out.println(" До: " + dateTime.format(format2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime beginning = LocalDateTime.of(2022, Month.JANUARY, 1, 8, 0);
        LocalDateTime end = LocalDateTime.of(2022, Month.JANUARY, 31, 17, 0);
        Period workingPeriod = Period.of(0, 0, 5);
        Duration restDuration = Duration.ofDays(2);

        smena(beginning, end, workingPeriod, restDuration);
    }
}
