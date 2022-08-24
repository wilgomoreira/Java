package site.wilgo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        try {FileReader fr = new FileReader(file); // colocando dentro do try, o try fica encarregado de fechar o arquivo depois
            /*char[] in = new char[100];
            fr.read(in);
            for(char ch : in) {
                System.out.print(ch);
            }   */
            // outra forma de fazer

            int i;

            while((i=fr.read()) != -1){
                System.out.print((char)i);    // lembrar que ele retorna numeros ASCII, tem que converter para char
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
