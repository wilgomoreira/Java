package site.wilgo.maratonajava.javacore.Rdates;

import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(22,56,54);
        LocalTime now = LocalTime.now();

        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getMinute());
        System.out.println(LocalTime.MIN);   // inicio do dia
        System.out.println(LocalTime.MAX);  // max do dia

    }
}
