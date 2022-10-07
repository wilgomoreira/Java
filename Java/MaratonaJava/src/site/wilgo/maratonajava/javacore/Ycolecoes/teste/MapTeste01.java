package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();  // para colocar na ordem da inserção, usar a classe LinkedHashMap

        // Não pode ter 2 chaves iguais, porém ter dois valores iguais com chaves diferentes
        map.put("tklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","voce");

        System.out.println(map);

        System.out.println("-----------------------------------");

        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-----------------------------------");

        for (String values : map.values()){
            System.out.println(values);
        }

        System.out.println("-----------------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
