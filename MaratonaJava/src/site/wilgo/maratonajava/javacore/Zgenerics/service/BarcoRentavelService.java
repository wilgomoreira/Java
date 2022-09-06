package site.wilgo.maratonajava.javacore.Zgenerics.service;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Barco;
import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barcos disponiveis ...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco:" +barco);
        System.out.println("Barcos diponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo o carro: " +barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos diponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }

}
