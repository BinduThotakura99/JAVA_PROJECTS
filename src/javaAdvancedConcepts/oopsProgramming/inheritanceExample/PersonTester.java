package javaAdvancedConcepts.oopsProgramming.inheritanceExample;

public class PersonTester {
    public static void main(String[] args) {
     Person person = new Person("Sally", "Phillips");
        System.out.println(person);

     Student student = new Student("Mike","Thompson","12345" );
        System.out.println(student);

     StudentEmployee studentEmployee = new StudentEmployee("Jeff","Sam","12345", "#12345", 20.5);
        System.out.println(studentEmployee);
    }
}
