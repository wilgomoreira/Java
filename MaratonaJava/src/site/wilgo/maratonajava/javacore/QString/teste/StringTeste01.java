package site.wilgo.maratonajava.javacore.QString.teste;

import org.w3c.dom.ls.LSOutput;

public class StringTeste01 {

    public static void main(String[] args) {

        // Strings sao imutaveis, sempre vão existir no pool da piscina

        String nome = "Wilgo";     // vai pro pool de String da memoria do computador

        String nome2 = "Wilgo";

        System.out.println(nome == nome2); // true

        nome.concat("Moreira");

        System.out.println(nome);

        nome = nome.concat("Moreira"); // nome += "Moreira" (mesma coisa)

        System.out.println(nome);

        String nome4 = new String("Wilgo");   // cria-se um novo espaço de memoria, portanto será outro objeto. Fora da Piscina de String
        // essa forma de criar String nunca é usado

        System.out.println(nome == nome4); // falso

        System.out.println(nome == nome4.intern());  // usando esse metodo é possível pegar objeto no pool de piscina
        // nesse caso é verdadeiro a igualdade



    }


}
