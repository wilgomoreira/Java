package site.wilgo.maratonajava.javacore.ZZGBuilder.teste;

import site.wilgo.maratonajava.javacore.ZZGBuilder.dominio.Person;

public class BuilderTeste01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder.aPerson()
                .firstName("WIL")
                .lastName("MOR")
                .email("wilg@gmail.com")
                .build();

        System.out.println(person);

    }
}
