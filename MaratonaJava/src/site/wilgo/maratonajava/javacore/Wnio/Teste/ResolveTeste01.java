package site.wilgo.maratonajava.javacore.Wnio.Teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/William"); // caminho relativo pois não tem a barra no começo
        Path file = Paths.get("dev/arquivo.txt");   // também é um caminho relativo

        Path resolve = dir.resolve(file);   // metodo para resolver a junção de dois paths
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/william");   // caminho absoluto; tomar cuidados pois pode ser que não resolva
        Path relativo = Paths.get("dev");       // caminho relativo

        System.out.println(absoluto.resolve(relativo));     // esse caso funciona  e geralmente se tem nos codigos o caminho absoluto
        System.out.println(relativo.resolve(absoluto));     // esse ja da problema, ele retorna so o absoluto


    }
}
