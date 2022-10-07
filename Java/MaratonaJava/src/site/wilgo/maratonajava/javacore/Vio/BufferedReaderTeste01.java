package site.wilgo.maratonajava.javacore.Vio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){ // colocando dentro do try, o try fica encarregado de fechar o arquivo depois

            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
