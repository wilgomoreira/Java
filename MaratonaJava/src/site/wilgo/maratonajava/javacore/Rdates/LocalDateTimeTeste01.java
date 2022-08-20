package site.wilgo.maratonajava.javacore.Rdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); // Having a LocalDate and LocalTime together

        System.out.println(localDateTime);

        LocalDate date = LocalDate.parse("2022-10-30");
        LocalTime time = LocalTime.parse("14:30");

        System.out.println(date);
        System.out.println(time);

        // add date ou time in the oject LocalDate or LocalTime
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
