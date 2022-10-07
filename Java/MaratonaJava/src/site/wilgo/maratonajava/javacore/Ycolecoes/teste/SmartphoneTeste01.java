package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("76fdasf9", "Asus");
        Smartphone s2 = new Smartphone("7werwr", "SamSung");
        Smartphone s3 = new Smartphone("3435", "Iphone");

        List<Smartphone> smartphones = new ArrayList<>(6);  // Lista de objetos

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);   //posso determinar a posição que coloco o objeto na lista

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("7werwr", "Oi");

        // metodo que verifica se existe um objeto dentro da lista.
        // importância de ter um equals sobrescrito, pois o contains chama ele e vai de acordo com a logica estabelecida pela classe
        System.out.println(smartphones.contains(s4));   // resultado é true, pois no equals foi estabelecido que o serialnumber como criterio de igualdade

        int indexSmartphone = smartphones.indexOf(s4);    //pega o index dentro da lista
        System.out.println(smartphones.get(indexSmartphone));    // retorna o objeto a partir do index



    }
}
