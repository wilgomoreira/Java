package site.wilgo.maratonajava.javacore.Ycolecoes.teste;

import site.wilgo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ASDDF", "Iphone");
        Smartphone s2 = new Smartphone("1ASDDF", "Iphone");

        System.out.println(s1.equals(s2));   // vai dar falso porque eles se referem a objetos diferentes na memoria

        s2 = s1;   // igualando as duas referências

        System.out.println(s1.equals(s2));  // agora assim será verdadeiro, pois faz referencia ao mesmo objeto da memoria
    }
}
