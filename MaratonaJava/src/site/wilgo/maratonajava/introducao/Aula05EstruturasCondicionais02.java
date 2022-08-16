package site.wilgo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        int age = 20;
        String categoria = "";

        if (age < 15) {
           categoria = "Category Infatil";
        } else if (age >= 15 && age < 18) {
            categoria = "Category Juvenil";
        } else {
            categoria = "Category Adulto";
        }
        System.out.println(categoria);
    }
}

// Variaveis locais (em um escopo) precisam ser inicializadas senão da erro de compilação.



