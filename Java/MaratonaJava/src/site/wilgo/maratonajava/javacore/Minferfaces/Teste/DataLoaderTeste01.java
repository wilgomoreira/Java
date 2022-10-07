package site.wilgo.maratonajava.javacore.Minferfaces.Teste;

import site.wilgo.maratonajava.javacore.Minferfaces.dominio.DataBaseLoader;
import site.wilgo.maratonajava.javacore.Minferfaces.dominio.DataLoader;
import site.wilgo.maratonajava.javacore.Minferfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();  // metodos abstratos da interface sobrecarregados nas classes
        fileLoader.load();  // metodos abstratos da interface sobrecarregados nas classes

        dataBaseLoader.remove(); // metodos abstratos da interface sobrecarregados nas classes
        fileLoader.remove();// metodos abstratos da interface sobrecarregados nas classes

        dataBaseLoader.checkPermission();  // metodo concreto e não abstrato da interface (exceção), pois declarado com default para essa condição
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();   // metodos estaticos que não pode ser sobreescrito, esse é da interface
        DataBaseLoader.retrieveMaxDataSize();  // esse metodo pertence a classe
    }
}
