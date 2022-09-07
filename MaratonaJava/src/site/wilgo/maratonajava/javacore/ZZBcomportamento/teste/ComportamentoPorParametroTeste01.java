package site.wilgo.maratonajava.javacore.ZZBcomportamento.teste;

import site.wilgo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {

    private static List<Car> carros = List.of(new Car("red",1998), new Car("green", 2001), new Car("blue", 2005));

    public static void main(String[] args) {

        System.out.println(filterGreenCar(carros));
        System.out.println(filterRedCar(carros));
        System.out.println(filterCarByColor(carros, "blue"));
        System.out.println(filterCarByYear(carros, 2003));

    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();

        for(Car car : cars){
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }

        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> redCars = new ArrayList<>();

        for(Car car : cars){
            if(car.getColor().equals("red")){
                redCars.add(car);
            }
        }

        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> CarsByColor = new ArrayList<>();

        for(Car car : cars){
            if(car.getColor().equals(color)){
                CarsByColor.add(car);
            }
        }

        return CarsByColor;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year){
        List<Car> CarsByYear = new ArrayList<>();

        for(Car car : cars){
            if(car.getYear() < year){
                CarsByYear.add(car);
            }
        }

        return CarsByYear;
    }

}
