package site.wilgo.maratonajava.javacore.Minferfaces.dominio;


// Com interfaces podemos fazer a implementação de varias interfaces, já com a Herança não é possivel multiplas
public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    public static void retrieveMaxDataSize(){      // mesmo nome do metodo da interface que é estatico, não existe sobrescrita
        System.out.println("Dentro do metodo do DataBase");
    }
}
