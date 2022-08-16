package site.wilgo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {   // pode vim dentro da classe que esta sendo usada, porem fica desorganizado o codigo
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    // processo para colocar números:

    private int VALOR;   // varivael sempre depois dos nomes que representam os numeros, senão da erro
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;

    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) { // Metodo para retornar a numeração baseada em algum dos arqgumentos

        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
