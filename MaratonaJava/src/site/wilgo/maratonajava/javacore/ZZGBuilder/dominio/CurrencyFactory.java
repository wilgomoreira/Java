package site.wilgo.maratonajava.javacore.ZZGBuilder.dominio;

import static site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.Country.BRAZIL;
import static site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.Country.USA;

public class CurrencyFactory {

    public static Currency newCurrency (Country country){
        return switch (country) {
            case BRAZIL -> new Real();
            case USA -> new DollarUSA();
            case EU -> new Euro();
            default -> throw new IllegalArgumentException("No Currency found this country");
        };
    }
}
