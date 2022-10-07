package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste01 {
    public static void main(String[] args) {
        // similar ao NavigableSt porém agora com a passagem de 2 paramentros

        NavigableMap< String, String> map = new TreeMap<>();

        map.put("A", "Letra A");
        map.put("E", "Letra E");
        map.put("C", "Letra C");
        map.put("B", "Letra B");
        map.put("D", "Letra D");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + "--" +entry.getValue());
        }

        // Usar metodos que encontram obejtos logo abaixo ou acima do objeto em questão:
        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("--------------------------------------------------------");
        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.lowerKey("C"));

    }
}
