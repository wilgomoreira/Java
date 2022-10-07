package site.wilgo.maratonajava.javacore.Vio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        // BufferedWriter is similar a FileWriter, give more performance the programa the using the class BufferedWriter
       try(FileWriter fw = new FileWriter(file, true);
           BufferedWriter bw = new BufferedWriter(fw)){   // colocando dentro do try, o try fica encarregado de fechar o arquivo depois
            bw.write("O curso é muito bom e bem prático Serve para toda a familia");
            bw.newLine();  // melhor do que o /n para pular linha
            bw.flush(); // usada para cuspir o texto
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
