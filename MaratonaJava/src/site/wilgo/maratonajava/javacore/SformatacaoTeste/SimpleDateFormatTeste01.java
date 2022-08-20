package site.wilgo.maratonajava.javacore.SformatacaoTeste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMMM 'de' yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));


    }
}
