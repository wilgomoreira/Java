package site.wilgo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {  // Interface usada para ordenar objetos
  private Long id;
  private String nome;
  private double preco;
  private int quantidade;

    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga outroObjeto) {    // para sobrescrever e ordenar elementos
        // negativo se o this < outroObjeto
        // se this == outroObjeto, return 0
        // positivo se this > outroObjeto

        // fazendo para ordenar o ID:

        /*if(this.id < outroObjeto.getId()) {
            return -1;
        }
        else if(this.id.equals(outroObjeto.getId())) {
            return 0;
        }else{
            return 1;
        }*/

        //outra formas de fazer:

       // return this.id.compareTo(outroObjeto.getId());   // esse metodo de vem do Wrap LONG. Deixa o codigo mais limpo

        //ordenar pelo preço:
        //return Double.valueOf(preco).compareTo(outroObjeto.getPreco()); //ou
        //return Double.compare(preco, outroObjeto.getPreco()); //ou

        //ordenar pelo nome:
        return this.nome.compareTo(outroObjeto.getNome());

    }
}
