package site.wilgo.maratonajava.javacore.ZZFthreads.teste;

public class DeadLockTeste01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        /// DeadLock � quando um programa fica bloqueado, sem que as threads consigam avan�ar para executar o codigo, da conflito
        // pois uma esta presa em outra parte do c�digo

        Runnable runnable1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: Segurando o Lock 1");
                System.out.println("Thread 1: esperando o Lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Segurando o Lock 2");
                }
            }

        };

        Runnable runnable2 = () -> {
            synchronized (lock2){
                System.out.println("Thread 2: Segurando o Lock 2");
                System.out.println("Thread 2: esperando o Lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2: Segurando o Lock 1");
                }
            }

        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();

        // para que n�o tenha DeadLock basta inverter os locks e deixa-los iguais entre si na execu��o do cd�go.
    }
}
