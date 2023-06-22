package javaBasicConcepts;

public class TypeCasting {
    public static void main(String[] args) {
        // Automatic type casting converts a smaller type into a larger type. For example:
        int intNumber = 3;
        double doubleNumber = intNumber;
        System.out.println("The double number is " + doubleNumber);

        //Manual Typecasting converts larger type to small type and Convert one object type into another
        double doubleNumber1 = 3.5;
        int intNumber1 = (int) doubleNumber1;
        System.out.println("The int number is " + intNumber1);
    }
}
