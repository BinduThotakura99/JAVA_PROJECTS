package javaAdvancedConcepts.definingClasses.workingWithClass;

public class Class {
    // Class Variables
    // The final keyword means that the class cannot be changed and cannot be overridden or inherited.
    private String id;
    private final String firstName;
    private final String lastName;

    public Class(String id, String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Accessor Methods
    public String getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    // Mutator Method
    public void setClass(String id, String firstName,String lastName){
        this.id = id;
        //this.firstName = firstName; -- class variables are final we cant modify them
        //this.lastName = lastName;
    }

    public static void main(String[] args) {
        Class student = new Class("1","Bindu","Thotakura");
        System.out.println("Student is is : " + student.getId());
        System.out.println("Student first name is : " + student.getFirstName());
        System.out.println("Student last name is : " + student.getLastName());
    }
}

