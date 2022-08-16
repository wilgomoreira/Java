package site.wilgo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double salary = 70000;
        double tax = 0;

        if(salary > 0 && salary <= 34712){
            tax = salary * 9.70/100;
        } else if(salary > 34712 && salary <= 68507){
            tax = salary * 37.35/100;
        }else{
            tax = salary * 49.50/100;
        }

        System.out.println("Your tax is "+ tax);

    }
}
