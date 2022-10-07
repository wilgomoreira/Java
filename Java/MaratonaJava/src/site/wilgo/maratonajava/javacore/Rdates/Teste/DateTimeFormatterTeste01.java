package site.wilgo.maratonajava.javacore.Rdates.Teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter formatter3 = DateTimeFormatter.ISO_LOCAL_DATE;

        String dateFormat1 = date.format(formatter1);   // transforma um objeto em uma String
        String dateFormat2 = date.format(formatter2);
        String dateFormat3 = date.format(formatter3);

        System.out.println(dateFormat1);
        System.out.println(dateFormat2);
        System.out.println(dateFormat3);

        // Transforma um String em objeto

        LocalDate date1 = LocalDate.parse("20220323", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2022-03-20+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate date3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        // Format BR

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateFormatBR = LocalDate.now().format(formatterBR);
        System.out.println(dateFormatBR);

        LocalDate dateBR = LocalDate.parse("19-10-2002",formatterBR);
        System.out.println(dateBR);

        DateTimeFormatter formatGerman = DateTimeFormatter.ofPattern("dd-MMMM-yyyy",Locale.GERMAN);
        String dateGerman = LocalDate.now().format(formatGerman);
        System.out.println(dateGerman);









    }
}
