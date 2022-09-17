package site.wilgo.maratonajava.javacore.ZZFthreads.teste;

public class DeadLockTeste01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        /// DeadLock é quando um programa fica bloqueado, sem que as threads consigam avançar para executar o codigo, da conflito
        // pois uma esta presa em outra parte do código

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

        // para que não tenha DeadLock basta inverter os locks e deixa-los iguais entre si na execução do cdígo.
    }
}
