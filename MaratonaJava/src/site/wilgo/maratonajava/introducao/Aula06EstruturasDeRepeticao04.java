package site.wilgo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado um valor de um carro, descobrir em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000

        double valorCarro = 40000;

        for (int parcela = 1; parcela < valorCarro ; parcela++) {

            double valorParcela = valorCarro / parcela;

            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcelado em "+parcela+ " vezes. O valor da parcela fica: " +valorParcela);

        }

    }
}

// Posso colocar outra condição: Exemplo:

// if (valorParcela >= 1000)  {
//       System.out.println("Parcelado em "+parcela+ " vezes. O valor da parcela fica: " +valorParcela);}
// else{
//  break;
//}
// Essa condição acima tem mais linha de código, enquanto a que esta no código mesmo é mais enxuta.