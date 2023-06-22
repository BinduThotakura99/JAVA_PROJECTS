package javaAdvancedConcepts.commonTypes.exceptionHandlerExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) throws IllegalAccessException {
        super();
        if(phoneType == null || phoneNumber == null){
            throw new IllegalAccessException("The type and the number cannot be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType(){
        return phoneType;
    }

    public void setPhoneType(String phoneType){
        this.phoneType = phoneType;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Phone type is : "+ phoneType + " " + ", Phone number is : " + phoneNumber;
    }
}
