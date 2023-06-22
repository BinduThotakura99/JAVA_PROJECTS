package javaAdvancedConcepts.collectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
            names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        //Before  Sorting
        for(String sortedNames : names){
            System.out.println(sortedNames);
        }

        // Sorting
        Collections.sort(names);

        // After sorting
        for(String sortedNames : names){
            System.out.println("-----------After Sorting------------ : "+ sortedNames);
        }
    }
}
