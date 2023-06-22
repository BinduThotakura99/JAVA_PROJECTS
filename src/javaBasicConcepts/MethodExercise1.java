package javaBasicConcepts;

public class MethodExercise1 {
    public static void main(String[] args) {
        System.out.println("The sum is "+ MethodExercise1.addNumbers(7,7));
    }
    //Adding method
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }
}
