package com.example.android.lesson3.src.inheritanceExample;

public class StudentEmployee extends Student {
    double rateOfPayPerHour;
    String employeeId;

    public StudentEmployee(String firstName, String lastName, String employeeId, double rateOfPayPerHour) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setRateOfPayPerHour() {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }

    @Override
    public String toString(){
        return super.toString() + "employeeID: " + employeeId + "rateOfPayPerHour: " + rateOfPayPerHour;
    }

    public static void main(String args[]) {
        StudentEmployee studentEmployee = new StudentEmployee("Roshan", "Lobo", "1234",120);
        System.out.println(studentEmployee.toString());
    }
}
