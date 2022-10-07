package site.wilgo.maratonajava.introducao;

/* Uma forma de fazer:

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 18){
            System.out.println("Autorizado a comprar");
        }
    }
}
*/

// Outra forma de fazer

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 19;

        boolean isAutorizado = age >= 18;

        if(isAutorizado){                                 // Esses if e else são dependentes, executa um ou outro
            System.out.println("Autorizado a comprar");
        }else{                                            // Else não pode ser sozinho, sempre vem junto com um if
            System.out.println("Nao autorizado a comprar");
        }

        if(!isAutorizado){                          // Esse if é independente do anterior e será executado para checar
            System.out.println("Nao autorizado a comprar");
        }
    }
}
