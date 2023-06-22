package javaAdvancedConcepts.commonTypes.exceptionHandlerExample;

public class phoneExceptionTester {
    public static void main(String[] args) {
        String[] numbers = new String[] {"12345", null, "67890", "01234"};
        for(int i = 0; i < numbers.length; i++){
            try{
                System.out.println(new Phone("iPhone",numbers[i]));
            } catch(IllegalAccessException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }
}
