package javaAdvancedConcepts.definingClasses.workingWithObjects;

public class personTester {
    public static void main(String[] args) {
        Person person = new Person("Bindu", "Thotakura","Silicon Valley", "Data Scientist");
        System.out.println(person);
        person.eat("Biryani");
        Person person1 = new Person("Sindhu", "Thotakura", "New york", "Software Developer");
        System.out.println(person1);
        person1.eat("Pasta");
    }
}
