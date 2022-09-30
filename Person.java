package com.example.android.lesson3.src.inheritanceExample;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name:" + firstName + " " + lastName;
    }

    public static void main(String args[]) {
        Person personObj = new Person("Beata","Jane");
        System.out.println(personObj.toString());
    }
}
