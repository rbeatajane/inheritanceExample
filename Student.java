package com.example.android.lesson3.src.inheritanceExample;

public class Student extends Person {
    public String studentId;
    public Student(String firstName, String lastName, String studentId) {
        super(firstName,lastName);
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return super.toString() + "Student ID: " + studentId;
    }
}
