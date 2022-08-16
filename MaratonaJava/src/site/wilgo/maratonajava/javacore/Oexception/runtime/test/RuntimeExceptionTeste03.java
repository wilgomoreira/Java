package site.wilgo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        openConexion();

    }

    private static String openConexion(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no Arquivo");
            return "Conexão aberta";
        }catch (Exception e) {
            e.printStackTrace();
        }finally {   // Finally indica que sempre vai ser executado independente de qualquer coisa
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }
}
