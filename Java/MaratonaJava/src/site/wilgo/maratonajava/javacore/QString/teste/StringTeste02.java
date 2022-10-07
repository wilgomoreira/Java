package site.wilgo.maratonajava.javacore.QString.teste;

import java.util.Locale;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = " Davi ";
        String numeros = "897284";


        // some methods the class String
        System.out.println(nome.charAt(4)); // Char in position "n"
        System.out.println(nome.length());
        System.out.println(nome.replace("Da","Ra"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length()));   //numeros.length pode ser removido, pois ele ja vai até o final
        System.out.println(nome.trim());  // remove empty spaces.

    }
}
