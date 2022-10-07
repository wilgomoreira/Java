package site.wilgo.maratonajava.javacore.Jmodificadorfinal.dominio;

public final class Carro {    // final pode ser colocado na classe para que ela não possa ter filhos.
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // uso de constantes no Java usa a palavra final, nunca será alterada.
    // Por convenção constantes são escritas em maiusculo com underline para separar palavras compostas
    // Sempre vem junto com a palavra static. E a constante precisa ser inicializada

    public final Comprador COMPRADOR = new Comprador();    // uso de constante com objeto

    //Outra forma de inicializar: (alem dos blocos de inicialização), poderia ser feito a inicialização através do Construtor

 /*   static{
        VELOCIDADE_LIMITE = 250;     //Bloco de inicialização estatico
    }
*/

  /*  public Carro() {
        VELOCIDADE_LIMITE = 250;   // claro se não houvesse o estatico
    }
*/

    public final void imprime(){   // pode-se colocar final nos metodos para que eles não sejam herdados nos filhos
                                    // quando se coloca o final na classse, não precisa colocar nos metodos.

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
