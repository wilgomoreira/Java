package site.wilgo.maratonajava.javacore.ZZAclassesinternas.Teste;

public class OuterClassesTeste02 {     // classes internas são usadas em interfaces graficas
    private String nome = "Maria";

    void print(){
        String ultimoNome = "Moreira";

        class LocalClass {
            public void printLocal(){
                System.out.println(nome+ " "+ultimoNome);
            }
        }

        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTeste02 outerClassesTeste02 = new OuterClassesTeste02();
        outerClassesTeste02.print();
    }
}
