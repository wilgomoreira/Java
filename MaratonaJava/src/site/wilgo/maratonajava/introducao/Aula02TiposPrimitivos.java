package site.wilgo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = 10;
        long numeroGrande = 100000;

        double salarioDouble = 2000;
        double salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;  // da tabela ASCII

// String é uma classe chamada de variável de referência e não primitiva
        String nome = "Teste muito grande ";

        System.out.println("Ele tem "+age+ " anos");
        System.out.println(verdadeiro);
        System.out.println("CHAR "+caractere);
        System.out.println(nome);
    }
}
