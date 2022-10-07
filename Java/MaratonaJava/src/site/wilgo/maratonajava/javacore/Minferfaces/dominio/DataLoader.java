package site.wilgo.maratonajava.javacore.Minferfaces.dominio;

public interface DataLoader {
    // por padrão os atributos são constantes (final) e estaticos, não precisa declarar

    public static final int MAX_SIZE = 10;

// todos os metodos são publicos e abstratos
    public abstract void load();    // não tem necessidade de colocar public e abstract já que é uma interface

    // Metodo abaixo é exceção para a interface, pois não é abstrata e é usado quando quando não se quer colocar o metodo em todas as classes com a
    // a interface implementada
    default void checkPermission(){
        System.out.println("Checando permissões");  // funciona com um metodo concreto praticamente
    }

    //podemos criar também um metodo estatico
    // metodo vai pertencer a interface e pode ter na classe o mesmo metodo sem sobrescrever, não é possivel sobrescrever

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do metodo estatico na interface DataLoader");
    }

}
