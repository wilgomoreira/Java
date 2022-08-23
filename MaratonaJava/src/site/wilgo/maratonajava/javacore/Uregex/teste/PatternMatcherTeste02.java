package site.wilgo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        //caracteres especiais para buscar palavras no texto:
        // \d = todos os digitos
        // \D = tudo o que n�o for digito
        // \s = espa�os em branco e \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = tudo que n�o for incluso no \w

        String regex = "aba";    //palavra para procurar
        String texto1 = "abaaba";
        String texto2 = "abababa";
        String texto3 = "#@jjj_h2 897fffewf34";

        Pattern pattern = Pattern.compile("\\W");   // transformar a palavra em um padr�o para procurar
        // da o match para achar no texto. texto um est� facil de achar, texto 2 ja esta dificil a logica a seguir
        Matcher matcher = pattern.matcher(texto3);

        System.out.println("texto: " +texto3);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " +regex);
        System.out.println("posic��es encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+ "\n");
        }

        

    }
}
