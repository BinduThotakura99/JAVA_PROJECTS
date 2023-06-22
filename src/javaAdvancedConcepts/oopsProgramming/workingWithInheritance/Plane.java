package javaAdvancedConcepts.oopsProgramming.workingWithInheritance;

public class Plane extends Vehicle{
    public Plane() {
        super("Plane start", "Plane stop", "Plane speed", "Plane direction");
    }

    public void altitude(){
        System.out.println("How high are we?");
    }
}
