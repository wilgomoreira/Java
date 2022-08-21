package site.wilgo.maratonajava.javacore.Rdates.Teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays;

        switch (dayOfWeek){
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
            default: addDays = 1;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAjusterTeste03 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
