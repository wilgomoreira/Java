package site.wilgo.maratonajava.javacore.Rdates.Teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate afterTime = now.plusDays(20);

        now = now.withDayOfMonth(30);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(ChronoField.DAY_OF_MONTH, 23);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
