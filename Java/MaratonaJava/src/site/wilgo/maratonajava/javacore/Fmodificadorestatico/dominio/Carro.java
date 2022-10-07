package site.wilgo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;  // quando coloca static, a variavel passa a ser da classe e não mais do objeto
                                                    // Caso ele mude de valor, todos os objetos terão o mesmo valor.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------------------");
        System.out.println("nome: "+this.nome);
        System.out.println("velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("velocidade Limite: "+Carro.velocidadeLimite);    // pode usar o this, pois a função acima precisa de objeto
    }


    // Metodos com static para set e get por conta do do atributo static

    public static void setVelocidadeLimite(double velocidadeLimite){    // esse metodo pode ser chamada sem objeto por conta do static
        Carro.velocidadeLimite = velocidadeLimite;                      // this não existe em metodos static

    }

    public static double getVelocidadeLimite(){       // esse metodo pode ser chamada sem objeto por conta do static
                                                      // recomenda usar metodos static quando o metodo não usar atribuitos da instância.
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        velocidadeMaxima = velocidadeMaxima;
    }


}
