package site.wilgo.maratonajava.javacore.Oexception.dominio;


//Classe customizada para para tratar exceção: ela pode ser do tipo checked ou unchecked vai depender do desejo do desenvolvedor
// para escolher, é so vem de onde ela vai herar as exceções

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
