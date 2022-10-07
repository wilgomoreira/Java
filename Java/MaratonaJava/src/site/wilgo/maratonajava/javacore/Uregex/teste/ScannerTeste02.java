package site.wilgo.maratonajava.javacore.Uregex.teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {

        String texto = "Rosa,Preta,Lucia,true,200";  // Strings misturadas com inteiros e booleans
        Scanner scanner = new Scanner(texto);    // situações em que você tem tipos diferentes de variavel e quer separar elas
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                System.out.println("int: " +scanner.nextInt());
            }
            else if(scanner.hasNextBoolean()){
                System.out.println("boolean:" +scanner.nextBoolean());
            }
            else{
                System.out.println("Strings: " +scanner.next());
            }
        }
    }
}
