package javaAdvancedConcepts.definingClasses.workingWithClass;

/*There will be times when we need to make an object a Singleton class.
Which means that there will only be one instance of the class in the JVM.
We use singleton class for utility classes and services when we only want one instance.
This is to ensure that the state data or methods are shared with all of the other objects in the JVM.
In this example, we are creating a static reference to the class server.
To access the server we use the class name with the method getInstance().
 This Singleton approach will ensure that every object that references the server class will have access to the server's hotelRoom ArrayList.*/

import java.util.ArrayList;

public class Server {

    /*This line creates a static variable called reference of type Server and initializes it to a new instance of Server.
    This means that there will only ever be one instance of Server in the entire program*/
    private static Server reference = new Server();

    /*This line declares a private variable called hotelRooms of type ArrayList.
     This will be used to store a list of hotel rooms*/
    private ArrayList hotelRooms;

    // This is the constructor for the Server class. It is private.
    // which means that it can only be called from within the Server class.
    private Server(){

        // This line creates a new instance of ArrayList and assigns it to the hotelRooms variable.
        this.hotelRooms = new ArrayList();
    }

    // This method returns an instance of the Server class
    public Server getInstance(){

        //This line returns the reference variable, which is the only instance of the Server class.
        return reference;
    }

    public static void main(String[] args) {

    }

}
