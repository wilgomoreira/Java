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
            withdrawl(10);
            if(account.getBalance() < 0){
                System.out.println("LASCOU");
            }
        }

    }


    private void withdrawl(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThradeName() + " está indo sacar dinheiro");
            account.withdrawl(amount);
            System.out.println(getThradeName() + " completou o saque, o valor atual da conta: " + account.getBalance());
        } else {
            System.out.println(getThradeName() + " Sem dinheiro para sacar " + account.getBalance());
        }
    }

    private static String getThradeName() {
        return Thread.currentThread().getName();
    }
}

