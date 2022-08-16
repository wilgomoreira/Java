package site.wilgo.maratonajava.javacore.Gassossiacao.dominio;

public class Local {

    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

   /* public void imprime(){
        System.out.println("-----LOCAL-------");
        System.out.println("Endereco: "+this.getEndereco());
    }*/

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
