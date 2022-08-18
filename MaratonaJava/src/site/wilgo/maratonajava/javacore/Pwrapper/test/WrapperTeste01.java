package site.wilgo.maratonajava.javacore.Pwrapper.test;

public class WrapperTeste01 {

    public static void main(String[] args) {

        // variaveis primitives:  they are used more when its possible

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // variaveis like Class, Object: using like references, used for methods, list, collections

        Byte byteW = 1;
        Short shoWtW = 1;
        Integer intW = 1;    // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW;   // unboxing

        Integer intW2 = Integer.parseInt("234");   //transforme in Integer
        boolean verdadeiro = Boolean.parseBoolean("TruE");   // Transforme in Boolean

        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('j'));
        System.out.println(Character.isLetter('j'));
        System.out.println(Character.toUpperCase('a'));






    }

}
