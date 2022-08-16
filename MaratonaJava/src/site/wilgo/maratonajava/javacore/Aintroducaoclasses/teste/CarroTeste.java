package site.wilgo.maratonajava.javacore.Aintroducaoclasses.teste;

import site.wilgo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "PUNTO";
        carro1.modelo = "FIAT";
        carro1.ano = 2012;

        carro2.nome = "HB20";
        carro2.modelo = "HYUNDAY";
        carro2.ano = 2018;

        System.out.println("Carro1: " +carro1.nome+ ", modelo: "+carro1.modelo+ ", ano: "+carro1.ano);
        System.out.println("Carro2: " +carro2.nome+ ", modelo: "+carro2.modelo+ ", ano: "+carro2.ano);

        // para que objetos se refiram ao mesmo espaço de memória, ou seja, aos mesmos valores:

        carro2 = carro1;

        System.out.println("-------SE REFIRANDO AO MESMO ESPACO DE MEMORIA AGORA");

        System.out.println("Carro1: " +carro1.nome+ ", modelo: "+carro1.modelo+ ", ano: "+carro1.ano);
        System.out.println("Carro2: " +carro2.nome+ ", modelo: "+carro2.modelo+ ", ano: "+carro2.ano);



    }

}
