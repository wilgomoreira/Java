package site.wilgo.maratonajava.javacore.Gassossiacao.teste;

import java.util.Scanner;

public class LeituraTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // para escrever

        System.out.println("Digite seu nome:");
        // String next = entrada.next();  // Ler apenas uma palavra
        String nome = entrada.nextLine();  // Ler uma linha inteira

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("-----------------------------");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo);
    }
}
