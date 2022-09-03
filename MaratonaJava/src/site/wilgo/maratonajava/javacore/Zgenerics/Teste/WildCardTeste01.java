package site.wilgo.maratonajava.javacore.Zgenerics.Teste;

abstract class Animal{

    public abstract void consulta();

}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Voce é um dog");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Voce é um gato");
    }
}


public class WildCardTeste01 {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        Animal[] animals = {new Cachorro(), new Gato()};   // executa normalmente e não da problema, polimorfismo

        printConsulta(cachorros);
        printConsulta(gatos);
        printConsulta(animals);

    }

    public static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
