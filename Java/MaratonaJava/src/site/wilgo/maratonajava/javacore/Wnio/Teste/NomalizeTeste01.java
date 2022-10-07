package site.wilgo.maratonajava.javacore.Wnio.Teste;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.JarOutputStream;

public class NomalizeTeste01 {
    public static void main(String[] args) {
        String diretorio = "/home/dev/testes";
        String arquivo = "../../teste.text";      //desta forma, sem o normalize, o JAVA não entende que tem q voltar 2 diretorios

        Path path1 = Paths.get(diretorio,arquivo);
        System.out.println(path1);
        System.out.println(path1.normalize());   // so entende quando coloca o normalize()

        //outro exemplo

        Path path2 = Paths.get("/home/./dev/./testes");   // algumas vezes pode vim assim o caminho
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
