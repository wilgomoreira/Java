package site.wilgo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        double valorCarro = 30000;

        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--) {

            double valorParcela = valorCarro / parcela;

            if(valorParcela < 1000){
               continue;

            }
            System.out.println("Parcelado em "+parcela+ " vezes. O valor da parcela fica: " +valorParcela);
        }
    }
}
