package site.wilgo.maratonajava.javacore.Zgenerics.Teste;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Barco;
import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;
import site.wilgo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import site.wilgo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando um barco por 1 mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
