package site.wilgo.maratonajava.javacore.Oexception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void Salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvado o arquivo");
    }
}
