package site.wilgo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprimir os numeros pares de 0 a 100000

        for(int i=1; i<=100; i++){

            if((i % 2) == 0){
                System.out.println(i);
            }
        }
    }
}
