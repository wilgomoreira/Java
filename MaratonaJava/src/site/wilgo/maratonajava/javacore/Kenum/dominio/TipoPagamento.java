package site.wilgo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {    // pode vim na classe o enum, mas não fica organizado dentro do codigo
    DEBITO {
        @Override
        public double calculaDesconto(double valor) {  // aperta CTRL + O para criar um função sobrescrita de outra
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculaDesconto(double valor); // Função que será sobrescrita e que nunca será usada, por isso pode ser usada como abstract

    // função abstrata não tem nada no corpo
}