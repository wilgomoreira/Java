package site.wilgo.maratonajava.javacore.ZZAclassesinternas.Teste;

public class OuterClassesTeste01 {     // classes internas são usadas em interfaces graficas
    private String name = "Julio";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClassesTeste01 = new OuterClassesTeste01();

        Inner inner = outerClassesTeste01.new Inner();
        Inner inner2 = new OuterClassesTeste01().new Inner();

        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
