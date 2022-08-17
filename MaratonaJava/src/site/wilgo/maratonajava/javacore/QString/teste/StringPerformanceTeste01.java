package site.wilgo.maratonajava.javacore.QString.teste;

public class StringPerformanceTeste01 {

    public static void main(String[] args) {

      long inicio = System.currentTimeMillis();

      concatenarString(50_000);

      long fim = System.currentTimeMillis();

      System.out.println("time running: " +(fim - inicio)+ " ms");

//----------------------------------------------------------------------------------
      inicio = System.currentTimeMillis();

      concatenarStringBuilder(50_000);

      fim = System.currentTimeMillis();

      System.out.println("time running: " +(fim - inicio)+ " ms");

//----------------------------------------------------------------------------------

      inicio = System.currentTimeMillis();

      concatenarStringBuffer(50_000);

      fim = System.currentTimeMillis();

      System.out.println("time running: " +(fim - inicio)+ " ms");

    }

    public static void concatenarString(int tamanho){

        String word = "";

        for (int i = 0; i < tamanho; i++) {
            word += i;
        }


    }

    public static void concatenarStringBuilder(int tamanho){

        StringBuilder word = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            word.append(i);
        }

    }

    public static void concatenarStringBuffer(int tamanho){

        StringBuffer word = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            word.append(i);
        }

    }
}
