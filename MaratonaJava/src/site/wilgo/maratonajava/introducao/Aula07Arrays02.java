package site.wilgo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //inicialização do array:
        // byte, short, int, float, double = 0
        // char '/u000' ' '
        // boolean false
        // String null

        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Maria";
        nomes[2] = "Jose";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // Esta imprimindo no ultimo valor um valor NULL já que não foi atribuido nenhum valor no ultimo elemento do array
    }
}

