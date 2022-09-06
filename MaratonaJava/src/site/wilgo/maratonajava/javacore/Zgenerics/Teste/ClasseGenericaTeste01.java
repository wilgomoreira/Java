package site.wilgo.maratonajava.javacore.Zgenerics.Teste;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;
import site.wilgo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando um carro por 1 mes...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
