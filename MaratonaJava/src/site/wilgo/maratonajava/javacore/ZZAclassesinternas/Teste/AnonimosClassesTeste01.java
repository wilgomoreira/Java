package site.wilgo.maratonajava.javacore.ZZAclassesinternas.Teste;

class Animal{
    public void Andar(){
        System.out.println("Andando pelo chão");
    }
}


// classes anonimas são usadas apenas em uma parte do codigo, depois não existem mais.

public class AnonimosClassesTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){

            @Override
            public void Andar() {
                System.out.println("Andando pelo mar");
            }
        };

        animal.Andar();
    }
}
