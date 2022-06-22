package academy.javadojo.introduction;

public class PrimitiveType {
    public static void main(String[] args) {
        //sao tipos que vao guardar na memoria valores simples
        //int, double, float, char, byte, short, long, boolean

        int age = 25;
        long bigNumber = 100000;
        double salaryDouble = 5000;
        float salaryFloat = 6000;
        byte ageByte = 12;
        short ageShort = 15;
        boolean conditionalTrue = true;
        boolean conditionalFalse = false;
        char character = 'S';

        System.out.println("Your age is: " + age);
        System.out.println("long: " + bigNumber);
        System.out.println("double: " +salaryDouble);
        System.out.println("float: " +salaryFloat);
        System.out.println("byte: " +ageByte);
        System.out.println("short: " +ageShort);
        System.out.println("boolean: " +conditionalTrue);
        System.out.println("boolean: " + conditionalFalse);
        System.out.println("char: " + character);


        //String is a refenrential type

        String name = "John";
        System.out.println("Your name is: " + name);


    }
}
