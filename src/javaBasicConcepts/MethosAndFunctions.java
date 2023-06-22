package javaBasicConcepts;

public class MethosAndFunctions {
    public static void main(String[] args) {
        /* All methods are functions but all functions are not methods
        * Method associated with classes and objects and reusable/ callable block of code*/
        double area1 = findArea(5.0,7.0);
        double area2 = findArea(6.0, 2.5);
        System.out.println("The area of area1 is  " + area1 +"\\ area2 is  " + area2);
    }

 public static double findArea(double length, double width) {
        double area = length * width;
        return area;
    }
}


