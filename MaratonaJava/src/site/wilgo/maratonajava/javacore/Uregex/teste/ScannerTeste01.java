package site.wilgo.maratonajava.javacore.Uregex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {

        String texto = "Rosa, Preta, Lucia";

        String[] nomes = texto.split(",");

        for (String nome: nomes) {
            System.out.println(nome.trim());

        }
    }
}
