package site.wilgo.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {

    public static void main(String[] args) throws IOException {
        criarArquivo();  // se nao tiver o arquivo permissão para criar, dar um erro exception checked. Necessita de tratamento
    }

    private static void criarArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");

        try{
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso");
        }catch (IOException e){  // NUNCA DEIXAR ESSE CATCH EM BRANCO, É REPROVADO EM ENTREVISTA
            e.printStackTrace(); // vai mostrar todo o caminho que o JAVA tentou para resolver e não conseguiu
            throw e;
        }

    }
    
}
