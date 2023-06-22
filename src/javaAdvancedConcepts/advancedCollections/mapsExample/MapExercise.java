package javaAdvancedConcepts.advancedCollections.mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {

        // Create a map object to store Person objects
        Map<String, Person > mapOfPeople = new HashMap<String, Person>();
        Person person1 = new Person("Mike", "mike@email.com");
        Person person2 = new Person("Shaun", "shaun@email.com");
        Person person3 = new Person("Sally", "sally@email.com");
        Person person4 = new Person("Cesar", "cesar@email.com");

        // Adding above objects to HashMap
        mapOfPeople.put(person1.getEmail(), person1);
        mapOfPeople.put(person2.getEmail(), person2);
        mapOfPeople.put(person3.getEmail(), person3);
        mapOfPeople.put(person4.getEmail(), person4);

        // Create an ArrayList and populate it with Person objects
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for (Person person : people) {
            MapExercise.addToMap(mapOfPeople, person);
        }

        for(String email : mapOfPeople.keySet()){
            System.out.println(email);
        }

        // Write a loop to add the Person objects to your Map
        for(Person person : mapOfPeople.values()){
            System.out.println(person);
        }

        System.out.println("Get Mike: " + mapOfPeople.get("mike@email.com"));
        System.out.println("Get Jeff: " + mapOfPeople.get("jeff@email.com"));
        System.out.println("Contains Mike: " + mapOfPeople.containsKey("mike@email.com"));
        System.out.println("Contains Jeff: " + mapOfPeople.containsKey("jeff@email.com"));

    }

    private static void addToMap(Map<String, Person> map, Person person) {
        map.put(person.getEmail(), person);
    }
}
