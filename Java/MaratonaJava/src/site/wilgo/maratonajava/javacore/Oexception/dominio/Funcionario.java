package site.wilgo.maratonajava.javacore.Oexception.dominio;


// A classe filha não é obrigada a herdar as exceções do pai, ela pode ter outra exceções, porém não pode ter exceções
// mais genericas que a do Pai, somente abaixo.

import java.io.FileNotFoundException;

// exceções do tipo unchecked não precisam ser tratadas, apenas checked
public class Funcionario extends Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvado novo arquivo");
    }
}
