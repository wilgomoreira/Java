package site.wilgo.maratonajava.javacore.Gassossiacao.teste;

import site.wilgo.maratonajava.javacore.Gassossiacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Kaka");
        Jogador jogador3 = new Jogador("Maradona");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
