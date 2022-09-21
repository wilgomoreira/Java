package site.wilgo.maratonajava.javacore.ZZGBuilder.teste;

import site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.Country;
import site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.Currency;
import site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.CurrencyFactory;

public class FactoryTeste01 {
    public static void main(String[] args) {

        //Factory é quando se criar um outra classe com metodos estatico apenas para resolver a logica de negocio,
        /// retira do construtor, o que deixa o codigo mais desacoplado e mais facil de dar manutenção.

        Currency currency1 = CurrencyFactory.newCurrency(Country.BRAZIL);
        Currency currency2 = CurrencyFactory.newCurrency(Country.USA);
        Currency currency3 = CurrencyFactory.newCurrency(Country.EU);

        System.out.println(currency1.getSymbol());
        System.out.println(currency2.getSymbol());
        System.out.println(currency3.getSymbol());

    }
}
