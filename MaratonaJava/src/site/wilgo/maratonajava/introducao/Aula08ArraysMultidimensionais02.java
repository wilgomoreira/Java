package site.wilgo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][]; // Precisa ser inicializado para poder ser manipulado, vai dar erro no código
                                       // vai dar erro de NULL

        int[] array = {1,2,45,56};   //inicilizando um array simples para depois ser chamando no multidimensional


        arrayInt[0] = new int[2];      // Outra formas de inicializar e mudar o tamanho dos arrays, se for imprimir
        arrayInt[1] = new int[]{1, 2, 3};       // não vai dar erro. Não pode incializar sozinho {1,2,3} depois do igual
        arrayInt[2] = array;

        int[][] arrayInt2 = {{2,3},{4,5,6},{45,4,5,6}}; //Outra forma de inicializar

        for(int[] arrayBase : arrayInt){
            System.out.println("/n------");
            for(int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
