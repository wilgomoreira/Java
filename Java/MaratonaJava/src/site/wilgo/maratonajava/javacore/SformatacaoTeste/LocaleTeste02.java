package site.wilgo.maratonajava.javacore.SformatacaoTeste;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoContry : isoCountries) {
            System.out.print(isoContry+ " ");
        }
        System.out.println("--------------------");

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+ " ");
        }

    }
}
