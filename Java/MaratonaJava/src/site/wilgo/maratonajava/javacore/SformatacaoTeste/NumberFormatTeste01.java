package site.wilgo.maratonajava.javacore.SformatacaoTeste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nf = new NumberFormat[4];

        nf[0] = NumberFormat.getNumberInstance(localeBR);
        nf[1] = NumberFormat.getNumberInstance(localeIT);
        nf[2] = NumberFormat.getNumberInstance(localeUS);
        nf[3] = NumberFormat.getNumberInstance(localeJP);

        double valor = 1000000.7538;

        for (NumberFormat numberFormat : nf) {
            numberFormat.setMaximumFractionDigits(3);
            System.out.println(numberFormat.format(valor));
        }

        String valor2 = "342325.56";

        try {
            System.out.println(nf[0].parse(valor2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
