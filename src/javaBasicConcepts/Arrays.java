package javaBasicConcepts;

public class Arrays {
    public static void main(String[] args) {
        /*Declare the type of the array, using brackets (as in int []).
          Name the array (in this example, the name is numbers).
          Add values to the array.*/
        int [] numbers  = {1, 2, 3, 4};

        //Accessing Array Element
        System.out.println(numbers[3]);

        // System.out.println(numbers[4]); ArrayIndexOutOfBoundsException

        //Another Way to Create an Array. This approach uses the new keyword to create a new array object of size 4
        int [] numbers1 = new int[4];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        numbers1[3] = 4;

        System.out.println(numbers1[1]);
    }
}
