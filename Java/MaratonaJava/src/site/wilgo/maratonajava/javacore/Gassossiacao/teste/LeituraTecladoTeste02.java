package site.wilgo.maratonajava.javacore.Gassossiacao.teste;

import java.util.Scanner;

public class LeituraTecladoTeste02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("PREVISÃO DO FUTURO ");
        System.out.println("Digite a sua pergunta que responderei SIM ou NÃO: ");

        String pergunta = entrada.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }

    }
}
