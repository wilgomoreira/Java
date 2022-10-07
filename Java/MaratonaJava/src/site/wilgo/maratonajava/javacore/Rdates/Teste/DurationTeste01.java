package site.wilgo.maratonajava.javacore.Rdates.Teste;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime after2years = LocalDateTime.now().plusYears(2);

        Duration durationDateTime = Duration.between(now,after2years);  // work with time e not date. Date uses the class Period

        System.out.println(durationDateTime);

        LocalTime time = LocalTime.now();
        LocalTime before40min = LocalTime.now().minusMinutes(40);

        Duration durationTime = Duration.between(time,before40min);  // work with class LocalTime

        System.out.println(durationTime);

        Duration durationDay = Duration.ofDays(40);

        System.out.println(durationDay);

    }
}
