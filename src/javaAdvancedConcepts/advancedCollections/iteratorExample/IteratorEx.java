package javaAdvancedConcepts.advancedCollections.iteratorExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();
        names.add("Sally");
        names.add("Bob");
        names.add("Alice");
        // We can use iterator interface with names
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
