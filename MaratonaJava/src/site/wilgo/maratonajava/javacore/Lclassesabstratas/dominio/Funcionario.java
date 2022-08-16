package site.wilgo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {   // Classe Abstrata funciona como um template que não permite criar algo concreto (instanciar)
    // nunca colocar "final" em uma classe abstrata, já que a função dela é apenas gerar filhos, ao contratio do final
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    public abstract void calculaBonus();// usa o metodo dos filhos quando é abstract
    // e metodos abstratos so podem existir em classes abstratas, se tirar o abstrato da classe, da erro de compilação
    // mas uma classe abstrata pode ter metodos abstratos e metodos concretos



}
