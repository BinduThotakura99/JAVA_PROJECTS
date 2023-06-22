package javaAdvancedConcepts.genericsExample;

import java.util.ArrayList;

//Generics allow us to create reusable code that can work with different types
public class GenericsExercise {
    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<Object>();
        Double doubleNumber = 1.5;
        String name = "Bindu";
        Integer intNumber = 4;
        Character letter = 'c';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable : variables) {
            GenericsExercise.displayClassName(variable);
        }
    }

    static <T> void displayClassName(T variable) {
        System.out.println(variable.getClass().getName());
    }
}
