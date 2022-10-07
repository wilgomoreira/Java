package site.wilgo.maratonajava.javacore.Wnio.Teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;


public class DosFileAtrributeTeste01 {
    public static void main(String[] args) throws IOException {
          Path path = Paths.get("Pasta/subpasta/subpasta/teste.txt");

          if(Files.notExists(path)){
              Files.createFile(path);
          }

          /*Files.setAttribute(path,"dos:hidden", true);
          Files.setAttribute(path,"dos:readonly", true);   // uma forma de deixar o arquivo oculto e somente leitura*/

        // outra forma de fazer

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        dosFileAttributeView.setHidden(false);
        dosFileAttributeView.setReadOnly(false);

        System.out.println(dosFileAttributeView.readAttributes().isReadOnly());
        System.out.println(dosFileAttributeView.readAttributes().isHidden());


    }
}
