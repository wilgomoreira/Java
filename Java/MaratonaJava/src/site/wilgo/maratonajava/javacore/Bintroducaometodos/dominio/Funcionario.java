package site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        System.out.println("Salário:");

        if(this.salario == null) {
            return;
        }

        for (double num : this.salario) {
            System.out.println(num);
        }

        mediaSalario();
    }

    public void mediaSalario(){

        if (this.salario == null){
            return;
        }

        double total = 0;

        for (double num : this.salario) {
            total += num;
        }

        media = total/this.salario.length;

        System.out.println("A média de salario é: " +media);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
