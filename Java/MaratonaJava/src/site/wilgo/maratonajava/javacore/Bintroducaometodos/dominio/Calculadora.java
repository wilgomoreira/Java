package site.wilgo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(15 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2){  // Metodo com 2 parametros
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;   // Return pode ser usado em função que não retorna nada (void), ele funciona como um break para sair.
                      // Não usar o break, pois o break da erro.
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do metodo Altera dois numeros");
        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;

        for (int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){    // outra forma de passar um array como parametro
                                                // Em uma função com mais de um parametro, varargs precisa ser o ultimo parametro
        int soma = 0;

        for (int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }
}
