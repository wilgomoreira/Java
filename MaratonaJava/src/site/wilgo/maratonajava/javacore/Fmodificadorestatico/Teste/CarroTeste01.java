package site.wilgo.maratonajava.javacore.Fmodificadorestatico.Teste;

import site.wilgo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);     // Atribuindo um valor que irá para classe e se refletirá para todos os objetos
                                            // Agora é possivel funcionar o código sem criar objetos por conta do static
                                            // O programa não da erro.

       Carro c1 = new Carro("BMW",280);
       Carro c2 = new Carro("Mercedes",275);
       Carro c3 = new Carro("Audio",290);


       c1.imprime();
       c2.imprime();
       c3.imprime();

    }
}
