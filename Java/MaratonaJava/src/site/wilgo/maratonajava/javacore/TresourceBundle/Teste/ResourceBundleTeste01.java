package site.wilgo.maratonajava.javacore.TresourceBundle.Teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        //pegando o bundle do meu pc default (dentro do arquivo)
        ResourceBundle bundle1 = ResourceBundle.getBundle("mensagem", new Locale("en","GB"));
        System.out.println(bundle1.getString("whatsup"));

        //pegando do arquivo em outra lingua
        ResourceBundle bundle2 = ResourceBundle.getBundle("mensagem", new Locale("pt","BR"));
        System.out.println(bundle2.getString("whatsup"));

        //quando ele não acha no arquivo especificado, ele procura na arvore mais acima, no caso (mesagem.properties)
        System.out.println(bundle2.getString("patio"));
    }

}
