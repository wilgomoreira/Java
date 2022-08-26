package site.wilgo.maratonajava.javacore.Wnio.Teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("Pasta");

        if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);   // quando voce não tem subpastas
        }

        Path subPastaPath = Paths.get("Pasta/subpasta/subpasta");
        Path SubPastaDirectory = Files.createDirectories(subPastaPath);   // quando se tem subpastas

        // para criar arquivo dentro de subpastas

        Path filePath = Paths.get(subPastaPath.toString(), "teste.txt");   // junta as strings para formar o caminho

        if(Files.notExists(filePath)) {
            Path file = Files.createFile(filePath);
        }



    }
}
