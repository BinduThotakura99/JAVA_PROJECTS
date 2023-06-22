package javaAdvancedConcepts.definingClasses.workingWithObjects;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String work;

    public Person(String firstName, String lastName, String address, String work ) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.work = work;
    }

    public static void eat(String food){
        String response = "I love eating";
        System.out.println(response +" "+ food);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
            this.address = address;
        }
        public String getWork() {
            return work;
        }

        public void setWork(String work) {
                this.work = work;
            }

            @Override
            public String toString() {
              return "First name of the person is : " + firstName + " " + "and last name is : " + lastName + " " + ", Address is : " + address +" "+ ", Work is : "+ work;
    }
}
