package javaBasicConcepts;

/*each primitive type has a memory size allocation, meaning that if we created a variable with one of these types,
 that variable would have a certain size in memory (e.g., an int primitive is always allocated 4 bytes in memory)*/


public class PrimitiveType {
    public static void main(String[] args) {
        int age = 42;
        // To declare a variable for the long primitive
        long agePlantEarth = 4005000000L;
        System.out.println("Age is : " + age + "  / agePlantEarth is " + agePlantEarth);
    }
}
