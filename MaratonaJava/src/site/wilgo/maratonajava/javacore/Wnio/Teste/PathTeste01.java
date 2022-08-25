package site.wilgo.maratonajava.javacore.Wnio.Teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\WIlgo\\DEV\\JAVA\\MaratonaJava\\pasta2\\teste.txt");
        Path path2 = Paths.get("C","Users","WIlgo", "DEV", "JAVA", "MaratonaJava\\pasta2\\teste.txt");
        System.out.println(path1.getFileName());
        System.out.println(path2.getFileName());

        // Path � uma interface que ir� substituir a classe FILE
        // Path � implementada na classe Paths
        // A classe FILES existe na classe Path. Ela � uma classe s� de metodos estaticos.


    }
}
