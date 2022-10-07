package site.wilgo.maratonajava.javacore.HHeranca.dominio;

public class Funcionario extends Pessoa {  // usa herança quando uma classe é outra com mais atributos

    public double salario;

    static{
        System.out.println("Dentro do bloco de inicialização Estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Não Estatico de Funcionario 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização Não Estatico de Funcionario 2 ");
    }

    public Funcionario(String nome){
        super(nome);    // Chama o construtor da classe pai (mais geral)
        System.out.println("Dentro do Construtor da classe Funcionario");
    }

    public void imprime(){       // Sobre escreve o metodo do pai para ser usado com um objeto filho
        super.imprime();      // Puxa a função da classe mais generica (pai)
        System.out.println(this.salario);
    }

    public void relatorioPag(){
        System.out.println("Eu" +this.nome+ "recebi o salário de " +this.salario);
        // Por conta do protected da classe pai (Pessoa) eu consigo acessar diretamente o atributo nome.
        // Classes dentro do mesmo pacote também tem acesso diretamente.
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
