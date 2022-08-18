package site.wilgo.maratonajava.javacore.Rdates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of week in Brazil");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        calendar.add(Calendar.DAY_OF_MONTH, 2);  // add 2 days

        Date date = calendar.getTime();

        System.out.println(date);   // put .toString and transforme date in String to print


    }
}
