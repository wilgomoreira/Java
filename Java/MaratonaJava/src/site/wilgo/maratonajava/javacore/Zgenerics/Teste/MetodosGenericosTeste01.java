package site.wilgo.maratonajava.javacore.Zgenerics.Teste;

import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Barco;
import site.wilgo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTeste01 {
    public static void main(String[] args) {

        List<Barco> barcos = criarArrayComObjeto2(new Barco("Lancha"));
        System.out.println(barcos);

    }

    private static <T> void criarArrayComObjeto(T t){
        List<T> list = List.of(t);
    }

    private static <T> List<T> criarArrayComObjeto2(T t){
        List<T> list = List.of(t);
        return list;
    }
}

