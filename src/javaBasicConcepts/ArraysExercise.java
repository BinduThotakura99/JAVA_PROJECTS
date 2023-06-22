package javaBasicConcepts;

public class ArraysExercise {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        int[] numbers = new int[]{1,2,3,4,5};
//        String[] words = {"Ignition Sequence Start!", "Liftoff!"};
//        String[] words = new String[]{"Ignition Sequence Start!", "Liftoff!"};

//        System.out.println(words[0]);
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(words[1]);

        // Creating an Array with new
        // Initialize the array to a size (in this case, five)
        int[] numbers = new int[5];

        // Add integers to each of the five locations in the array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
       for(int i =0; i < numbers.length; i++){
           System.out.println(numbers[i]);
       }

    }
}
