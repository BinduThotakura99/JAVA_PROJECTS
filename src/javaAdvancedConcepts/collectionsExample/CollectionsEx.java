package javaAdvancedConcepts.collectionsExample;

import java.util.LinkedList;
import java.util.List;

//Collections provide data structures to store and manipulate groups of objects.
public class CollectionsEx {
    public static void main(String[] args) {
        List<String> listOfItems = new LinkedList<String>();
        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        for(String names : listOfItems){
            System.out.println(names);
        }
    }
}
