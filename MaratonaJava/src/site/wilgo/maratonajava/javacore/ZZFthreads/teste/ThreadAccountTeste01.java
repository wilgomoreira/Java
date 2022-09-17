package site.wilgo.maratonajava.javacore.ZZFthreads.teste;

import site.wilgo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTeste01 implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTeste01 threadAccountTeste01 = new ThreadAccountTeste01();
        Thread t1 = new Thread(threadAccountTeste01, "Arnaldo");
        Thread t2 = new Thread(threadAccountTeste01, "Rita");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                withdrawl(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(account.getBalance() < 0){
                System.out.println("LASCOU");
            }
        }

    }

// o metodo fica bloqueado para que a Thread que come�ou termine, n�o pode outra Thread entrar para executar
    private synchronized void withdrawl(int amount) throws InterruptedException {
        if (account.getBalance() >= amount) {
            System.out.println(getThradeName() + " est� indo sacar dinheiro");
            account.withdrawl(amount);

            Thread.sleep(1000);

            System.out.println(getThradeName() + " completou o saque, o valor atual da conta: " + account.getBalance());
        } else {
            System.out.println(getThradeName() + " Sem dinheiro para sacar " + account.getBalance());
        }
    }

    private static String getThradeName() {
        return Thread.currentThread().getName();
    }
}

