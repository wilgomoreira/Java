package site.wilgo.maratonajava.javacore.Jmodificadorfinal.Teste;

import site.wilgo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import site.wilgo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Carro.VELOCIDADE_LIMITE = 180;  // da erro de compilação por ser uma constante

        System.out.println(Carro.VELOCIDADE_LIMITE); // por ser estatico, é um valor da classe para todos os objetos


        //----------------------------------------COM OBJETO

        Comprador comprador2 = new Comprador();

        // carro.COMPRADOR = comprador 2;   // não é possível, pois a referência é constante, porém e possível alterar variaveis dentro

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Davi");
        System.out.println(carro.COMPRADOR);

    }
}
