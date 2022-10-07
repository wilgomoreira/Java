package site.wilgo.maratonajava.javacore.SformatacaoTeste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {

        //pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Na italia: " +df1.format(calendar.getTime()));
        System.out.println("Na Suiça: " +df2.format(calendar.getTime()));
        System.out.println("Na India: " +df3.format(calendar.getTime()));
        System.out.println("No Japao: " +df4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());     // passa de acordo com o sistema operacional do computador
        System.out.println(localeIndia.getDisplayCountry(localeJapao));    // passe no local indicado no parametro


        System.out.println("ç??~~´´´´~~lçlç[];");

    }
}
