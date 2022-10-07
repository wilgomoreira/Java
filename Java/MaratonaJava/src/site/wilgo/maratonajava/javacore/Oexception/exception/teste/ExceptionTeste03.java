package site.wilgo.maratonajava.javacore.Oexception.exception.teste;

import site.wilgo.maratonajava.javacore.Oexception.dominio.Funcionario;
import site.wilgo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;
import site.wilgo.maratonajava.javacore.Oexception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class ExceptionTeste03 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        }catch (LoginInvalidoException | FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
