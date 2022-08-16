package site.wilgo.maratonajava.javacore.Gassossiacao.teste;

import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Jogador;
import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");


        jogador1.setTime(time);
        jogador1.imprime();
    }
}
