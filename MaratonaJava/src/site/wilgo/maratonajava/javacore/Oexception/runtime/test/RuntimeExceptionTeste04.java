package site.wilgo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {

        try{
          //  throw new ArrayIndexOutOfBoundsException();
        // Podemos ter várias capturas para pegar as varias exceções.
        // A mais generica (ex: Runtime Exception) deve ficar no final para não prejudicar a captura das outras
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro da ArrayIndexOutOfBoundsException ");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro da IndexOutOfBoundsException ");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro da llegalArgumentException ");
        }catch(RuntimeException e){
            System.out.println("Dentro da RuntimeException ");
        }

        try{
            TalvezLanceException();

        }catch(SQLException e){
            System.out.println("Dentro do SQLException ");
        }catch (FileNotFoundException e){
            System.out.println("Dentro do FileNotFoundException ");
        }

    }

    // No caso de exceções checked é a mesma ideia, pode capturar várias
    private static void TalvezLanceException() throws SQLException, FileNotFoundException {
        throw new FileNotFoundException();
    }
}
