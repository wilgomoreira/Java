package site.wilgo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int cont = 12;

        while(cont < 10){
            System.out.println(cont);
            cont += 1;
        }

        do {                             // Diferença para o While que ele executa pelo menos uma vez
            System.out.println("Dentro do While");
        } while(cont < 10);

        for(int i=0; i < 10; i++){
            System.out.println(i);
        }
    }
}
