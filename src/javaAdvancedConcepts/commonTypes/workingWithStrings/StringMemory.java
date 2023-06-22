package javaAdvancedConcepts.commonTypes.workingWithStrings;

public class StringMemory {
    public static void main(String[] args) {
        // The reference object is same for the text and if we update the value, the reference object is not removed
        String text = "Hello";
        String anotherText = "Hello";
        String yetAnotherText = "Hello";
//        text = "Hellooo";
        System.out.println(anotherText == text );
    }
}
