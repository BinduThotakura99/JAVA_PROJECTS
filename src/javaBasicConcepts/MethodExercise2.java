package javaBasicConcepts;

public class MethodExercise2 {
    public static void main(String[] args) {
        System.out.println("The output of multiplication is " + MethodExercise2.multiplyNumbers(7,7));
        System.out.println("The output of multiplication is " + multiplyNumbers(8,8));
    }
    public static int multiplyNumbers(int num1, int num2){
        int multiplication = num1 * num2;
        return multiplication;
    }
}
