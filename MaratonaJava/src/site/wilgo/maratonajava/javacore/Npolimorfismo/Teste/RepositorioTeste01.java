package site.wilgo.maratonajava.javacore.Npolimorfismo.Teste;

import site.wilgo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import site.wilgo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import site.wilgo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste01 {
    public static void main(String[] args) {

        //Orientação voltada a interfaces com polimorfismo

        Repositorio repositorio = new RepositorioBancoDeDados();   // a variavel de inferface é mais generica
        repositorio.salvar();

        repositorio = new RepositorioArquivo();
        repositorio.salvar();


    }
}
