package site.wilgo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {

    private String title;
    private int episodies;

    public Anime(String title, int quantity) {
        this.title = title;
        this.episodies = quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodies=" + episodies +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodies() {
        return episodies;
    }
}
