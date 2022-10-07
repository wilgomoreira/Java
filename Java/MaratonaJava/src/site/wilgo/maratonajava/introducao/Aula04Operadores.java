package site.wilgo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores matemáticos:  + - * /

        double n1=10;
        double n2=2;

        double r1 = n1+n2;
        double r2 = n1-n2;
        double r3 = n1*n2;
        double r4 = n1/n2;

        System.out.println("Valor: "+ r1);
        System.out.println("Valor: "+ r2);
        System.out.println("Valor: "+ r3);
        System.out.println("Valor: "+ r4);

        //operadores relacionais: < > <= >= == != retornam valores booleans

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // operadores lógicos: and (&&) or (//) not (!)
        int age=35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salario >= 4612;

        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double valorContaCorrente = 500;
        double valorContaPoupanca = 1000;
        float valorTenis = 700F;     //F enfatiza para o numero ser float

        boolean isCompravel = valorContaCorrente > valorTenis || valorContaPoupanca > valorTenis;

        System.out.println("O tenis é: "+ isCompravel);


        // Atribuições: = += -= *= /= %=

        double premio = 1000;
        premio = premio + 500;
        premio += 200;
        premio -= 100;
        premio *= 2;
        premio /= 2;

        System.out.println("Premio: " +premio);

        //contador (formas diferentes de escrever), o incremento é feito depois
        int contador = 0;
        contador = contador + 1;
        contador += 1;
        contador++;
        contador--;

        // nesse caso o incrimento ou decremento é feito primeiro
        ++contador;
        --contador;



    }
}
