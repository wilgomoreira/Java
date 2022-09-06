package site.wilgo.maratonajava.javacore.Zgenerics.Teste;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Barco;
import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;
import site.wilgo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import site.wilgo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Fusca"), new Carro("Gol")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService1 = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService1.buscarObjetosDisponivel();
        System.out.println("Usando um carro por um mes");
        rentalService1.retornarObjetoAlugado(carro);

        System.out.println("-----------------------------------");

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.buscarObjetosDisponivel();
        System.out.println("Usando um barco por um mes");
        rentalService2.retornarObjetoAlugado(barco);

    }
}
