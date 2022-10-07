package site.wilgo.maratonajava.javacore.ZZBcomportamento.teste;

import site.wilgo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import site.wilgo.maratonajava.javacore.ZZBcomportamento.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste02 {

    private static List<Car> carros = List.of(new Car("red",1998), new Car("green", 2001), new Car("blue", 2005));

    public static void main(String[] args) {

        /*List<Car> greenCars = filter(carros, new CarroPredicate() {
                 @Override
                public boolean teste(Car car) {
                return car.getColor().equals("green");
                 }
             });*/

        // o codigo abaixo é igual ao de cima (classe anonima).

        List<Car> greenCars = filter(carros, car -> car.getColor().equals("green"));
        List<Car> blueCars = filter(carros, car -> car.getColor().equals("blue"));
        List<Car> yearsCars = filter(carros, car -> car.getYear() < 2003);

        System.out.println(greenCars);
        System.out.println(blueCars);
        System.out.println(yearsCars);

    }

    private static List<Car> filter(List<Car> cars, CarroPredicate carroPredicate) {
        List<Car> filteredCars = new ArrayList<>();

        for(Car car : cars) {
            if(carroPredicate.teste(car)){
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }


}
