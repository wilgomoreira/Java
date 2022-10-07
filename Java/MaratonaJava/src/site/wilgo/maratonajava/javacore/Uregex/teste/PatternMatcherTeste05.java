package site.wilgo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        //caracteres especiais para buscar palavras no texto:
        // \d = todos os digitos
        // \D = tudo o que não for digito
        // \s = espaços em branco e \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = tudo que não for incluso no \w
        // [] = range = nele voce pode escolher os caracteres que quer pegar. ex: [wer]. Ele pega o w ou e ou r
        // outro exemplo: [a-zA-C] ele vai pegar todos os caracteres de a até z minusculo e os caracteres de A a C maiusculo

        //qualificadores para pegar mais ocorrências, colocar "ou" e expressões de final de linha e etc
        // ? = zero ou uma ocorrência
        // * = zero ou mais
        // + = uma ou mais
        // {n, m} de n até m ocorrencias
        // () = agrupamento
        // | = ou
        // $ = fim de linha
        // . = vai achar tudo entre aquilo. ex: 1.3 = 13, 1.3, 123, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // pegar os emais
        String texto = "luffy@hotmail.com, 123johanh@gmail.com, #$%zoro@gmail.com, teste@gmail.com.br, sakura@mail";

        System.out.print("Verificando se o email é valido: #$%zoro@gmail.com  :");
        System.out.println("#$%zoro@gmail.com".matches(regex));

        Pattern pattern = Pattern.compile(regex);   // transformar a palavra em um padrão para procurar
        // da o match para achar no texto. texto um está facil de achar, texto 2 ja esta dificil a logica a seguir
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: " +texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " +regex);
        System.out.println("posicções encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+ "\n");
        }

        int numeroHEX = 0XE659;    // para um numero ser hexadecimal no JAVA se coloca 0X antes do numero para que o JAVA reconheça

        System.out.println(numeroHEX); // imprimindo um numero hexadecimal o Java transforma em decimal

        

    }
}
