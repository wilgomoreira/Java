package site.wilgo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        // nesse caso ele abre o arquivo, apaga tudo e escreve o texto
       /* try(FileWriter fw = new FileWriter(file)){   // colocando dentro do try, o try fica encarregado de fechar o arquivo depois
            fw.write("O curso � muito bom e bem pr�tico \n Serve para toda a familia");
            fw.flush(); // usada para cuspir o texto
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // para adicionar um texto em um arquivo que j� tem algo
        try(FileWriter fw = new FileWriter(file, true)){   // colocando dentro do try, o try fica encarregado de fechar o arquivo depois
            fw.write("\n Vamos sembora");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
