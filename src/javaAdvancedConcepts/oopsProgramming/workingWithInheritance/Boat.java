package javaAdvancedConcepts.oopsProgramming.workingWithInheritance;

public class Boat extends  Vehicle{

    // We are passing arguments into super class (Vehicle) constructor
    public Boat() {
        super("Boat start", "Boat stop", "Boat speed", "Boat direction");
    }

    public void depthFinder(){
        System.out.println("How deep is this water");
    }

}
