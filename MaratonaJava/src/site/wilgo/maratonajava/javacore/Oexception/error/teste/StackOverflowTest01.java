package site.wilgo.maratonajava.javacore.Oexception.error.teste;

public class StackOverflowTest01 {
    public static void main(String[] args) {

        recursividade();

    }

    public static void recursividade(){
        recursividade();
    }
}

// Erro ocorre na JVM em tempo de execução e não tem como recuperar. Ex: StackOverflow
// erro é uma filha da classe mae Throwable, que sua vez é mae de outra classe (exception).
// As duas filhas são diferentes entre em si. A classe Exception ainda tem mais filhas. A erro não tem.


