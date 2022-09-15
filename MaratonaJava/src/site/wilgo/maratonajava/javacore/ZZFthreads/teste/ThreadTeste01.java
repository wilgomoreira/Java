package site.wilgo.maratonajava.javacore.ZZFthreads.teste;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable{

    private final char c;

    public ThreadExampleRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadTeste01 {

    public static void main(String[] args) {

        //Melhor usar Interface do que classes para Threads
        /*ThreadExample a1 = new ThreadExample('A');
        ThreadExample a2 = new ThreadExample('B');
        ThreadExample a3 = new ThreadExample('C');
        ThreadExample a4 = new ThreadExample('D');
        ThreadExample a5 = new ThreadExample('E');*/

        //executado pelo mesma Thread (main)
       /* a1.run();
        a2.run();
        a3.run();
        a4.run();
        a5.run();

        //executado por Threads diferentes
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start(); */

        //Uso da Interface Runnable, que no caso é bem melhor para esse caso:

        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "T4D");
        Thread t5 = new Thread(new ThreadExampleRunnable('E'), "T5E");

        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("############################### " +Thread.currentThread().getName());
    }
}
