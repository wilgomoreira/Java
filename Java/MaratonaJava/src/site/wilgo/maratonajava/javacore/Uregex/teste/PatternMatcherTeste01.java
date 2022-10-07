package site.wilgo.maratonajava.javacore.Uregex.teste;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        String regex = "aba";    //palavra para procurar
        String texto1 = "abaaba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);   // transformar a palavra em um padrão para procurar
        // da o match para achar no texto. texto um está facil de achar, texto 2 ja esta dificil a logica a seguir
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto: " +texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " +regex);
        System.out.println("posicções encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }



    }
}
