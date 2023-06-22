package javaAdvancedConcepts.oopsProgramming.inheritanceExample;

public class StudentEmployee extends Student{
    private String employeeId;
    private double rateOfPayPerHour;
    public StudentEmployee(String firstName, String lastName, String studentId, String employeeId, double rateOfPayPerHour) {
        super(firstName, lastName, studentId);
        this.rateOfPayPerHour = rateOfPayPerHour;
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public double getRateOfPerHour(){
        return rateOfPayPerHour;
    }

    public void setRateOfPerHour(double rateOfPayPerHour){
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString(){
        return super.toString() + ",  employee Id :  " + employeeId +", "+ "Pay rate per hour : " + rateOfPayPerHour;
    }
}
