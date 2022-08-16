package site.wilgo.maratonajava.javacore.Npolimorfismo.servico;

import site.wilgo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
