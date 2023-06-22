package javaAdvancedConcepts.definingClasses.workingWithClass;

public class Dog {

    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge) {
        super();
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    /* toString() method is used to provide a formatted string representation of the Dog objec.
    If you don't set the values for the dogType, dogName, dogColor, and dogAge fields, their
    default values will be used. For reference types (such as String), the default value is null,
     and for the int type, the default value is 0. So if you don't set the values, the toString()
      method will return a string with these default values*/

    @Override
    public String toString() {
        return "Dog type:" + dogType +" " + " Dog name:" + dogName +" "+ " Dog Color:" + dogColor +" "+ " Dog age" + dogAge;
    }

    /*In the main method, when we create a Dog object and print its properties,
    the toString() method is implicitly called to convert the Dog object into a string,
     allowing you to display the dog's type, name, color, and age.*/

    public static void main(String[] args) {
        Dog dog = new Dog("French Bulldog", "Snoopy", "White", 10);
        // Implicitly calls toString() method
        System.out.println( dog);
//        System.out.println("Dog name is " + dog.getDogName());
//        System.out.println("Dog color is " + dog.getDogColor());
//        System.out.println("Dog age is " + dog.getDogAge());
    }
}
