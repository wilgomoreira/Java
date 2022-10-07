package site.wilgo.maratonajava.javacore.ZZGBuilder.teste;

import site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.*;

public class ReportDtoTeste01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.aPerson().firstName("Wil").build();

        ReportDto reportDto = ReportDto
                .ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currencyName(currency.getSymbol())
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);


    }
}
