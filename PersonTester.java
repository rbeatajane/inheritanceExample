package com.example.android.lesson3.src.inheritanceExample;

public class PersonTester{
    public static void main(String args[]) {
        Person sally = new Person("Main","World");
        System.out.println(sally);
        Student mike = new Student("Mike","Jackson","567");
        System.out.println(mike);
        StudentEmployee jeff = new StudentEmployee("Beata","Jane","1234",250000);
        System.out.println(jeff);
    }
}
