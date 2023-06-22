package javaBasicConcepts.docs;

/** This is my first JavaDoc
 *  @author Bindu Thotakura */
public class JavaDocExample {
    public static void main(String[] args) {
    JavaDocExample school = new JavaDocExample();
        System.out.println(school.nameOfSchool());
    }

    /** This method will return the school name
     * @author - Bindu Thotakura
     * @param  - it returns string type
     * @return - returns school name */
    public String nameOfSchool(){
        return "UCM";
    }
}
