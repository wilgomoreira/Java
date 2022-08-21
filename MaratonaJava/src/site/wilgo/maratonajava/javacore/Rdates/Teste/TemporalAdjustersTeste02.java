package site.wilgo.maratonajava.javacore.Rdates.Teste;

import site.wilgo.maratonajava.javacore.Rdates.dominio.WorkDay;


public class TemporalAdjustersTeste02 {
    public static void main(String[] args) {

        String date = "2022-08-19";

        WorkDay workDay = new WorkDay(date);

    }
}





// Made for me

        /*LocalDate localDate = LocalDate.parse(date);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        LocalDate workDay;

        switch(dayOfWeek){
            case THURSDAY: workDay = localDate.with(ChronoField.DAY_OF_MONTH, localDate.getDayOfMonth()+4);
            break;
            case FRIDAY: workDay = localDate.with(ChronoField.DAY_OF_MONTH, localDate.getDayOfMonth()+3);
            break;
            case SATURDAY:workDay = localDate.with(ChronoField.DAY_OF_MONTH, localDate.getDayOfMonth()+2);
            break;

            default: workDay = localDate.with(ChronoField.DAY_OF_MONTH, localDate.getDayOfMonth()+1);
        }

        System.out.print("Day: " +localDate);
        System.out.println("  Day of Week: " +localDate.getDayOfWeek());
        System.out.print("Next workday: " +workDay);
        System.out.println("  Day of Week: " +workDay.getDayOfWeek());*/