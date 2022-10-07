package site.wilgo.maratonajava.introducao;

/*public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
         int diaDaSemana = 5;

         switch (diaDaSemana){
             case 1:
                 System.out.println("Hoje é domingo, é fim de semana");
                 break;
             case 2:
                 System.out.println("Hoje é segunda, é dia util");
                 break;
             case 3:
                 System.out.println("Hoje é terça, é dia util");
                 break;
             case 4:
                 System.out.println("Hoje é quarta, é dia util");
                 break;
             case 5:
                 System.out.println("Hoje é quinta, é dia util");
                 break;
             case 6:
                 System.out.println("Hoje é sexta, é dia util");
                 break;
             case 7:
                 System.out.println("Hoje é sabado, é fim de semana");
                 break;

         }

    }
}*/

// outra forma de fazer o exercicio

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

    }
}