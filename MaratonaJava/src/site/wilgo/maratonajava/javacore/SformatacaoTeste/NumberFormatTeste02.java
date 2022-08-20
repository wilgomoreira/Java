package site.wilgo.maratonajava.javacore.SformatacaoTeste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) throws ParseException {
        Locale localeBR = new Locale("pt","BR");
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nf = new NumberFormat[4];

        // moedas
        nf[0] = NumberFormat.getCurrencyInstance(localeBR);
        nf[1] = NumberFormat.getCurrencyInstance(localeIT);
        nf[2] = NumberFormat.getCurrencyInstance (localeUS);
        nf[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1_000_000.7538;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1234.56";

        System.out.println(nf[0].parse(valorString)); // da uma exceção por conta do simbolo da moeda


    }
}
