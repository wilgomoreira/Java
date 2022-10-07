package site.wilgo.maratonajava.javacore.Aintroducaoclasses.teste;

import site.wilgo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        // new Estudante();       Posso criar um objeto sem variável de referência para criar um espaço de memoria, porém
                             // para acessar preciso de uma váriável de referência

        Estudante estudante = new Estudante();   // Se nao for inicializado, vai atribuir a inicilização padrão (sem valor ou valor NULL)
        // Ou irá vim com um valor atribuido dentro da classe, que será replicado para todos os objetos criados, o que não é
        // recomendado
    }
}
