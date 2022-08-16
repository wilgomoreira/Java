package site.wilgo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {2,3,4,5,6};   //Outra forma de inicializar um array
        int[] numeros3 = new int[]{2,34,56};  //Uma outra forma de inicializar um array

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        //uso do for each

        for (int i : numeros2){
            System.out.println(i);
        }
    }
}
