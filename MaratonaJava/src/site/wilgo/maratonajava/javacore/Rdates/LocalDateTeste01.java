package site.wilgo.maratonajava.javacore.Rdates;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        System.out.println(Month.JANUARY.getValue());

        LocalDate localdate = LocalDate.of(1985,07,13);

        LocalDate agora = LocalDate.now();  // classe imutavel, ou seja, o valor do objeto não muda com o metodo. So muda se for atribuido de novo, igual a String

        System.out.println(agora);

        agora = agora.plusDays(3);
        System.out.println(agora);


        System.out.println(localdate);  // formato usado para banco de dados, mais simples e facil de colocar
        System.out.println(localdate.getMonth());
        System.out.println(localdate.getMonthValue());
        System.out.println(localdate.getDayOfWeek());
        System.out.println(localdate.lengthOfMonth());




    }
}
