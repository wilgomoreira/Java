package site.wilgo.maratonajava.javacore.Zgenerics.service;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetosDisponivel(){
        System.out.println("Buscando objetos disponiveis ...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto:" +t);
        System.out.println("Objetos diponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo o objeto: " +t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos diponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
