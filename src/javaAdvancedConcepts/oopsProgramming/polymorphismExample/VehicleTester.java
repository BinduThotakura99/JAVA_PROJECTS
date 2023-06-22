package javaAdvancedConcepts.oopsProgramming.polymorphismExample;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        // Add a car, boat and plane objects to an array
        vehicles[0] = new Car();
        vehicles[1] = new Boat();
        vehicles[2] = new Plane();
        polymorphism(vehicles);
        coupling();
    }
    public static void polymorphism(Vehicle[] vehicles){
        // Iterate ove the array and call the start method
        for (int i =0; i < vehicles.length; i++){
            Vehicle vehicle = vehicles[i];
            vehicle.start();
            vehicle.stop();
            vehicle.speed();
            vehicle.direction();
        }
    }
    public static void coupling(){
        // Instead of creating individual objects add car, boat and plane objects to an array like above
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();
        car.start();
        boat.speed();
        plane.direction();
    }
}
