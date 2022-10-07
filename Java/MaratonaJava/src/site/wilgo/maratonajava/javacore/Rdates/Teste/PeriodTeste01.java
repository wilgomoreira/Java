package site.wilgo.maratonajava.javacore.Rdates.Teste;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusMonths(6).plusDays(20);

        // using for periods
        Period p1 = Period.between(ld1, ld2);  // class Period only use de the Class LocalDate, never localDateTime
        System.out.println(p1);

        System.out.println(Period.ofDays(20));
        System.out.println(Period.ofMonths(3));
        System.out.println(Period.ofWeeks(49));
        System.out.println(Period.ofYears(3));

    }
}
