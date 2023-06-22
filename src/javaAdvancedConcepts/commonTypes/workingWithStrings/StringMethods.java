package javaAdvancedConcepts.commonTypes.workingWithStrings;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(text.charAt(4));
        System.out.println(text.equalsIgnoreCase("hello"));
        System.out.println(text.contains("l"));
        String commaSeperatedString = "This, is, not, my, dream";
        String[] strArray = commaSeperatedString.split(",");
        System.out.println(strArray);
        System.out.println(commaSeperatedString.substring(0,5));
        System.out.println(text.replace("e","1"));
    }
}
