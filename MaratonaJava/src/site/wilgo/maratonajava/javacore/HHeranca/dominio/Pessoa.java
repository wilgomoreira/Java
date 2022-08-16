package site.wilgo.maratonajava.javacore.HHeranca.dominio;

public class Pessoa {
    protected String nome;      // O protected faz com quem todas as classes filhas (subclasses) tenham acesso as esses atributos
    protected  String cpf;      // diretamente como se fossem publicos
    protected  Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização Estatico de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização Não Estatico de Pessoa 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização Não Estatico de Pessoa 2 ");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }
    
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + "  " + this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
