package site.wilgo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // checked and unchecked (classe Exception)
// checked são filhas diretamente da classe Exception. Precisam de tratamento senao o codigo não compila

// unchecked são filhas da RuntimeException (filha da Exception). O problema que da é devido a um erro de desenvolvimento do programador.
// não precisam de tratamento. Ocorrem durante o erro de execução
        // Exemplo de RuntimeException:

        Object object = null;

        System.out.println(object.toString());




    }
}
