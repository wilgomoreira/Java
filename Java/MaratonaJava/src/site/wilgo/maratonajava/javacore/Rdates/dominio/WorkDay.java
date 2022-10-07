package site.wilgo.maratonajava.javacore.Rdates.dominio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class WorkDay {
    private LocalDate date;
    private DayOfWeek dayOfWeek;
    private LocalDate workDay;

    public WorkDay(String dateString) {
        this.date = LocalDate.parse(dateString);
        this.dayOfWeek = date.getDayOfWeek();

        checkWorkDay();
    }

    private void checkWorkDay(){
        switch(this.dayOfWeek){
            case THURSDAY: this.workDay = this.date.with(ChronoField.DAY_OF_MONTH, this.date.getDayOfMonth()+4);
                break;
            case FRIDAY: this.workDay = this.date.with(ChronoField.DAY_OF_MONTH, this.date.getDayOfMonth()+3);
                break;
            case SATURDAY: this.workDay = this.date.with(ChronoField.DAY_OF_MONTH, this.date.getDayOfMonth()+2);
                break;
            default: this.workDay = this.date.with(ChronoField.DAY_OF_MONTH, this.date.getDayOfMonth()+1);
        }
    }

    @Override
    public String toString() {
        return "Day: " +date+ " Day of Week: " +date.getDayOfWeek()+ "\n"+
                "Next workday: " +workDay+ " Day of Week: " +workDay.getDayOfWeek();

    }

}
