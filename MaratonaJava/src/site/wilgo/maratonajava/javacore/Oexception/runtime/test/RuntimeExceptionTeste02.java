package site.wilgo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTeste02 {
    // caso em que podemos se quiser tratar o erro unchecked da Exception Runtime e suas filhas, que não são obrigadas a ter tratamento

    public static void main(String[] args) {
        System.out.println(divisao(1,0)); // da um erro de Runtime exception, não é obrigado o tratamento, mas podemos fazer.
    }

    private static int divisao(int a, int b)  throws RuntimeException {  // avisa no metodo chamado que pode dar erro de Exceção

       /* try{
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return 0;*/    // seria um forma de fazer o codigo acima, porém ter uma forma melhor logo abaixo

        if(b == 0){
            //throw new RuntimeException("Argumento invalido, não pode ser 0"); // Poderia ser usada
            //outra classe que pode ser usada, é a filha de RuntimeException: Ajuda a outro desenvolvedor entender melhor que esta acontecendo pelo nome do metodo
            throw new IllegalArgumentException("Argumento invalido, não pode ser 0");
        }

        return a/b;
    }
}
