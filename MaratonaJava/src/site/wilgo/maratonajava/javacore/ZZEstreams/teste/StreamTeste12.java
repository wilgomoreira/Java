package site.wilgo.maratonajava.javacore.ZZEstreams.teste;

import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.Category;
import site.wilgo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste12 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 2.33, Category.FANTASY),
            new LightNovel("Dragon Ball", 4.99, Category.DRAMA),
            new LightNovel("Yokachu", 4.00, Category.FANTASY),
            new LightNovel("Cavaleiros do Zodiaco", 2.99, Category.ROMANCE),
            new LightNovel("Cavaleiros do Zodiaco", 2.99, Category.ROMANCE),
            new LightNovel("Sailormoon", 8.99, Category.FANTASY),
            new LightNovel("Jiraya", 7.99, Category.DRAMA)
    ));

    public static void main(String[] args) {

        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightnovel : lightNovels){
            switch(lightnovel.getCategory()){
                case FANTASY: fantasy.add(lightnovel); break;
                case DRAMA: drama.add(lightnovel); break;
                case ROMANCE: romance.add(lightnovel); break;
            }

        }

        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.ROMANCE, romance);
        categoryListMap.put(Category.FANTASY, fantasy);

        System.out.println(categoryListMap);


        //outra forma de fazer usando Stream e collectors

        Map<Category, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(collect);
    }
}
