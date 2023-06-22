package javaBasicConcepts;

/*To declare or define a variable in Java, we specify the data type, the name of the variable,
and any value we want to store in the variable. For example, here we declare an integer value
with the name age that holds the value 42:*/

/* We type the word age in our code, it will refer to this location in memory.
The reason we use the term "variable" is because it is able to vary.
After we have declared it, we can easily change the value of the variable as many times as we like:*/

/*Notice that Java ends every statement with a semicolon, ;. This is how Java knows it has reached the end of the statement.*/

public class Variables {
    public static void main(String[] args) {
        int age = 32;
        System.out.println("The age is : " + age);
        //age = "there";

    }
}
