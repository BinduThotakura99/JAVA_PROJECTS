package javaAdvancedConcepts.oopsProgramming.workingWithInheritance;

public class VehicleTester {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Boat boat = new Boat();
        boat.stop();
        boat.depthFinder();

        Plane plane = new Plane();
        plane.speed();
        plane.altitude();
    }
}
