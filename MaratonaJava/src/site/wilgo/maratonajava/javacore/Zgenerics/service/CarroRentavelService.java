package site.wilgo.maratonajava.javacore.Zgenerics.service;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Fusca"), new Carro("Gol")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponiveis ...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro:" +carro);
        System.out.println("Carros diponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo o carro: " +carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros diponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }

}
