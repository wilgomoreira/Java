package site.wilgo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // apertar CTRL+O para acessar o menu e escolher a opção sobrescrever o metodo Equals
    // Reflexivo: x.equals(x) que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferentes de null, se x.equals(y) igual a true, logo, y.equals(x) igual a true também
    // transitividade: para x, y e z, diferentes de null, se x.equals(y) é true, e x.equals(z) é true, logo, y.equals(z) também é true
    // consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false.

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashcode() == x.hashcode()
    // y.hashcode() == x.hashcode() não necessariamente o equals de y.equals(x) tem que ser true, pode ter objetos diferentes
    // x.equals(y) == false
    // y.hashcode() e != x.hashcode(), x.equals(y) deverá ser false.

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();   // chama o JAVA para gerar o hash
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}




