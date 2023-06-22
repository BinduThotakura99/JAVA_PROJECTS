package javaBasicConcepts;

/*Object types do not have a specific memory allocation size.
The reference to the object can be of a known, fixed size,
but the object itself may vary greatly in size
(e.g., the string "hi" will be allocated less space than the string "abcdefghijklmnopqrstuvwxyz").*/


/*Notice that the keywords for creating object variables begin with an uppercase letter (String and Integer)
 rather than the lowercase used for primitives (e.g. int and long).*/

/*one of the benefits of creating an object is that it can include additional data and behavior.
 For example, String objects are bundled with a method called length that lets us get the length of the string
 */

public class ObjectReferenceType {
    public static void main(String[] args) {
        //Declaring a String object variable looks like this
        String text = "Hello there";
        Integer length = text.length();

        //Create an object variable for an integer, that looks like this
        Integer age1 = 634726772;
        age1 = 72676273;

        //Object data types, however, can be assigned a null value, indicating the absence of an object reference.
        Double value = null;

        /*
         double value1 = null;
         int age = 42;
         age = 834738748;
        */

        System.out.println("The text is " + text + " / The length of text is " + length + " / The age1 is " + age1 );
    }
}
