package site.wilgo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File file = new File("pasta");
        boolean isCreatedDir = file.mkdir();
        System.out.println(isCreatedDir);

        File fileArquivo = new File(file,"teste2.txt");
        boolean isCreatedFile = fileArquivo.createNewFile();
        System.out.println(isCreatedFile);

        File fileRenomeado = new File(file,"teste1000");
        boolean isRenomeado = fileArquivo.renameTo(fileRenomeado);
        System.out.println(isRenomeado);

        File RenomearPasta = new File("pasta2");
        boolean pastaRenomeada = file.renameTo(RenomearPasta);
        System.out.println(pastaRenomeada);

        // se rodar o programa de novo, terá resultados diferentes, pois ações já fora feitas nas ultima execução

    }
}
