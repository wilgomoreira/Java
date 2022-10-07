package site.wilgo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste05 {
    public static void main(String[] args) {

        try{
          // Uma outra forma de sintaxe é colocar as exceções na mesma linha para deixar o codigo mais limpo
            // porém so é possível exceções que não estão na mesma linha de herança. O JAVA avisa se não pode, dar erro de compilação

            throw new IndexOutOfBoundsException();

        }catch(IllegalArgumentException | IndexOutOfBoundsException e){
            System.out.println("Dentro do IllegalArgumentException | IndexOutOfBoundsException ");
        }catch(RuntimeException e){
            System.out.println("Dentro da RuntimeException ");
        }

        try{
            TalvezLanceException();

        }catch(SQLException | IOException e){
            System.out.println("Dentro do SQLException | IOException ");
        }

    }

    // No caso de exceções checked é a mesma ideia, pode capturar várias
    private static void TalvezLanceException() throws SQLException, IOException {
        throw new SQLException();
    }
}
