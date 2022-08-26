package site.wilgo.maratonajava.javacore.Wnio.Teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/william");
        Path path2 = Paths.get("/home/willam/dev/Ola.java");
        Path pathRelative = path.relativize(path2);

        System.out.println(pathRelative);   // tomar cuidado quando envolve caminhos absolutos com relativo, pode dar confusão.

    }
}
