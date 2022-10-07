package site.wilgo.maratonajava.javacore.ZZBcomportamento.teste;

import site.wilgo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import site.wilgo.maratonajava.javacore.ZZBcomportamento.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste03 {

    private static List<Car> carros = List.of(new Car("red",1998), new Car("green", 2001), new Car("blue", 2005));

    public static void main(String[] args) {


        List<Car> greenCars = filter(carros, car -> car.getColor().equals("green"));
        List<Car> blueCars = filter(carros, car -> car.getColor().equals("blue"));
        List<Car> yearsCars = filter(carros, car -> car.getYear() < 2003);

        System.out.println(greenCars);
        System.out.println(blueCars);
        System.out.println(yearsCars);

        List<Integer> nums = List.of(2,4,3,2,1,5,6,7,8,9);
        System.out.println(filter(nums, num -> num % 2 == 0));

    }

    private static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();

        for(T t : list){
            if(predicate.test(t) ){
                filteredList.add(t);
            }
        }
        return filteredList;
    }



}
