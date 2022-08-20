package site.wilgo.maratonajava.javacore.Rdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020,07,20,20,40,10);
        LocalDateTime now = LocalDateTime.now();


        // You choose any time for your duration. Good Class for time
        double timeDurationDay = ChronoUnit.DAYS.between(now, dateTime);
        double timeDurationMonth = ChronoUnit.MONTHS.between(now, dateTime);
        double timeDurationWeeks = ChronoUnit.WEEKS.between(now, dateTime);

        System.out.println(timeDurationDay);
        System.out.println(timeDurationMonth);
        System.out.println(timeDurationWeeks);

    }
}
