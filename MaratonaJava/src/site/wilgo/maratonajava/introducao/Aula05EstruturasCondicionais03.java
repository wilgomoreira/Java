package site.wilgo.maratonajava.introducao;

//Operador ternario para condição

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario for > 5000

        double salario = 3000;

        String mensDoar = "Eu vou doar por quero";
        String mensNaoDoar = "Eu nao vou doar";

        String resultado = salario > 5000 ? mensDoar : mensNaoDoar;

        System.out.println(resultado);

    }
}

// É possivel usar o operarador condicional ternario para uma situação que tenha mais de 2 condições, porém o código
// fica muito poluido
// ex: condição 1 ? true : condição 2 ? true : false


