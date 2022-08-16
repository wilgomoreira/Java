package site.wilgo.maratonajava.javacore.Oexception.exception.teste;

import site.wilgo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTeste01 {
    public static void main(String[] args) {

        try {
            logar();     // ALT + ENTER em cima da função pode colocar o TRY CATCH automaticamente
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {   // em Exceções do tipo Checked é obrigatório jogar pelo metodo
        String usuario = "Wilgo";
        String senha = "123";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Usuario: ");
        String digitUsuario = teclado.nextLine();

        System.out.println("Senha: ");
        String digitSenha = teclado.nextLine();

        if(!usuario.equals(digitUsuario) || !senha.equals(digitSenha)){
            throw new LoginInvalidoException("Usuario ou senha errado");
        }

        System.out.println("Usuario com acesso ao sistema");

    }

}
